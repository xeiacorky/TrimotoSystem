import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ViewRentalTransaction extends javax.swing.JPanel {

   public ViewRentalTransaction() {
        UIManager.put("Button.focusWidth", 0);
        initComponents();
        loadTableData();
    }

    public void loadTableData() {
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (RentalTransaction r : TrimotoSystem.rentals) {
            double balance = r.totalCost - r.initialPayment;
            String renterName = r.getRenterName();

            model.addRow(new Object[]{
                r.transactionId, 
                r.motorcycleId, 
                renterName, 
                r.days, 
                r.totalCost, 
                r.initialPayment, 
                balance, 
                r.date, 
                r.returnDate, 
                r.status
            });
        }
    }
    
    private void notifyDashboardRefresh() {
        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editviewtransac = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        lblrenter = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblnumber = new javax.swing.JLabel();
        txtcontnumber = new javax.swing.JTextField();
        lblduration = new javax.swing.JLabel();
        lbldura = new javax.swing.JTextField();
        driverlicense = new javax.swing.JLabel();
        txtdriverslicense = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbpartial = new javax.swing.JCheckBox();
        cbfull = new javax.swing.JCheckBox();
        lblexpectedreturn = new javax.swing.JLabel();
        txtreturn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        saveRentalEdit = new javax.swing.JButton();
        viewtransacdialog = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        viewtransactedit = new javax.swing.JButton();
        viewtransactdelete = new javax.swing.JButton();
        viewtranasactfilter = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        viewtransactapplyfilter = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnreturnedmark = new javax.swing.JButton();
        btnviewtransac = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setLayout(new java.awt.GridLayout(10, 2, 15, 15));

        lblrenter.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblrenter.setText("Renter Name:");
        jPanel2.add(lblrenter);

        txtname.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtname);

        lbladdress.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lbladdress.setText("Address:");
        jPanel2.add(lbladdress);

        txtaddress.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtaddress.addActionListener(this::txtaddressActionPerformed);
        jPanel2.add(txtaddress);

        lblnumber.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblnumber.setText("Contact Number:");
        jPanel2.add(lblnumber);

        txtcontnumber.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtcontnumber);

        lblduration.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblduration.setText("Rental Duration (Days):");
        jPanel2.add(lblduration);

        lbldura.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(lbldura);

        driverlicense.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        driverlicense.setText("Driver's License #:");
        jPanel2.add(driverlicense);

        txtdriverslicense.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtdriverslicense);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel1.setText("Total Cost (₱)");
        jPanel2.add(jLabel1);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jTextField1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setText("Initial Payment (₱)");
        jPanel2.add(jLabel2);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(jTextField2);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Payment Type:");
        jPanel2.add(jLabel3);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        cbpartial.setText("Partial Payment");
        jPanel3.add(cbpartial);

        cbfull.setText("Full Payment");
        jPanel3.add(cbfull);

        jPanel2.add(jPanel3);

        lblexpectedreturn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblexpectedreturn.setText("Expected Return Date: ");
        jPanel2.add(lblexpectedreturn);

        txtreturn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel2.add(txtreturn);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Status:");
        jPanel2.add(jLabel4);

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);

        saveRentalEdit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        saveRentalEdit.setText("Save");
        saveRentalEdit.addActionListener(this::saveRentalEditActionPerformed);

        javax.swing.GroupLayout editviewtransacLayout = new javax.swing.GroupLayout(editviewtransac.getContentPane());
        editviewtransac.getContentPane().setLayout(editviewtransacLayout);
        editviewtransacLayout.setHorizontalGroup(
            editviewtransacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editviewtransacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(editviewtransacLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(saveRentalEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editviewtransacLayout.setVerticalGroup(
            editviewtransacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editviewtransacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveRentalEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setToolTipText("");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Motorcycle ID/Plate #", "Renter", "Age", "Address", "Driver's  License #", "Rental Days", "Total Cost", "Initial Payment", "Balance", "Date Rented", "Return Date", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        viewtransactedit.setText("Edit");
        viewtransactedit.addActionListener(this::viewtransacteditActionPerformed);

        viewtransactdelete.setText("Delete");
        viewtransactdelete.addActionListener(this::viewtransactdeleteActionPerformed);

        viewtranasactfilter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        viewtranasactfilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Active", "Completed" }));
        viewtranasactfilter.addActionListener(this::viewtranasactfilterActionPerformed);

        jLabel32.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel32.setText("Filter Status:");

        viewtransactapplyfilter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        viewtransactapplyfilter.setText("Apply Filter");
        viewtransactapplyfilter.addActionListener(this::viewtransactapplyfilterActionPerformed);

        jTextField18.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTextField18.addActionListener(this::jTextField18ActionPerformed);

        jLabel33.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel33.setText("Search ID/Keyword");

        javax.swing.GroupLayout viewtransacdialogLayout = new javax.swing.GroupLayout(viewtransacdialog.getContentPane());
        viewtransacdialog.getContentPane().setLayout(viewtransacdialogLayout);
        viewtransacdialogLayout.setHorizontalGroup(
            viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtransacdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewtransacdialogLayout.createSequentialGroup()
                        .addComponent(viewtransactedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewtransactdelete))
                    .addGroup(viewtransacdialogLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewtranasactfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewtransactapplyfilter)))
                .addContainerGap(391, Short.MAX_VALUE))
            .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewtransacdialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewtransacdialogLayout.setVerticalGroup(
            viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewtransacdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(viewtranasactfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtransactapplyfilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtransactedit)
                    .addComponent(viewtransactdelete))
                .addContainerGap())
            .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewtransacdialogLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        description.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        description.setText("Review rental history and transaction status.");

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Rental Transaction");

        jScrollPane1.setToolTipText("");

        jTable1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Motorcycle ID", "Renter", "Rental Days", "Total Cost", "Initial Payment", "Balance", "Date Rented", "Return Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ID.setText("Search ID:");

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        btnsearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.setFocusPainted(false);
        btnsearch.addActionListener(this::btnsearchActionPerformed);

        btnrefresh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.setFocusPainted(false);
        btnrefresh.addActionListener(this::btnrefreshActionPerformed);

        btnreturnedmark.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnreturnedmark.setText("Mark Motorcycle Returned");
        btnreturnedmark.setFocusPainted(false);
        btnreturnedmark.addActionListener(this::btnreturnedmarkActionPerformed);

        btnviewtransac.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnviewtransac.setText("View Transaction Details");
        btnviewtransac.setFocusPainted(false);
        btnviewtransac.addActionListener(this::btnviewtransacActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(ID)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnviewtransac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreturnedmark)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrefresh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsearch))
                    .addComponent(description))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnreturnedmark)
                            .addComponent(btnviewtransac)
                            .addComponent(btnrefresh))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewtransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewtransacActionPerformed
        viewtransactapplyfilterActionPerformed(evt);
        viewtransacdialog.setSize(1520, 520);
        viewtransacdialog.setLocationRelativeTo(this);
        viewtransacdialog.setVisible(true);
       
    }//GEN-LAST:event_btnviewtransacActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    btnsearchActionPerformed(evt);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        viewtransactapplyfilterActionPerformed(evt);
        viewtransacdialog.setSize(900, 480);
        viewtransacdialog.setLocationRelativeTo(this);
        viewtransacdialog.setVisible(true);
    }//GEN-LAST:event_txtaddressActionPerformed

    private void saveRentalEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRentalEditActionPerformed
        javax.swing.JTable targetTable = (jTable2.getRowCount() > 0 && jTable2.getSelectedRow() != -1) ? jTable2 : jTable1;
        int selectedRow = targetTable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No rental transaction selected to edit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String renterName = txtname.getText().trim();
        String address = txtaddress.getText().trim();
        String contactNumber = txtcontnumber.getText().trim();
        String licenseNumber = txtdriverslicense.getText().trim();
        String duraStr = lbldura.getText().trim();
        String costStr = jTextField1.getText().trim();
        String paymentStr = jTextField2.getText().trim();
        String returnDate = txtreturn.getText().trim();

        if (renterName.isEmpty() || address.isEmpty() || contactNumber.isEmpty() || 
            licenseNumber.isEmpty() || duraStr.isEmpty() || costStr.isEmpty() || 
            paymentStr.isEmpty() || returnDate.isEmpty()) {
            JOptionPane.showMessageDialog(editviewtransac, "All renter personal details, duration, amounts, and return date are required before saving.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String transId = targetTable.getValueAt(selectedRow, 0).toString();

        for (RentalTransaction r : TrimotoSystem.rentals) {
            if (r.transactionId.equalsIgnoreCase(transId)) {
                try {
                    int days = Integer.parseInt(duraStr);
                    double cost = Double.parseDouble(costStr);
                    double payment = Double.parseDouble(paymentStr);

                    if (r.renterProfile != null) {
                        r.renterProfile.setName(renterName);
                        r.renterProfile.setAddress(address);
                        r.renterProfile.setContactNumber(contactNumber);
                        r.renterProfile.setLicenseNumber(licenseNumber);
                    }
                    r.days = days;
                    r.totalCost = cost;
                    r.initialPayment = payment;
                    r.returnDate = returnDate;
                    r.paymentType = cbpartial.isSelected() ? "Partial" : "Full";
                    if (jComboBox1.getSelectedItem() != null) {
                        r.status = jComboBox1.getSelectedItem().toString();
                    }

                    // Sync motorcycle status when rental status changes
                    Motorcycle m = TrimotoSystem.findMotorcycleById(r.motorcycleId);
                    if (m != null) {
                        if ("Completed".equalsIgnoreCase(r.status) || "Returned".equalsIgnoreCase(r.status) || "Cancelled".equalsIgnoreCase(r.status)) {
                            m.setStatus("Available");
                        } else if ("Active".equalsIgnoreCase(r.status)) {
                            m.setStatus("Rented");
                        }
                    }

                    loadTableData();
                    viewtransactapplyfilterActionPerformed(evt);
                    notifyDashboardRefresh();
                    editviewtransac.dispose();
                    
                    JOptionPane.showMessageDialog(this, "Rental transaction updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(editviewtransac, "Please enter valid numeric values for Duration, Total Cost, and Initial Payment.", "Format Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
        }
    }//GEN-LAST:event_saveRentalEditActionPerformed

    private void viewtransacteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransacteditActionPerformed
       int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewtransacdialog, "Please select a row from the table to edit.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String transId = jTable2.getValueAt(selectedRow, 0).toString();
        for (RentalTransaction r : TrimotoSystem.rentals) {
            if (r.transactionId.equalsIgnoreCase(transId)) {
                if (r.renterProfile != null) {
                    txtname.setText(r.renterProfile.getName());
                    txtaddress.setText(r.renterProfile.getAddress());
                    txtcontnumber.setText(r.renterProfile.getContactNumber());
                    txtdriverslicense.setText(r.renterProfile.getLicenseNumber());
                }
                lbldura.setText(String.valueOf(r.days));
                jTextField1.setText(String.valueOf(r.totalCost));
                jTextField2.setText(String.valueOf(r.initialPayment));
                txtreturn.setText(r.returnDate);
                cbpartial.setSelected("Partial".equalsIgnoreCase(r.paymentType));
                cbfull.setSelected("Full".equalsIgnoreCase(r.paymentType));

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Completed" }));
                jComboBox1.setSelectedItem(r.status);

                editviewtransac.setSize(750, 540);
                editviewtransac.setLocationRelativeTo(this);
                editviewtransac.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_viewtransacteditActionPerformed

    private void viewtranasactfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtranasactfilterActionPerformed
        viewtransactapplyfilterActionPerformed(evt);    }//GEN-LAST:event_viewtranasactfilterActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        viewtransactapplyfilterActionPerformed(evt);    }//GEN-LAST:event_jTextField18ActionPerformed

    private void viewtransactdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransactdeleteActionPerformed
       int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(viewtransacdialog, "Please select a transaction to delete.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String transId = jTable2.getValueAt(selectedRow, 0).toString();
        int confirm = JOptionPane.showConfirmDialog(viewtransacdialog, "Are you sure you want to delete transaction " + transId + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            TrimotoSystem.rentals.removeIf(r -> r.transactionId.equalsIgnoreCase(transId));
            loadTableData();
            viewtransactapplyfilterActionPerformed(evt);
            JOptionPane.showMessageDialog(viewtransacdialog, "Transaction deleted successfully.");
        }
    }//GEN-LAST:event_viewtransactdeleteActionPerformed

    private void viewtransactapplyfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransactapplyfilterActionPerformed
        String filterStatus = viewtranasactfilter.getSelectedItem() != null ? viewtranasactfilter.getSelectedItem().toString() : "All";
        String keyword = jTextField18.getText().trim().toLowerCase();

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for (RentalTransaction r : TrimotoSystem.rentals) {
            boolean matchesStatus = "All".equalsIgnoreCase(filterStatus) || r.status.equalsIgnoreCase(filterStatus);
            String renterName = r.getRenterName();
            boolean matchesKeyword = keyword.isEmpty() || 
                                     r.transactionId.toLowerCase().contains(keyword) || 
                                     r.motorcycleId.toLowerCase().contains(keyword) || 
                                     renterName.toLowerCase().contains(keyword);

            if (matchesStatus && matchesKeyword) {
                double balance = r.totalCost - r.initialPayment;
                String age = r.renterProfile != null ? r.renterProfile.getAge() : "-";
                String address = r.renterProfile != null ? r.renterProfile.getAddress() : "-";
                String license = r.renterProfile != null ? r.renterProfile.getLicenseNumber() : "-";

                model.addRow(new Object[]{
                    r.transactionId, r.motorcycleId, renterName, age, address, license,
                    r.days, r.totalCost, r.initialPayment, balance, r.date,
                    r.returnDate, r.status
                });
            }
        }
    }//GEN-LAST:event_viewtransactapplyfilterActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String searchId = jTextField3.getText().trim();
        if (searchId.isEmpty()) {
            loadTableData();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (RentalTransaction r : TrimotoSystem.rentals) {
            if (r.transactionId.equalsIgnoreCase(searchId) || r.motorcycleId.equalsIgnoreCase(searchId)) {
                double balance = r.totalCost - r.initialPayment;
                String renterName = r.getRenterName();

                // 10 Summary Columns for jTable1
                model.addRow(new Object[]{
                    r.transactionId, 
                    r.motorcycleId, 
                    renterName, 
                    r.days, 
                    r.totalCost, 
                    r.initialPayment, 
                    balance, 
                    r.date, 
                    r.returnDate, 
                    r.status
                });
            }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnreturnedmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnedmarkActionPerformed
       int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a transaction row first.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String transId = jTable1.getValueAt(selectedRow, 0).toString();
        for (RentalTransaction r : TrimotoSystem.rentals) {
            if (r.transactionId.equalsIgnoreCase(transId)) {
                r.status = "Completed";
                Motorcycle m = TrimotoSystem.findMotorcycleById(r.motorcycleId);
                if (m != null) {
                    m.setStatus("Available");
                }
                break;
            }
        }

        loadTableData();
        java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (topWindow instanceof MainDashboard) {
            ((MainDashboard) topWindow).refreshAllPanels();
        }
        JOptionPane.showMessageDialog(this, "Motorcycle marked as Returned & Available!");    }//GEN-LAST:event_btnreturnedmarkActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        loadTableData();
    }//GEN-LAST:event_btnrefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnreturnedmark;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnviewtransac;
    private javax.swing.JCheckBox cbfull;
    private javax.swing.JCheckBox cbpartial;
    private javax.swing.JLabel description;
    private javax.swing.JLabel driverlicense;
    private javax.swing.JDialog editviewtransac;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JTextField lbldura;
    private javax.swing.JLabel lblduration;
    private javax.swing.JLabel lblexpectedreturn;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblrenter;
    private javax.swing.JButton saveRentalEdit;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontnumber;
    private javax.swing.JTextField txtdriverslicense;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtreturn;
    private javax.swing.JComboBox<String> viewtranasactfilter;
    private javax.swing.JDialog viewtransacdialog;
    private javax.swing.JButton viewtransactapplyfilter;
    private javax.swing.JButton viewtransactdelete;
    private javax.swing.JButton viewtransactedit;
    // End of variables declaration//GEN-END:variables
}