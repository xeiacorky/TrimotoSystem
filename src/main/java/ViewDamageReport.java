import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ViewDamageReport extends javax.swing.JPanel {

    public ViewDamageReport() {
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        refreshMotorcycleDropdown();
    }

    public void refreshMotorcycleDropdown() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cbMotorId.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMotorcycle = new javax.swing.JLabel();
        cbMotorId = new javax.swing.JComboBox<>();
        lblDamageLocation = new javax.swing.JLabel();
        txtDamageLocation = new javax.swing.JTextField();
        lblDamageType = new javax.swing.JLabel();
        cbDamageType = new javax.swing.JComboBox<>();
        lblDamageDescription = new javax.swing.JLabel();
        txtDamageDescrip = new javax.swing.JTextField();
        lblDamageReported = new javax.swing.JLabel();
        txtDateReported = new javax.swing.JTextField();
        lblAddNotes = new javax.swing.JLabel();
        txtAddNotes = new javax.swing.JTextField();
        lblEstimatedRepairCost = new javax.swing.JLabel();
        txtEstimatedRepairCost = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnDamageReport = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Damage Report");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(7, 2, 15, 15));

        lblMotorcycle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMotorcycle.setText("Motorcycle:");
        jPanel1.add(lblMotorcycle);

        cbMotorId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotorId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMotorId.setFocusable(false);
        cbMotorId.addActionListener(this::cbMotorIdActionPerformed);
        jPanel1.add(cbMotorId);

        lblDamageLocation.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageLocation.setText("Damage Location: ");
        jPanel1.add(lblDamageLocation);

        txtDamageLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtDamageLocation);

        lblDamageType.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageType.setText("Damage Type:");
        jPanel1.add(lblDamageType);

        cbDamageType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDamageType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scratch", "Dent", "Crack", "Broken Part" }));
        cbDamageType.setFocusable(false);
        jPanel1.add(cbDamageType);

        lblDamageDescription.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageDescription.setText("Damage Description:");
        jPanel1.add(lblDamageDescription);

        txtDamageDescrip.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtDamageDescrip);

        lblDamageReported.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageReported.setText("Date Reported:");
        jPanel1.add(lblDamageReported);

        txtDateReported.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtDateReported);

        lblAddNotes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAddNotes.setText("Additional Notes:");
        jPanel1.add(lblAddNotes);

        txtAddNotes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtAddNotes);

        lblEstimatedRepairCost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEstimatedRepairCost.setText("Estimated Repair Cost:");
        jPanel1.add(lblEstimatedRepairCost);

        txtEstimatedRepairCost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtEstimatedRepairCost);

        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnclear.setText("Clear");
        btnclear.setFocusPainted(false);
        btnclear.setFocusable(false);
        btnclear.addActionListener(this::btnclearActionPerformed);

        btnDamageReport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDamageReport.setText("Save Damage Report");
        btnDamageReport.setFocusPainted(false);
        btnDamageReport.setFocusable(false);
        btnDamageReport.addActionListener(this::btnDamageReportActionPerformed);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel15.setText("Record damage report records and notes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDamageReport))
                            .addComponent(title)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btnDamageReport))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamageReportActionPerformed
    if (cbMotorId.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String location = txtDamageLocation.getText().trim();
        String desc = txtDamageDescrip.getText().trim();
        String date = txtDateReported.getText().trim();
        String notes = txtAddNotes.getText().trim();
        String costStr = txtEstimatedRepairCost.getText().trim();

        if (location.isEmpty() || desc.isEmpty() || date.isEmpty() || notes.isEmpty() || costStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required to create a damage report.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double cost = Double.parseDouble(costStr);
            String selected = cbMotorId.getSelectedItem().toString();
            String motorId = selected.split(" - ")[0];
            String type = cbDamageType.getSelectedItem().toString();

            String dmgId = "DMG-" + (TrimotoSystem.damageReports.size() + 1001);

            DamageReport newReport = new DamageReport(dmgId, motorId, date, location, type, desc, cost, notes);
            TrimotoSystem.damageReports.add(newReport);

            TrimotoSystem.saveAllData();

            java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
            if (topWindow instanceof MainDashboard) {
                ((MainDashboard) topWindow).refreshAllPanels();
            }

            JOptionPane.showMessageDialog(this, "Damage Report Saved Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            btnclearActionPerformed(evt);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric cost.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    btnclearActionPerformed(evt);    }//GEN-LAST:event_btnDamageReportActionPerformed

    private void cbMotorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorIdActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtDamageLocation.setText("");
        txtDamageDescrip.setText("");
        txtDateReported.setText("");
        txtAddNotes.setText("");
        txtEstimatedRepairCost.setText("");    }//GEN-LAST:event_btnclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDamageReport;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> cbDamageType;
    private javax.swing.JComboBox<String> cbMotorId;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddNotes;
    private javax.swing.JLabel lblDamageDescription;
    private javax.swing.JLabel lblDamageLocation;
    private javax.swing.JLabel lblDamageReported;
    private javax.swing.JLabel lblDamageType;
    private javax.swing.JLabel lblEstimatedRepairCost;
    private javax.swing.JLabel lblMotorcycle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAddNotes;
    private javax.swing.JTextField txtDamageDescrip;
    private javax.swing.JTextField txtDamageLocation;
    private javax.swing.JTextField txtDateReported;
    private javax.swing.JTextField txtEstimatedRepairCost;
    // End of variables declaration//GEN-END:variables
}
