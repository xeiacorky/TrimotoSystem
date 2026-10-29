import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RentalProcessing extends javax.swing.JPanel {

    public RentalProcessing() {
        UIManager.put("Button.focusWidth", 0);
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        txtreturn.setText("");
        refreshMotorcycleDropdown();
    }

    public void refreshMotorcycleDropdown() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Motorcycle m : TrimotoSystem.motorcycles) {
            if ("Available".equalsIgnoreCase(m.getStatus())) {
                model.addElement(m.getId() + " - " + m.getBrand() + " " + m.getModel() + " (₱" + m.getDailyRate() + "/day)");
            }
        }
        motor.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblmotor = new javax.swing.JLabel();
        motor = new javax.swing.JComboBox<>();
        lblrenter = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblage = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblnumber = new javax.swing.JLabel();
        txtcontnumber = new javax.swing.JTextField();
        lblduration = new javax.swing.JLabel();
        lbldura = new javax.swing.JTextField();
        driverlicense = new javax.swing.JLabel();
        txtdriverslicense = new javax.swing.JTextField();
        lblamount = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbpartial = new javax.swing.JCheckBox();
        cbfull = new javax.swing.JCheckBox();
        lblexpectedreturn = new javax.swing.JLabel();
        txtreturn = new javax.swing.JTextField();
        btnprocessrental = new javax.swing.JButton();
        calculateCost = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 550));

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Rental Processing");

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setText("Record repairs, servicing, and maintenance expenses");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(10, 2, 15, 15));

        lblmotor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotor.setText("Motorcycle:");
        jPanel1.add(lblmotor);

        motor.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        motor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        motor.setFocusable(false);
        motor.addActionListener(this::motorActionPerformed);
        jPanel1.add(motor);

        lblrenter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblrenter.setText("Renter Name:");
        jPanel1.add(lblrenter);

        txtname.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtname);

        lblage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblage.setText("Age:");
        jPanel1.add(lblage);

        txtage.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtage);

        lbladdress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbladdress.setText("Address:");
        jPanel1.add(lbladdress);

        txtaddress.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtaddress.addActionListener(this::txtaddressActionPerformed);
        jPanel1.add(txtaddress);

        lblnumber.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblnumber.setText("Contact Number:");
        jPanel1.add(lblnumber);

        txtcontnumber.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtcontnumber);

        lblduration.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblduration.setText("Rental Duration (Days):");
        jPanel1.add(lblduration);

        lbldura.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(lbldura);

        driverlicense.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        driverlicense.setText("Driver's License #:");
        jPanel1.add(driverlicense);

        txtdriverslicense.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtdriverslicense);

        lblamount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblamount.setText("Enter Amount:");
        jPanel1.add(lblamount);

        txtamount.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtamount);

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

        lblexpectedreturn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblexpectedreturn.setText("Expected Return Date: ");
        jPanel1.add(lblexpectedreturn);

        txtreturn.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtreturn);

        btnprocessrental.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnprocessrental.setText("Process Rental");
        btnprocessrental.setFocusPainted(false);
        btnprocessrental.setFocusable(false);
        btnprocessrental.addActionListener(this::btnprocessrentalActionPerformed);

        calculateCost.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        calculateCost.setText("Calculate Cost");
        calculateCost.setFocusPainted(false);
        calculateCost.setFocusable(false);
        calculateCost.addActionListener(this::calculateCostActionPerformed);

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
                    .addComponent(title)
                    .addComponent(description))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculateCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprocessrental)
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
                    .addComponent(btnprocessrental)
                    .addComponent(calculateCost)
                    .addComponent(btnclear))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocessrentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocessrentalActionPerformed
        if (motor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "No available motorcycle selected.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String renter = txtname.getText().trim();
        String age = txtage.getText().trim();
        String address = txtaddress.getText().trim();
        String contactNumber = txtcontnumber.getText().trim();
        String daysStr = lbldura.getText().trim();
        String licenseNumber = txtdriverslicense.getText().trim();
        String amountStr = txtamount.getText().trim();
        String returnDate = txtreturn.getText().trim();

        if (renter.isEmpty() || age.isEmpty() || address.isEmpty() || contactNumber.isEmpty() || 
            daysStr.isEmpty() || licenseNumber.isEmpty() || amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete all renter personal details, rental duration, and payment amount before processing.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int days = Integer.parseInt(daysStr);
            double payment = Double.parseDouble(amountStr);
            String motorId = motor.getSelectedItem().toString().split(" - ")[0];

            String paymentType = cbpartial.isSelected() ? "Partial" : (cbfull.isSelected() ? "Full" : "Standard");

            Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
            if (m == null) return;

            // Dynamic polymorphic calculation
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

            btnclearActionPerformed(evt);
            refreshMotorcycleDropdown();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Age, Rental Duration, and Payment Amount.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnprocessrentalActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed

    }//GEN-LAST:event_txtaddressActionPerformed

    private void calculateCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateCostActionPerformed
      if (motor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a motorcycle.");
            return;
        }

        try {
            String selected = motor.getSelectedItem().toString();
            String motorId = selected.split(" - ")[0].trim();
            int days = Integer.parseInt(lbldura.getText().trim());

            Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
            if (m != null) {
                if (!"Available".equalsIgnoreCase(m.getStatus())) {
                    JOptionPane.showMessageDialog(this, "Note: Selected motorcycle is currently '" + m.getStatus() + "'.", "Availability Warning", JOptionPane.WARNING_MESSAGE);
                }

                // Polymorphic Cost Calculation
                double totalCost = m.calculateRentalCost(days);

                if (txtreturn.getText().trim().isEmpty()) {
                    txtreturn.setText(java.time.LocalDate.now().plusDays(days).toString());
                }

                JOptionPane.showMessageDialog(this, "Calculated Total Rental Cost: ₱" + totalCost + "\n\nPlease enter the payment amount received in the 'Enter Amount' field.", "Rental Cost Calculation", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of rental days.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calculateCostActionPerformed

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

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
    txtname.setText("");
        txtage.setText("");
        txtaddress.setText("");
        txtcontnumber.setText("");
        lbldura.setText("");
        txtdriverslicense.setText("");
        txtamount.setText("");
        txtreturn.setText("");
        txtreturn.setText("");
        cbpartial.setSelected(false);
        cbfull.setSelected(false);
     }//GEN-LAST:event_btnclearActionPerformed

    private void motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnprocessrental;
    private javax.swing.JButton calculateCost;
    private javax.swing.JCheckBox cbfull;
    private javax.swing.JCheckBox cbpartial;
    private javax.swing.JLabel description;
    private javax.swing.JLabel driverlicense;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblamount;
    private javax.swing.JTextField lbldura;
    private javax.swing.JLabel lblduration;
    private javax.swing.JLabel lblexpectedreturn;
    private javax.swing.JLabel lblmotor;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblrenter;
    private javax.swing.JComboBox<String> motor;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtcontnumber;
    private javax.swing.JTextField txtdriverslicense;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtreturn;
    // End of variables declaration//GEN-END:variables
}
