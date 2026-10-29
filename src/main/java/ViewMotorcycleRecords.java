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

    public ViewMotorcycleRecords() {
        javax.swing.UIManager.put("Button.focusWidth", 0);
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
        maintefilter = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btneditinspect2 = new javax.swing.JButton();
        mainteapplyfilter = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btndeleteinspect = new javax.swing.JButton();
        viewinspectdialog = new javax.swing.JDialog();
        inspectfilter = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btneditinspect1 = new javax.swing.JButton();
        inspectapplyfilter = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btninpsectdelete = new javax.swing.JButton();
        viewdamagereportdialog = new javax.swing.JDialog();
        damagerepapplyfilter = new javax.swing.JButton();
        btneditdamagarep = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        damagrepfilter = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        btndamagerepdelete = new javax.swing.JButton();
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
        btnsaveviewmotorcycle = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();

        btnsavemainte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnsavemainte.setText("Save");
        btnsavemainte.addActionListener(this::btnsavemainteActionPerformed);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(12, 2, 15, 15));

        lblmotor2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor2.setText("Motorcycle:");
        jPanel1.add(lblmotor2);

        jComboBox1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jPanel1.add(jComboBox2);

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel21.setText("Motorcycle Availability:");
        jPanel1.add(jLabel21);

        jComboBox3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Under Maintenance" }));
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

        btnviewinspectsave.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnviewinspectsave.setText("Save");
        btnviewinspectsave.addActionListener(this::btnviewinspectsaveActionPerformed);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel5.setLayout(new java.awt.GridLayout(15, 2, 15, 15));

        lblmotor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor.setText("Motorcycle:");
        jPanel5.add(lblmotor);

        cmbmotorcycle.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cmbmotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jPanel5.add(jComboBox8);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setText("Brake Condition:");
        jPanel5.add(jLabel22);

        jComboBox9.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Worn", "Damaged" }));
        jPanel5.add(jComboBox9);

        lblheadlightandsignal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblheadlightandsignal.setText("Headlight and Signal Lights:");
        jPanel5.add(lblheadlightandsignal);

        cbheadlight.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbheadlight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        jPanel5.add(cbheadlight);

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setText("Horns");
        jPanel5.add(jLabel23);

        jComboBox10.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        jPanel5.add(jComboBox10);

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel24.setText("Mirrors");
        jPanel5.add(jLabel24);

        jComboBox11.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete", "Missing", "Damaged" }));
        jPanel5.add(jComboBox11);

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setText("Motorcycle Body:");
        jPanel5.add(jLabel25);

        jComboBox12.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Needs Repair" }));
        jPanel5.add(jComboBox12);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Engine Condition:");
        jPanel5.add(jLabel1);

        jComboBox13.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Unusual Noise", "Other Issue" }));
        jPanel5.add(jComboBox13);

        lbloverallcondi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbloverallcondi.setText("Overall Condition:");
        jPanel5.add(lbloverallcondi);

        cbcondition.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbcondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Minor Damage", "Needs Repair", "Unsafe" }));
        jPanel5.add(cbcondition);

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setText("Readiness Status:");
        jPanel5.add(jLabel26);

        jComboBox14.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready", "Not Ready" }));
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
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(btnviewinspectsave)
                .addGap(16, 16, 16))
            .addGroup(viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewinspectLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        maintefilter.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        maintefilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "In Progress", "Completed" }));
        maintefilter.addActionListener(this::maintefilterActionPerformed);

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel32.setText("Filter Status:");

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
        btneditinspect2.addActionListener(this::btneditinspect2ActionPerformed);

        mainteapplyfilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mainteapplyfilter.setText("Apply Filter");
        mainteapplyfilter.addActionListener(this::mainteapplyfilterActionPerformed);

        jTextField18.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField18.addActionListener(this::jTextField18ActionPerformed);

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setText("Search ID/Keyword");

        btndeleteinspect.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btndeleteinspect.setText("Delete");
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
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maintefilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mainteapplyfilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewmaintedialogLayout.setVerticalGroup(
            viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmaintedialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(maintefilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        inspectfilter.addActionListener(this::inspectfilterActionPerformed);

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel30.setText("Filter Status:");

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

        btneditinspect1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btneditinspect1.setText("Edit");
        btneditinspect1.addActionListener(this::btneditinspect1ActionPerformed);

        inspectapplyfilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inspectapplyfilter.setText("Apply Filter");
        inspectapplyfilter.addActionListener(this::inspectapplyfilterActionPerformed);

        jTextField17.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField17.addActionListener(this::jTextField17ActionPerformed);

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel31.setText("Search ID/Keyword");

        btninpsectdelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btninpsectdelete.setText("Delete");
        btninpsectdelete.addActionListener(this::btninpsectdeleteActionPerformed);

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
                        .addComponent(btninpsectdelete))
                    .addGroup(viewinspectdialogLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inspectfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inspectapplyfilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewinspectdialogLayout.setVerticalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(inspectfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inspectapplyfilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditinspect1)
                    .addComponent(btninpsectdelete))
                .addGap(18, 18, 18))
        );

        damagerepapplyfilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        damagerepapplyfilter.setText("Apply Filter");
        damagerepapplyfilter.addActionListener(this::damagerepapplyfilterActionPerformed);

        btneditdamagarep.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btneditdamagarep.setText("Edit");
        btneditdamagarep.addActionListener(this::btneditdamagarepActionPerformed);

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

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel34.setText("Filter Status:");

        damagrepfilter.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        damagrepfilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "Under Repair", "Resolved" }));
        damagrepfilter.addActionListener(this::damagrepfilterActionPerformed);

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel35.setText("Search ID/Keyword");

        jTextField20.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField20.addActionListener(this::jTextField20ActionPerformed);

        btndamagerepdelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btndamagerepdelete.setText("Delete");
        btndamagerepdelete.addActionListener(this::btndamagerepdeleteActionPerformed);

        javax.swing.GroupLayout viewdamagereportdialogLayout = new javax.swing.GroupLayout(viewdamagereportdialog.getContentPane());
        viewdamagereportdialog.getContentPane().setLayout(viewdamagereportdialogLayout);
        viewdamagereportdialogLayout.setHorizontalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addComponent(btneditdamagarep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndamagerepdelete))
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(damagrepfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(damagerepapplyfilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewdamagereportdialogLayout.setVerticalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(damagrepfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damagerepapplyfilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditdamagarep)
                    .addComponent(btndamagerepdelete))
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel3.setLayout(new java.awt.GridLayout(9, 2, 15, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Motorcycle:");
        jPanel3.add(jLabel10);

        jComboBox5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jPanel3.add(jComboBox7);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Damage Status:");
        jPanel3.add(jLabel7);

        jComboBox15.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Under Repair", "Resolved" }));
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

        btndamagereport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btndamagereport.setText("Save");
        btndamagereport.addActionListener(this::btndamagereportActionPerformed);

        javax.swing.GroupLayout viewdmgreportLayout = new javax.swing.GroupLayout(viewdmgreport.getContentPane());
        viewdmgreport.getContentPane().setLayout(viewdmgreportLayout);
        viewdmgreportLayout.setHorizontalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(btndamagereport)
                .addGap(311, 311, 311))
            .addGroup(viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewdmgreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewdmgreportLayout.setVerticalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(btndamagereport)
                .addGap(42, 42, 42))
            .addGroup(viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewdmgreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        btnsaveviewmotorcycle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnsaveviewmotorcycle.setText("Save");
        btnsaveviewmotorcycle.addActionListener(this::btnsaveviewmotorcycleActionPerformed);

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

        javax.swing.GroupLayout viewmmotorcycleLayout = new javax.swing.GroupLayout(viewmmotorcycle.getContentPane());
        viewmmotorcycle.getContentPane().setLayout(viewmmotorcycleLayout);
        viewmmotorcycleLayout.setHorizontalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(btnsaveviewmotorcycle)
                .addGap(427, 427, 427))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        viewmmotorcycleLayout.setVerticalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(btnsaveviewmotorcycle)
                .addGap(15, 15, 15))
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

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        btnsearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(this::btnsearchActionPerformed);

        btnviewinspectionrecord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnviewinspectionrecord.setText("View Inspection");
        btnviewinspectionrecord.addActionListener(this::btnviewinspectionrecordActionPerformed);

        btnviewmaintenancerecord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnviewmaintenancerecord.setText("View Maintenance");
        btnviewmaintenancerecord.addActionListener(this::btnviewmaintenancerecordActionPerformed);

        btnviewdmg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnviewdmg.setText("View Damage Report");
        btnviewdmg.addActionListener(this::btnviewdmgActionPerformed);

        btndelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(this::btndeleteActionPerformed);

        btnrefresh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(this::btnrefreshActionPerformed);

        btnedit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(this::btneditActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jButton1.setText("View Further Details");
        jButton1.addActionListener(this::jButton1ActionPerformed);

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
                        .addComponent(btnviewinspectionrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnviewmaintenancerecord, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnviewdmg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
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
                    .addComponent(btnviewinspectionrecord)
                    .addComponent(btnviewmaintenancerecord)
                    .addComponent(btnviewdmg)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnrefresh)
                    .addComponent(btnedit))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewinspectionrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinspectionrecordActionPerformed
        int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle row.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedMotorId = recordstable.getValueAt(selectedRow, 0).toString();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for (InspectionRecord record : TrimotoSystem.inspections) {
            if (record.motorcycleId.trim().equalsIgnoreCase(selectedMotorId.trim())) {
                model.addRow(new Object[]{
                    record.recordId, record.motorcycleId, record.date, record.phase,
                    record.odometer, record.fuel, record.tires, record.brakes,
                    record.headlight, record.horns, record.mirrors, record.body,
                    record.engine, record.condition, record.readiness, record.notes
                });
            }
        }

        viewinspectdialog.setSize(1000, 500);
        viewinspectdialog.setLocationRelativeTo(this);
        viewinspectdialog.setVisible(true);
    }//GEN-LAST:event_btnviewinspectionrecordActionPerformed

    private void btnviewmaintenancerecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewmaintenancerecordActionPerformed
        int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle row.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedMotorId = recordstable.getValueAt(selectedRow, 0).toString();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);

        for (MaintenanceRecord record : TrimotoSystem.maintenanceRecords) {
            if (record.motorcycleId.equalsIgnoreCase(selectedMotorId)) {
                model.addRow(new Object[]{
                    record.recordId, record.motorcycleId, record.date, record.type,
                    record.category, record.workPerformed, record.partsReplaced,
                    record.odometer, record.cost, record.nextServiceMileage,
                    record.status, record.availability, record.remarks
                });
            }
        }

        viewmaintedialog.setSize(1000, 500);
        viewmaintedialog.setLocationRelativeTo(this);
        viewmaintedialog.setVisible(true);
    }//GEN-LAST:event_btnviewmaintenancerecordActionPerformed

    private void btnviewdmgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdmgActionPerformed
        int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle row.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedMotorId = recordstable.getValueAt(selectedRow, 0).toString();
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);

        for (String report : TrimotoSystem.damageReports) {
            if (report.contains("Motorcycle: " + selectedMotorId)) {
                model.addRow(new Object[]{
                    extractField(report, "Report ID"),
                    selectedMotorId,
                    extractField(report, "Date"),
                    extractField(report, "Location"),
                    extractField(report, "Type"),
                    extractField(report, "Description"),
                    extractField(report, "Action Required"),
                    extractField(report, "Cost"),
                    extractField(report, "Status"),
                    extractField(report, "Notes")
                });
            }
        }

        viewdamagereportdialog.setSize(1000, 500);
        viewdamagereportdialog.setLocationRelativeTo(this);
        viewdamagereportdialog.setVisible(true);
    }//GEN-LAST:event_btnviewdmgActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
