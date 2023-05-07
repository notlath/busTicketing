

package busticketing;

import javax.swing.ImageIcon;
import java.net.URL;
import static busticketing.BusTicketing.sqlConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class CustomerDetails extends javax.swing.JFrame {
    User user;
    JTransit jTransit;
    
    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails() {
        initComponents();
        setImageIcon();
    }
    
    private void setImageIcon(){
    URL defaultImageUrl = getClass().getResource("/Images/Untitled-1.png");
    ImageIcon icon = new ImageIcon(defaultImageUrl);
    System.out.println(icon);

    }
    
    public CustomerDetails(User user) {
        this.user = user;
        
        initComponents();
        customerDetails();
    }
    
    public CustomerDetails(JTransit jTransit){
        
    }
    
    public CustomerDetails(User user, JTransit jTransit) {
        this.jTransit = jTransit;
        this.user = user;
        
        initComponents();
        customerDetails();
        
    }
    
    private void customerDetails(){
        try {
          String query = "SELECT * FROM jtransit.users WHERE email = ?";
          PreparedStatement stmt = sqlConn.prepareStatement(query);
          stmt.setString(1, this.user.userName);

          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
            String name = rs.getString("name");

            String contactNumber = rs.getString("contactNumber");

            nameLabel.setText(name);
            emailLabel.setText(this.user.userName);
            contactLabel.setText(contactNumber);
          }
        } catch (SQLException e) {
          System.out.print(e);
        }

        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        subname1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ticketdetails = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Details");

        jPanel1.setBackground(new java.awt.Color(20, 31, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(603, 436));
        jPanel1.setPreferredSize(new java.awt.Dimension(603, 436));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Akira Expanded", 3, 28)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("JTransit");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        subname1.setFont(new java.awt.Font("Aftika Light", 0, 10)); // NOI18N
        subname1.setForeground(new java.awt.Color(255, 255, 255));
        subname1.setText("Bus Ticketing System");
        jPanel1.add(subname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        nameLabel.setFont(new java.awt.Font("Aftika Bold", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("sample");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 270, -1));

        emailLabel.setFont(new java.awt.Font("Aftika Regular", 0, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("sample");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 270, -1));

        contactLabel.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactLabel.setText("sample");
        jPanel1.add(contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 270, -1));

        jButton1.setBackground(new java.awt.Color(46, 72, 187));
        jButton1.setFont(new java.awt.Font("Aftika Regular", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Out");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 100, -1));

        ticketdetails.setFont(new java.awt.Font("Aftika ExtraBold", 0, 36)); // NOI18N
        ticketdetails.setForeground(new java.awt.Color(255, 255, 255));
        ticketdetails.setText("CUSTOMER DETAILS");
        jPanel1.add(ticketdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        back.setBackground(new java.awt.Color(246, 247, 252));
        back.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(20, 31, 80));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 107, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/customerdetails.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        this.user.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        this.jTransit.setVisible(true);
        dispose();

    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel subname1;
    private javax.swing.JLabel ticketdetails;
    // End of variables declaration//GEN-END:variables
}
