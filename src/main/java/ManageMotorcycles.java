import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ManageMotorcycles extends javax.swing.JPanel {

    public ManageMotorcycles() {
        UIManager.put("Button.focusWidth", 0);
        initComponents();
        cmbtypesActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnaddmotorcycle = new javax.swing.JButton();

        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.pressedBackground"));
        setPreferredSize(new java.awt.Dimension(970, 551));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("Manage Motorcycles");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setText("Register a motorcycle in the system.");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setLayout(new java.awt.GridLayout(11, 2, 15, 15));

        lblMotorID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMotorID.setText("Motorcycle ID/Plate #:");
        jPanel1.add(lblMotorID);

        txtmotorid.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtmotorid.addActionListener(this::txtmotoridActionPerformed);
        jPanel1.add(txtmotorid);

        brand.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        brand.setText("Brand:");
        jPanel1.add(brand);

        txtbrand.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtbrand);

        model.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        model.setText("Model:");
        jPanel1.add(model);

        txtmodel.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtmodel);

        lblyear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblyear.setText("Year:");
        jPanel1.add(lblyear);

        txtyear.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtyear);

        lblmileage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmileage.setText("Mileage (km):");
        jPanel1.add(lblmileage);

        txtmileage.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtmileage);

        lbldailyrentalrate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbldailyrentalrate.setText("Daily Rental Rate:");
        jPanel1.add(lbldailyrentalrate);

        txtdailyrentalrate.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(txtdailyrentalrate);

        lblmotortype.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblmotortype.setText("Motorcycle Type");
        jPanel1.add(lblmotortype);

        cmbtypes.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        cmbtypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scooter", "Standard Bike", "Sports Bike", "Adventure Bike", "Electric Bike", "" }));
        cmbtypes.addActionListener(this::cmbtypesActionPerformed);
        jPanel1.add(cmbtypes);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Transmission Type:");
        jPanel1.add(jLabel3);

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        jPanel1.add(jTextField1);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel1.add(jLabel4);

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField2);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel1.add(jLabel5);

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField3);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel1.add(jLabel6);

        jTextField4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel1.add(jTextField4);

        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnclear.setText("Clear");
        btnclear.setFocusPainted(false);
        btnclear.addActionListener(this::btnclearActionPerformed);

        btnaddmotorcycle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnaddmotorcycle.setText("Add Motorcycle");
        btnaddmotorcycle.setFocusPainted(false);
        btnaddmotorcycle.addActionListener(this::btnaddmotorcycleActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnaddmotorcycle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btnaddmotorcycle))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtmotoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotoridActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       txtmotorid.setText("");
        txtbrand.setText("");
        txtmodel.setText("");
        txtyear.setText("");
        txtmileage.setText("");
        txtdailyrentalrate.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnaddmotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddmotorcycleActionPerformed
        String id = txtmotorid.getText().trim();
        String brand = txtbrand.getText().trim();
        String model = txtmodel.getText().trim();
        String yearStr = txtyear.getText().trim();
        String mileageStr = txtmileage.getText().trim();
        String rateStr = txtdailyrentalrate.getText().trim();
        String transmission = jTextField1.getText().trim().isEmpty() ? "Manual" : jTextField1.getText().trim();

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
            String type = cmbtypes.getSelectedItem() != null ? cmbtypes.getSelectedItem().toString().trim() : "Scooter";

            double spec1 = jTextField2.getText().trim().isEmpty() ? 0 : Double.parseDouble(jTextField2.getText().trim());
            double spec2 = jTextField3.getText().trim().isEmpty() ? 0 : Double.parseDouble(jTextField3.getText().trim());
            double spec3 = jTextField4.getText().trim().isEmpty() ? 0 : Double.parseDouble(jTextField4.getText().trim());

            Motorcycle m = MotorcycleFactory.createMotorcycle(type, id, brand, model, year, transmission, mileage, rate, spec1, spec2, spec3);

            TrimotoSystem.motorcycles.add(m);

            java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
            if (topWindow instanceof MainDashboard) {
                ((MainDashboard) topWindow).refreshAllPanels();
            }

            JOptionPane.showMessageDialog(this, "Motorcycle Registered Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            btnclearActionPerformed(new java.awt.event.ActionEvent(btnclear, java.awt.event.ActionEvent.ACTION_PERFORMED, null));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Year, Mileage, and Daily Rate.", "Invalid Format", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnaddmotorcycleActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cmbtypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtypesActionPerformed
        String selectedType = cmbtypes.getSelectedItem() != null ? cmbtypes.getSelectedItem().toString().trim() : "Scooter";

        switch (selectedType) {
            case "Scooter":
                jLabel4.setText("Engine Displacement (cc):");
                jLabel5.setText("Compartment Capacity (L):");
                jLabel6.setText("Fuel Capacity (L):");
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
                break;

            case "Adventure Bike":
                jLabel4.setText("Engine Displacement (cc):");
                jLabel5.setText("Compartment Capacity (L):");
                jLabel6.setText("Fuel Capacity (L):");
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
                break;

            case "Standard Bike":
                jLabel4.setText("Engine Displacement (cc):");
                jLabel5.setText("Fuel Capacity (L):");
                jLabel6.setText("");
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(false);
                break;

            case "Sports Bike":
                jLabel4.setText("Engine Displacement (cc):");
                jLabel5.setText("Fuel Capacity (L):");
                jLabel6.setText("Power Output (HP):");
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
                break;

            case "Electric Bike":
                jLabel4.setText("Motor Power (W):");
                jLabel5.setText("Battery Capacity (Ah):");
                jLabel6.setText("Charging Time (hrs):");
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
                break;

            default:
                jLabel4.setText(" ");
                jLabel5.setText(" ");
                jLabel6.setText(" ");
                break;
        }
    }//GEN-LAST:event_cmbtypesActionPerformed
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brand;
    private javax.swing.JButton btnaddmotorcycle;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> cmbtypes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblMotorID;
    private javax.swing.JLabel lbldailyrentalrate;
    private javax.swing.JLabel lblmileage;
    private javax.swing.JLabel lblmotortype;
    private javax.swing.JLabel lblyear;
    private javax.swing.JLabel model;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtdailyrentalrate;
    private javax.swing.JTextField txtmileage;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtmotorid;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
