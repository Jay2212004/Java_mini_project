
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchag
 */
public class Cancellation extends javax.swing.JFrame {

    /**
     * Creates new form Cancellation
     */
    public Cancellation() {
        initComponents();
          GetTicket();
          FCodeTb.setVisible(true);
          FCodeTb.setEditable(false);
        DisplayCanc();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        BookBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CancellationTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TIdCb = new javax.swing.JComboBox<>();
        CDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 102));
        jLabel13.setText("TICKET ID");

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 102));
        jLabel14.setText("FLIGHT CODE");

        FCodeTb.setBackground(new java.awt.Color(0, 102, 0));
        FCodeTb.setForeground(new java.awt.Color(102, 204, 0));
        FCodeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeTbActionPerformed(evt);
            }
        });

        BookBtn.setBackground(new java.awt.Color(0, 102, 102));
        BookBtn.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        BookBtn.setForeground(new java.awt.Color(0, 204, 153));
        BookBtn.setText("CANCEL");
        BookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookBtnMouseClicked(evt);
            }
        });
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(0, 102, 102));
        ResetBtn.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(0, 204, 153));
        ResetBtn.setText("RESET");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(0, 102, 102));
        BackBtn.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 204, 153));
        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 102));
        jLabel18.setText("CANCELLATION LIST");

        CancellationTable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CancellationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CancellationTable.setRowHeight(35);
        CancellationTable.setShowGrid(true);
        jScrollPane4.setViewportView(CancellationTable);

        jLabel20.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 102));
        jLabel20.setText("TICKET CANCELLATION");

        jLabel19.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 102));
        jLabel19.setText("FLIGHT DATE");

        TIdCb.setBackground(new java.awt.Color(0, 102, 0));
        TIdCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        TIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIdCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(BookBtn)
                                .addGap(170, 170, 170)
                                .addComponent(ResetBtn)
                                .addGap(185, 185, 185)
                                .addComponent(BackBtn))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jLabel14)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(CDate, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel19))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jLabel18)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13))
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookBtn)
                    .addComponent(ResetBtn)
                    .addComponent(BackBtn))
                .addGap(39, 39, 39)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
       new Welcome().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
      
        
     Connection Con = null;
    PreparedStatement pst = null;
 ResultSet Rs = null,Rs1 = null;
 Statement St =  null,St1 = null;
        private void GetTicket(){
     try{
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Daniel@#1234");
         St = Con.createStatement();
         String Query ="Select *from booking_table";
         Rs = St.executeQuery(Query);
         while(Rs.next()){
              String TID = Rs.getString("Tickrt_Id");
             TIdCb.addItem(TID);
             
             
             
         }
         
         
     }catch(Exception e){
         
     }
 }
        
        private void GetFCode(){
    String Query = "select * from booking_table where Tickrt_Id = "+TIdCb.getSelectedItem().toString();
    Statement st;
    ResultSet Rs;
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Daniel@#1234");
        St = Con.createStatement();
        Rs = St.executeQuery(Query);
        if(Rs.next()){
            FCodeTb.setText(Rs.getString("FlightCode"));
            
        }
        
    }catch(Exception e){
        
    }
}

  private void DisplayCanc(){
     {
         try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Daniel@#1234");
             St = Con.createStatement();
             Rs = St.executeQuery("select *from cancellation_table");
             CancellationTable.setModel(DbUtils.resultSetToTableModel(Rs));
         }catch(Exception e){
     }
 }}
  int CID =0;
    private void CountCanc(){
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(Cancellation_Id) from Cancellation_table");
            Rs1.next();
            CID = Rs1.getInt(1)+1;
            
            
            
        }catch(Exception e){
        
    }}
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        FCodeTb.setText("");
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void TIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIdCbActionPerformed
         GetFCode();
    }//GEN-LAST:event_TIdCbActionPerformed
    private void Cancel(){
     try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Daniel@#1234");
               String Query = "Delete from booking_table where Tickrt_Id ="+TIdCb.getSelectedItem();
               Statement Del = Con.createStatement();
               Del.executeUpdate(Query);
               //JOptionPane.showMessageDialog(this,"Flight Deleted");
               //DisplayFlights();
          }catch(Exception e){
              JOptionPane.showMessageDialog(this, e);
              
          
      }
}
    private void BookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookBtnMouseClicked
                                  
         if(FCodeTb.getText().isEmpty())
         {
           JOptionPane.showMessageDialog(this,"Missing Information");
         }else{
             try{
                     CountCanc();
                    
             
                  Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Daniel@#1234");
                  PreparedStatement Add  =  Con.prepareStatement("insert into Cancellation_table values(?,?,?,?)");
                  Add.setInt(1, CID);
                  Add.setInt(2, Integer.valueOf(TIdCb.getSelectedItem().toString()));
                  Add.setString(3, FCodeTb.getText());
                  Add.setString(4, CDate.getDate().toString());
                  
                  int row = Add.executeUpdate();
                  JOptionPane.showMessageDialog(this,"Ticket Cancelled");
                  Con.close();
                  Cancel();
                  DisplayCanc();
                  //Clear();
                  GetTicket();
             }catch(Exception e){
                 JOptionPane.showMessageDialog(this, e);
                 
             }
         }
    }//GEN-LAST:event_BookBtnMouseClicked

    private void FCodeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeTbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BookBtn;
    private com.toedter.calendar.JDateChooser CDate;
    private javax.swing.JTable CancellationTable;
    private javax.swing.JTextField FCodeTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JComboBox<String> TIdCb;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
