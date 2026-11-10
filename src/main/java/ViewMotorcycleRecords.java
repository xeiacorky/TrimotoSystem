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
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable4.getTableHeader().setReorderingAllowed(false);
        recordstable.getTableHeader().setReorderingAllowed(false);
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
                m.getId(), m.getPlate(), m.getBrand(), m.getModel(), m.getYear(), m.getType(), m.getMileage(), m.getDailyRate(), m.getStatus()
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
        cbMotorcycle = new javax.swing.JComboBox<>();
        lblmaintenancedate = new javax.swing.JLabel();
        txtmaintedate = new javax.swing.JTextField();
        lblmaintenancetype = new javax.swing.JLabel();
        cbMaintenanceType = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtServiceCat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtWorkPerformed = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPartsReplaced = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtOdometerReading = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaintenanceCost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNextServiceMileage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        viewinspect = new javax.swing.JDialog();
        btnViewInspectSave = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblmotor = new javax.swing.JLabel();
        cbmotorcycle = new javax.swing.JComboBox<>();
        lblinspectiondate = new javax.swing.JLabel();
        txtinspectdate = new javax.swing.JTextField();
        lblInspectionphase = new javax.swing.JLabel();
        cbinspectionphase = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtOdometerRd = new javax.swing.JTextField();
        lblfuel = new javax.swing.JLabel();
        txtFuelLvl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbTireCondition = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cbBrakeCondition = new javax.swing.JComboBox<>();
        lblheadlightandsignal = new javax.swing.JLabel();
        cbHeadlightSignalLights = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cbHorns = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cbMirrors = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cbMotorcycleBody = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbEngineCondition = new javax.swing.JComboBox<>();
        lbloverallcondi = new javax.swing.JLabel();
        cbOverallCondition = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cbReadinessStatus = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtInspectNotes = new javax.swing.JTextField();
        viewmaintedialog = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnEditMainte = new javax.swing.JButton();
        mainteapplyfilter = new javax.swing.JButton();
        txtSearchMaintenance = new javax.swing.JTextField();
        lblSearchId = new javax.swing.JLabel();
        btnDeleteMainte = new javax.swing.JButton();
        viewinspectdialog = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnEditInspect = new javax.swing.JButton();
        InspectApplyFilter = new javax.swing.JButton();
        txtSearchInspect = new javax.swing.JTextField();
        lblSearchId1 = new javax.swing.JLabel();
        btnInspectDelete = new javax.swing.JButton();
        viewdamagereportdialog = new javax.swing.JDialog();
        DamageRepApplyFilter = new javax.swing.JButton();
        btnEditDamageReport = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        lblSearchId2 = new javax.swing.JLabel();
        txtSearchDamageReport = new javax.swing.JTextField();
        btnDamageReportDelete = new javax.swing.JButton();
        viewdmgreport = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbMotorcycle1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtDamageLocation1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbDamageType1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtDamageDescription1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDateReported1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAdditionalNotes1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEstimatedRepairCost1 = new javax.swing.JTextField();
        btnDamageReport = new javax.swing.JButton();
        viewmmotorcycle = new javax.swing.JDialog();
        btnSaveViewMotorcycle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblMotorID = new javax.swing.JLabel();
        txtMotorcycleID = new javax.swing.JTextField();
        lblPlate = new javax.swing.JLabel();
        txtPlate = new javax.swing.JTextField();
        brand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        model = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblyear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblmileage = new javax.swing.JLabel();
        txtMileage = new javax.swing.JTextField();
        lbldailyrentalrate = new javax.swing.JLabel();
        txtDailyRentalRate = new javax.swing.JTextField();
        lblmotortype = new javax.swing.JLabel();
        cbTypes = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        txtTransmissionType = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtSpec1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtSpec2 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtSpec3 = new javax.swing.JTextField();
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
        jPanel4 = new javax.swing.JPanel();
        btnViewInspectionRecord = new javax.swing.JButton();
        btnViewMaintenanceRecord = new javax.swing.JButton();
        btnViewDmg = new javax.swing.JButton();
        btnViewFurtherDetails = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnMarkAsAvailable = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        viewmainte.setResizable(false);

        btnSaveMainte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSaveMainte.setText("Save");
        btnSaveMainte.setFocusPainted(false);
        btnSaveMainte.setFocusable(false);
        btnSaveMainte.addActionListener(this::btnSaveMainteActionPerformed);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(10, 2, 15, 15));

        lblmotor2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor2.setText("Motorcycle:");
        jPanel1.add(lblmotor2);

        cbMotorcycle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMotorcycle.setFocusable(false);
        cbMotorcycle.addActionListener(this::cbMotorcycleActionPerformed);
        jPanel1.add(cbMotorcycle);

        lblmaintenancedate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmaintenancedate.setText("Maintenance Date:");
        jPanel1.add(lblmaintenancedate);

        txtmaintedate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtmaintedate);

        lblmaintenancetype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmaintenancetype.setText("Maintenance Type:");
        jPanel1.add(lblmaintenancetype);

        cbMaintenanceType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMaintenanceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventive", "Corrective" }));
        cbMaintenanceType.setFocusable(false);
        jPanel1.add(cbMaintenanceType);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Service Category");
        jPanel1.add(jLabel12);

        txtServiceCat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtServiceCat);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setText("Work Performed:");
        jPanel1.add(jLabel16);

        txtWorkPerformed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtWorkPerformed);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Parts Replaced:");
        jPanel1.add(jLabel13);

        txtPartsReplaced.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtPartsReplaced);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setText("Odometer Reading(km):");
        jPanel1.add(jLabel17);

        txtOdometerReading.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtOdometerReading);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Maintenance Cost:");
        jPanel1.add(jLabel2);

        txtMaintenanceCost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtMaintenanceCost);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Next Service Mileage:");
        jPanel1.add(jLabel3);

        txtNextServiceMileage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtNextServiceMileage);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("Remarks");
        jPanel1.add(jLabel15);

        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtRemarks);

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

        viewinspect.setResizable(false);

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

        cbmotorcycle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbmotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbmotorcycle.setFocusable(false);
        cbmotorcycle.addActionListener(this::cbmotorcycleActionPerformed);
        jPanel5.add(cbmotorcycle);

        lblinspectiondate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblinspectiondate.setText("Inspection Date:");
        jPanel5.add(lblinspectiondate);

        txtinspectdate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel5.add(txtinspectdate);

        lblInspectionphase.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblInspectionphase.setText("Inspection Phase:");
        jPanel5.add(lblInspectionphase);

        cbinspectionphase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbinspectionphase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Rental", "Post-Rental" }));
        cbinspectionphase.setFocusable(false);
        jPanel5.add(cbinspectionphase);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setText("Odometer Reading:");
        jPanel5.add(jLabel19);

        txtOdometerRd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel5.add(txtOdometerRd);

        lblfuel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblfuel.setText("Fuel Level:");
        jPanel5.add(lblfuel);

        txtFuelLvl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel5.add(txtFuelLvl);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Tire Condition:");
        jPanel5.add(jLabel4);

        cbTireCondition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTireCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Scratched", "Dented" }));
        cbTireCondition.setFocusable(false);
        jPanel5.add(cbTireCondition);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setText("Brake Condition:");
        jPanel5.add(jLabel22);

        cbBrakeCondition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbBrakeCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Worn", "Damaged" }));
        cbBrakeCondition.setFocusable(false);
        jPanel5.add(cbBrakeCondition);

        lblheadlightandsignal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblheadlightandsignal.setText("Headlight and Signal Lights:");
        jPanel5.add(lblheadlightandsignal);

        cbHeadlightSignalLights.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbHeadlightSignalLights.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        cbHeadlightSignalLights.setFocusable(false);
        jPanel5.add(cbHeadlightSignalLights);

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setText("Horns");
        jPanel5.add(jLabel23);

        cbHorns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbHorns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        cbHorns.setFocusable(false);
        jPanel5.add(cbHorns);

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel24.setText("Mirrors");
        jPanel5.add(jLabel24);

        cbMirrors.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMirrors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete", "Missing", "Damaged" }));
        cbMirrors.setFocusable(false);
        jPanel5.add(cbMirrors);

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setText("Motorcycle Body:");
        jPanel5.add(jLabel25);

        cbMotorcycleBody.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotorcycleBody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Needs Repair" }));
        cbMotorcycleBody.setFocusable(false);
        jPanel5.add(cbMotorcycleBody);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Engine Condition:");
        jPanel5.add(jLabel1);

        cbEngineCondition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbEngineCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Unusual Noise", "Other Issue" }));
        cbEngineCondition.setFocusable(false);
        jPanel5.add(cbEngineCondition);

        lbloverallcondi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbloverallcondi.setText("Overall Condition:");
        jPanel5.add(lbloverallcondi);

        cbOverallCondition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbOverallCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Minor Damage", "Needs Repair", "Unsafe" }));
        cbOverallCondition.setFocusable(false);
        jPanel5.add(cbOverallCondition);

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setText("Readiness Status:");
        jPanel5.add(jLabel26);

        cbReadinessStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbReadinessStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Under Repair", "Under Maintenance" }));
        cbReadinessStatus.setFocusable(false);
        jPanel5.add(cbReadinessStatus);

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel27.setText("Inspection Notes:");
        jPanel5.add(jLabel27);

        txtInspectNotes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel5.add(txtInspectNotes);

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

        jTable3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Motorcycle ID", "Date", "Type", "Service Category", "Work Performed", "Parts Replaced", "Odometer Reading (km)", "Maintenance Cost (₱)", "Next Service Mileage", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable3);

        btnEditMainte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEditMainte.setText("Edit");
        btnEditMainte.setFocusPainted(false);
        btnEditMainte.setFocusable(false);
        btnEditMainte.addActionListener(this::btnEditMainteActionPerformed);

        mainteapplyfilter.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mainteapplyfilter.setText("Apply Filter");
        mainteapplyfilter.setFocusPainted(false);
        mainteapplyfilter.setFocusable(false);
        mainteapplyfilter.addActionListener(this::mainteapplyfilterActionPerformed);

        txtSearchMaintenance.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSearchMaintenance.addActionListener(this::txtSearchMaintenanceActionPerformed);

        lblSearchId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblSearchId.setText("Search Keyword:");

        btnDeleteMainte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDeleteMainte.setText("Delete");
        btnDeleteMainte.setFocusPainted(false);
        btnDeleteMainte.setFocusable(false);
        btnDeleteMainte.addActionListener(this::btnDeleteMainteActionPerformed);

        javax.swing.GroupLayout viewmaintedialogLayout = new javax.swing.GroupLayout(viewmaintedialog.getContentPane());
        viewmaintedialog.getContentPane().setLayout(viewmaintedialogLayout);
        viewmaintedialogLayout.setHorizontalGroup(
            viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmaintedialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(viewmaintedialogLayout.createSequentialGroup()
                        .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewmaintedialogLayout.createSequentialGroup()
                                .addComponent(btnEditMainte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteMainte))
                            .addGroup(viewmaintedialogLayout.createSequentialGroup()
                                .addComponent(lblSearchId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainteapplyfilter)))
                        .addGap(0, 1131, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewmaintedialogLayout.setVerticalGroup(
            viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmaintedialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchId)
                    .addComponent(txtSearchMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainteapplyfilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewmaintedialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditMainte)
                    .addComponent(btnDeleteMainte))
                .addContainerGap())
        );

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Motorcycle ID", "Date", "Phase", "Odometer", "Fuel Level / Battery Level", "Tire Condition", "Brake Condition", "Headlight & Signals", "Horns", "Mirrors", "Body Condition", "Engine Condition", "Overall Condition", "Readiness Status", "Inspection Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        lblSearchId1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblSearchId1.setText("Search Keyword:");

        btnInspectDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnInspectDelete.setText("Delete");
        btnInspectDelete.setFocusPainted(false);
        btnInspectDelete.setFocusable(false);
        btnInspectDelete.addActionListener(this::btnInspectDeleteActionPerformed);

        javax.swing.GroupLayout viewinspectdialogLayout = new javax.swing.GroupLayout(viewinspectdialog.getContentPane());
        viewinspectdialog.getContentPane().setLayout(viewinspectdialogLayout);
        viewinspectdialogLayout.setHorizontalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1990, Short.MAX_VALUE)
                    .addGroup(viewinspectdialogLayout.createSequentialGroup()
                        .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewinspectdialogLayout.createSequentialGroup()
                                .addComponent(btnEditInspect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInspectDelete))
                            .addGroup(viewinspectdialogLayout.createSequentialGroup()
                                .addComponent(lblSearchId1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchInspect, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InspectApplyFilter)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewinspectdialogLayout.setVerticalGroup(
            viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewinspectdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchId1)
                    .addComponent(txtSearchInspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InspectApplyFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewinspectdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditInspect)
                    .addComponent(btnInspectDelete))
                .addContainerGap())
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

        jTable4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Motorcycle ID", "Date", "Location", "Type", "Description", "Cost (₱)", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable4);

        lblSearchId2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblSearchId2.setText("Search Keyword:");

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
                    .addComponent(jScrollPane9)
                    .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                        .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                                .addComponent(btnEditDamageReport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDamageReportDelete))
                            .addGroup(viewdamagereportdialogLayout.createSequentialGroup()
                                .addComponent(lblSearchId2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchDamageReport, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DamageRepApplyFilter)))
                        .addGap(0, 744, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewdamagereportdialogLayout.setVerticalGroup(
            viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdamagereportdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchId2)
                    .addComponent(txtSearchDamageReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DamageRepApplyFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewdamagereportdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditDamageReport)
                    .addComponent(btnDamageReportDelete))
                .addContainerGap())
        );

        viewdmgreport.setResizable(false);
        viewdmgreport.setSize(new java.awt.Dimension(774, 303));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel3.setLayout(new java.awt.GridLayout(7, 2, 15, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Motorcycle:");
        jPanel3.add(jLabel10);

        cbMotorcycle1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotorcycle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMotorcycle1.setFocusable(false);
        cbMotorcycle1.addActionListener(this::cbMotorcycle1ActionPerformed);
        jPanel3.add(cbMotorcycle1);

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel18.setText("Damage Location: ");
        jPanel3.add(jLabel18);

        txtDamageLocation1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(txtDamageLocation1);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Damage Type:");
        jPanel3.add(jLabel8);

        cbDamageType1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDamageType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scratch", "Dent", "Crack", "Broken Part" }));
        cbDamageType1.setFocusable(false);
        jPanel3.add(cbDamageType1);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel20.setText("Damage Description:");
        jPanel3.add(jLabel20);

        txtDamageDescription1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(txtDamageDescription1);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Date Reported:");
        jPanel3.add(jLabel6);

        txtDateReported1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(txtDateReported1);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("Additional Notes:");
        jPanel3.add(jLabel9);

        txtAdditionalNotes1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(txtAdditionalNotes1);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("Estimated Repair Cost:");
        jPanel3.add(jLabel11);

        txtEstimatedRepairCost1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(txtEstimatedRepairCost1);

        btnDamageReport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDamageReport.setText("Save");
        btnDamageReport.setAlignmentX(0.5F);
        btnDamageReport.setFocusPainted(false);
        btnDamageReport.setFocusable(false);
        btnDamageReport.addActionListener(this::btnDamageReportActionPerformed);

        javax.swing.GroupLayout viewdmgreportLayout = new javax.swing.GroupLayout(viewdmgreport.getContentPane());
        viewdmgreport.getContentPane().setLayout(viewdmgreportLayout);
        viewdmgreportLayout.setHorizontalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewdmgreportLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(btnDamageReport)
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewdmgreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewdmgreportLayout.setVerticalGroup(
            viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewdmgreportLayout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addComponent(btnDamageReport)
                .addContainerGap())
            .addGroup(viewdmgreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewdmgreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        viewmmotorcycle.setResizable(false);

        btnSaveViewMotorcycle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSaveViewMotorcycle.setText("Save");
        btnSaveViewMotorcycle.setFocusPainted(false);
        btnSaveViewMotorcycle.setFocusable(false);
        btnSaveViewMotorcycle.addActionListener(this::btnSaveViewMotorcycleActionPerformed);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setLayout(new java.awt.GridLayout(12, 2, 15, 15));

        lblMotorID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMotorID.setText("Motorcycle ID:");
        jPanel2.add(lblMotorID);

        txtMotorcycleID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMotorcycleID.addActionListener(this::txtMotorcycleIDActionPerformed);
        jPanel2.add(txtMotorcycleID);

        lblPlate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPlate.setText("Plate #:");
        jPanel2.add(lblPlate);

        txtPlate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtPlate);

        brand.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        brand.setText("Brand:");
        jPanel2.add(brand);

        txtBrand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtBrand);

        model.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        model.setText("Model:");
        jPanel2.add(model);

        txtModel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtModel);

        lblyear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblyear.setText("Year:");
        jPanel2.add(lblyear);

        txtYear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtYear);

        lblmileage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmileage.setText("Mileage (km):");
        jPanel2.add(lblmileage);

        txtMileage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtMileage);

        lbldailyrentalrate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbldailyrentalrate.setText("Daily Rental Rate:");
        jPanel2.add(lbldailyrentalrate);

        txtDailyRentalRate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtDailyRentalRate);

        lblmotortype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotortype.setText("Motorcycle Type");
        jPanel2.add(lblmotortype);

        cbTypes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electic Bike", " " }));
        cbTypes.setFocusable(false);
        cbTypes.addActionListener(this::cbTypesActionPerformed);
        jPanel2.add(cbTypes);

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel38.setText("Transmission Type:");
        jPanel2.add(jLabel38);

        txtTransmissionType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtTransmissionType);

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel2.add(jLabel39);

        txtSpec1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtSpec1);

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel2.add(jLabel40);

        txtSpec2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtSpec2);

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel2.add(jLabel41);

        txtSpec3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(txtSpec3);

        javax.swing.GroupLayout viewmmotorcycleLayout = new javax.swing.GroupLayout(viewmmotorcycle.getContentPane());
        viewmmotorcycle.getContentPane().setLayout(viewmmotorcycleLayout);
        viewmmotorcycleLayout.setHorizontalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(btnSaveViewMotorcycle)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        viewmmotorcycleLayout.setVerticalGroup(
            viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmmotorcycleLayout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(btnSaveViewMotorcycle)
                .addContainerGap())
            .addGroup(viewmmotorcycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewmmotorcycleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        viewfurtherdetails.setResizable(false);

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

        setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.pressedBackground"));

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setForeground(new java.awt.Color(153, 153, 153));
        description.setText("Browse registered motorcycles and their current status.");

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Motorcycle Records");

        recordstable.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        recordstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Plate #", "Brand", "Model", "Year", "Type", "Mileage", "Daily Rate ₱", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordsscrollpane.setViewportView(recordstable);

        ID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ID.setText("Search ID/ Keyword:");

        txtSearch.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtSearch.addActionListener(this::txtSearchActionPerformed);

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setFocusPainted(false);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        jPanel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.pressedBackground"));
        jPanel4.setLayout(new java.awt.GridLayout(2, 2, 10, 5));

        btnViewInspectionRecord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewInspectionRecord.setText("View Inspection");
        btnViewInspectionRecord.setFocusPainted(false);
        btnViewInspectionRecord.setFocusable(false);
        btnViewInspectionRecord.addActionListener(this::btnViewInspectionRecordActionPerformed);
        jPanel4.add(btnViewInspectionRecord);

        btnViewMaintenanceRecord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewMaintenanceRecord.setText("View Maintenance");
        btnViewMaintenanceRecord.setFocusPainted(false);
        btnViewMaintenanceRecord.setFocusable(false);
        btnViewMaintenanceRecord.addActionListener(this::btnViewMaintenanceRecordActionPerformed);
        jPanel4.add(btnViewMaintenanceRecord);

        btnViewDmg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewDmg.setText("View Damage Report");
        btnViewDmg.setFocusPainted(false);
        btnViewDmg.setFocusable(false);
        btnViewDmg.addActionListener(this::btnViewDmgActionPerformed);
        jPanel4.add(btnViewDmg);

        btnViewFurtherDetails.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnViewFurtherDetails.setText("View Further Details");
        btnViewFurtherDetails.setFocusPainted(false);
        btnViewFurtherDetails.setFocusable(false);
        btnViewFurtherDetails.addActionListener(this::btnViewFurtherDetailsActionPerformed);
        jPanel4.add(btnViewFurtherDetails);

        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 10, 5));

        btnMarkAsAvailable.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnMarkAsAvailable.setText("Mark As Available");
        btnMarkAsAvailable.setFocusPainted(false);
        btnMarkAsAvailable.setFocusable(false);
        btnMarkAsAvailable.addActionListener(this::btnMarkAsAvailableActionPerformed);
        jPanel6.add(btnMarkAsAvailable);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setFocusPainted(false);
        btnEdit.setFocusable(false);
        btnEdit.addActionListener(this::btnEditActionPerformed);
        jPanel6.add(btnEdit);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setFocusPainted(false);
        btnRefresh.setFocusable(false);
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);
        jPanel6.add(btnRefresh);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFocusPainted(false);
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(this::btnDeleteActionPerformed);
        jPanel6.add(btnDelete);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recordsscrollpane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addComponent(description))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordsscrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        InspectApplyFilterActionPerformed(evt);

        viewinspectdialog.setSize(1900, 522);
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

        mainteapplyfilterActionPerformed(evt);

        viewmaintedialog.setSize(1492, 522);
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

        DamageRepApplyFilterActionPerformed(evt);

        viewdamagereportdialog.setSize(1150, 501);
        viewdamagereportdialog.setLocationRelativeTo(this);
        viewdamagereportdialog.setVisible(true);
    }//GEN-LAST:event_btnViewDmgActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
    btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnEditInspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInspectActionPerformed
    int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewinspectdialog, "Please select an inspection record to edit.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cbmotorcycle.setModel(model);

        String motorId = jTable2.getValueAt(selectedRow, 0).toString().trim();
        String date = jTable2.getValueAt(selectedRow, 1).toString().trim();
        String phase = jTable2.getValueAt(selectedRow, 2).toString().trim();

        for (InspectionRecord record : TrimotoSystem.inspections) {
            if (record.motorcycleId.equalsIgnoreCase(motorId) && record.date.equalsIgnoreCase(date) && record.phase.equalsIgnoreCase(phase)) {
                for (int i = 0; i < cbmotorcycle.getItemCount(); i++) {
                    if (cbmotorcycle.getItemAt(i).startsWith(record.motorcycleId)) {
                        cbmotorcycle.setSelectedIndex(i);
                        break;
                    }
                }
                txtinspectdate.setText(record.date);
                cbinspectionphase.setSelectedItem(record.phase);
                txtOdometerRd.setText(record.odometer);
                txtFuelLvl.setText(record.fuel);
                cbTireCondition.setSelectedItem(record.tires);
                cbBrakeCondition.setSelectedItem(record.brakes);
                cbHeadlightSignalLights.setSelectedItem(record.headlight);
                cbHorns.setSelectedItem(record.horns);
                cbMirrors.setSelectedItem(record.mirrors);
                cbMotorcycleBody.setSelectedItem(record.body);
                cbEngineCondition.setSelectedItem(record.engine);
                cbOverallCondition.setSelectedItem(record.condition);
                cbReadinessStatus.setSelectedItem(record.readiness);
                txtInspectNotes.setText(record.notes);

                viewinspect.setSize(720, 650);
                viewinspect.setLocationRelativeTo(this);
                viewinspect.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btnEditInspectActionPerformed

    private void btnEditMainteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMainteActionPerformed
    int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewmaintedialog, "Please select a maintenance record to edit.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cbMotorcycle.setModel(model);

        String motorId = jTable3.getValueAt(selectedRow, 0).toString().trim();
        String date = jTable3.getValueAt(selectedRow, 1).toString().trim();
        String type = jTable3.getValueAt(selectedRow, 2).toString().trim();

        for (MaintenanceRecord record : TrimotoSystem.maintenanceRecords) {
            if (record.motorcycleId.equalsIgnoreCase(motorId) && record.date.equalsIgnoreCase(date) && record.type.equalsIgnoreCase(type)) {
                for (int i = 0; i < cbMotorcycle.getItemCount(); i++) {
                    if (cbMotorcycle.getItemAt(i).startsWith(record.motorcycleId)) {
                        cbMotorcycle.setSelectedIndex(i);
                        break;
                    }
                }
                txtmaintedate.setText(record.date);
                cbMaintenanceType.setSelectedItem(record.type);
                txtServiceCat.setText(record.category);
                txtWorkPerformed.setText(record.workPerformed);
                txtPartsReplaced.setText(record.partsReplaced);
                txtOdometerReading.setText(record.odometer);
                txtMaintenanceCost.setText(String.valueOf(record.cost));
                txtNextServiceMileage.setText(record.nextServiceMileage);
                txtRemarks.setText(record.remarks);

                viewmainte.setSize(720, 550);
                viewmainte.setLocationRelativeTo(this);
                viewmainte.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btnEditMainteActionPerformed

    private void btnEditDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDamageReportActionPerformed
int selectedRow = jTable4.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Please select a damage report to edit.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cbMotorcycle1.setModel(model);

        String motorId = jTable4.getValueAt(selectedRow, 0).toString().trim();
        String date = jTable4.getValueAt(selectedRow, 1).toString().trim();
        String location = jTable4.getValueAt(selectedRow, 2).toString().trim();
        String type = jTable4.getValueAt(selectedRow, 3).toString().trim();
        String desc = jTable4.getValueAt(selectedRow, 4).toString().trim();

        for (DamageReport report : TrimotoSystem.damageReports) {
            if (report.motorcycleId.equalsIgnoreCase(motorId) && report.date.equalsIgnoreCase(date) && report.location.equalsIgnoreCase(location)) {
                for (int i = 0; i < cbMotorcycle1.getItemCount(); i++) {
                    if (cbMotorcycle1.getItemAt(i).startsWith(report.motorcycleId)) {
                        cbMotorcycle1.setSelectedIndex(i);
                        break;
                    }
                }
                txtDamageLocation1.setText(report.location);
                cbDamageType1.setSelectedItem(report.type);
                txtDamageDescription1.setText(report.description);
                txtDateReported1.setText(report.date);
                txtAdditionalNotes1.setText(report.notes != null ? report.notes : "");
                txtEstimatedRepairCost1.setText(String.valueOf(report.estimatedCost));

                viewdmgreport.setSize(774, 350);
                viewdmgreport.setLocationRelativeTo(this);
                viewdmgreport.setVisible(true);
                break;
            }
        }
   
    }//GEN-LAST:event_btnEditDamageReportActionPerformed

    private void cbMotorcycle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorcycle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorcycle1ActionPerformed

    private void btnDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamageReportActionPerformed
    int selectedRow = jTable4.getSelectedRow();
    if (selectedRow == -1) return;

    String date = txtDateReported1.getText().trim();
    String location = txtDamageLocation1.getText().trim();
    String desc = txtDamageDescription1.getText().trim();
    String costStr = txtEstimatedRepairCost1.getText().trim();
    String notes = txtAdditionalNotes1.getText().trim();

        if (date.isEmpty() || location.isEmpty() || desc.isEmpty() || costStr.isEmpty()) {
            JOptionPane.showMessageDialog(viewdmgreport, "All primary fields are required to update a damage report.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double cost = Double.parseDouble(costStr);
            String tableMotorId = jTable4.getValueAt(selectedRow, 0).toString().trim();
            String tableDate = jTable4.getValueAt(selectedRow, 1).toString().trim();
            String tableLocation = jTable4.getValueAt(selectedRow, 2).toString().trim();

            for (DamageReport report : TrimotoSystem.damageReports) {
                if (report.motorcycleId.equalsIgnoreCase(tableMotorId) && 
                    report.date.equalsIgnoreCase(tableDate) && 
                    report.location.equalsIgnoreCase(tableLocation)) {

                    boolean dateChanged = !report.date.equalsIgnoreCase(date);

                    if (cbMotorcycle1.getSelectedItem() != null) {
                        report.motorcycleId = cbMotorcycle1.getSelectedItem().toString().split(" - ")[0].trim();
                    }
                    report.date = date;
                    report.location = location;
                    report.type = cbDamageType1.getSelectedItem().toString();
                    report.description = desc;
                    report.estimatedCost = cost;
                    report.notes = notes;

                    if (dateChanged) {
                        TrimotoSystem.damageReports.sort((r1, r2) -> r2.date.compareToIgnoreCase(r1.date));
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
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(viewdmgreport, "Please enter a valid number for Estimated Repair Cost.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDamageReportActionPerformed

    private void txtMotorcycleIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorcycleIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorcycleIDActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle from the table to edit.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String id = recordstable.getValueAt(selectedRow, 0).toString();
        Motorcycle m = TrimotoSystem.findMotorcycleById(id);

        if (m != null) {
            txtMotorcycleID.setText(m.getId());
            txtMotorcycleID.setEditable(false);
            txtPlate.setText(m.getPlate());
            txtBrand.setText(m.getBrand());
            txtModel.setText(m.getModel());
            txtYear.setText(String.valueOf(m.getYear()));
            txtMileage.setText(String.valueOf(m.getMileage()));
            txtDailyRentalRate.setText(String.valueOf(m.getDailyRate()));
            
            for (java.awt.event.ActionListener al : cbTypes.getActionListeners()) {
                cbTypes.removeActionListener(al);
            }

            cbTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { 
                "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electric Bike" 
            }));
            cbTypes.setSelectedItem(m.getType());
            txtTransmissionType.setText(m.getTransmissionType());

            populateSubclassFieldsFromInfo(m);

            cbTypes.addActionListener(e -> cbTypesActionPerformed(e));            
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

        String id = recordstable.getValueAt(selectedRow, 0).toString().trim();
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to delete motorcycle " + id + " and all of its associated records (inspections, maintenance, damage reports)?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            for (RentalTransaction r : TrimotoSystem.rentals) {
                if (r.motorcycleId.trim().equalsIgnoreCase(id) && "Active".equalsIgnoreCase(r.status)) {
                    r.status = "Completed";
                }
            }

            TrimotoSystem.motorcycles.removeIf(m -> m.getId().trim().equalsIgnoreCase(id));
            TrimotoSystem.inspections.removeIf(r -> r.motorcycleId.trim().equalsIgnoreCase(id));
            TrimotoSystem.maintenanceRecords.removeIf(r -> r.motorcycleId.trim().equalsIgnoreCase(id));
            TrimotoSystem.damageReports.removeIf(r -> r.motorcycleId.trim().equalsIgnoreCase(id));

            TrimotoSystem.saveAllData();
            loadTableData();
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(this, "Motorcycle " + id + " deleted successfully. Any active rental transactions for this motorcycle have been updated to Completed.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveMainteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMainteActionPerformed
    int tableRow = jTable3.getSelectedRow();
    if (tableRow == -1) return;

    String date = txtmaintedate.getText().trim();
    String category = txtServiceCat.getText().trim();
    String workPerformed = txtWorkPerformed.getText().trim();
    String partsReplaced = txtPartsReplaced.getText().trim();
    String odometer = txtOdometerReading.getText().trim();
    String costStr = txtMaintenanceCost.getText().trim();
    String nextMileage = txtNextServiceMileage.getText().trim();
    String remarks = txtRemarks.getText().trim();

        if (date.isEmpty() || category.isEmpty() || workPerformed.isEmpty() || 
            partsReplaced.isEmpty() || odometer.isEmpty() || costStr.isEmpty() || nextMileage.isEmpty()) {
            JOptionPane.showMessageDialog(viewmainte, "Please fill in all maintenance fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double cost = Double.parseDouble(costStr);
            String motorId = jTable3.getValueAt(tableRow, 0).toString().trim();
            String origDate = jTable3.getValueAt(tableRow, 1).toString().trim();
            String origType = jTable3.getValueAt(tableRow, 2).toString().trim();

            for (MaintenanceRecord record : TrimotoSystem.maintenanceRecords) {
                if (record.motorcycleId.equalsIgnoreCase(motorId) && 
                    record.date.equalsIgnoreCase(origDate) && 
                    record.type.equalsIgnoreCase(origType)) {

                    boolean dateChanged = !record.date.equalsIgnoreCase(date);

                    if (cbMotorcycle.getSelectedItem() != null) {
                        String selectedCombo = cbMotorcycle.getSelectedItem().toString();
                        record.motorcycleId = selectedCombo.split(" - ")[0].trim();
                    }
                    record.date = date;
                    record.type = cbMaintenanceType.getSelectedItem().toString();
                    record.category = category;
                    record.workPerformed = workPerformed;
                    record.partsReplaced = partsReplaced;
                    record.odometer = odometer;
                    record.cost = cost;
                    record.nextServiceMileage = nextMileage;
                    record.remarks = remarks;

                    if (dateChanged) {
                        TrimotoSystem.maintenanceRecords.sort((r1, r2) -> r2.date.compareToIgnoreCase(r1.date));
                    }
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
    String odometerStr = txtOdometerRd.getText().trim();
    String fuel = txtFuelLvl.getText().trim();

        if (date.isEmpty() || odometerStr.isEmpty() || fuel.isEmpty()) {
            JOptionPane.showMessageDialog(viewinspect, "Please fill in all required inspection fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int newMileage = Integer.parseInt(odometerStr);
            String motorId = jTable2.getValueAt(tableRow, 0).toString().trim();
            String origDate = jTable2.getValueAt(tableRow, 1).toString().trim();
            String origPhase = jTable2.getValueAt(tableRow, 2).toString().trim();

            for (InspectionRecord record : TrimotoSystem.inspections) {
                if (record.motorcycleId.equalsIgnoreCase(motorId) && 
                    record.date.equalsIgnoreCase(origDate) && 
                    record.phase.equalsIgnoreCase(origPhase)) {

                    boolean dateChanged = !record.date.equalsIgnoreCase(date);

                    if (cbmotorcycle.getSelectedItem() != null) {
                        String selectedCombo = cbmotorcycle.getSelectedItem().toString();
                        record.motorcycleId = selectedCombo.split(" - ")[0].trim();
                    }
                    record.date = date;
                    record.phase = cbinspectionphase.getSelectedItem().toString();
                    record.odometer = odometerStr;
                    record.fuel = fuel;
                    record.tires = cbTireCondition.getSelectedItem().toString();
                    record.brakes = cbBrakeCondition.getSelectedItem().toString();
                    record.headlight = cbHeadlightSignalLights.getSelectedItem().toString();
                    record.horns = cbHorns.getSelectedItem().toString();
                    record.mirrors = cbMirrors.getSelectedItem().toString();
                    record.body = cbMotorcycleBody.getSelectedItem().toString();
                    record.engine = cbEngineCondition.getSelectedItem().toString();
                    record.condition = cbOverallCondition.getSelectedItem().toString();
                    record.readiness = cbReadinessStatus.getSelectedItem().toString();
                    record.notes = txtInspectNotes.getText().trim();

                    Motorcycle m = TrimotoSystem.findMotorcycleById(record.motorcycleId);
                    if (m != null) {
                        if ("Under Repair".equalsIgnoreCase(record.readiness) || 
                            "Unsafe".equalsIgnoreCase(record.condition) || 
                            "Needs Repair".equalsIgnoreCase(record.condition)) {
                            m.setStatus("Under Repair");
                        } else if ("Under Maintenance".equalsIgnoreCase(record.readiness)) {
                            m.setStatus("Under Maintenance");
                        } else {
                            m.setStatus("Available");
                        }
                    }

                    if (dateChanged) {
                        TrimotoSystem.inspections.sort((r1, r2) -> r2.date.compareToIgnoreCase(r1.date));
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
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(viewinspect, "Odometer reading must be a valid integer.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewInspectSaveActionPerformed

    private void btnDeleteMainteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMainteActionPerformed
    int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewmaintedialog, "Please select a maintenance record to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(viewmaintedialog, "Are you sure you want to delete this specific maintenance record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String motorId = jTable3.getValueAt(selectedRow, 0).toString().trim();
            String date = jTable3.getValueAt(selectedRow, 1).toString().trim();
            String type = jTable3.getValueAt(selectedRow, 2).toString().trim();

            for (int i = 0; i < TrimotoSystem.maintenanceRecords.size(); i++) {
                MaintenanceRecord r = TrimotoSystem.maintenanceRecords.get(i);
                if (r.motorcycleId.trim().equalsIgnoreCase(motorId) && 
                    r.date.trim().equalsIgnoreCase(date) && 
                    r.type.trim().equalsIgnoreCase(type)) {

                    TrimotoSystem.maintenanceRecords.remove(i);
                    break; 
                }
            }

            TrimotoSystem.saveAllData();
            mainteapplyfilterActionPerformed(evt);
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(viewmaintedialog, "Maintenance record deleted successfully.");
        }
    }//GEN-LAST:event_btnDeleteMainteActionPerformed

    private void txtSearchMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchMaintenanceActionPerformed
        mainteapplyfilterActionPerformed(evt);
    }//GEN-LAST:event_txtSearchMaintenanceActionPerformed

    private void cbmotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmotorcycleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmotorcycleActionPerformed

    private void cbMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorcycleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorcycleActionPerformed

    private void btnInspectDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInspectDeleteActionPerformed
    int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewinspectdialog, "Please select an inspection record to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(viewinspectdialog, "Are you sure you want to delete this specific inspection record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String motorId = jTable2.getValueAt(selectedRow, 0).toString().trim();
            String date = jTable2.getValueAt(selectedRow, 1).toString().trim();
            String phase = jTable2.getValueAt(selectedRow, 2).toString().trim();

            for (int i = 0; i < TrimotoSystem.inspections.size(); i++) {
                InspectionRecord r = TrimotoSystem.inspections.get(i);
                if (r.motorcycleId.trim().equalsIgnoreCase(motorId) && 
                    r.date.trim().equalsIgnoreCase(date) && 
                    r.phase.trim().equalsIgnoreCase(phase)) {

                    TrimotoSystem.inspections.remove(i); // Removes single item
                    break; 
                }
            }

            TrimotoSystem.saveAllData();
            InspectApplyFilterActionPerformed(evt);
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(viewinspectdialog, "Inspection record deleted successfully.");
        }    }//GEN-LAST:event_btnInspectDeleteActionPerformed

    private void txtSearchInspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchInspectActionPerformed
    InspectApplyFilterActionPerformed(evt);
    }//GEN-LAST:event_txtSearchInspectActionPerformed

    private void btnDamageReportDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamageReportDeleteActionPerformed
    int selectedRow = jTable4.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewdamagereportdialog, "Please select a damage report to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(viewdamagereportdialog, "Are you sure you want to delete this specific damage report?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (selectedRow < TrimotoSystem.damageReports.size()) {
                TrimotoSystem.damageReports.remove(selectedRow); // Deletes ONLY the clicked row index
                TrimotoSystem.saveAllData();
                DamageRepApplyFilterActionPerformed(evt);
                notifyDashboardRefresh();
                JOptionPane.showMessageDialog(viewdamagereportdialog, "Damage report deleted successfully.");
            }
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
        
        
        String plate = txtPlate.getText().trim();
        String brand = txtBrand.getText().trim();
        String model = txtModel.getText().trim();
        String yearStr = txtYear.getText().trim();
        String mileageStr = txtMileage.getText().trim();
        String rateStr = txtDailyRentalRate.getText().trim();

        String spec1Str = txtSpec1.getText().trim();
        String spec2Str = txtSpec2.getText().trim();
        String spec3Str = txtSpec3.getText().trim();

        if (spec1Str.matches(".*[a-zA-Z].*") || spec2Str.matches(".*[a-zA-Z].*") || spec3Str.matches(".*[a-zA-Z].*")) {
            JOptionPane.showMessageDialog(viewmmotorcycle, "Specifications cannot contain letters.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (brand.isEmpty() || model.isEmpty() || yearStr.isEmpty() || mileageStr.isEmpty() || rateStr.isEmpty()) {
            JOptionPane.showMessageDialog(viewmmotorcycle, "Please fill in all primary motorcycle details (Brand, Model, Year, Mileage, Daily Rate).", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String targetId = txtMotorcycleID.getText().trim();
        Motorcycle m = TrimotoSystem.findMotorcycleById(targetId);

        if (m != null) {
            try {
                int year = Integer.parseInt(yearStr);
                int mileage = Integer.parseInt(mileageStr);
                double rate = Double.parseDouble(rateStr);
                String trans = txtTransmissionType.getText().trim().isEmpty() ? "Manual" : txtTransmissionType.getText().trim();
                String type = cbTypes.getSelectedItem() != null ? cbTypes.getSelectedItem().toString() : m.getType();

                double spec1 = spec1Str.isEmpty() ? 0 : Double.parseDouble(spec1Str);
                double spec2 = spec2Str.isEmpty() ? 0 : Double.parseDouble(spec2Str);
                double spec3 = spec3Str.isEmpty() ? 0 : Double.parseDouble(spec3Str);

                Motorcycle updatedMotorcycle = MotorcycleFactory.createMotorcycle(
                    type, targetId, plate, brand, model, year, trans, mileage, rate, spec1, spec2, spec3
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
        String keyword = txtSearchMaintenance.getText().trim().toLowerCase();

        TrimotoSystem.maintenanceRecords.sort((r1, r2) -> r2.date.compareToIgnoreCase(r1.date));

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);

        for (MaintenanceRecord r : TrimotoSystem.maintenanceRecords) {
            boolean matchesMotorcycle = selectedMaintenanceMotorId == null || 
                                         r.motorcycleId.trim().equalsIgnoreCase(selectedMaintenanceMotorId);

            boolean matchesKeyword = keyword.isEmpty() ||
                r.motorcycleId.toLowerCase().contains(keyword) ||
                r.date.toLowerCase().contains(keyword) ||
                r.type.toLowerCase().contains(keyword) ||
                r.category.toLowerCase().contains(keyword) ||
                r.workPerformed.toLowerCase().contains(keyword) ||
                r.partsReplaced.toLowerCase().contains(keyword) ||
                r.odometer.toLowerCase().contains(keyword) ||
                String.valueOf(r.cost).toLowerCase().contains(keyword) ||
                r.nextServiceMileage.toLowerCase().contains(keyword) ||
                r.remarks.toLowerCase().contains(keyword);

            if (matchesMotorcycle && matchesKeyword) {
                model.addRow(new Object[]{
                    r.motorcycleId, r.date, r.type, r.category, r.workPerformed,
                    r.partsReplaced, r.odometer, r.cost, r.nextServiceMileage, r.remarks
                });
            }
        }
    
    }//GEN-LAST:event_mainteapplyfilterActionPerformed

    private void InspectApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InspectApplyFilterActionPerformed
    String keyword = txtSearchInspect.getText().trim().toLowerCase();

    TrimotoSystem.inspections.sort((r1, r2) -> r2.date.compareToIgnoreCase(r1.date));

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);

    for (InspectionRecord r : TrimotoSystem.inspections) {
        boolean matchesMotorcycle = selectedInspectionMotorId == null || 
                                     r.motorcycleId.trim().equalsIgnoreCase(selectedInspectionMotorId);

        boolean matchesKeyword = keyword.isEmpty() ||
            r.motorcycleId.toLowerCase().contains(keyword) ||
            r.date.toLowerCase().contains(keyword) ||
            r.phase.toLowerCase().contains(keyword) ||
            r.odometer.toLowerCase().contains(keyword) ||
            r.fuel.toLowerCase().contains(keyword) ||
            r.tires.toLowerCase().contains(keyword) ||
            r.brakes.toLowerCase().contains(keyword) ||
            r.headlight.toLowerCase().contains(keyword) ||
            r.horns.toLowerCase().contains(keyword) ||
            r.mirrors.toLowerCase().contains(keyword) ||
            r.body.toLowerCase().contains(keyword) ||
            r.engine.toLowerCase().contains(keyword) ||
            r.condition.toLowerCase().contains(keyword) ||
            r.readiness.toLowerCase().contains(keyword) ||
            r.notes.toLowerCase().contains(keyword);

        if (matchesMotorcycle && matchesKeyword) {
            model.addRow(new Object[]{
                r.motorcycleId, r.date, r.phase,
                r.odometer, r.fuel, r.tires, r.brakes,
                r.headlight, r.horns, r.mirrors, r.body,
                r.engine, r.condition, r.readiness, r.notes
            });
        }
    }
    }//GEN-LAST:event_InspectApplyFilterActionPerformed

    private void DamageRepApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamageRepApplyFilterActionPerformed
    String keyword = txtSearchDamageReport.getText().trim().toLowerCase();

    TrimotoSystem.damageReports.sort((r1, r2) -> r2.date.compareToIgnoreCase(r1.date));

    DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
    model.setRowCount(0);

        for (DamageReport r : TrimotoSystem.damageReports) {
            boolean matchesMotorcycle = selectedDamageReportMotorId == null || 
                                         r.motorcycleId.trim().equalsIgnoreCase(selectedDamageReportMotorId);

            boolean matchesKeyword = keyword.isEmpty() ||
                r.motorcycleId.toLowerCase().contains(keyword) ||
                r.date.toLowerCase().contains(keyword) ||
                r.location.toLowerCase().contains(keyword) ||
                r.type.toLowerCase().contains(keyword) ||
                r.description.toLowerCase().contains(keyword) ||
                String.valueOf(r.estimatedCost).toLowerCase().contains(keyword) ||
                r.notes.toLowerCase().contains(keyword);

            if (matchesMotorcycle && matchesKeyword) {
                model.addRow(new Object[]{
                    r.motorcycleId, r.date, r.location, r.type, r.description, r.estimatedCost, r.notes
                });
            }
        }
    }//GEN-LAST:event_DamageRepApplyFilterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    String keyword = txtSearch.getText().trim().toLowerCase();
        if (keyword.isEmpty()) {
            loadTableData();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) recordstable.getModel();
        model.setRowCount(0);

        for (Motorcycle m : TrimotoSystem.motorcycles) {
            if (m.getId().toLowerCase().contains(keyword) ||
                m.getBrand().toLowerCase().contains(keyword) ||
                m.getModel().toLowerCase().contains(keyword) ||
                String.valueOf(m.getYear()).toLowerCase().contains(keyword) ||
                m.getType().toLowerCase().contains(keyword) ||
                m.getStatus().toLowerCase().contains(keyword)) {

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

    private void cbTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypesActionPerformed
    String selectedType = cbTypes.getSelectedItem() != null ? cbTypes.getSelectedItem().toString().trim() : "Scooter";

        switch (selectedType) {
            case "Scooter":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Compartment Capacity (L):");
                jLabel41.setText("Fuel Capacity (L):");
                
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                jLabel41.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec3.setEditable(true);
                break;

            case "Adventure Bike":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Compartment Capacity (L):");
                jLabel41.setText("Fuel Capacity (L):");
                
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                jLabel41.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec3.setEditable(true);
                break;

            case "Standard Bike":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Fuel Capacity (L):");
                jLabel41.setText("");
                
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                jLabel41.setVisible(false);
                txtSpec3.setVisible(false);
                txtSpec3.setEditable(false);
                break;

            case "Sports Bike":
                jLabel39.setText("Engine Displacement (cc):");
                jLabel40.setText("Fuel Capacity (L):");
                jLabel41.setText("Power Output (HP):");
                
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                jLabel41.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec3.setEditable(true);
                break;

            case "Electric Bike":
                jLabel39.setText("Motor Power (W):");
                jLabel40.setText("Battery Capacity (Ah):");
                jLabel41.setText("Charging Time (hrs):");
                
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                jLabel41.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec3.setEditable(true);
                break;

            default:
                jLabel39.setText(" ");
                jLabel40.setText(" ");
                jLabel41.setText(" ");
                break;
        }
    }//GEN-LAST:event_cbTypesActionPerformed

    private void btnMarkAsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAsAvailableActionPerformed
    int selectedRow = recordstable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle to mark as available.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String motorId = recordstable.getValueAt(selectedRow, 0).toString().trim();
        Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);

        if (m != null) {
            m.setStatus("Available");
            TrimotoSystem.saveAllData();
            loadTableData();
            notifyDashboardRefresh();
            JOptionPane.showMessageDialog(this, "Motorcycle " + motorId + " is now marked as Available.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnMarkAsAvailableActionPerformed
  
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
            jLabel39.setText(""); txtSpec1.setText("");
            jLabel40.setText(""); txtSpec2.setText("");
            jLabel41.setText(""); txtSpec3.setText("");
            return;
        }

        String[] lines = info.split("\n");

        if (lines.length > 0 && lines[0].contains(":")) {
            String[] parts = lines[0].split(":", 2);
            jLabel39.setText(parts[0].trim() + ":");
            String val = parts[1].replaceAll("[^0-9.]", "").trim();
            txtSpec1.setText(val);
        } else {
            jLabel39.setText(""); txtSpec1.setText("");
        }

        if (lines.length > 1 && lines[1].contains(":")) {
            String[] parts = lines[1].split(":", 2);
            jLabel40.setText(parts[0].trim() + ":");
            String val = parts[1].replaceAll("[^0-9.]", "").trim();
            txtSpec2.setText(val);
        } else {
            jLabel40.setText(""); txtSpec2.setText("");
        }

        if (lines.length > 2 && lines[2].contains(":")) {
            String[] parts = lines[2].split(":", 2);
            jLabel41.setText(parts[0].trim() + ":");
            String val = parts[1].replaceAll("[^0-9.]", "").trim();
            txtSpec3.setText(val);
            jLabel41.setVisible(true);
            txtSpec3.setVisible(true);
            txtSpec3.setEditable(true);
        } else {
            jLabel41.setText("");
            txtSpec3.setText("");
            jLabel41.setVisible(false);
            txtSpec3.setVisible(false);
            txtSpec3.setEditable(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DamageRepApplyFilter;
    private javax.swing.JLabel ID;
    private javax.swing.JButton InspectApplyFilter;
    private javax.swing.JLabel brand;
    private javax.swing.JButton btnDamageReport;
    private javax.swing.JButton btnDamageReportDelete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteMainte;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditDamageReport;
    private javax.swing.JButton btnEditInspect;
    private javax.swing.JButton btnEditMainte;
    private javax.swing.JButton btnInspectDelete;
    private javax.swing.JButton btnMarkAsAvailable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSaveMainte;
    private javax.swing.JButton btnSaveViewMotorcycle;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDmg;
    private javax.swing.JButton btnViewFurtherDetails;
    private javax.swing.JButton btnViewInspectSave;
    private javax.swing.JButton btnViewInspectionRecord;
    private javax.swing.JButton btnViewMaintenanceRecord;
    private javax.swing.JComboBox<String> cbBrakeCondition;
    private javax.swing.JComboBox<String> cbDamageType1;
    private javax.swing.JComboBox<String> cbEngineCondition;
    private javax.swing.JComboBox<String> cbHeadlightSignalLights;
    private javax.swing.JComboBox<String> cbHorns;
    private javax.swing.JComboBox<String> cbMaintenanceType;
    private javax.swing.JComboBox<String> cbMirrors;
    private javax.swing.JComboBox<String> cbMotorcycle;
    private javax.swing.JComboBox<String> cbMotorcycle1;
    private javax.swing.JComboBox<String> cbMotorcycleBody;
    private javax.swing.JComboBox<String> cbOverallCondition;
    private javax.swing.JComboBox<String> cbReadinessStatus;
    private javax.swing.JComboBox<String> cbTireCondition;
    private javax.swing.JComboBox<String> cbTypes;
    private javax.swing.JComboBox<String> cbinspectionphase;
    private javax.swing.JComboBox<String> cbmotorcycle;
    private javax.swing.JLabel description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblInspectionphase;
    private javax.swing.JLabel lblMotorID;
    private javax.swing.JLabel lblPlate;
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
    private javax.swing.JLabel model;
    private javax.swing.JScrollPane recordsscrollpane;
    private javax.swing.JTable recordstable;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAdditionalNotes1;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtDailyRentalRate;
    private javax.swing.JTextField txtDamageDescription1;
    private javax.swing.JTextField txtDamageLocation1;
    private javax.swing.JTextField txtDateReported1;
    private javax.swing.JTextField txtEstimatedRepairCost1;
    private javax.swing.JTextField txtFuelLvl;
    private javax.swing.JTextField txtInspectNotes;
    private javax.swing.JTextField txtMaintenanceCost;
    private javax.swing.JTextField txtMileage;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtMotorcycleID;
    private javax.swing.JTextField txtNextServiceMileage;
    private javax.swing.JTextField txtOdometerRd;
    private javax.swing.JTextField txtOdometerReading;
    private javax.swing.JTextField txtPartsReplaced;
    private javax.swing.JTextField txtPlate;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchDamageReport;
    private javax.swing.JTextField txtSearchInspect;
    private javax.swing.JTextField txtSearchMaintenance;
    private javax.swing.JTextField txtServiceCat;
    private javax.swing.JTextField txtSpec1;
    private javax.swing.JTextField txtSpec2;
    private javax.swing.JTextField txtSpec3;
    private javax.swing.JTextField txtTransmissionType;
    private javax.swing.JTextField txtWorkPerformed;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtinspectdate;
    private javax.swing.JTextField txtmaintedate;
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