import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ManageMotorcycles extends javax.swing.JPanel {

    public ManageMotorcycles() {
        UIManager.put("Button.focusWidth", 0);
        UIManager.put("ComboBox.drawFocusBackground", Boolean.FALSE);
        initComponents();
        cbMotorcycleTypesActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMotorID = new javax.swing.JLabel();
        txtMotorId = new javax.swing.JTextField();
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
        cbMotorcycleTypes = new javax.swing.JComboBox<>();
        lblTransmissionType = new javax.swing.JLabel();
        txtTransmissionType = new javax.swing.JTextField();
        lblSpec1 = new javax.swing.JLabel();
        txtSpec1 = new javax.swing.JTextField();
        lblSpec2 = new javax.swing.JLabel();
        txtSpec2 = new javax.swing.JTextField();
        lblSpec3 = new javax.swing.JLabel();
        txtSpec3 = new javax.swing.JTextField();
        lblSpec4 = new javax.swing.JLabel();
        txtSpec4 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAddMotorcycle = new javax.swing.JButton();

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.pressedBackground"));
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(970, 551));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("Manage Motorcycles");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Register a motorcycle in the system.");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(13, 2, 15, 15));

        lblMotorID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblMotorID.setText("Motorcycle ID:");
        jPanel1.add(lblMotorID);

        txtMotorId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMotorId.addActionListener(this::txtMotorIdActionPerformed);
        jPanel1.add(txtMotorId);

        lblPlate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblPlate.setText("Plate #:");
        jPanel1.add(lblPlate);

        txtPlate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtPlate);

        brand.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        brand.setText("Brand:");
        jPanel1.add(brand);

        txtBrand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtBrand);

        model.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        model.setText("Model:");
        jPanel1.add(model);

        txtModel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtModel);

        lblyear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblyear.setText("Year:");
        jPanel1.add(lblyear);

        txtYear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtYear);

        lblmileage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblmileage.setText("Mileage (km):");
        jPanel1.add(lblmileage);

        txtMileage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtMileage);

        lbldailyrentalrate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lbldailyrentalrate.setText("Daily Rental Rate:");
        jPanel1.add(lbldailyrentalrate);

        txtDailyRentalRate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtDailyRentalRate);

        lblmotortype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblmotortype.setText("Motorcycle Type:");
        jPanel1.add(lblmotortype);

        cbMotorcycleTypes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbMotorcycleTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electric Bike" }));
        cbMotorcycleTypes.setFocusable(false);
        cbMotorcycleTypes.addActionListener(this::cbMotorcycleTypesActionPerformed);
        jPanel1.add(cbMotorcycleTypes);

        lblTransmissionType.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblTransmissionType.setText("Transmission Type:");
        jPanel1.add(lblTransmissionType);

        txtTransmissionType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTransmissionType.addActionListener(this::txtTransmissionTypeActionPerformed);
        jPanel1.add(txtTransmissionType);

        lblSpec1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jPanel1.add(lblSpec1);

        txtSpec1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtSpec1);

        lblSpec2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jPanel1.add(lblSpec2);

        txtSpec2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtSpec2);

        lblSpec3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jPanel1.add(lblSpec3);

        txtSpec3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtSpec3);

        lblSpec4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jPanel1.add(lblSpec4);

        txtSpec4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtSpec4);

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setFocusPainted(false);
        btnClear.setFocusable(false);
        btnClear.addActionListener(this::btnClearActionPerformed);

        btnAddMotorcycle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnAddMotorcycle.setText("Add Motorcycle");
        btnAddMotorcycle.setFocusPainted(false);
        btnAddMotorcycle.setFocusable(false);
        btnAddMotorcycle.addActionListener(this::btnAddMotorcycleActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnClear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddMotorcycle))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnAddMotorcycle))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMotorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMotorId.setText("");
        txtBrand.setText("");
        txtPlate.setText("");
        txtModel.setText("");
        txtYear.setText("");
        txtMileage.setText("");
        txtDailyRentalRate.setText("");
        txtTransmissionType.setText("");
        txtSpec1.setText("");
        txtSpec2.setText("");
        txtSpec3.setText("");
        txtSpec4.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMotorcycleActionPerformed
                                                 
            String id = txtMotorId.getText().trim();
            String plate = txtPlate.getText().trim();
            String brand = txtBrand.getText().trim();
            String model = txtModel.getText().trim();
            String yearStr = txtYear.getText().trim();
            String mileageStr = txtMileage.getText().trim();
            String rateStr = txtDailyRentalRate.getText().trim();
            String transmission = txtTransmissionType.getText().trim().isEmpty() ? "Manual" : txtTransmissionType.getText().trim();

            if (id.isEmpty() || brand.isEmpty() || model.isEmpty() || yearStr.isEmpty() || mileageStr.isEmpty() || rateStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all primary fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (TrimotoSystem.findMotorcycleById(id) != null) {
                JOptionPane.showMessageDialog(this, "Motorcycle ID '" + id + "' already exists!", "Duplicate ID", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                int year = Integer.parseInt(yearStr);
                int mileage = Integer.parseInt(mileageStr);
                double rate = Double.parseDouble(rateStr);
                String type = cbMotorcycleTypes.getSelectedItem() != null ? cbMotorcycleTypes.getSelectedItem().toString().trim() : "Scooter";

                double spec1 = txtSpec1.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtSpec1.getText().trim());
                double spec2 = txtSpec2.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtSpec2.getText().trim());
                double spec3 = txtSpec3.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtSpec3.getText().trim());
                double spec4 = txtSpec4.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtSpec4.getText().trim()); // Added parsing for spec4

                Motorcycle m = MotorcycleFactory.createMotorcycle(type, id, plate, brand, model, year, transmission, mileage, rate, spec1, spec2, spec3, spec4);
                if (m != null) {
                    m.setStatus("For Inspection");
                    TrimotoSystem.addMotorcycle(m);
                }

                TrimotoSystem.saveAllData();

                java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
                if (topWindow instanceof MainDashboard) {
                    ((MainDashboard) topWindow).refreshAllPanels();
                }

                JOptionPane.showMessageDialog(this, "Motorcycle Registered Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnClearActionPerformed(new java.awt.event.ActionEvent(btnClear, java.awt.event.ActionEvent.ACTION_PERFORMED, null));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values only.", "Invalid Format", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnAddMotorcycleActionPerformed

    private void txtTransmissionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransmissionTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransmissionTypeActionPerformed

    private void cbMotorcycleTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorcycleTypesActionPerformed
        String selectedType = cbMotorcycleTypes.getSelectedItem() != null ? cbMotorcycleTypes.getSelectedItem().toString().trim() : "Scooter";

        switch (selectedType) {
            case "Scooter":
                lblSpec1.setText("Engine Displacement (cc):");
                lblSpec2.setText("Compartment Capacity (L):");
                lblSpec3.setText("Fuel Capacity (L):");
                lblSpec4.setText(" ");
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec4.setVisible(false);
                break;

            case "Adventure Bike":
                lblSpec1.setText("Engine Displacement (cc):");
                lblSpec2.setText("Compartment Capacity (L):");
                lblSpec3.setText("Fuel Capacity (L):");
                lblSpec4.setText("Ground Clearance (mm): ");
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec4.setVisible(true);
                break;

            case "Standard Bike":
                lblSpec1.setText("Engine Displacement (cc):");
                lblSpec2.setText("Fuel Capacity (L):");
                lblSpec3.setText("");
                lblSpec4.setText(" ");
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                txtSpec3.setVisible(false);
                txtSpec4.setVisible(false);
                break;

            case "Sports Bike":
                lblSpec1.setText("Engine Displacement (cc):");
                lblSpec2.setText("Fuel Capacity (L):");
                lblSpec3.setText("Power Output (HP):");
                lblSpec4.setText(" ");
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec4.setVisible(false);
                break;

            case "Electric Bike":
                lblSpec1.setText("Motor Power (W):");
                lblSpec2.setText("Battery Capacity (Ah):");
                lblSpec3.setText("Charging Time (hrs):");
                lblSpec4.setText(" ");
                txtSpec1.setVisible(true);
                txtSpec2.setVisible(true);
                txtSpec3.setVisible(true);
                txtSpec4.setVisible(false);
                break;

            default:
                lblSpec1.setText(" ");
                lblSpec2.setText(" ");
                lblSpec3.setText(" ");
                lblSpec4.setText(" ");
                break;
        }
    }//GEN-LAST:event_cbMotorcycleTypesActionPerformed
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brand;
    private javax.swing.JButton btnAddMotorcycle;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cbMotorcycleTypes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMotorID;
    private javax.swing.JLabel lblPlate;
    private javax.swing.JLabel lblSpec1;
    private javax.swing.JLabel lblSpec2;
    private javax.swing.JLabel lblSpec3;
    private javax.swing.JLabel lblSpec4;
    private javax.swing.JLabel lblTransmissionType;
    private javax.swing.JLabel lbldailyrentalrate;
    private javax.swing.JLabel lblmileage;
    private javax.swing.JLabel lblmotortype;
    private javax.swing.JLabel lblyear;
    private javax.swing.JLabel model;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtDailyRentalRate;
    private javax.swing.JTextField txtMileage;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtMotorId;
    private javax.swing.JTextField txtPlate;
    private javax.swing.JTextField txtSpec1;
    private javax.swing.JTextField txtSpec2;
    private javax.swing.JTextField txtSpec3;
    private javax.swing.JTextField txtSpec4;
    private javax.swing.JTextField txtTransmissionType;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
