import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ViewMotorcycleRecords extends javax.swing.JPanel {

    private javax.swing.JTable jTableMaintenanceView;
    private javax.swing.JTable jTableInspectionView;
    private javax.swing.JTable jTableDamageView;
    
    public ViewMotorcycleRecords() {
        UIManager.put("Button.focusWidth", 0);
        initComponents();
        setupEvents();
        loadTableData();
    }

    private void notifyDashboardRefresh() {
        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }
    }

   private void setupEvents() {
    btnrefresh.addActionListener(e -> loadTableData());
    btnsearch.addActionListener(e -> searchRecord());
    btndelete.addActionListener(e -> deleteSelectedMotorcycle());
    btnedit.addActionListener(e -> editSelectedMotorcycle());
    
    btnviewinspectsave.addActionListener(e -> btnviewinspectsaveActionPerformed(e));
    btnsavemainte.addActionListener(e -> btnsavemainteActionPerformed(e));
}

    public void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) recordstable.getModel();
        model.setRowCount(0);

        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addRow(new Object[]{
                m.id, m.brand, m.model, m.year, m.type, m.mileage, m.dailyRate, m.status
            });
        }
    }

    private void searchRecord() {
        String searchId = jTextField3.getText().trim();
        if (searchId.isEmpty()) {
            loadTableData();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) recordstable.getModel();
        model.setRowCount(0);

        for (Motorcycle m : TrimotoSystem.motorcycles) {
            if (m.id.equalsIgnoreCase(searchId)) {
                model.addRow(new Object[]{
                    m.id, m.brand, m.model, m.year, m.type, m.mileage, m.dailyRate, m.status
                });
            }
        }
    }

    private void deleteSelectedMotorcycle() {
        int selectedRow = recordstable.getSelectedRow();
        if (selectedRow != -1) {
            String id = recordstable.getValueAt(selectedRow, 0).toString();
            TrimotoSystem.motorcycles.removeIf(m -> m.id.equals(id));
            
            loadTableData();
            notifyDashboardRefresh();
            
            JOptionPane.showMessageDialog(this, "Motorcycle deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle row to delete.");
        }
    }

    private void editSelectedMotorcycle() {
        int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle from the table to edit.");
            return;
        }

        String id = recordstable.getValueAt(selectedRow, 0).toString();
        Motorcycle m = TrimotoSystem.findMotorcycleById(id);

        if (m != null) {
            String newBrand = JOptionPane.showInputDialog(this, "Edit Brand:", m.brand);
            if (newBrand == null) return;

            String newModel = JOptionPane.showInputDialog(this, "Edit Model:", m.model);
            if (newModel == null) return;

            String yearStr = JOptionPane.showInputDialog(this, "Edit Year:", m.year);
            if (yearStr == null) return;

            String mileageStr = JOptionPane.showInputDialog(this, "Edit Mileage (km):", m.mileage);
            if (mileageStr == null) return;

            String rateStr = JOptionPane.showInputDialog(this, "Edit Daily Rate (₱):", m.dailyRate);
            if (rateStr == null) return;

            String newStatus = JOptionPane.showInputDialog(this, "Edit Status (Available/Rented/Under Maintenance/For Inspection/Under Repair):", m.status);
            if (newStatus == null) return;

            try {
                int year = Integer.parseInt(yearStr.trim());
                int mileage = Integer.parseInt(mileageStr.trim());
                double rate = Double.parseDouble(rateStr.trim());

                saveEditedMotorcycle(m.id, newBrand.trim(), newModel.trim(), year, m.type, mileage, rate, newStatus.trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number format for Year, Mileage, or Daily Rate.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveEditedMotorcycle(String id, String brand, String model, int year, String type, int mileage, double rate, String status) {
        Motorcycle m = TrimotoSystem.findMotorcycleById(id);
        if (m != null) {
            m.brand = brand;
            m.model = model;
            m.year = year;
            m.type = type;
            m.mileage = mileage;
            m.dailyRate = rate;
            m.status = status;

            loadTableData();
            notifyDashboardRefresh();

            JOptionPane.showMessageDialog(this, "Motorcycle updated successfully!");
        }
    }

    private String extractField(String text, String key) {
        if (text == null) return "-";
        for (String line : text.split("\n")) {
            if (line.toLowerCase().contains(key.toLowerCase() + ":")) {
                return line.substring(line.indexOf(":") + 1).trim();
            }
        }
        return "-";
    }

    private void populateInspectionGui(InspectionRecord record) {
        if (record == null) return;

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.id + " - " + m.brand + " " + m.model);
        }
        cmbmotorcycle.setModel(model);

        for (int i = 0; i < cmbmotorcycle.getItemCount(); i++) {
            if (cmbmotorcycle.getItemAt(i).toString().startsWith(record.motorcycleId)) {
                cmbmotorcycle.setSelectedIndex(i);
                break;
            }
        }

        txtinspectdate.setText(record.date);
        cbinspectionphase.setSelectedItem(record.phase);
        jTextField1.setText(record.odometer);
        txtfuel.setText(record.fuel);
        jComboBox8.setSelectedItem(record.tires);
        jComboBox9.setSelectedItem(record.brakes);
        cbheadlight.setSelectedItem(record.headlight);
        jComboBox10.setSelectedItem(record.horns);
        jComboBox11.setSelectedItem(record.mirrors);
        jComboBox12.setSelectedItem(record.body);
        jComboBox13.setSelectedItem(record.engine);
        cbcondition.setSelectedItem(record.condition);
        jComboBox14.setSelectedItem(record.readiness);
        jTextField2.setText(record.notes);
    }

    private void populateMaintenanceGui(MaintenanceRecord record) {
        if (record == null) return;

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.id + " - " + m.brand + " " + m.model);
        }
        jComboBox1.setModel(model);

        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (jComboBox1.getItemAt(i).toString().startsWith(record.motorcycleId)) {
                jComboBox1.setSelectedIndex(i);
                break;
            }
        }

        txtmaintedate.setText(record.date);
        jComboBox4.setSelectedItem(record.type);
        jTextField12.setText(record.category);
        jTextField19.setText(record.workPerformed);
        jTextField11.setText(record.partsReplaced);
        jTextField13.setText(record.odometer);
        jTextField15.setText(String.valueOf(record.cost));
        jTextField14.setText(record.nextServiceMileage);
        jComboBox2.setSelectedItem(record.status);
        jComboBox3.setSelectedItem(record.availability);
        jTextField16.setText(record.remarks);
    }

    private void populateDamageGui(String record) {

    }

    private void packTableColumns(javax.swing.JTable table) {
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 85;
            
            Object headerValue = table.getColumnModel().getColumn(column).getHeaderValue();
            if (headerValue != null) {
                width = Math.max(width, table.getFontMetrics(table.getFont()).stringWidth(headerValue.toString()) + 30);
            }

            for (int row = 0; row < table.getRowCount(); row++) {
                Object cellValue = table.getValueAt(row, column);
                if (cellValue != null) {
                    int cellWidth = table.getFontMetrics(table.getFont()).stringWidth(cellValue.toString()) + 30;
                    width = Math.max(width, cellWidth);
                }
            }
            table.getColumnModel().getColumn(column).setPreferredWidth(width);
        }
    }

    

       
    private String getRecordField(Object obj, String fieldName) {
        if (obj == null) return "-";
        try {
            java.lang.reflect.Field f = obj.getClass().getDeclaredField(fieldName);
            f.setAccessible(true);
            Object v = f.get(obj);
            return v != null ? v.toString() : "-";
        } catch (Exception e) {
            return "-";
        }
    }

    private void deleteSelectedInspection(String selectedMotorId) {

    }

    private void btnsavemainteActionPerformed(java.awt.event.ActionEvent evt) {
        int tableRow = (jTableMaintenanceView != null) ? jTableMaintenanceView.getSelectedRow() : -1;
        if (tableRow == -1) return;

        String targetRecId = jTableMaintenanceView.getValueAt(tableRow, 0).toString();
        for (MaintenanceRecord record : TrimotoSystem.maintenanceRecords) {
            if (targetRecId.equalsIgnoreCase(getRecordField(record, "recordId"))) {
                record.date = txtmaintedate.getText().trim();
                record.type = jComboBox4.getSelectedItem().toString();
                record.category = jTextField12.getText().trim();
                record.workPerformed = jTextField19.getText().trim();
                record.partsReplaced = jTextField11.getText().trim();
                record.odometer = jTextField13.getText().trim();
                try {
                    record.cost = Double.parseDouble(jTextField15.getText().trim());
                } catch (NumberFormatException ignored) {}
                record.nextServiceMileage = jTextField14.getText().trim();
                record.status = jComboBox2.getSelectedItem().toString();
                record.availability = jComboBox3.getSelectedItem().toString();
                record.remarks = jTextField16.getText().trim();
                break;
            }
        }

        JOptionPane.showMessageDialog(viewmainte, "Maintenance record updated!");
        viewmainte.dispose();
        btnviewmaintenancerecordActionPerformed(evt);
    }
    
    private void btnviewinspectsaveActionPerformed(java.awt.event.ActionEvent evt) {
        int tableRow = (jTableInspectionView != null) ? jTableInspectionView.getSelectedRow() : -1;
        if (tableRow == -1) return;

        String targetRecId = jTableInspectionView.getValueAt(tableRow, 0).toString();
        for (InspectionRecord record : TrimotoSystem.inspections) {
            if (targetRecId.equalsIgnoreCase(getRecordField(record, "recordId"))) {
                record.date = txtinspectdate.getText().trim();
                record.phase = cbinspectionphase.getSelectedItem().toString();
                record.odometer = jTextField1.getText().trim();
                record.fuel = txtfuel.getText().trim();
                record.tires = jComboBox8.getSelectedItem().toString();
                record.brakes = jComboBox9.getSelectedItem().toString();
                record.headlight = cbheadlight.getSelectedItem().toString();
                record.horns = jComboBox10.getSelectedItem().toString();
                record.mirrors = jComboBox11.getSelectedItem().toString();
                record.body = jComboBox12.getSelectedItem().toString();
                record.engine = jComboBox13.getSelectedItem().toString();
                record.condition = cbcondition.getSelectedItem().toString();
                record.readiness = jComboBox14.getSelectedItem().toString();
                record.notes = jTextField2.getText().trim();
                break;
            }
        }

        JOptionPane.showMessageDialog(viewinspect, "Inspection record updated!");
        viewinspect.dispose();
        btnviewinspectionrecordActionPerformed(evt);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewmainte = new javax.swing.JDialog();
        btnsavemainte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblmotor2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblmaintenancedate = new javax.swing.JLabel();
        txtmaintedate = new javax.swing.JTextField();
        lblmaintenancetype = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        viewinspect = new javax.swing.JDialog();
        btnviewinspectsave = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblmotor = new javax.swing.JLabel();
        cmbmotorcycle = new javax.swing.JComboBox<>();
        lblinspectiondate = new javax.swing.JLabel();
        txtinspectdate = new javax.swing.JTextField();
        lblInspectionphase = new javax.swing.JLabel();
        cbinspectionphase = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblfuel = new javax.swing.JLabel();
        txtfuel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        lblheadlightandsignal = new javax.swing.JLabel();
        cbheadlight = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        lbloverallcondi = new javax.swing.JLabel();
        cbcondition = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        viewmaintedialog = new javax.swing.JDialog();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btneditinspect2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        viewinspectdialog = new javax.swing.JDialog();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btneditinspect1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        viewdamagereportdialog = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
        btneditinspect3 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        viewdmgreport = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btndamagereport = new javax.swing.JButton();
        viewmmotorcycle = new javax.swing.JDialog();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblMotorID = new javax.swing.JLabel();
        txtmotorid = new javax.swing.JTextField();
        brand = new javax.swing.JLabel();
        txtbrand = new javax.swing.JTextField();
        model = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        lblyear = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        lblmileage = new javax.swing.JLabel();
        txtmileage = new javax.swing.JTextField();
        lbldailyrentalrate = new javax.swing.JLabel();
        txtdailyrentalrate = new javax.swing.JTextField();
        lblmotortype = new javax.swing.JLabel();
        cmbtypes = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        viewfurtherdetails = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        description = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        recordsscrollpane = new javax.swing.JScrollPane();
        recordstable = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnviewinspectionrecord = new javax.swing.JButton();
        btnviewmaintenancerecord = new javax.swing.JButton();
        btnviewdmg = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        btnsavemainte.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnsavemainte.setText("Save");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(12, 2, 15, 15));

        lblmotor2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblmotor2.setText("Motorcycle:");
        jPanel1.add(lblmotor2);

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);

        lblmaintenancedate.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblmaintenancedate.setText("Maintenance Date:");
        jPanel1.add(lblmaintenancedate);

        txtmaintedate.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(txtmaintedate);

        lblmaintenancetype.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblmaintenancetype.setText("Maintenance Type:");
        jPanel1.add(lblmaintenancetype);

        jComboBox4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventive", "Corrective" }));
        jPanel1.add(jComboBox4);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel12.setText("Service Category");
        jPanel1.add(jLabel12);

        jTextField12.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField12);

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel16.setText("Work Performed:");
        jPanel1.add(jLabel16);

        jTextField19.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField19);

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel13.setText("Parts Replaced:");
        jPanel1.add(jLabel13);

        jTextField11.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField11);

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel17.setText("Odometer Reading(km):");
        jPanel1.add(jLabel17);

        jTextField13.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField13);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setText("Maintenance Cost:");
        jPanel1.add(jLabel2);

        jTextField15.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField15);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Next Service Mileage:");
        jPanel1.add(jLabel3);

        jTextField14.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField14);

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel14.setText("Maintenance Status:");
        jPanel1.add(jLabel14);

        jComboBox2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "In Progress", "Completed" }));
        jPanel1.add(jComboBox2);

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel21.setText("Motorcycle Availability:");
        jPanel1.add(jLabel21);

        jComboBox3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Under Maintenance" }));
        jPanel1.add(jComboBox3);

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel15.setText("Remarks");
        jPanel1.add(jLabel15);

        jTextField16.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel1.add(jTextField16);

        javax.swing.GroupLayout viewmainteLayout = new javax.swing.GroupLayout(viewmainte.getContentPane());
        viewmainte.getContentPane().setLayout(viewmainteLayout);
        viewmainteLayout.setHorizontalGroup(
            viewmainteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmainteLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(btnsavemainte)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(viewmainteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewmainteLayout.setVerticalGroup(
            viewmainteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmainteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsavemainte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnviewinspectsave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnviewinspectsave.setText("Save");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel5.setLayout(new java.awt.GridLayout(15, 2, 15, 15));

        lblmotor.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblmotor.setText("Motorcycle:");
        jPanel5.add(lblmotor);

        cmbmotorcycle.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbmotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(cmbmotorcycle);

        lblinspectiondate.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblinspectiondate.setText("Inspection Date:");
        jPanel5.add(lblinspectiondate);

        txtinspectdate.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel5.add(txtinspectdate);

        lblInspectionphase.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblInspectionphase.setText("Inspection Phase:");
        jPanel5.add(lblInspectionphase);

        cbinspectionphase.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cbinspectionphase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Rental", "Post-Rental" }));
        jPanel5.add(cbinspectionphase);

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel19.setText("Odometer Reading:");
        jPanel5.add(jLabel19);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel5.add(jTextField1);

        lblfuel.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblfuel.setText("Fuel Level:");
        jPanel5.add(lblfuel);

        txtfuel.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel5.add(txtfuel);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Tire Condition:");
        jPanel5.add(jLabel4);

        jComboBox8.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Scratched", "Dented" }));
        jPanel5.add(jComboBox8);

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel22.setText("Brake Condition:");
        jPanel5.add(jLabel22);

        jComboBox9.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Worn", "Damaged" }));
        jPanel5.add(jComboBox9);

        lblheadlightandsignal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblheadlightandsignal.setText("Headlight and Signal Lights:");
        jPanel5.add(lblheadlightandsignal);

        cbheadlight.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cbheadlight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        jPanel5.add(cbheadlight);

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel23.setText("Horns");
        jPanel5.add(jLabel23);

        jComboBox10.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        jPanel5.add(jComboBox10);

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel24.setText("Mirrors");
        jPanel5.add(jLabel24);

        jComboBox11.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete", "Missing", "Damaged" }));
        jPanel5.add(jComboBox11);

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel25.setText("Motorcycle Body:");
        jPanel5.add(jLabel25);

        jComboBox12.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Needs Repair" }));
        jPanel5.add(jComboBox12);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel1.setText("Engine Condition:");
        jPanel5.add(jLabel1);

        jComboBox13.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Unusual Noise", "Other Issue" }));
        jPanel5.add(jComboBox13);

        lbloverallcondi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbloverallcondi.setText("Overall Condition:");
        jPanel5.add(lbloverallcondi);

        cbcondition.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cbcondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Minor Damage", "Needs Repair", "Unsafe" }));
        jPanel5.add(cbcondition);

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel26.setText("Readiness Status:");
        jPanel5.add(jLabel26);

        jComboBox14.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready", "Not Ready" }));
        jPanel5.add(jComboBox14);

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel27.setText("Inspection Notes:");
        jPanel5.add(jLabel27);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel5.add(jTextField2);

        javax.swing.GroupLayout viewinspectLayout = new javax.swing.GroupLayout(viewinspect.getContentPane());
        viewinspect.getContentPane().setLayout(viewinspectLayout);
        viewinspectLayout.setHorizontalGroup(
            viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewinspectLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(btnviewinspectsave)
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewinspectLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewinspectLayout.setVerticalGroup(
            viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewinspectLayout.createSequentialGroup()
                .addContainerGap(570, Short.MAX_VALUE)
                .addComponent(btnviewinspectsave)
                .addGap(16, 16, 16))
            .addGroup(viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewinspectLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "In Progress", "Completed" }));

        jLabel32.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel32.setText("Filter Status:");

        jTable3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Maintenance ID", "Motorcycle ID", "Date", "Type", "Service Category", "Work Performed", "Parts Replaced", "Odometer Reading (km)", "Maintenance Cost (₱)", "Next Service Mileage", "Status", "Availability", "Remarks"
            }
        ));
        jScrollPane8.setViewportView(jTable3);

        btneditinspect2.setText("Edit");
        btneditinspect2.addActionListener(this::btneditinspect2ActionPerformed);

        jButton3.setText("Apply Filter");

        jLabel33.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel33.setText("Search ID/Keyword");

        jButton6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton6.setText("Delete");

        javax.swing.GroupLayout viewmaintedialogLayout = new javax.swing.GroupLayout(viewmaintedialog.getContentPane());
        viewmaintedialog.getContentPane().setLayout(viewmaintedialogLayout);
        viewmaintedialogLayout.setHorizontalGroup(
            viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmaintedialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewmaintedialogLayout.createSequentialGroup()
                        .addComponent(btneditinspect2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(viewmaintedialogLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewmaintedialogLayout.setVerticalGroup(
            viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmaintedialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditinspect2)
                    .addComponent(jButton6))
                .addGap(18, 18, 18))
        );

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Good", "Minor Damage", "Needs Repair", "Unsafe" }));

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel30.setText("Filter Status:");

        jTable2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Inspection ID", "Motorcycle ID", "Date", "Phase", "Odometer", "Fuel Level", "Tire Condition", "Brake Condition", "Headlight & Signals", "Horns", "Mirrors", "Body Condition", "Engine Condition", "Overall Condition", "Readiness Status", "Inspection Notes"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        btneditinspect1.setText("Edit");
        btneditinspect1.addActionListener(this::btneditinspect1ActionPerformed);

        jButton2.setText("Apply Filter");

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel31.setText("Search ID/Keyword");

        jButton5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton5.setText("Delete");

        javax.swing.GroupLayout viewinspectdialogLayout = new javax.swing.GroupLayout(viewinspectdialog.getContentPane());
        viewinspectdialog.getContentPane().setLayout(viewinspectdialogLayout);
        viewinspectdialogLayout.setHorizontalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewinspectdialogLayout.createSequentialGroup()
                        .addComponent(btneditinspect1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(viewinspectdialogLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewinspectdialogLayout.setVerticalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditinspect1)
                    .addComponent(jButton5))
                .addGap(18, 18, 18))
        );

        jButton4.setText("Apply Filter");

        btneditinspect3.setText("Edit");
        btneditinspect3.addActionListener(this::btneditinspect3ActionPerformed);

        jTable4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Report ID", "Motorcycle ID", "Date", "Location", "Type", "Description", "Action Required", "Cost (₱)", "Status", "Notes"
            }
        ));
        jScrollPane9.setViewportView(jTable4);

        jLabel34.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel34.setText("Filter Status:");

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "Under Repair", "Resolved" }));

        jLabel35.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel35.setText("Search ID/Keyword");

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton1.setText("Delete");

        javax.swing.GroupLayout viewdamagereportdialogLayout = new javax.swing.GroupLayout(viewdamagereportdialog.getContentPane());
        viewdamagereportdialog.getContentPane().setLayout(viewdamagereportdialogLayout);
        viewdamagereportdialogLayout.setHorizontalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addComponent(btneditinspect3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewdamagereportdialogLayout.setVerticalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditinspect3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel3.setLayout(new java.awt.GridLayout(9, 2, 15, 15));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel10.setText("Motorcycle:");
        jPanel3.add(jLabel10);

        jComboBox5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.addActionListener(this::jComboBox5ActionPerformed);
        jPanel3.add(jComboBox5);

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel18.setText("Damage Location: ");
        jPanel3.add(jLabel18);

        jTextField7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel3.add(jTextField7);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel8.setText("Damage Type:");
        jPanel3.add(jLabel8);

        jComboBox6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scratch", "Dent", "Crack", "Broken Part" }));
        jPanel3.add(jComboBox6);

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel20.setText("Damage Description:");
        jPanel3.add(jLabel20);

        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel3.add(jTextField5);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Date Reported:");
        jPanel3.add(jLabel6);

        jTextField4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel3.add(jTextField4);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Action Required:");
        jPanel3.add(jLabel5);

        jComboBox7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repair", "Monitor", "No Action" }));
        jPanel3.add(jComboBox7);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel7.setText("Damage Status:");
        jPanel3.add(jLabel7);

        jComboBox15.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Under Repair", "Resolved" }));
        jPanel3.add(jComboBox15);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel9.setText("Additional Notes:");
        jPanel3.add(jLabel9);

        jTextField6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel3.add(jTextField6);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel11.setText("Estimated Repair Cost:");
        jPanel3.add(jLabel11);

        jTextField8.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel3.add(jTextField8);

        btndamagereport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btndamagereport.setText("Save");
        btndamagereport.addActionListener(this::btndamagereportActionPerformed);

        javax.swing.GroupLayout viewdmgreportLayout = new javax.swing.GroupLayout(viewdmgreport.getContentPane());
        viewdmgreport.getContentPane().setLayout(viewdmgreportLayout);
        viewdmgreportLayout.setHorizontalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(btndamagereport)
                .addGap(308, 308, 308))
            .addGroup(viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewdmgreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewdmgreportLayout.setVerticalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(btndamagereport)
                .addGap(45, 45, 45))
            .addGroup(viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewdmgreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        jButton7.setText("Save");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setLayout(new java.awt.GridLayout(11, 2, 15, 15));

        lblMotorID.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblMotorID.setText("Motorcycle ID:");
        jPanel2.add(lblMotorID);

        txtmotorid.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtmotorid.addActionListener(this::txtmotoridActionPerformed);
        jPanel2.add(txtmotorid);

        brand.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        brand.setText("Brand:");
        jPanel2.add(brand);

        txtbrand.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtbrand);

        model.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        model.setText("Model:");
        jPanel2.add(model);

        txtmodel.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtmodel);

        lblyear.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblyear.setText("Year:");
        jPanel2.add(lblyear);

        txtyear.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtyear);

        lblmileage.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblmileage.setText("Mileage (km):");
        jPanel2.add(lblmileage);

        txtmileage.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtmileage);

        lbldailyrentalrate.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbldailyrentalrate.setText("Daily Rental Rate:");
        jPanel2.add(lbldailyrentalrate);

        txtdailyrentalrate.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtdailyrentalrate);

        lblmotortype.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblmotortype.setText("Motorcycle Type");
        jPanel2.add(lblmotortype);

        cmbtypes.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbtypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electic Bike", " " }));
        jPanel2.add(cmbtypes);

        jLabel38.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel38.setText("Transmission Type:");
        jPanel2.add(jLabel38);

        jTextField23.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jTextField23);

        jLabel39.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jLabel39);

        jTextField24.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jTextField24);

        jLabel40.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jLabel40);

        jTextField25.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jTextField25);

        jLabel41.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jLabel41);

        jTextField26.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jTextField26);

        javax.swing.GroupLayout viewmmotorcycleLayout = new javax.swing.GroupLayout(viewmmotorcycle.getContentPane());
        viewmmotorcycle.getContentPane().setLayout(viewmmotorcycleLayout);
        viewmmotorcycleLayout.setHorizontalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(428, 428, 428))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        viewmmotorcycleLayout.setVerticalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(18, 18, 18))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout viewfurtherdetailsLayout = new javax.swing.GroupLayout(viewfurtherdetails.getContentPane());
        viewfurtherdetails.getContentPane().setLayout(viewfurtherdetailsLayout);
        viewfurtherdetailsLayout.setHorizontalGroup(
            viewfurtherdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewfurtherdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewfurtherdetailsLayout.setVerticalGroup(
            viewfurtherdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewfurtherdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        description.setText("Browse registered motorcycles and their current status.");

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Motorcycle Records");

        recordstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Brand", "Model", "Year", "Type", "Mileage", "Daily Rate ₱", "Status"
            }
        ));
        recordsscrollpane.setViewportView(recordstable);

        ID.setText("Search ID:");

        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        btnsearch.setText("Search");

        btnviewinspectionrecord.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnviewinspectionrecord.setText("View Inspection");
        btnviewinspectionrecord.addActionListener(this::btnviewinspectionrecordActionPerformed);

        btnviewmaintenancerecord.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnviewmaintenancerecord.setText("View Maintenance");
        btnviewmaintenancerecord.addActionListener(this::btnviewmaintenancerecordActionPerformed);

        btnviewdmg.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnviewdmg.setText("View Damage Report");
        btnviewdmg.addActionListener(this::btnviewdmgActionPerformed);

        btndelete.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btndelete.setText("Delete");

        btnrefresh.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnrefresh.setText("Refresh");

        btnedit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnedit.setText("Edit");

        jButton8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton8.setText("View Further Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(description)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ID)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnsearch))
                        .addComponent(recordsscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnviewinspectionrecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnviewmaintenancerecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnviewdmg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnedit)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description)
                    .addComponent(ID)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordsscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewinspectionrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewmaintenancerecord, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewdmg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewinspectionrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinspectionrecordActionPerformed
 
    }//GEN-LAST:event_btnviewinspectionrecordActionPerformed

    private void btnviewmaintenancerecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewmaintenancerecordActionPerformed

    }//GEN-LAST:event_btnviewmaintenancerecordActionPerformed

    private void btnviewdmgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdmgActionPerformed

    

    }//GEN-LAST:event_btnviewdmgActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btneditinspect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditinspect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditinspect1ActionPerformed

    private void btneditinspect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditinspect2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditinspect2ActionPerformed

    private void btneditinspect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditinspect3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditinspect3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void btndamagereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndamagereportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndamagereportActionPerformed

    private void txtmotoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotoridActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel brand;
    private javax.swing.JButton btndamagereport;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btneditinspect1;
    private javax.swing.JButton btneditinspect2;
    private javax.swing.JButton btneditinspect3;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsavemainte;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnviewdmg;
    private javax.swing.JButton btnviewinspectionrecord;
    private javax.swing.JButton btnviewinspectsave;
    private javax.swing.JButton btnviewmaintenancerecord;
    private javax.swing.JComboBox<String> cbcondition;
    private javax.swing.JComboBox<String> cbheadlight;
    private javax.swing.JComboBox<String> cbinspectionphase;
    private javax.swing.JComboBox<String> cmbmotorcycle;
    private javax.swing.JComboBox<String> cmbtypes;
    private javax.swing.JLabel description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblInspectionphase;
    private javax.swing.JLabel lblMotorID;
    private javax.swing.JLabel lbldailyrentalrate;
    private javax.swing.JLabel lblfuel;
    private javax.swing.JLabel lblheadlightandsignal;
    private javax.swing.JLabel lblinspectiondate;
    private javax.swing.JLabel lblmaintenancedate;
    private javax.swing.JLabel lblmaintenancetype;
    private javax.swing.JLabel lblmileage;
    private javax.swing.JLabel lblmotor;
    private javax.swing.JLabel lblmotor2;
    private javax.swing.JLabel lblmotortype;
    private javax.swing.JLabel lbloverallcondi;
    private javax.swing.JLabel lblyear;
    private javax.swing.JLabel model;
    private javax.swing.JScrollPane recordsscrollpane;
    private javax.swing.JTable recordstable;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtdailyrentalrate;
    private javax.swing.JTextField txtfuel;
    private javax.swing.JTextField txtinspectdate;
    private javax.swing.JTextField txtmaintedate;
    private javax.swing.JTextField txtmileage;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtmotorid;
    private javax.swing.JTextField txtyear;
    private javax.swing.JDialog viewdamagereportdialog;
    private javax.swing.JDialog viewdmgreport;
    private javax.swing.JDialog viewfurtherdetails;
    private javax.swing.JDialog viewinspect;
    private javax.swing.JDialog viewinspectdialog;
    private javax.swing.JDialog viewmainte;
    private javax.swing.JDialog viewmaintedialog;
    private javax.swing.JDialog viewmmotorcycle;
    // End of variables declaration//GEN-END:variables
}
