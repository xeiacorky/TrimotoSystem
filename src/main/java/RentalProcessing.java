import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RentalProcessing extends javax.swing.JPanel {

    public RentalProcessing() {
        UIManager.put("Button.focusWidth", 0);
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        txtReturnDate.setText("");
        refreshMotorcycleDropdown();
    }

    public void refreshMotorcycleDropdown() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            if ("Available".equalsIgnoreCase(m.getStatus())) {
                model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel() + " (₱" + m.getDailyRate() + "/day)");
            }
        }
        cbMotor.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMotor = new javax.swing.JLabel();
        cbMotor = new javax.swing.JComboBox<>();
        lblRenter = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblnumber = new javax.swing.JLabel();
        txtContNumber = new javax.swing.JTextField();
        lblduration = new javax.swing.JLabel();
        txtRentalDays = new javax.swing.JTextField();
        driverlicense = new javax.swing.JLabel();
        txtDriversLicense = new javax.swing.JTextField();
        lblamount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbpartial = new javax.swing.JCheckBox();
        cbfull = new javax.swing.JCheckBox();
        lblExpectedReturn = new javax.swing.JLabel();
        txtReturnDate = new javax.swing.JTextField();
        btnProcessRental = new javax.swing.JButton();
        btnCalculateCost = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 550));

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Rental Processing");

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setText("Record repairs, servicing, and maintenance expenses");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(10, 2, 15, 15));

        lblMotor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMotor.setText("Motorcycle:");
        jPanel1.add(lblMotor);

        cbMotor.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMotor.setFocusable(false);
        cbMotor.addActionListener(this::cbMotorActionPerformed);
        jPanel1.add(cbMotor);

        lblRenter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblRenter.setText("Renter Name:");
        jPanel1.add(lblRenter);

        txtName.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtName);

        lblAge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAge.setText("Age:");
        jPanel1.add(lblAge);

        txtAge.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtAge);

        lblAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAddress.setText("Address:");
        jPanel1.add(lblAddress);

        txtAddress.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtAddress.addActionListener(this::txtAddressActionPerformed);
        jPanel1.add(txtAddress);

        lblnumber.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblnumber.setText("Contact Number:");
        jPanel1.add(lblnumber);

        txtContNumber.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtContNumber);

        lblduration.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblduration.setText("Rental Duration (Days):");
        jPanel1.add(lblduration);

        txtRentalDays.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtRentalDays);

        driverlicense.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        driverlicense.setText("Driver's License #:");
        jPanel1.add(driverlicense);

        txtDriversLicense.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtDriversLicense);

        lblamount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblamount.setText("Enter Amount:");
        jPanel1.add(lblamount);

        txtAmount.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtAmount);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel1.add(jLabel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        cbpartial.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbpartial.setText("Partial Payment");
        cbpartial.addActionListener(this::cbpartialActionPerformed);
        jPanel3.add(cbpartial);

        cbfull.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cbfull.setText("Full Payment");
        cbfull.addActionListener(this::cbfullActionPerformed);
        jPanel3.add(cbfull);

        jPanel1.add(jPanel3);

        lblExpectedReturn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblExpectedReturn.setText("Expected Return Date: ");
        jPanel1.add(lblExpectedReturn);

        txtReturnDate.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtReturnDate);

        btnProcessRental.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnProcessRental.setText("Process Rental");
        btnProcessRental.setFocusPainted(false);
        btnProcessRental.setFocusable(false);
        btnProcessRental.addActionListener(this::btnProcessRentalActionPerformed);

        btnCalculateCost.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCalculateCost.setText("Calculate Cost");
        btnCalculateCost.setFocusPainted(false);
        btnCalculateCost.setFocusable(false);
        btnCalculateCost.addActionListener(this::btnCalculateCostActionPerformed);

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
                    .addComponent(title)
                    .addComponent(description))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalculateCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcessRental)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessRental)
                    .addComponent(btnCalculateCost)
                    .addComponent(btnClear))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRentalActionPerformed
        if (cbMotor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "No available motorcycle selected.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String renter = txtName.getText().trim();
        String age = txtAge.getText().trim();
        String address = txtAddress.getText().trim();
        String contactNumber = txtContNumber.getText().trim();
        String daysStr = txtRentalDays.getText().trim();
        String licenseNumber = txtDriversLicense.getText().trim();
        String amountStr = txtAmount.getText().trim();
        String returnDate = txtReturnDate.getText().trim();

        if (renter.isEmpty() || age.isEmpty() || address.isEmpty() || contactNumber.isEmpty() || 
            daysStr.isEmpty() || licenseNumber.isEmpty() || amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete all renter personal details, rental duration, and payment amount before processing.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int days = Integer.parseInt(daysStr);
            double payment = Double.parseDouble(amountStr);
            String motorId = cbMotor.getSelectedItem().toString().split(" - ")[0];

            String paymentType = cbpartial.isSelected() ? "Partial" : (cbfull.isSelected() ? "Full" : "Standard");

            Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
            if (m == null) return;

            double totalCost = m.calculateRentalCost(days);
            String transId = "TRX-" + (TrimotoSystem.rentals.size() + 1001);
            String date = java.time.LocalDate.now().toString();

            if (returnDate.isEmpty()) {
                returnDate = java.time.LocalDate.now().plusDays(days).toString();
            }

            RenterProfile profile = new RenterProfile(renter, address, contactNumber, licenseNumber, age);

            TrimotoSystem.rentals.add(new RentalTransaction(
                transId, motorId, profile, days, totalCost, payment,
                paymentType, date, returnDate, "Active"
            ));

            m.setStatus("Rented");

            java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
            if (topWindow instanceof MainDashboard) {
                ((MainDashboard) topWindow).refreshAllPanels();
            }

            JOptionPane.showMessageDialog(this, "Rental Processed Successfully!\nTransaction ID: " + transId + "\nTotal Cost: ₱" + totalCost, "Success", JOptionPane.INFORMATION_MESSAGE);

            btnClearActionPerformed(evt);
            refreshMotorcycleDropdown();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Age, Rental Duration, and Payment Amount.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProcessRentalActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed

    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnCalculateCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateCostActionPerformed
      if (cbMotor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle.");
            return;
        }

        try {
            String selected = cbMotor.getSelectedItem().toString();
            String motorId = selected.split(" - ")[0].trim();
            int days = Integer.parseInt(txtRentalDays.getText().trim());

            Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
            if (m != null) {
                if (!"Available".equalsIgnoreCase(m.getStatus())) {
                    JOptionPane.showMessageDialog(this, "Note: Selected motorcycle is currently '" + m.getStatus() + "'.", "Availability Warning", JOptionPane.WARNING_MESSAGE);
                }

                double totalCost = m.calculateRentalCost(days);

                if (txtReturnDate.getText().trim().isEmpty()) {
                    txtReturnDate.setText(java.time.LocalDate.now().plusDays(days).toString());
                }

                JOptionPane.showMessageDialog(this, "Calculated Total Rental Cost: ₱" + totalCost + "\n\nPlease enter the payment amount received in the 'Enter Amount' field.", "Rental Cost Calculation", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of rental days.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculateCostActionPerformed

    private void cbpartialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpartialActionPerformed
        if (cbpartial.isSelected()) {
            cbfull.setSelected(false);
        }
    }//GEN-LAST:event_cbpartialActionPerformed

    private void cbfullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfullActionPerformed
        if (cbfull.isSelected()) {
            cbpartial.setSelected(false);
        }
    }//GEN-LAST:event_cbfullActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtAge.setText("");
        txtAddress.setText("");
        txtContNumber.setText("");
        txtRentalDays.setText("");
        txtDriversLicense.setText("");
        txtAmount.setText("");
        txtReturnDate.setText("");
        txtReturnDate.setText("");
        cbpartial.setSelected(false);
        cbfull.setSelected(false);
     }//GEN-LAST:event_btnClearActionPerformed

    private void cbMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateCost;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnProcessRental;
    private javax.swing.JComboBox<String> cbMotor;
    private javax.swing.JCheckBox cbfull;
    private javax.swing.JCheckBox cbpartial;
    private javax.swing.JLabel description;
    private javax.swing.JLabel driverlicense;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblExpectedReturn;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblRenter;
    private javax.swing.JLabel lblamount;
    private javax.swing.JLabel lblduration;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtContNumber;
    private javax.swing.JTextField txtDriversLicense;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRentalDays;
    private javax.swing.JTextField txtReturnDate;
    // End of variables declaration//GEN-END:variables
}
