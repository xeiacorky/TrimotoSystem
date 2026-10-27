import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ViewRentalTransaction extends javax.swing.JPanel {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
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
        jButton3 = new javax.swing.JButton();
        viewtransacdialog = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        jPanel3.setLayout(new java.awt.GridLayout());

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

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton3.setText("Save");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setToolTipText("");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jButton1.setText("Edit");

        jButton2.setText("Delete");

        javax.swing.GroupLayout viewtransacdialogLayout = new javax.swing.GroupLayout(viewtransacdialog.getContentPane());
        viewtransacdialog.getContentPane().setLayout(viewtransacdialogLayout);
        viewtransacdialogLayout.setHorizontalGroup(
            viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtransacdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(732, Short.MAX_VALUE))
            .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewtransacdialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        viewtransacdialogLayout.setVerticalGroup(
            viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewtransacdialogLayout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(viewtransacdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewtransacdialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        description.setText("Review rental history and transaction status.");

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setText("Rental Transaction");

        jScrollPane1.setToolTipText("");

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


    }//GEN-LAST:event_btnviewtransacActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed

    }//GEN-LAST:event_txtaddressActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JTextField lbldura;
    private javax.swing.JLabel lblduration;
    private javax.swing.JLabel lblexpectedreturn;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblrenter;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontnumber;
    private javax.swing.JTextField txtdriverslicense;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtreturn;
    private javax.swing.JDialog viewtransacdialog;
    // End of variables declaration//GEN-END:variables

    void loadTableData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