btnsearchActionPerformed(evt);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btneditinspect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditinspect1ActionPerformed
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
        
        
    }//GEN-LAST:event_btneditinspect1ActionPerformed

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

    private void btneditdamagarepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditdamagarepActionPerformed
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
    }//GEN-LAST:event_btneditdamagarepActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void btndamagereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndamagereportActionPerformed
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

        damagerepapplyfilterActionPerformed(evt); 
        loadTableData();
        notifyDashboardRefresh(); 
        JOptionPane.showMessageDialog(viewdmgreport, "Damage report updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        viewdmgreport.dispose();
    }//GEN-LAST:event_btndamagereportActionPerformed

    private void txtmotoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotoridActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
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
    }//GEN-LAST:event_btneditActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        loadTableData();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
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
            loadTableData();
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(this, "Motorcycle " + id + " deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsavemainteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavemainteActionPerformed
   int tableRow = jTable3.getSelectedRow();
        if (tableRow == -1) return;

        String date = txtmaintedate.getText().trim();
        String category = jTextField12.getText().trim();
        String workPerformed = jTextField19.getText().trim();
        String partsReplaced = jTextField11.getText().trim();
        String odometer = jTextField13.getText().trim();
        String costStr = jTextField15.getText().trim();
        String nextMileage = jTextField14.getText().trim();
        String remarks = jTextField16.getText().trim(); // Optional

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
                        record.motorcycleId = jComboBox1.getSelectedItem().toString();
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
            loadTableData();
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(viewmainte, "Maintenance record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            viewmainte.dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(viewmainte, "Please enter a valid numeric value for Maintenance Cost.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsavemainteActionPerformed

    private void btnviewinspectsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinspectsaveActionPerformed
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
                    record.motorcycleId = cmbmotorcycle.getSelectedItem().toString();
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
                record.notes = jTextField2.getText().trim(); // Optional

                // Update physical motorcycle status to sync with dashboard counters
                String cleanId = record.motorcycleId.split(" - ")[0].trim();
                Motorcycle m = TrimotoSystem.findMotorcycleById(cleanId);
                if (m != null) {
                    m.setStatus(record.condition); 
                }
                break;
            }
        }

        inspectapplyfilterActionPerformed(evt); 
        loadTableData();
        notifyDashboardRefresh(); 
        JOptionPane.showMessageDialog(viewinspect, "Inspection record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        viewinspect.dispose();
    }//GEN-LAST:event_btnviewinspectsaveActionPerformed

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
            mainteapplyfilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewmaintedialog, "Maintenance record deleted.");
        }
    }//GEN-LAST:event_btndeleteinspectActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        mainteapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void maintefilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintefilterActionPerformed
        mainteapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_maintefilterActionPerformed

    private void cmbmotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmotorcycleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmotorcycleActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btninpsectdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninpsectdeleteActionPerformed
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewinspectdialog, "Please select an inspection record to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String recId = jTable2.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(viewinspectdialog, "Are you sure you want to delete inspection record " + recId + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.inspections.removeIf(r -> r.recordId.equalsIgnoreCase(recId));
            inspectapplyfilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewinspectdialog, "Inspection record deleted.");
        }    }//GEN-LAST:event_btninpsectdeleteActionPerformed

    private void inspectfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspectfilterActionPerformed
        inspectapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_inspectfilterActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        inspectapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void damagrepfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damagrepfilterActionPerformed
        damagerepapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_damagrepfilterActionPerformed

    private void btndamagerepdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndamagerepdeleteActionPerformed
        int selectedRow = jTable4.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Please select a damage report to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String recId = jTable4.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(viewdamagereportdialog, "Are you sure you want to delete damage report " + recId + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.damageReports.removeIf(r -> r.contains("Report ID: " + recId));
            damagerepapplyfilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Damage report deleted.");
        }
    }//GEN-LAST:event_btndamagerepdeleteActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        damagerepapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void btnsaveviewmotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveviewmotorcycleActionPerformed
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

                loadTableData();
                notifyDashboardRefresh();
                JOptionPane.showMessageDialog(viewmmotorcycle, "Motorcycle record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                viewmmotorcycle.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(viewmmotorcycle, "Please enter valid numeric values for Year, Mileage, Daily Rate, and Specifications.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnsaveviewmotorcycleActionPerformed

    private void mainteapplyfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainteapplyfilterActionPerformed
        String filterStatus = maintefilter.getSelectedItem() != null ? maintefilter.getSelectedItem().toString() : "All";
        String keyword = jTextField18.getText().trim().toLowerCase();

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);

        for (MaintenanceRecord r : TrimotoSystem.maintenanceRecords) {
            boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || r.status.equalsIgnoreCase(filterStatus);
            boolean matchesKeyword = keyword.isEmpty() || 
                                     r.recordId.toLowerCase().contains(keyword) || 
                                     r.motorcycleId.toLowerCase().contains(keyword);

            if (matchesStatus && matchesKeyword) {
                model.addRow(new Object[]{
                    r.recordId, r.motorcycleId, r.date, r.type,
                    r.category, r.workPerformed, r.partsReplaced,
                    r.odometer, r.cost, r.nextServiceMileage,
                    r.status, r.availability, r.remarks
                });
            }
        }
    }//GEN-LAST:event_mainteapplyfilterActionPerformed

    private void inspectapplyfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspectapplyfilterActionPerformed
        String filterStatus = inspectfilter.getSelectedItem() != null ? inspectfilter.getSelectedItem().toString() : "All";
        String keyword = jTextField17.getText().trim().toLowerCase();

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for (InspectionRecord r : TrimotoSystem.inspections) {
            boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || r.condition.equalsIgnoreCase(filterStatus);
            boolean matchesKeyword = keyword.isEmpty() || 
                                     r.recordId.toLowerCase().contains(keyword) || 
                                     r.motorcycleId.toLowerCase().contains(keyword);

            if (matchesStatus && matchesKeyword) {
                model.addRow(new Object[]{
                    r.recordId, r.motorcycleId, r.date, r.phase,
                    r.odometer, r.fuel, r.tires, r.brakes,
                    r.headlight, r.horns, r.mirrors, r.body,
                    r.engine, r.condition, r.readiness, r.notes
                });
            }
        }
    }//GEN-LAST:event_inspectapplyfilterActionPerformed

    private void damagerepapplyfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damagerepapplyfilterActionPerformed
        String filterStatus = damagrepfilter.getSelectedItem() != null ? damagrepfilter.getSelectedItem().toString() : "All";
        String keyword = jTextField20.getText().trim().toLowerCase();

        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);

        for (String report : TrimotoSystem.damageReports) {
            String status = extractField(report, "Status");
            String recId = extractField(report, "Report ID");
            String motorId = extractField(report, "Motorcycle");

            boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || status.equalsIgnoreCase(filterStatus);
            boolean matchesKeyword = keyword.isEmpty() || 
                                     recId.toLowerCase().contains(keyword) || 
                                     motorId.toLowerCase().contains(keyword);

            if (matchesStatus && matchesKeyword) {
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
    }//GEN-LAST:event_damagerepapplyfilterActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
      String searchId = jTextField3.getText().trim();
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
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

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

        // Split formatted output line-by-line
        String[] lines = info.split("\n");

        // Line 1 -> Label & Text Field 1
        if (lines.length > 0 && lines[0].contains(":")) {
            String[] parts = lines[0].split(":", 2);
            jLabel39.setText(parts[0].trim() + ":");
            jTextField24.setText(cleanUnits(parts[1]));
        } else {
            jLabel39.setText(""); jTextField24.setText("");
        }

        // Line 2 -> Label & Text Field 2
        if (lines.length > 1 && lines[1].contains(":")) {
            String[] parts = lines[1].split(":", 2);
            jLabel40.setText(parts[0].trim() + ":");
            jTextField25.setText(cleanUnits(parts[1]));
        } else {
            jLabel40.setText(""); jTextField25.setText("");
        }

        // Line 3 -> Label & Text Field 3 (If available)
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

    // Helper to extract raw numbers by stripping trailing units like "cc", "L", "W", "HP", "hrs", "Ah"
    private String cleanUnits(String valueWithUnit) {
        if (valueWithUnit == null) return "";
        return valueWithUnit.replaceAll("[^0-9.]", "").trim();
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel brand;
    private javax.swing.JButton btndamagerepdelete;
    private javax.swing.JButton btndamagereport;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndeleteinspect;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btneditdamagarep;
    private javax.swing.JButton btneditinspect1;
    private javax.swing.JButton btneditinspect2;
    private javax.swing.JButton btninpsectdelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsavemainte;
    private javax.swing.JButton btnsaveviewmotorcycle;
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
    private javax.swing.JButton damagerepapplyfilter;
    private javax.swing.JComboBox<String> damagrepfilter;
    private javax.swing.JLabel description;
    private javax.swing.JButton inspectapplyfilter;
    private javax.swing.JComboBox<String> inspectfilter;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton mainteapplyfilter;
    private javax.swing.JComboBox<String> maintefilter;
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