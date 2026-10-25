import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ViewRentalTransaction extends javax.swing.JPanel {

    private javax.swing.JTable jTableDetailView;

    public ViewRentalTransaction() {
        UIManager.put("Button.focusWidth", 0);
        initComponents();
        setupEvents();
        loadTableData();
    }
    
    private void setupEvents() {
        btnrefresh.addActionListener(e -> loadTableData());
        btnsearch.addActionListener(e -> searchTransaction());
        btnreturnedmark.addActionListener(e -> markReturned());
        btnviewtransac.addActionListener(this::btnviewtransacActionPerformed);
    }

    public void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (RentalTransaction rt : TrimotoSystem.rentals) {
            model.addRow(new Object[]{
                rt.transactionId, rt.motorcycleId, rt.renter, rt.days, rt.totalCost, rt.initialPayment, rt.date, rt.returnDate, rt.status
            });
        }
    }

    private void packTableColumns(javax.swing.JTable table) {
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 85; // Minimum column width
            
            Object headerValue = table.getColumnModel().getColumn(column).getHeaderValue();
            if (headerValue != null) {
                width = Math.max(width, table.getFontMetrics(table.getFont()).stringWidth(headerValue.toString()) + 30);
            }

            for (int row = 0; row < table.getRowCount(); row++) {
                Object cellValue = table.getValueAt(row, column);
                if (cellValue != null) {
                    int cellWidth = table.getFontMetrics(table.getFont()).stringWidth(cellValue.toString()) + 30;
                    width = Math.max(width, cellWidth);
                }
            }
            
            table.getColumnModel().getColumn(column).setPreferredWidth(width);
        }
    }

    private void searchTransaction() {
        String searchId = jTextField3.getText().trim();
        if (searchId.isEmpty()) {
            loadTableData();
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (RentalTransaction rt : TrimotoSystem.rentals) {
            if (rt.transactionId.equalsIgnoreCase(searchId) || rt.motorcycleId.equalsIgnoreCase(searchId)) {
                model.addRow(new Object[]{
                    rt.transactionId, rt.motorcycleId, rt.renter, rt.days, rt.totalCost, rt.initialPayment, rt.date, rt.returnDate, rt.status
                });
            }
        }
    }

    private void markReturned() {
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            String transId = jTable1.getValueAt(row, 0).toString();
            String motorId = jTable1.getValueAt(row, 1).toString();

            for (RentalTransaction rt : TrimotoSystem.rentals) {
                if (rt.transactionId.equals(transId)) {
                    rt.status = "Completed";
                }
            }

            Motorcycle m = TrimotoSystem.findMotorcycleById(motorId);
            if (m != null) {
                m.status = "Available";
            }

            loadTableData();
            java.awt.Window topWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
            if (topWindow instanceof MainDashboard) {
                ((MainDashboard) topWindow).refreshAllPanels();
            }

            JOptionPane.showMessageDialog(this, "Motorcycle marked as Returned and set to Available!");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a rental transaction.");
        }
    }

    private String getFieldValue(RentalTransaction rt, String fieldName) {
        if (rt == null) return "-";
        try {
            java.lang.reflect.Field field = rt.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Object value = field.get(rt);
            return value != null ? value.toString() : "-";
        } catch (Exception e) {
            return "-";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewtransac = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnsave = new javax.swing.JButton();
        description = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnviewtransac = new javax.swing.JButton();
        btnreturnedmark = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnsave.setText("Save");
        btnsave.addActionListener(this::btnsaveActionPerformed);

        javax.swing.GroupLayout viewtransacLayout = new javax.swing.GroupLayout(viewtransac.getContentPane());
        viewtransac.getContentPane().setLayout(viewtransacLayout);
        viewtransacLayout.setHorizontalGroup(
            viewtransacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtransacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(viewtransacLayout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(btnsave)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        viewtransacLayout.setVerticalGroup(
            viewtransacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtransacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsave)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        description.setText("Review rental history and transaction status.");

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Rental Transaction");

        jScrollPane1.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Motorcycle ID", "Renter", "Rental Days", "Total Cost", "Initial Payment", "Date Rented", "Return Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 15, 0));

        btnviewtransac.setText("View Transaction Details");
        btnviewtransac.addActionListener(this::btnviewtransacActionPerformed);
        jPanel1.add(btnviewtransac);

        btnreturnedmark.setText("Mark Motorcycle Returned");
        jPanel1.add(btnreturnedmark);

        btnrefresh.setText("Refresh");
        jPanel1.add(btnrefresh);

        ID.setText("Search ID:");

        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        btnsearch.setText("Search");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ID)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch)
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewtransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewtransacActionPerformed
  int row = jTable1.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a transaction from the table first.", "Selection Required", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String transId = jTable1.getValueAt(row, 0).toString();
    RentalTransaction selected = null;
    for (RentalTransaction rt : TrimotoSystem.rentals) {
        if (rt.transactionId.equalsIgnoreCase(transId)) {
            selected = rt;
            break;
        }
    }

    DefaultTableModel detailModel = new DefaultTableModel(
        new Object[][]{},
        new String[]{
            "Transaction ID", "Motorcycle ID", "Renter Name", "Address", "Contact Number", 
            "Driver's License No.", "Days Rented", "Total Cost (₱)", 
            "Initial Payment (₱)", "Payment Type", "Date Rented", 
            "Expected Return Date", "Status"
        }
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    if (selected != null) {
        detailModel.addRow(new Object[]{
            selected.transactionId, 
            selected.motorcycleId, 
            selected.renter, 
            selected.address != null && !selected.address.isEmpty() ? selected.address : "-", 
            selected.contactNumber != null && !selected.contactNumber.isEmpty() ? selected.contactNumber : "-", 
            selected.licenseNumber != null && !selected.licenseNumber.isEmpty() ? selected.licenseNumber : "-", 
            selected.days, 
            selected.totalCost, 
            selected.initialPayment, 
            selected.paymentType != null ? selected.paymentType : "-", 
            selected.date, 
            selected.returnDate, 
            selected.status
        });
    }

    if (jTableDetailView == null) {
        jTableDetailView = new javax.swing.JTable();
    }
    jTableDetailView.setModel(detailModel);

    packTableColumns(jTableDetailView);

    jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jScrollPane2.setViewportView(jTableDetailView);

    viewtransac.setSize(1000, 450);
    viewtransac.setLocationRelativeTo(javax.swing.SwingUtilities.getWindowAncestor(this));
    viewtransac.setVisible(true);

    }//GEN-LAST:event_btnviewtransacActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
    viewtransac.dispose();    }//GEN-LAST:event_btnsaveActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnreturnedmark;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnviewtransac;
    private javax.swing.JLabel description;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel title;
    private javax.swing.JDialog viewtransac;
    // End of variables declaration//GEN-END:variables
}
