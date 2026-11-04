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
import java.util.List;

public class ViewMotorcycleRecords extends javax.swing.JPanel {

    private String selectedInspectionMotorId = null;
    private String selectedMaintenanceMotorId = null;
    private String selectedDamageReportMotorId = null;
    
    public ViewMotorcycleRecords() {
        javax.swing.UIManager.put("Button.focusWidth", 0);
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        loadTableData();
    }

    private void notifyDashboardRefresh() {
        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }
    }

    public void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) recordstable.getModel();
        model.setRowCount(0);

        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addRow(new Object[]{
                m.getId(), m.getBrand(), m.getModel(), m.getYear(), m.getType(), m.getMileage(), m.getDailyRate(), m.getStatus()
            });
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewmainte = new javax.swing.JDialog();
        btnSaveMainte = new javax.swing.JButton();
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
        btnViewInspectSave = new javax.swing.JButton();
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
        maintefilter = new javax.swing.JComboBox<>();
        lblFilterStat = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btneditinspect2 = new javax.swing.JButton();
        mainteapplyfilter = new javax.swing.JButton();
        txtSearchMaintenance = new javax.swing.JTextField();
        lblSearchId = new javax.swing.JLabel();
        btndeleteinspect = new javax.swing.JButton();
        viewinspectdialog = new javax.swing.JDialog();
        inspectfilter = new javax.swing.JComboBox<>();
        lblFilterStat1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnEditInspect = new javax.swing.JButton();
        InspectApplyFilter = new javax.swing.JButton();
        txtSearchInspect = new javax.swing.JTextField();
        lblSearchId1 = new javax.swing.JLabel();
        btnInpsectDelete = new javax.swing.JButton();
        viewdamagereportdialog = new javax.swing.JDialog();
        DamageRepApplyFilter = new javax.swing.JButton();
        btnEditDamageReport = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        lblFilterStat2 = new javax.swing.JLabel();
        DamagReportFilter = new javax.swing.JComboBox<>();
        lblSearchId2 = new javax.swing.JLabel();
        txtSearchDamageReport = new javax.swing.JTextField();
        btnDamageReportDelete = new javax.swing.JButton();
        viewdmgreport = new javax.swing.JDialog();
        btnDamageReport = new javax.swing.JButton();
        viewmmotorcycle = new javax.swing.JDialog();
        btnSaveViewMotorcycle = new javax.swing.JButton();
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
        viewfurtherdetails = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        description = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        recordsscrollpane = new javax.swing.JScrollPane();
        recordstable = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnViewInspectionRecord = new javax.swing.JButton();
        btnViewMaintenanceRecord = new javax.swing.JButton();
        btnViewDmg = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnViewFurtherDetails = new javax.swing.JButton();

        btnSaveMainte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSaveMainte.setText("Save");
        btnSaveMainte.setFocusPainted(false);
        btnSaveMainte.setFocusable(false);
        btnSaveMainte.addActionListener(this::btnSaveMainteActionPerformed);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(12, 2, 15, 15));

        lblmotor2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor2.setText("Motorcycle:");
        jPanel1.add(lblmotor2);

        jComboBox1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);
        jPanel1.add(jComboBox1);

        lblmaintenancedate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmaintenancedate.setText("Maintenance Date:");
        jPanel1.add(lblmaintenancedate);

        txtmaintedate.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtmaintedate);

        lblmaintenancetype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmaintenancetype.setText("Maintenance Type:");
        jPanel1.add(lblmaintenancetype);

        jComboBox4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventive", "Corrective" }));
        jComboBox4.setFocusable(false);
        jPanel1.add(jComboBox4);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Service Category");
        jPanel1.add(jLabel12);

        jTextField12.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField12);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setText("Work Performed:");
        jPanel1.add(jLabel16);

        jTextField19.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField19);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Parts Replaced:");
        jPanel1.add(jLabel13);

        jTextField11.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField11);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setText("Odometer Reading(km):");
        jPanel1.add(jLabel17);

        jTextField13.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField13);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Maintenance Cost:");
        jPanel1.add(jLabel2);

        jTextField15.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField15);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Next Service Mileage:");
        jPanel1.add(jLabel3);

        jTextField14.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField14);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setText("Maintenance Status:");
        jPanel1.add(jLabel14);

        jComboBox2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "In Progress", "Completed" }));
        jComboBox2.setFocusable(false);
        jPanel1.add(jComboBox2);

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel21.setText("Motorcycle Availability:");
        jPanel1.add(jLabel21);

        jComboBox3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Under Maintenance" }));
        jComboBox3.setFocusable(false);
        jPanel1.add(jComboBox3);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("Remarks");
        jPanel1.add(jLabel15);

        jTextField16.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField16);

        javax.swing.GroupLayout viewmainteLayout = new javax.swing.GroupLayout(viewmainte.getContentPane());
        viewmainte.getContentPane().setLayout(viewmainteLayout);
        viewmainteLayout.setHorizontalGroup(
            viewmainteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmainteLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(btnSaveMainte)
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
                .addComponent(btnSaveMainte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnViewInspectSave.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewInspectSave.setText("Save");
        btnViewInspectSave.setFocusPainted(false);
        btnViewInspectSave.setFocusable(false);
        btnViewInspectSave.addActionListener(this::btnViewInspectSaveActionPerformed);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel5.setLayout(new java.awt.GridLayout(15, 2, 15, 15));

        lblmotor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor.setText("Motorcycle:");
        jPanel5.add(lblmotor);

        cmbmotorcycle.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cmbmotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbmotorcycle.setFocusable(false);
        cmbmotorcycle.addActionListener(this::cmbmotorcycleActionPerformed);
        jPanel5.add(cmbmotorcycle);

        lblinspectiondate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblinspectiondate.setText("Inspection Date:");
        jPanel5.add(lblinspectiondate);

        txtinspectdate.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel5.add(txtinspectdate);

        lblInspectionphase.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblInspectionphase.setText("Inspection Phase:");
        jPanel5.add(lblInspectionphase);

        cbinspectionphase.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbinspectionphase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Rental", "Post-Rental" }));
        cbinspectionphase.setFocusable(false);
        jPanel5.add(cbinspectionphase);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setText("Odometer Reading:");
        jPanel5.add(jLabel19);

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel5.add(jTextField1);

        lblfuel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblfuel.setText("Fuel Level:");
        jPanel5.add(lblfuel);

        txtfuel.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel5.add(txtfuel);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Tire Condition:");
        jPanel5.add(jLabel4);

        jComboBox8.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Scratched", "Dented" }));
        jComboBox8.setFocusable(false);
        jPanel5.add(jComboBox8);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setText("Brake Condition:");
        jPanel5.add(jLabel22);

        jComboBox9.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Worn", "Damaged" }));
        jComboBox9.setFocusable(false);
        jPanel5.add(jComboBox9);

        lblheadlightandsignal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblheadlightandsignal.setText("Headlight and Signal Lights:");
        jPanel5.add(lblheadlightandsignal);

        cbheadlight.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbheadlight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        cbheadlight.setFocusable(false);
        jPanel5.add(cbheadlight);

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setText("Horns");
        jPanel5.add(jLabel23);

        jComboBox10.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        jComboBox10.setFocusable(false);
        jPanel5.add(jComboBox10);

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel24.setText("Mirrors");
        jPanel5.add(jLabel24);

        jComboBox11.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete", "Missing", "Damaged" }));
        jComboBox11.setFocusable(false);
        jPanel5.add(jComboBox11);

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setText("Motorcycle Body:");
        jPanel5.add(jLabel25);

        jComboBox12.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Needs Repair" }));
        jComboBox12.setFocusable(false);
        jPanel5.add(jComboBox12);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Engine Condition:");
        jPanel5.add(jLabel1);

        jComboBox13.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Unusual Noise", "Other Issue" }));
        jComboBox13.setFocusable(false);
        jPanel5.add(jComboBox13);

        lbloverallcondi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbloverallcondi.setText("Overall Condition:");
        jPanel5.add(lbloverallcondi);

        cbcondition.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbcondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Minor Damage", "Needs Repair", "Unsafe" }));
        cbcondition.setFocusable(false);
        jPanel5.add(cbcondition);

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setText("Readiness Status:");
        jPanel5.add(jLabel26);

        jComboBox14.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready", "Not Ready" }));
        jComboBox14.setFocusable(false);
        jPanel5.add(jComboBox14);

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel27.setText("Inspection Notes:");
        jPanel5.add(jLabel27);

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel5.add(jTextField2);

        javax.swing.GroupLayout viewinspectLayout = new javax.swing.GroupLayout(viewinspect.getContentPane());
        viewinspect.getContentPane().setLayout(viewinspectLayout);
        viewinspectLayout.setHorizontalGroup(
            viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewinspectLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(btnViewInspectSave)
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
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(btnViewInspectSave)
                .addGap(16, 16, 16))
            .addGroup(viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewinspectLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        maintefilter.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        maintefilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "In Progress", "Completed" }));
        maintefilter.setFocusable(false);
        maintefilter.addActionListener(this::maintefilterActionPerformed);

        lblFilterStat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblFilterStat.setText("Filter Status:");

        jTable3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Maintenance ID", "Motorcycle ID/Plate #", "Date", "Type", "Service Category", "Work Performed", "Parts Replaced", "Odometer Reading (km)", "Maintenance Cost (₱)", "Next Service Mileage", "Status", "Availability", "Remarks"
            }
        ));
        jScrollPane8.setViewportView(jTable3);

        btneditinspect2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btneditinspect2.setText("Edit");
        btneditinspect2.setFocusPainted(false);
        btneditinspect2.setFocusable(false);
        btneditinspect2.addActionListener(this::btneditinspect2ActionPerformed);

        mainteapplyfilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mainteapplyfilter.setText("Apply Filter");
        mainteapplyfilter.setFocusPainted(false);
        mainteapplyfilter.setFocusable(false);
        mainteapplyfilter.addActionListener(this::mainteapplyfilterActionPerformed);

        txtSearchMaintenance.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSearchMaintenance.addActionListener(this::txtSearchMaintenanceActionPerformed);

        lblSearchId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblSearchId.setText("Search ID/Keyword");

        btndeleteinspect.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btndeleteinspect.setText("Delete");
        btndeleteinspect.setFocusPainted(false);
        btndeleteinspect.setFocusable(false);
        btndeleteinspect.addActionListener(this::btndeleteinspectActionPerformed);

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
                        .addComponent(btndeleteinspect))
                    .addGroup(viewmaintedialogLayout.createSequentialGroup()
                        .addComponent(lblFilterStat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maintefilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mainteapplyfilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewmaintedialogLayout.setVerticalGroup(
            viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmaintedialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilterStat)
                    .addComponent(maintefilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchId)
                    .addComponent(txtSearchMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainteapplyfilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditinspect2)
                    .addComponent(btndeleteinspect))
                .addGap(18, 18, 18))
        );

        inspectfilter.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        inspectfilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Good", "Minor Damage", "Needs Repair", "Unsafe" }));
        inspectfilter.setFocusable(false);
        inspectfilter.addActionListener(this::inspectfilterActionPerformed);

        lblFilterStat1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblFilterStat1.setText("Filter Status:");

        jTable2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Inspection ID", "Motorcycle ID/Plate #", "Date", "Phase", "Odometer", "Fuel Level", "Tire Condition", "Brake Condition", "Headlight & Signals", "Horns", "Mirrors", "Body Condition", "Engine Condition", "Overall Condition", "Readiness Status", "Inspection Notes"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        btnEditInspect.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEditInspect.setText("Edit");
        btnEditInspect.setFocusPainted(false);
        btnEditInspect.setFocusable(false);
        btnEditInspect.addActionListener(this::btnEditInspectActionPerformed);

        InspectApplyFilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        InspectApplyFilter.setText("Apply Filter");
        InspectApplyFilter.setFocusPainted(false);
        InspectApplyFilter.setFocusable(false);
        InspectApplyFilter.addActionListener(this::InspectApplyFilterActionPerformed);

        txtSearchInspect.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSearchInspect.addActionListener(this::txtSearchInspectActionPerformed);

        lblSearchId1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblSearchId1.setText("Search ID/Keyword");

        btnInpsectDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnInpsectDelete.setText("Delete");
        btnInpsectDelete.setFocusPainted(false);
        btnInpsectDelete.setFocusable(false);
        btnInpsectDelete.addActionListener(this::btnInpsectDeleteActionPerformed);

        javax.swing.GroupLayout viewinspectdialogLayout = new javax.swing.GroupLayout(viewinspectdialog.getContentPane());
        viewinspectdialog.getContentPane().setLayout(viewinspectdialogLayout);
        viewinspectdialogLayout.setHorizontalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewinspectdialogLayout.createSequentialGroup()
                        .addComponent(btnEditInspect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInpsectDelete))
                    .addGroup(viewinspectdialogLayout.createSequentialGroup()
                        .addComponent(lblFilterStat1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inspectfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSearchId1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchInspect, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InspectApplyFilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewinspectdialogLayout.setVerticalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilterStat1)
                    .addComponent(inspectfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchId1)
                    .addComponent(txtSearchInspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InspectApplyFilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditInspect)
                    .addComponent(btnInpsectDelete))
                .addGap(18, 18, 18))
        );

        DamageRepApplyFilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        DamageRepApplyFilter.setText("Apply Filter");
        DamageRepApplyFilter.setFocusPainted(false);
        DamageRepApplyFilter.setFocusable(false);
        DamageRepApplyFilter.addActionListener(this::DamageRepApplyFilterActionPerformed);

        btnEditDamageReport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEditDamageReport.setText("Edit");
        btnEditDamageReport.setFocusPainted(false);
        btnEditDamageReport.setFocusable(false);
        btnEditDamageReport.addActionListener(this::btnEditDamageReportActionPerformed);

        jTable4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Report ID", "Motorcycle ID/Plate #", "Date", "Location", "Type", "Description", "Action Required", "Cost (₱)", "Status", "Notes"
            }
        ));
        jScrollPane9.setViewportView(jTable4);

        lblFilterStat2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblFilterStat2.setText("Filter Status:");

        DamagReportFilter.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        DamagReportFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "Under Repair", "Resolved" }));
        DamagReportFilter.setFocusable(false);
        DamagReportFilter.addActionListener(this::DamagReportFilterActionPerformed);

        lblSearchId2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblSearchId2.setText("Search ID/Keyword");

        txtSearchDamageReport.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSearchDamageReport.addActionListener(this::txtSearchDamageReportActionPerformed);

        btnDamageReportDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDamageReportDelete.setText("Delete");
        btnDamageReportDelete.setFocusPainted(false);
        btnDamageReportDelete.setFocusable(false);
        btnDamageReportDelete.addActionListener(this::btnDamageReportDeleteActionPerformed);

        javax.swing.GroupLayout viewdamagereportdialogLayout = new javax.swing.GroupLayout(viewdamagereportdialog.getContentPane());
        viewdamagereportdialog.getContentPane().setLayout(viewdamagereportdialogLayout);
        viewdamagereportdialogLayout.setHorizontalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addComponent(btnEditDamageReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDamageReportDelete))
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addComponent(lblFilterStat2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DamagReportFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSearchId2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchDamageReport, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DamageRepApplyFilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewdamagereportdialogLayout.setVerticalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilterStat2)
                    .addComponent(DamagReportFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchId2)
                    .addComponent(txtSearchDamageReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DamageRepApplyFilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditDamageReport)
                    .addComponent(btnDamageReportDelete))
                .addGap(18, 18, 18))
        );

        btnDamageReport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDamageReport.setText("Save");
        btnDamageReport.setFocusPainted(false);
        btnDamageReport.setFocusable(false);
        btnDamageReport.addActionListener(this::btnDamageReportActionPerformed);

        javax.swing.GroupLayout viewdmgreportLayout = new javax.swing.GroupLayout(viewdmgreport.getContentPane());
        viewdmgreport.getContentPane().setLayout(viewdmgreportLayout);
        viewdmgreportLayout.setHorizontalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(btnDamageReport)
                .addGap(311, 311, 311))
        );
        viewdmgreportLayout.setVerticalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(btnDamageReport)
                .addGap(42, 42, 42))
        );

        btnSaveViewMotorcycle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSaveViewMotorcycle.setText("Save");
        btnSaveViewMotorcycle.setFocusPainted(false);
        btnSaveViewMotorcycle.setFocusable(false);
        btnSaveViewMotorcycle.addActionListener(this::btnSaveViewMotorcycleActionPerformed);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setLayout(new java.awt.GridLayout(11, 2, 15, 15));

        lblMotorID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMotorID.setText("Motorcycle ID/Plate #:");
        jPanel2.add(lblMotorID);

        txtmotorid.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtmotorid.addActionListener(this::txtmotoridActionPerformed);
        jPanel2.add(txtmotorid);

        brand.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        brand.setText("Brand:");
        jPanel2.add(brand);

        txtbrand.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(txtbrand);

        model.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        model.setText("Model:");
        jPanel2.add(model);

        txtmodel.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(txtmodel);

        lblyear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblyear.setText("Year:");
        jPanel2.add(lblyear);

        txtyear.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(txtyear);

        lblmileage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmileage.setText("Mileage (km):");
        jPanel2.add(lblmileage);

        txtmileage.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(txtmileage);

        lbldailyrentalrate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbldailyrentalrate.setText("Daily Rental Rate:");
        jPanel2.add(lbldailyrentalrate);

        txtdailyrentalrate.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(txtdailyrentalrate);

        lblmotortype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotortype.setText("Motorcycle Type");
        jPanel2.add(lblmotortype);

        cmbtypes.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cmbtypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electic Bike", " " }));
        cmbtypes.setFocusable(false);
        cmbtypes.addActionListener(this::cmbtypesActionPerformed);
        jPanel2.add(cmbtypes);

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel38.setText("Transmission Type:");
        jPanel2.add(jLabel38);

        jTextField23.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(jTextField23);

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel2.add(jLabel39);

        jTextField24.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(jTextField24);

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel2.add(jLabel40);

        jTextField25.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(jTextField25);

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel2.add(jLabel41);

        jTextField26.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel2.add(jTextField26);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel3.setLayout(new java.awt.GridLayout(9, 2, 15, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Motorcycle:");
        jPanel3.add(jLabel10);

        jComboBox5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.setFocusable(false);
        jComboBox5.addActionListener(this::jComboBox5ActionPerformed);
        jPanel3.add(jComboBox5);

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel18.setText("Damage Location: ");
        jPanel3.add(jLabel18);

        jTextField7.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel3.add(jTextField7);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Damage Type:");
        jPanel3.add(jLabel8);

        jComboBox6.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scratch", "Dent", "Crack", "Broken Part" }));
        jComboBox6.setFocusable(false);
        jPanel3.add(jComboBox6);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel20.setText("Damage Description:");
        jPanel3.add(jLabel20);

        jTextField5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel3.add(jTextField5);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Date Reported:");
        jPanel3.add(jLabel6);

        jTextField4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel3.add(jTextField4);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Action Required:");
        jPanel3.add(jLabel5);

        jComboBox7.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repair", "Monitor", "No Action" }));
        jComboBox7.setFocusable(false);
        jPanel3.add(jComboBox7);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Damage Status:");
        jPanel3.add(jLabel7);

        jComboBox15.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Under Repair", "Resolved" }));
        jComboBox15.setFocusable(false);
        jPanel3.add(jComboBox15);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("Additional Notes:");
        jPanel3.add(jLabel9);

        jTextField6.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel3.add(jTextField6);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("Estimated Repair Cost:");
        jPanel3.add(jLabel11);

        jTextField8.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel3.add(jTextField8);

        javax.swing.GroupLayout viewmmotorcycleLayout = new javax.swing.GroupLayout(viewmmotorcycle.getContentPane());
        viewmmotorcycle.getContentPane().setLayout(viewmmotorcycleLayout);
        viewmmotorcycleLayout.setHorizontalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(btnSaveViewMotorcycle)
                .addGap(427, 427, 427))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewmmotorcycleLayout.setVerticalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(btnSaveViewMotorcycle)
                .addGap(15, 15, 15))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setText("Browse registered motorcycles and their current status.");

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Motorcycle Records");

        recordstable.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
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

        ID.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        ID.setText("Search ID:");

        txtSearch.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSearch.addActionListener(this::txtSearchActionPerformed);

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setFocusPainted(false);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnViewInspectionRecord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewInspectionRecord.setText("View Inspection");
        btnViewInspectionRecord.setFocusPainted(false);
        btnViewInspectionRecord.setFocusable(false);
        btnViewInspectionRecord.addActionListener(this::btnViewInspectionRecordActionPerformed);

        btnViewMaintenanceRecord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewMaintenanceRecord.setText("View Maintenance");
        btnViewMaintenanceRecord.setFocusPainted(false);
        btnViewMaintenanceRecord.setFocusable(false);
        btnViewMaintenanceRecord.addActionListener(this::btnViewMaintenanceRecordActionPerformed);

        btnViewDmg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewDmg.setText("View Damage Report");
        btnViewDmg.setFocusPainted(false);
        btnViewDmg.setFocusable(false);
        btnViewDmg.addActionListener(this::btnViewDmgActionPerformed);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFocusPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setFocusPainted(false);
        btnRefresh.setFocusable(false);
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setFocusPainted(false);
        btnEdit.setFocusable(false);
        btnEdit.addActionListener(this::btnEditActionPerformed);

        btnViewFurtherDetails.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewFurtherDetails.setText("View Further Details");
        btnViewFurtherDetails.setFocusPainted(false);
        btnViewFurtherDetails.setFocusable(false);
        btnViewFurtherDetails.addActionListener(this::btnViewFurtherDetailsActionPerformed);

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
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch))
                        .addComponent(recordsscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewInspectionRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewMaintenanceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewDmg, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewFurtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordsscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewInspectionRecord)
                    .addComponent(btnViewMaintenanceRecord)
                    .addComponent(btnViewDmg)
                    .addComponent(btnViewFurtherDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh)
                    .addComponent(btnEdit))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewInspectionRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInspectionRecordActionPerformed
        int selectedRow = recordstable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a motorcycle row.", "Selection Required", JOptionPane.WARNING_MESSAGE);
        return;
    }

    selectedInspectionMotorId = recordstable.getValueAt(selectedRow, 0).toString().trim();
    
    txtSearchInspect.setText("");
    inspectfilter.setSelectedIndex(0);

    InspectApplyFilterActionPerformed(evt);
    
    viewinspectdialog.setSize(1520, 520);
    viewinspectdialog.setLocationRelativeTo(this);
    viewinspectdialog.setVisible(true);
    }//GEN-LAST:event_btnViewInspectionRecordActionPerformed

    private void btnViewMaintenanceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMaintenanceRecordActionPerformed
       int selectedRow = recordstable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a motorcycle row.", "Selection Required", JOptionPane.WARNING_MESSAGE);
        return;
    }

    selectedMaintenanceMotorId = recordstable.getValueAt(selectedRow, 0).toString().trim();
    txtSearchMaintenance.setText("");
    maintefilter.setSelectedIndex(0);

    mainteapplyfilterActionPerformed(evt);

    viewmaintedialog.setSize(1520, 520);
    viewmaintedialog.setLocationRelativeTo(this);
    viewmaintedialog.setVisible(true);
    }//GEN-LAST:event_btnViewMaintenanceRecordActionPerformed

    private void btnViewDmgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDmgActionPerformed
      int selectedRow = recordstable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a motorcycle row.", "Selection Required", JOptionPane.WARNING_MESSAGE);
        return;
    }

    selectedDamageReportMotorId = recordstable.getValueAt(selectedRow, 0).toString().trim();
    txtSearchDamageReport.setText("");
    DamagReportFilter.setSelectedIndex(0);

    DamageRepApplyFilterActionPerformed(evt);

    viewdamagereportdialog.setSize(1520, 520);
    viewdamagereportdialog.setLocationRelativeTo(this);
    viewdamagereportdialog.setVisible(true);
    }//GEN-LAST:event_btnViewDmgActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
    btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnEditInspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInspectActionPerformed
 int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewinspectdialog, "Please select an inspection record to edit.");
            return;
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cmbmotorcycle.setModel(model);

        String recId = jTable2.getValueAt(selectedRow, 0).toString();
        for (InspectionRecord record : TrimotoSystem.inspections) {
            if (recId.equalsIgnoreCase(record.recordId)) {

                for (int i = 0; i < cmbmotorcycle.getItemCount(); i++) {
                    if (cmbmotorcycle.getItemAt(i).startsWith(record.motorcycleId)) {
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

                viewinspect.setSize(720, 620);
                viewinspect.setLocationRelativeTo(this);
                viewinspect.setVisible(true);
                break;
            }
        }
        
        
    }//GEN-LAST:event_btnEditInspectActionPerformed

    private void btneditinspect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditinspect2ActionPerformed
        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewmaintedialog, "Please select a maintenance record to edit.");
            return;
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        jComboBox1.setModel(model);

        String recId = jTable3.getValueAt(selectedRow, 0).toString();
        for (MaintenanceRecord record : TrimotoSystem.maintenanceRecords) {
            if (recId.equalsIgnoreCase(record.recordId)) {

                for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                    if (jComboBox1.getItemAt(i).startsWith(record.motorcycleId)) {
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

                viewmainte.setSize(720, 550);
                viewmainte.setLocationRelativeTo(this);
                viewmainte.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btneditinspect2ActionPerformed

    private void btnEditDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDamageReportActionPerformed
        int selectedRow = jTable4.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Please select a damage report to edit.");
            return;
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        jComboBox5.setModel(model);

        String reportId = jTable4.getValueAt(selectedRow, 0).toString();
        String selectedMotorId = jTable4.getValueAt(selectedRow, 1).toString();

        for (int i = 0; i < jComboBox5.getItemCount(); i++) {
            if (jComboBox5.getItemAt(i).startsWith(selectedMotorId)) {
                jComboBox5.setSelectedIndex(i);
                break;
            }
        }

        for (String report : TrimotoSystem.damageReports) {
            if (report.contains("Report ID: " + reportId)) {
                jTextField7.setText(extractField(report, "Location"));
                jComboBox6.setSelectedItem(extractField(report, "Type"));
                jTextField5.setText(extractField(report, "Description"));
                jTextField4.setText(extractField(report, "Date"));
                jComboBox7.setSelectedItem(extractField(report, "Action Required"));
                jComboBox15.setSelectedItem(extractField(report, "Status"));
                jTextField6.setText(extractField(report, "Notes"));
                jTextField8.setText(extractField(report, "Cost"));

                viewdmgreport.setSize(720, 500);
                viewdmgreport.setLocationRelativeTo(this);
                viewdmgreport.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btnEditDamageReportActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void btnDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamageReportActionPerformed
        int selectedRow = jTable4.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewdmgreport, "Please select a damage report row to save.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String date = jTextField4.getText().trim();
        String location = jTextField7.getText().trim();
        String desc = jTextField5.getText().trim();
        String cost = jTextField8.getText().trim();
        String notes = jTextField6.getText().trim();

        if (date.isEmpty() || location.isEmpty() || desc.isEmpty() || cost.isEmpty() || notes.isEmpty()) {
            JOptionPane.showMessageDialog(viewdmgreport, "All fields are required to update a damage report. Please complete all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String reportId = jTable4.getValueAt(selectedRow, 0).toString();
        String motorId = jTable4.getValueAt(selectedRow, 1).toString();
        String status = jComboBox15.getSelectedItem().toString();

        StringBuilder newReport = new StringBuilder();
        newReport.append("Report ID: ").append(reportId).append("\n");
        newReport.append("Motorcycle: ").append(motorId).append("\n");
        newReport.append("Date: ").append(date).append("\n");
        newReport.append("Location: ").append(location).append("\n");
        newReport.append("Type: ").append(jComboBox6.getSelectedItem().toString()).append("\n");
        newReport.append("Description: ").append(desc).append("\n");
        newReport.append("Action Required: ").append(jComboBox7.getSelectedItem().toString()).append("\n");
        newReport.append("Cost: ").append(cost).append("\n");
        newReport.append("Status: ").append(status).append("\n");
        newReport.append("Notes: ").append(notes);

        for (int i = 0; i < TrimotoSystem.damageReports.size(); i++) {
            if (TrimotoSystem.damageReports.get(i).contains("Report ID: " + reportId)) {
                TrimotoSystem.damageReports.set(i, newReport.toString());
                
                Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
                if (m != null) {
                    m.setStatus(status);
                }
                break;
            }
        }

        DamageRepApplyFilterActionPerformed(evt);
        TrimotoSystem.saveAllData();
        loadTableData();
        notifyDashboardRefresh(); 
        JOptionPane.showMessageDialog(viewdmgreport, "Damage report updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        viewdmgreport.dispose();
    }//GEN-LAST:event_btnDamageReportActionPerformed

    private void txtmotoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotoridActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle from the table to edit.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String id = recordstable.getValueAt(selectedRow, 0).toString();
        Motorcycle m = TrimotoSystem.findMotorcycleById(id);

        if (m != null) {
            txtmotorid.setText(m.getId());
            txtmotorid.setEditable(false); 
            txtbrand.setText(m.getBrand());
            txtmodel.setText(m.getModel());
            txtyear.setText(String.valueOf(m.getYear()));
            txtmileage.setText(String.valueOf(m.getMileage()));
            txtdailyrentalrate.setText(String.valueOf(m.getDailyRate()));
            
            for (java.awt.event.ActionListener al : cmbtypes.getActionListeners()) {
                cmbtypes.removeActionListener(al);
            }

            cmbtypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { 
                "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electric Bike" 
            }));
            cmbtypes.setSelectedItem(m.getType());
            jTextField23.setText(m.getTransmissionType());

            populateSubclassFieldsFromInfo(m);

            cmbtypes.addActionListener(this::cmbtypesActionPerformed);

            viewmmotorcycle.setSize(950, 560);
            viewmmotorcycle.setLocationRelativeTo(this);
            viewmmotorcycle.setVisible(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadTableData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle row to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String id = recordstable.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to delete motorcycle " + id + "?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.motorcycles.removeIf(m -> m.getId().equals(id));
            TrimotoSystem.saveAllData();
            loadTableData();
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(this, "Motorcycle " + id + " deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveMainteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMainteActionPerformed
    int tableRow = jTable3.getSelectedRow();
    if (tableRow == -1) return;

    String date = txtmaintedate.getText().trim();
    String category = jTextField12.getText().trim();
    String workPerformed = jTextField19.getText().trim();
    String partsReplaced = jTextField11.getText().trim();
    String odometer = jTextField13.getText().trim();
    String costStr = jTextField15.getText().trim();
    String nextMileage = jTextField14.getText().trim();
    String remarks = jTextField16.getText().trim();

    if (date.isEmpty() || category.isEmpty() || workPerformed.isEmpty() || 
        partsReplaced.isEmpty() || odometer.isEmpty() || costStr.isEmpty() || nextMileage.isEmpty()) {
        JOptionPane.showMessageDialog(viewmainte, "Please fill in all maintenance fields. Only Remarks can be left blank.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double cost = Double.parseDouble(costStr);
        String targetRecId = jTable3.getValueAt(tableRow, 0).toString();

        for (MaintenanceRecord record : TrimotoSystem.maintenanceRecords) {
            if (targetRecId.equalsIgnoreCase(record.recordId)) {
                if (jComboBox1.getSelectedItem() != null) {
                    String selectedCombo = jComboBox1.getSelectedItem().toString();
                    record.motorcycleId = selectedCombo.split(" - ")[0].trim();
                }
                record.date = date;
                record.type = jComboBox4.getSelectedItem().toString();
                record.category = category;
                record.workPerformed = workPerformed;
                record.partsReplaced = partsReplaced;
                record.odometer = odometer;
                record.cost = cost;
                record.nextServiceMileage = nextMileage;
                record.status = jComboBox2.getSelectedItem().toString();
                record.availability = jComboBox3.getSelectedItem().toString();
                record.remarks = remarks;
                break;
            }
        }

        mainteapplyfilterActionPerformed(evt); 
        TrimotoSystem.saveAllData();
        loadTableData();
        notifyDashboardRefresh();
        JOptionPane.showMessageDialog(viewmainte, "Maintenance record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        viewmainte.dispose();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(viewmainte, "Please enter a valid numeric value for Maintenance Cost.", "Format Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSaveMainteActionPerformed

    private void btnViewInspectSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInspectSaveActionPerformed
    int tableRow = jTable2.getSelectedRow();
    if (tableRow == -1) return;

    String date = txtinspectdate.getText().trim();
    String odometer = jTextField1.getText().trim();
    String fuel = txtfuel.getText().trim();

    if (date.isEmpty() || odometer.isEmpty() || fuel.isEmpty()) {
        JOptionPane.showMessageDialog(viewinspect, "Please fill in all required inspection fields (Date, Odometer, Fuel). Only Notes can be left blank.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String targetRecId = jTable2.getValueAt(tableRow, 0).toString();
    for (InspectionRecord record : TrimotoSystem.inspections) {
        if (targetRecId.equalsIgnoreCase(record.recordId)) {
            if (cmbmotorcycle.getSelectedItem() != null) {
                String selectedCombo = cmbmotorcycle.getSelectedItem().toString();
                record.motorcycleId = selectedCombo.split(" - ")[0].trim();
            }
            record.date = date;
            record.phase = cbinspectionphase.getSelectedItem().toString();
            record.odometer = odometer;
            record.fuel = fuel;
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

            Motorcycle m = TrimotoSystem.findMotorcycleById(record.motorcycleId);
            if (m != null) {
                m.setStatus(record.condition); 
            }
            break;
        }
    }

    InspectApplyFilterActionPerformed(evt);
    TrimotoSystem.saveAllData();
    loadTableData();
    notifyDashboardRefresh(); 
    JOptionPane.showMessageDialog(viewinspect, "Inspection record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    viewinspect.dispose();
    }//GEN-LAST:event_btnViewInspectSaveActionPerformed

    private void btndeleteinspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteinspectActionPerformed
        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewmaintedialog, "Please select a maintenance record to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String recId = jTable3.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(viewmaintedialog, "Are you sure you want to delete maintenance record " + recId + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.maintenanceRecords.removeIf(r -> r.recordId.equalsIgnoreCase(recId));
            TrimotoSystem.saveAllData();
            mainteapplyfilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewmaintedialog, "Maintenance record deleted.");
        }
    }//GEN-LAST:event_btndeleteinspectActionPerformed

    private void txtSearchMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchMaintenanceActionPerformed
        mainteapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_txtSearchMaintenanceActionPerformed

    private void maintefilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintefilterActionPerformed
        mainteapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_maintefilterActionPerformed

    private void cmbmotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmotorcycleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmotorcycleActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnInpsectDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInpsectDeleteActionPerformed
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewinspectdialog, "Please select an inspection record to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String recId = jTable2.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(viewinspectdialog, "Are you sure you want to delete inspection record " + recId + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.inspections.removeIf(r -> r.recordId.equalsIgnoreCase(recId));
            TrimotoSystem.saveAllData();
            InspectApplyFilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewinspectdialog, "Inspection record deleted.");
        }    }//GEN-LAST:event_btnInpsectDeleteActionPerformed

    private void inspectfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspectfilterActionPerformed
        InspectApplyFilterActionPerformed(evt);
    }//GEN-LAST:event_inspectfilterActionPerformed

    private void txtSearchInspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchInspectActionPerformed
        InspectApplyFilterActionPerformed(evt);
    }//GEN-LAST:event_txtSearchInspectActionPerformed

    private void DamagReportFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamagReportFilterActionPerformed
        DamageRepApplyFilterActionPerformed(evt);
    }//GEN-LAST:event_DamagReportFilterActionPerformed

    private void btnDamageReportDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamageReportDeleteActionPerformed
        int selectedRow = jTable4.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Please select a damage report to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String recId = jTable4.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(viewdamagereportdialog, "Are you sure you want to delete damage report " + recId + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.damageReports.removeIf(r -> r.contains("Report ID: " + recId));
            TrimotoSystem.saveAllData();
            DamageRepApplyFilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Damage report deleted.");
        }
    }//GEN-LAST:event_btnDamageReportDeleteActionPerformed

    private void txtSearchDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDamageReportActionPerformed
        DamageRepApplyFilterActionPerformed(evt);
    }//GEN-LAST:event_txtSearchDamageReportActionPerformed

    private void btnSaveViewMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveViewMotorcycleActionPerformed
        int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            viewmmotorcycle.dispose();
            return;
        }

        String brand = txtbrand.getText().trim();
        String model = txtmodel.getText().trim();
        String yearStr = txtyear.getText().trim();
        String mileageStr = txtmileage.getText().trim();
        String rateStr = txtdailyrentalrate.getText().trim();

        if (brand.isEmpty() || model.isEmpty() || yearStr.isEmpty() || mileageStr.isEmpty() || rateStr.isEmpty()) {
            JOptionPane.showMessageDialog(viewmmotorcycle, "Please fill in all primary motorcycle details (Brand, Model, Year, Mileage, Daily Rate).", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String targetId = txtmotorid.getText().trim();
        Motorcycle m = TrimotoSystem.findMotorcycleById(targetId);

        if (m != null) {
            try {
                int year = Integer.parseInt(yearStr);
                int mileage = Integer.parseInt(mileageStr);
                double rate = Double.parseDouble(rateStr);
                String trans = jTextField23.getText().trim().isEmpty() ? "Manual" : jTextField23.getText().trim();
                String type = cmbtypes.getSelectedItem() != null ? cmbtypes.getSelectedItem().toString() : m.getType();

                double spec1 = jTextField24.getText().trim().isEmpty() ? 0 : Double.parseDouble(jTextField24.getText().trim());
                double spec2 = jTextField25.getText().trim().isEmpty() ? 0 : Double.parseDouble(jTextField25.getText().trim());
                double spec3 = jTextField26.getText().trim().isEmpty() ? 0 : Double.parseDouble(jTextField26.getText().trim());

                Motorcycle updatedMotorcycle = MotorcycleFactory.createMotorcycle(
                    type, targetId, brand, model, year, trans, mileage, rate, spec1, spec2, spec3
                );
                updatedMotorcycle.setStatus(m.getStatus());

                int index = TrimotoSystem.motorcycles.indexOf(m);
                if (index != -1) {
                    TrimotoSystem.motorcycles.set(index, updatedMotorcycle);
                }
                TrimotoSystem.saveAllData();
                loadTableData();
                notifyDashboardRefresh();
                JOptionPane.showMessageDialog(viewmmotorcycle, "Motorcycle record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                viewmmotorcycle.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(viewmmotorcycle, "Please enter valid numeric values for Year, Mileage, Daily Rate, and Specifications.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveViewMotorcycleActionPerformed

    private void mainteapplyfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainteapplyfilterActionPerformed
       String filterStatus = maintefilter.getSelectedItem() != null ? maintefilter.getSelectedItem().toString() : "All";
    String keyword = txtSearchMaintenance.getText().trim().toLowerCase();

    DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
    model.setRowCount(0);

    for (MaintenanceRecord r : TrimotoSystem.maintenanceRecords) {
        boolean matchesMotorcycle = selectedMaintenanceMotorId == null || 
                                     r.motorcycleId.trim().equalsIgnoreCase(selectedMaintenanceMotorId);

        boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || r.status.equalsIgnoreCase(filterStatus);
        boolean matchesKeyword = keyword.isEmpty() || 
                                 r.recordId.toLowerCase().contains(keyword) || 
                                 r.motorcycleId.toLowerCase().contains(keyword);

        if (matchesMotorcycle && matchesStatus && matchesKeyword) {
            model.addRow(new Object[]{
                r.recordId, r.motorcycleId, r.date, r.type,
                r.category, r.workPerformed, r.partsReplaced,
                r.odometer, r.cost, r.nextServiceMileage,
                r.status, r.availability, r.remarks
            });
        }
    }
    }//GEN-LAST:event_mainteapplyfilterActionPerformed

    private void InspectApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InspectApplyFilterActionPerformed
       String filterStatus = inspectfilter.getSelectedItem() != null ? inspectfilter.getSelectedItem().toString() : "All";
    String keyword = txtSearchInspect.getText().trim().toLowerCase();

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);

    for (InspectionRecord r : TrimotoSystem.inspections) {
        boolean matchesMotorcycle = selectedInspectionMotorId == null || 
                                     r.motorcycleId.trim().equalsIgnoreCase(selectedInspectionMotorId);

        boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || r.condition.equalsIgnoreCase(filterStatus);
        boolean matchesKeyword = keyword.isEmpty() || 
                                 r.recordId.toLowerCase().contains(keyword) || 
                                 r.motorcycleId.toLowerCase().contains(keyword);

        if (matchesMotorcycle && matchesStatus && matchesKeyword) {
            model.addRow(new Object[]{
                r.recordId, r.motorcycleId, r.date, r.phase,
                r.odometer, r.fuel, r.tires, r.brakes,
                r.headlight, r.horns, r.mirrors, r.body,
                r.engine, r.condition, r.readiness, r.notes
            });
        }
    }
    }//GEN-LAST:event_InspectApplyFilterActionPerformed

    private void DamageRepApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamageRepApplyFilterActionPerformed
        String filterStatus = DamagReportFilter.getSelectedItem() != null ? DamagReportFilter.getSelectedItem().toString() : "All";
    String keyword = txtSearchDamageReport.getText().trim().toLowerCase();

    DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
    model.setRowCount(0);

    for (String report : TrimotoSystem.damageReports) {
        String status = extractField(report, "Status");
        String recId = extractField(report, "Report ID");
        String motorId = extractField(report, "Motorcycle");

        boolean matchesMotorcycle = selectedDamageReportMotorId == null || 
                                     motorId.trim().equalsIgnoreCase(selectedDamageReportMotorId);

        boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || status.equalsIgnoreCase(filterStatus);
        boolean matchesKeyword = keyword.isEmpty() || 
                                 recId.toLowerCase().contains(keyword) || 
                                 motorId.toLowerCase().contains(keyword);

        if (matchesMotorcycle && matchesStatus && matchesKeyword) {
            model.addRow(new Object[]{
                recId,
                motorId,
                extractField(report, "Date"),
                extractField(report, "Location"),
                extractField(report, "Type"),
                extractField(report, "Description"),
                extractField(report, "Action Required"),
                extractField(report, "Cost"),
                status,
                extractField(report, "Notes")
            });
        }
    }

    }//GEN-LAST:event_DamageRepApplyFilterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      String searchId = txtSearch.getText().trim();
        if (searchId.isEmpty()) {
            loadTableData();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) recordstable.getModel();
        model.setRowCount(0);

        for (Motorcycle m : TrimotoSystem.motorcycles) {
            if (m.getId().equalsIgnoreCase(searchId)) {
                model.addRow(new Object[]{
                    m.getId(), m.getBrand(), m.getModel(), m.getYear(), m.getType(), m.getMileage(), m.getDailyRate(), m.getStatus()
                });
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewFurtherDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFurtherDetailsActionPerformed
    int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle row to view details.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String id = recordstable.getValueAt(selectedRow, 0).toString();
        Motorcycle m = TrimotoSystem.findMotorcycleById(id);

        if (m != null) {
            showMotorcycleDetails(m);
        }
    }//GEN-LAST:event_btnViewFurtherDetailsActionPerformed

    private void cmbtypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtypesActionPerformed
        String selectedType = cmbtypes.getSelectedItem() != null ? cmbtypes.getSelectedItem().toString().trim() : "Scooter";

        switch (selectedType) {
            case "Scooter":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Compartment Capacity (L):");
                jLabel41.setText("Fuel Capacity (L):");
                
                jTextField24.setVisible(true);
                jTextField25.setVisible(true);
                jLabel41.setVisible(true);
                jTextField26.setVisible(true);
                jTextField26.setEditable(true);
                break;

            case "Adventure Bike":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Compartment Capacity (L):");
                jLabel41.setText("Fuel Capacity (L):");
                
                jTextField24.setVisible(true);
                jTextField25.setVisible(true);
                jLabel41.setVisible(true);
                jTextField26.setVisible(true);
                jTextField26.setEditable(true);
                break;

            case "Standard Bike":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Fuel Capacity (L):");
                jLabel41.setText("");
                
                jTextField24.setVisible(true);
                jTextField25.setVisible(true);
                jLabel41.setVisible(false);
                jTextField26.setVisible(false);
                jTextField26.setEditable(false);
                break;

            case "Sports Bike":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Fuel Capacity (L):");
                jLabel41.setText("Power Output (HP):");
                
                jTextField24.setVisible(true);
                jTextField25.setVisible(true);
                jLabel41.setVisible(true);
                jTextField26.setVisible(true);
                jTextField26.setEditable(true);
                break;

            case "Electric Bike":
                jLabel39.setText("Motor Power (W):");
                jLabel40.setText("Battery Capacity (Ah):");
                jLabel41.setText("Charging Time (hrs):");
                
                jTextField24.setVisible(true);
                jTextField25.setVisible(true);
                jLabel41.setVisible(true);
                jTextField26.setVisible(true);
                jTextField26.setEditable(true);
                break;

            default:
                jLabel39.setText(" ");
                jLabel40.setText(" ");
                jLabel41.setText(" ");
                break;
        }
    }//GEN-LAST:event_cmbtypesActionPerformed
  
    private void showMotorcycleDetails(Motorcycle m) {
        String details = m.displayMotorcycleInfo();

        jTextArea1.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        jTextArea1.setText(details);
        jTextArea1.setEditable(false);
        jTextArea1.setCaretPosition(0);

        viewfurtherdetails.setTitle("Further Details - " + m.getId());
        viewfurtherdetails.setSize(380, 220);
        viewfurtherdetails.setLocationRelativeTo(this);
        viewfurtherdetails.setVisible(true);
    }
    private void populateSubclassFieldsFromInfo(Motorcycle m) {
        String info = m.displayMotorcycleInfo();
        if (info == null || info.trim().isEmpty()) {
            jLabel39.setText(""); jTextField24.setText("");
            jLabel40.setText(""); jTextField25.setText("");
            jLabel41.setText(""); jTextField26.setText("");
            return;
        }

        String[] lines = info.split("\n");

        if (lines.length > 0 && lines[0].contains(":")) {
            String[] parts = lines[0].split(":", 2);
            jLabel39.setText(parts[0].trim() + ":");
            jTextField24.setText(cleanUnits(parts[1]));
        } else {
            jLabel39.setText(""); jTextField24.setText("");
        }

        if (lines.length > 1 && lines[1].contains(":")) {
            String[] parts = lines[1].split(":", 2);
            jLabel40.setText(parts[0].trim() + ":");
            jTextField25.setText(cleanUnits(parts[1]));
        } else {
            jLabel40.setText(""); jTextField25.setText("");
        }

        if (lines.length > 2 && lines[2].contains(":")) {
            String[] parts = lines[2].split(":", 2);
            jLabel41.setText(parts[0].trim() + ":");
            jTextField26.setText(cleanUnits(parts[1]));
            jLabel41.setVisible(true);
            jTextField26.setVisible(true);
            jTextField26.setEditable(true);
        } else {
            jLabel41.setText("");
            jTextField26.setText("");
            jLabel41.setVisible(false);
            jTextField26.setVisible(false);
            jTextField26.setEditable(false);
        }
    }

    private String cleanUnits(String valueWithUnit) {
        if (valueWithUnit == null) return "";
        return valueWithUnit.replaceAll("[^0-9.]", "").trim();
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DamagReportFilter;
    private javax.swing.JButton DamageRepApplyFilter;
    private javax.swing.JLabel ID;
    private javax.swing.JButton InspectApplyFilter;
    private javax.swing.JLabel brand;
    private javax.swing.JButton btnDamageReport;
    private javax.swing.JButton btnDamageReportDelete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditDamageReport;
    private javax.swing.JButton btnEditInspect;
    private javax.swing.JButton btnInpsectDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSaveMainte;
    private javax.swing.JButton btnSaveViewMotorcycle;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDmg;
    private javax.swing.JButton btnViewFurtherDetails;
    private javax.swing.JButton btnViewInspectSave;
    private javax.swing.JButton btnViewInspectionRecord;
    private javax.swing.JButton btnViewMaintenanceRecord;
    private javax.swing.JButton btndeleteinspect;
    private javax.swing.JButton btneditinspect2;
    private javax.swing.JComboBox<String> cbcondition;
    private javax.swing.JComboBox<String> cbheadlight;
    private javax.swing.JComboBox<String> cbinspectionphase;
    private javax.swing.JComboBox<String> cmbmotorcycle;
    private javax.swing.JComboBox<String> cmbtypes;
    private javax.swing.JLabel description;
    private javax.swing.JComboBox<String> inspectfilter;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
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
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblFilterStat;
    private javax.swing.JLabel lblFilterStat1;
    private javax.swing.JLabel lblFilterStat2;
    private javax.swing.JLabel lblInspectionphase;
    private javax.swing.JLabel lblMotorID;
    private javax.swing.JLabel lblSearchId;
    private javax.swing.JLabel lblSearchId1;
    private javax.swing.JLabel lblSearchId2;
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
    private javax.swing.JButton mainteapplyfilter;
    private javax.swing.JComboBox<String> maintefilter;
    private javax.swing.JLabel model;
    private javax.swing.JScrollPane recordsscrollpane;
    private javax.swing.JTable recordstable;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchDamageReport;
    private javax.swing.JTextField txtSearchInspect;
    private javax.swing.JTextField txtSearchMaintenance;
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