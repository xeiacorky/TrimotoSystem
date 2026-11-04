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

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        btnclear1 = new javax.swing.JButton();
        btnsavemaintenance1 = new javax.swing.JButton();
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
        lblActionRequired = new javax.swing.JLabel();
        cbActionReq = new javax.swing.JComboBox<>();
        lblDamageStatus = new javax.swing.JLabel();
        cbDamageStat = new javax.swing.JComboBox<>();
        lblAddNotes = new javax.swing.JLabel();
        txtAddNotes = new javax.swing.JTextField();
        lblEstimatedRepairCost = new javax.swing.JLabel();
        txtEstimatedRepairCost = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnDamageReport = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        title1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title1.setText("Damage Report");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel3.setLayout(new java.awt.GridLayout(10, 2, 15, 15));

        jLabel11.setText("Motorcycle:");
        jPanel3.add(jLabel11);
        jPanel3.add(jTextField9);

        jLabel19.setText("Damage Location: ");
        jPanel3.add(jLabel19);
        jPanel3.add(jTextField10);

        jLabel9.setText("Damage Type:");
        jPanel3.add(jLabel9);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scratch", "Dent", "Crack", "Broken Part" }));
        jPanel3.add(jComboBox8);

        jLabel21.setText("Damage Description:");
        jPanel3.add(jLabel21);
        jPanel3.add(jTextField6);

        jLabel7.setText("Date Reported:");
        jPanel3.add(jLabel7);
        jPanel3.add(jTextField11);

        jLabel12.setText("Action Required:");
        jPanel3.add(jLabel12);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repair", "Monitor", "No Action" }));
        jPanel3.add(jComboBox9);

        jLabel13.setText("Damage Status:");
        jPanel3.add(jLabel13);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Under Repair", "Resolved" }));
        jPanel3.add(jComboBox10);

        jLabel3.setText("Additional Notes:");
        jPanel3.add(jLabel3);
        jPanel3.add(jTextField3);

        jLabel14.setText("Estimated Repair Cost:");
        jPanel3.add(jLabel14);
        jPanel3.add(jTextField12);

        btnclear1.setText("Clear");
        jPanel3.add(btnclear1);

        btnsavemaintenance1.setText("Save Maintenance Record");
        btnsavemaintenance1.addActionListener(this::btnsavemaintenance1ActionPerformed);
        jPanel3.add(btnsavemaintenance1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Damage Report");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(9, 2, 15, 15));

        lblMotorcycle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMotorcycle.setText("Motorcycle:");
        jPanel1.add(lblMotorcycle);

        cbMotorId.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbMotorId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMotorId.setFocusable(false);
        cbMotorId.addActionListener(this::cbMotorIdActionPerformed);
        jPanel1.add(cbMotorId);

        lblDamageLocation.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageLocation.setText("Damage Location: ");
        jPanel1.add(lblDamageLocation);

        txtDamageLocation.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtDamageLocation);

        lblDamageType.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageType.setText("Damage Type:");
        jPanel1.add(lblDamageType);

        cbDamageType.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbDamageType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scratch", "Dent", "Crack", "Broken Part" }));
        cbDamageType.setFocusable(false);
        jPanel1.add(cbDamageType);

        lblDamageDescription.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageDescription.setText("Damage Description:");
        jPanel1.add(lblDamageDescription);

        txtDamageDescrip.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtDamageDescrip);

        lblDamageReported.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageReported.setText("Date Reported:");
        jPanel1.add(lblDamageReported);

        txtDateReported.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtDateReported);

        lblActionRequired.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblActionRequired.setText("Action Required:");
        jPanel1.add(lblActionRequired);

        cbActionReq.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbActionReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repair", "Monitor", "No Action" }));
        cbActionReq.setFocusable(false);
        jPanel1.add(cbActionReq);

        lblDamageStatus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDamageStatus.setText("Damage Status:");
        jPanel1.add(lblDamageStatus);

        cbDamageStat.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbDamageStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Under Repair", "Resolved" }));
        cbDamageStat.setFocusable(false);
        jPanel1.add(cbDamageStat);

        lblAddNotes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAddNotes.setText("Additional Notes:");
        jPanel1.add(lblAddNotes);

        txtAddNotes.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtAddNotes);

        lblEstimatedRepairCost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEstimatedRepairCost.setText("Estimated Repair Cost:");
        jPanel1.add(lblEstimatedRepairCost);

        txtEstimatedRepairCost.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
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
                        .addComponent(btnclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDamageReport)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15))
                    .addComponent(title))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btnDamageReport))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsavemaintenance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavemaintenance1ActionPerformed
