package busticketing;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lathrell pagsuguiron
 */
public class JTransit extends javax.swing.JFrame {
    User user;
    
    /**
     * Creates new form JTransit
     */
    public JTransit() {
        initComponents();
        focus();
    }
    
    private void focus(){
        jPanel1.requestFocus();
    }
    
    public JTransit(User user) {
        this.user = user;
        
        initComponents();
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
        name = new javax.swing.JLabel();
        subname = new javax.swing.JLabel();
        customer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(603, 436));

        jPanel1.setBackground(new java.awt.Color(20, 31, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 64, 1));
        jPanel1.setMinimumSize(new java.awt.Dimension(603, 436));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Akira Expanded", 2, 48)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("JTransit");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 38));

        subname.setFont(new java.awt.Font("Aftika Light", 0, 16)); // NOI18N
        subname.setForeground(new java.awt.Color(255, 255, 255));
        subname.setText("Bus Ticketing System");
        jPanel1.add(subname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        customer.setBackground(new java.awt.Color(246, 247, 252));
        customer.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        customer.setForeground(new java.awt.Color(51, 51, 51));
        customer.setText("Customer Details");
        customer.setBorder(null);
        customer.setBorderPainted(false);
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jPanel1.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 180, 51));

        jButton3.setBackground(new java.awt.Color(246, 247, 252));
        jButton3.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Manage Bus Routes");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 180, 51));

        jButton5.setBackground(new java.awt.Color(246, 247, 252));
        jButton5.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Sign Out");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 180, 51));

        jLabel1.setFont(new java.awt.Font("Aftika ExtraBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN HOMEPAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 36));

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    dispose();
    User bus = new User();
    bus.setVisible(true);
//    this.user.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        BusRoute route = new BusRoute(this);
        route.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
    dispose();
    CustomerDetails route = new CustomerDetails(this.user, this);
    route.setVisible(true);  
    }//GEN-LAST:event_customerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
        
        try{
          javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){
                System.out.println("UIManager Exception : "+e);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTransit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customer;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel subname;
    // End of variables declaration//GEN-END:variables
}
