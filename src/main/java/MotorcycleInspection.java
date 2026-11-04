import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MotorcycleInspection extends javax.swing.JPanel {

    public MotorcycleInspection() {
        UIManager.put("Button.focusWidth", 0);
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        txtInspectDate.setText(java.time.LocalDate.now().toString());
        refreshMotorcycleDropdown();
    }

    public void refreshMotorcycleDropdown() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cmbMotorcycle.setModel(model);
    }

    private void notifyDashboardRefresh() {
        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewinspect = new javax.swing.JDialog();
        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblmotor = new javax.swing.JLabel();
        cmbMotorcycle = new javax.swing.JComboBox<>();
        lblinspectiondate = new javax.swing.JLabel();
        txtInspectDate = new javax.swing.JTextField();
        lblInspectionphase = new javax.swing.JLabel();
        cbInspectionPhase = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtOdometer = new javax.swing.JTextField();
        lblfuel = new javax.swing.JLabel();
        txtFuel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbTire = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbBrake = new javax.swing.JComboBox<>();
        lblheadlightandsignal = new javax.swing.JLabel();
        cbHeadlight = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbHorn = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbMirrors = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbMotoBody = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbEngineCondition = new javax.swing.JComboBox<>();
        lbloverallcondi = new javax.swing.JLabel();
        cbOverallCondition = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbReadiness = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtInspectionNotes = new javax.swing.JTextField();
        btnCreateDmgReport = new javax.swing.JButton();
        btnSaveInspect = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        javax.swing.GroupLayout viewinspectLayout = new javax.swing.GroupLayout(viewinspect.getContentPane());
        viewinspect.getContentPane().setLayout(viewinspectLayout);
        viewinspectLayout.setHorizontalGroup(
            viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        viewinspectLayout.setVerticalGroup(
            viewinspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.pressedBackground"));
        setPreferredSize(new java.awt.Dimension(900, 550));

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Motorcycle Inspection");

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setText("Document the motorcycles current condition and any damage");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(15, 2, 15, 15));

        lblmotor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor.setText("Motorcycle:");
        jPanel1.add(lblmotor);

        cmbMotorcycle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbMotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMotorcycle.setFocusable(false);
        jPanel1.add(cmbMotorcycle);

        lblinspectiondate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblinspectiondate.setText("Inspection Date:");
        jPanel1.add(lblinspectiondate);

        txtInspectDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtInspectDate);

        lblInspectionphase.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblInspectionphase.setText("Inspection Phase:");
        jPanel1.add(lblInspectionphase);

        cbInspectionPhase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbInspectionPhase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Rental", "Post-Rental" }));
        cbInspectionPhase.setFocusable(false);
        jPanel1.add(cbInspectionPhase);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Odometer Reading:");
        jPanel1.add(jLabel5);

        txtOdometer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtOdometer);

        lblfuel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblfuel.setText("Fuel Level / Battery Level:");
        jPanel1.add(lblfuel);

        txtFuel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtFuel);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Tire Condition:");
        jPanel1.add(jLabel2);

        cbTire.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Scratched", "Dented" }));
        cbTire.setFocusable(false);
        jPanel1.add(cbTire);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Brake Condition:");
        jPanel1.add(jLabel3);

        cbBrake.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbBrake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Worn", "Damaged" }));
        cbBrake.setFocusable(false);
        jPanel1.add(cbBrake);

        lblheadlightandsignal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblheadlightandsignal.setText("Headlight and Signal Lights:");
        jPanel1.add(lblheadlightandsignal);

        cbHeadlight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbHeadlight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        cbHeadlight.setFocusable(false);
        jPanel1.add(cbHeadlight);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Horns");
        jPanel1.add(jLabel6);

        cbHorn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbHorn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Functional", "Not Functional" }));
        cbHorn.setFocusable(false);
        jPanel1.add(cbHorn);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Mirrors");
        jPanel1.add(jLabel8);

        cbMirrors.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMirrors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete", "Missing", "Damaged" }));
        cbMirrors.setFocusable(false);
        jPanel1.add(cbMirrors);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Motorcycle Body:");
        jPanel1.add(jLabel4);

        cbMotoBody.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotoBody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Needs Repair" }));
        cbMotoBody.setFocusable(false);
        jPanel1.add(cbMotoBody);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Engine Condition:");
        jPanel1.add(jLabel1);

        cbEngineCondition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbEngineCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Unusual Noise", "Other Issue" }));
        cbEngineCondition.setFocusable(false);
        jPanel1.add(cbEngineCondition);

        lbloverallcondi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbloverallcondi.setText("Overall Condition:");
        jPanel1.add(lbloverallcondi);

        cbOverallCondition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbOverallCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Minor Damage", "Needs Repair", "Unsafe" }));
        cbOverallCondition.setFocusable(false);
        jPanel1.add(cbOverallCondition);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Readiness Status:");
        jPanel1.add(jLabel7);

        cbReadiness.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbReadiness.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Under Repair", "Under Maintenance" }));
        cbReadiness.setFocusable(false);
        jPanel1.add(cbReadiness);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("Inspection Notes:");
        jPanel1.add(jLabel9);

        txtInspectionNotes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtInspectionNotes);

        btnCreateDmgReport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCreateDmgReport.setText("Create Damage Report");
        btnCreateDmgReport.setFocusPainted(false);
        btnCreateDmgReport.setFocusable(false);
        btnCreateDmgReport.addActionListener(this::btnCreateDmgReportActionPerformed);

        btnSaveInspect.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSaveInspect.setText("Save Inspection");
        btnSaveInspect.setFocusPainted(false);
        btnSaveInspect.setFocusable(false);
        btnSaveInspect.addActionListener(this::btnSaveInspectActionPerformed);

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setFocusPainted(false);
        btnClear.setFocusable(false);
        btnClear.addActionListener(this::btnClearActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(description)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreateDmgReport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveInspect)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateDmgReport)
                    .addComponent(btnSaveInspect)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDmgReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDmgReportActionPerformed
        javax.swing.JDialog popupDialog = new javax.swing.JDialog(javax.swing.SwingUtilities.getWindowAncestor(this), "Damage Report", java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        popupDialog.add(new ViewDamageReport());
        popupDialog.pack();
        popupDialog.setLocationRelativeTo(this);
        popupDialog.setVisible(true);
    }//GEN-LAST:event_btnCreateDmgReportActionPerformed

    private void btnSaveInspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveInspectActionPerformed
      if (cmbMotorcycle.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Please select a motorcycle.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String date = txtInspectDate.getText().trim();
    String odometerStr = txtOdometer.getText().trim();
    String fuel = txtFuel.getText().trim();

    if (date.isEmpty() || odometerStr.isEmpty() || fuel.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required inspection fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int newMileage = Integer.parseInt(odometerStr);
        String selectedItem = cmbMotorcycle.getSelectedItem().toString();
        String motorId = selectedItem.split(" - ")[0];
        String phase = cbInspectionPhase.getSelectedItem().toString();
        String tires = cbTire.getSelectedItem().toString();
        String brakes = cbBrake.getSelectedItem().toString();
        String headlight = cbHeadlight.getSelectedItem().toString();
        String horns = cbHorn.getSelectedItem().toString();
        String mirrors = cbMirrors.getSelectedItem().toString();
        String body = cbMotoBody.getSelectedItem().toString();
        String engine = cbEngineCondition.getSelectedItem().toString();
        String condition = cbOverallCondition.getSelectedItem().toString();
        String readiness = cbReadiness.getSelectedItem().toString();
        String notes = txtInspectionNotes.getText().trim();

        String insId = "INS-" + (TrimotoSystem.inspections.size() + 1001);
        TrimotoSystem.inspections.add(new InspectionRecord(
            insId, motorId, date, phase, odometerStr, fuel, tires, brakes, 
            headlight, horns, mirrors, body, engine, condition, readiness, notes
        ));

        Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
        if (m != null) {
            m.setMileage(newMileage);

            // Sync Motorcycle status with selected readiness/condition
            if ("Under Repair".equalsIgnoreCase(readiness) || "Unsafe".equalsIgnoreCase(condition) || "Needs Repair".equalsIgnoreCase(condition)) {
                m.setStatus("Under Repair");
            } else if ("Under Maintenance".equalsIgnoreCase(readiness)) {
                m.setStatus("Under Maintenance");
            } else {
                m.setStatus("Available");
            }
        }
        
        TrimotoSystem.saveAllData();

        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }

        JOptionPane.showMessageDialog(this, "Inspection Saved Successfully! Motorcycle mileage updated to " + newMileage + " km.", "Success", JOptionPane.INFORMATION_MESSAGE);
        btnClearActionPerformed(new java.awt.event.ActionEvent(btnClear, java.awt.event.ActionEvent.ACTION_PERFORMED, null));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Odometer Reading must be a valid numeric integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSaveInspectActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtInspectDate.setText(java.time.LocalDate.now().toString());
        txtFuel.setText("");
        txtOdometer.setText("");
        txtInspectionNotes.setText("");    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateDmgReport;
    private javax.swing.JButton btnSaveInspect;
    private javax.swing.JComboBox<String> cbBrake;
    private javax.swing.JComboBox<String> cbEngineCondition;
    private javax.swing.JComboBox<String> cbHeadlight;
    private javax.swing.JComboBox<String> cbHorn;
    private javax.swing.JComboBox<String> cbInspectionPhase;
    private javax.swing.JComboBox<String> cbMirrors;
    private javax.swing.JComboBox<String> cbMotoBody;
    private javax.swing.JComboBox<String> cbOverallCondition;
    private javax.swing.JComboBox<String> cbReadiness;
    private javax.swing.JComboBox<String> cbTire;
    private javax.swing.JComboBox<String> cmbMotorcycle;
    private javax.swing.JLabel description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInspectionphase;
    private javax.swing.JLabel lblfuel;
    private javax.swing.JLabel lblheadlightandsignal;
    private javax.swing.JLabel lblinspectiondate;
    private javax.swing.JLabel lblmotor;
    private javax.swing.JLabel lbloverallcondi;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JTextField txtInspectDate;
    private javax.swing.JTextField txtInspectionNotes;
    private javax.swing.JTextField txtOdometer;
    private javax.swing.JDialog viewinspect;
    // End of variables declaration//GEN-END:variables
}