if (cbMotorId.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Motorcycle ID required.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selected = cbMotorId.getSelectedItem().toString();
        String motorId = selected.split(" - ")[0];
        String location = txtDamageLocation.getText().trim();
        String type = cbDamageType.getSelectedItem().toString();
        String desc = txtDamageDescrip.getText().trim();
        String date = txtDateReported.getText().trim();
        String action = cbActionReq.getSelectedItem().toString();
        String status = cbDamageStat.getSelectedItem().toString();
        String notes = txtAddNotes.getText().trim();
        String cost = txtEstimatedRepairCost.getText().trim();

        String dmgId = "DMG-" + (TrimotoSystem.damageReports.size() + 1001);
        String formattedRecord = "Report ID: " + dmgId + "\n" +
                                "Motorcycle: " + motorId + "\n" +
                                "Date: " + (date.isEmpty() ? java.time.LocalDate.now().toString() : date) + "\n" +
                                "Location: " + (location.isEmpty() ? "-" : location) + "\n" +
                                "Type: " + type + "\n" +
                                "Description: " + (desc.isEmpty() ? "-" : desc) + "\n" +
                                "Action Required: " + action + "\n" +
                                "Status: " + status + "\n" +
                                "Notes: " + (notes.isEmpty() ? "-" : notes) + "\n" +
                                "Cost: " + (cost.isEmpty() ? "0" : cost);

        TrimotoSystem.damageReports.add(formattedRecord);
        JOptionPane.showMessageDialog(this, "Damage Report Saved Successfully!");
        btnclearActionPerformed(new java.awt.event.ActionEvent(btnclear, java.awt.event.ActionEvent.ACTION_PERFORMED, null));    }//GEN-LAST:event_btnsavemaintenance1ActionPerformed

    private void btnDamageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamageReportActionPerformed
    if (cbMotorId.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String location = txtDamageLocation.getText().trim();
        String desc = txtDamageDescrip.getText().trim();
        String date = txtDateReported.getText().trim();
        String notes = txtAddNotes.getText().trim();
        String cost = txtEstimatedRepairCost.getText().trim();

        if (location.isEmpty() || desc.isEmpty() || date.isEmpty() || notes.isEmpty() || cost.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required to create a damage report. Please complete all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String selected = cbMotorId.getSelectedItem().toString();
        String motorId = selected.split(" - ")[0];
        String type = cbDamageType.getSelectedItem().toString();
        String action = cbActionReq.getSelectedItem().toString();
        String status = cbDamageStat.getSelectedItem().toString();

        String dmgId = "DMG-" + (TrimotoSystem.damageReports.size() + 1001);
        String formattedRecord = "Report ID: " + dmgId + "\n" +
                                "Motorcycle: " + motorId + "\n" +
                                "Date: " + date + "\n" +
                                "Location: " + location + "\n" +
                                "Type: " + type + "\n" +
                                "Description: " + desc + "\n" +
                                "Action Required: " + action + "\n" +
                                "Status: " + status + "\n" +
                                "Notes: " + notes + "\n" +
                                "Cost: " + cost;

        TrimotoSystem.damageReports.add(formattedRecord);
        JOptionPane.showMessageDialog(this, "Damage Report Saved Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnsavemaintenance1;
    private javax.swing.JComboBox<String> cbActionReq;
    private javax.swing.JComboBox<String> cbDamageStat;
    private javax.swing.JComboBox<String> cbDamageType;
    private javax.swing.JComboBox<String> cbMotorId;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblActionRequired;
    private javax.swing.JLabel lblAddNotes;
    private javax.swing.JLabel lblDamageDescription;
    private javax.swing.JLabel lblDamageLocation;
    private javax.swing.JLabel lblDamageReported;
    private javax.swing.JLabel lblDamageStatus;
    private javax.swing.JLabel lblDamageType;
    private javax.swing.JLabel lblEstimatedRepairCost;
    private javax.swing.JLabel lblMotorcycle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField txtAddNotes;
    private javax.swing.JTextField txtDamageDescrip;
    private javax.swing.JTextField txtDamageLocation;
    private javax.swing.JTextField txtDateReported;
    private javax.swing.JTextField txtEstimatedRepairCost;
    // End of variables declaration//GEN-END:variables
}
