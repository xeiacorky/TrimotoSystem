import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MaintenanceRecording extends javax.swing.JPanel {

    public MaintenanceRecording() {
        UIManager.put("Button.focusWidth", 0);
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        txtMaintedate.setText(java.time.LocalDate.now().toString());
        refreshMotorcycleDropdown();
    }
    
    public void refreshMotorcycleDropdown() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.getMotorcycles()) {
            model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel());
        }
        cbMotorcycle.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblmotor = new javax.swing.JLabel();
        cbMotorcycle = new javax.swing.JComboBox<>();
        lblmaintenancedate = new javax.swing.JLabel();
        txtMaintedate = new javax.swing.JTextField();
        lblmaintenancetype = new javax.swing.JLabel();
        cbMainteType = new javax.swing.JComboBox<>();
        lblServiceCategory = new javax.swing.JLabel();
        txtServiceCat = new javax.swing.JTextField();
        lblWorkPerformed = new javax.swing.JLabel();
        txtWorkPerfo = new javax.swing.JTextField();
        lblPartsReplaced = new javax.swing.JLabel();
        txtPartsRepla = new javax.swing.JTextField();
        lblOdometer = new javax.swing.JLabel();
        txtOdometer = new javax.swing.JTextField();
        lblMaintenanceCost = new javax.swing.JLabel();
        txtMainteCost = new javax.swing.JTextField();
        lblNextServiceMileage = new javax.swing.JLabel();
        txtServiceMile = new javax.swing.JTextField();
        lblRemarks = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        btnsavemaintenance = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 550));

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Maintenance Recording");

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setForeground(new java.awt.Color(153, 153, 153));
        description.setText("Record repairs, servicing, and maintenance expenses");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(10, 2, 15, 15));

        lblmotor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblmotor.setText("Motorcycle:");
        jPanel1.add(lblmotor);

        cbMotorcycle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotorcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMotorcycle.setFocusable(false);
        cbMotorcycle.addActionListener(this::cbMotorcycleActionPerformed);
        jPanel1.add(cbMotorcycle);

        lblmaintenancedate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblmaintenancedate.setText("Maintenance Date:");
        jPanel1.add(lblmaintenancedate);

        txtMaintedate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtMaintedate);

        lblmaintenancetype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblmaintenancetype.setText("Maintenance Type:");
        jPanel1.add(lblmaintenancetype);

        cbMainteType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMainteType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventive", "Corrective" }));
        cbMainteType.setFocusable(false);
        jPanel1.add(cbMainteType);

        lblServiceCategory.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblServiceCategory.setText("Service Category");
        jPanel1.add(lblServiceCategory);

        txtServiceCat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtServiceCat);

        lblWorkPerformed.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblWorkPerformed.setText("Work Performed:");
        jPanel1.add(lblWorkPerformed);

        txtWorkPerfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtWorkPerfo);

        lblPartsReplaced.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblPartsReplaced.setText("Parts Replaced:");
        jPanel1.add(lblPartsReplaced);

        txtPartsRepla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtPartsRepla);

        lblOdometer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblOdometer.setText("Odometer Reading(km):");
        jPanel1.add(lblOdometer);

        txtOdometer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtOdometer);

        lblMaintenanceCost.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblMaintenanceCost.setText("Maintenance Cost:");
        jPanel1.add(lblMaintenanceCost);

        txtMainteCost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtMainteCost);

        lblNextServiceMileage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblNextServiceMileage.setText("Next Service Mileage:");
        jPanel1.add(lblNextServiceMileage);

        txtServiceMile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtServiceMile);

        lblRemarks.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblRemarks.setText("Remarks");
        jPanel1.add(lblRemarks);

        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtRemarks);

        btnsavemaintenance.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnsavemaintenance.setText("Save Maintenance Record");
        btnsavemaintenance.setFocusPainted(false);
        btnsavemaintenance.setFocusable(false);
        btnsavemaintenance.addActionListener(this::btnsavemaintenanceActionPerformed);

        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnclear.setText("Clear");
        btnclear.setFocusPainted(false);
        btnclear.setFocusable(false);
        btnclear.addActionListener(this::btnclearActionPerformed);

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsavemaintenance))
                            .addComponent(description)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsavemaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclear))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsavemaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavemaintenanceActionPerformed
     if (cbMotorcycle.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Please select a motorcycle.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String date = txtMaintedate.getText().trim();
    String category = txtServiceCat.getText().trim();
    String workPerformed = txtWorkPerfo.getText().trim();
    String partsReplaced = txtPartsRepla.getText().trim();
    String odometer = txtOdometer.getText().trim();
    String costText = txtMainteCost.getText().trim();
    String nextServiceMileage = txtServiceMile.getText().trim();
    String remarks = txtRemarks.getText().trim(); 

    if (date.isEmpty() || category.isEmpty() || workPerformed.isEmpty() || 
        partsReplaced.isEmpty() || odometer.isEmpty() || costText.isEmpty() || nextServiceMileage.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all maintenance fields. Only Remarks can be left blank.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double cost = Double.parseDouble(costText);
        String selectedItem = cbMotorcycle.getSelectedItem().toString();
        String motorId = selectedItem.split(" - ")[0].trim();
        String type = cbMainteType.getSelectedItem().toString();

        String mntId = "MNT-" + (TrimotoSystem.getMaintenanceRecords().size() + 1001);
        TrimotoSystem.addMaintenanceRecord(new MaintenanceRecord(
            mntId, motorId, date, type, category, workPerformed, partsReplaced, 
            odometer, cost, nextServiceMileage, remarks
        ));

        Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
        if (m != null) {
            m.setStatus("Available");
        }
        
        TrimotoSystem.saveAllData();

        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }

        for (int i = 0; i < cbMotorcycle.getItemCount(); i++) {
            if (cbMotorcycle.getItemAt(i).startsWith(motorId)) {
                cbMotorcycle.setSelectedIndex(i);
                break;
            }
        }

        JOptionPane.showMessageDialog(this, "Maintenance Record Saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
        btnclearActionPerformed(evt);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Maintenance cost must be a valid number.", "Invalid Format", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnsavemaintenanceActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtMaintedate.setText("");
        txtServiceCat.setText("");
        txtWorkPerfo.setText("");
        txtPartsRepla.setText("");
        txtOdometer.setText("");
        txtMainteCost.setText("");
        txtServiceMile.setText("");
        txtRemarks.setText("");    }//GEN-LAST:event_btnclearActionPerformed

    private void cbMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorcycleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorcycleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsavemaintenance;
    private javax.swing.JComboBox<String> cbMainteType;
    private javax.swing.JComboBox<String> cbMotorcycle;
    private javax.swing.JLabel description;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMaintenanceCost;
    private javax.swing.JLabel lblNextServiceMileage;
    private javax.swing.JLabel lblOdometer;
    private javax.swing.JLabel lblPartsReplaced;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblServiceCategory;
    private javax.swing.JLabel lblWorkPerformed;
    private javax.swing.JLabel lblmaintenancedate;
    private javax.swing.JLabel lblmaintenancetype;
    private javax.swing.JLabel lblmotor;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtMainteCost;
    private javax.swing.JTextField txtMaintedate;
    private javax.swing.JTextField txtOdometer;
    private javax.swing.JTextField txtPartsRepla;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtServiceCat;
    private javax.swing.JTextField txtServiceMile;
    private javax.swing.JTextField txtWorkPerfo;
    // End of variables declaration//GEN-END:variables
}
