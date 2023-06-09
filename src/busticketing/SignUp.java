package busticketing;

import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public class SignUp extends javax.swing.JFrame {
    boolean validator;
    /**
     * Creates new form SignUp
     */
    public SignUp() {
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
        jPanel2 = new javax.swing.JPanel();
        ticketdetails = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        FROM7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        match = new javax.swing.JLabel();
        regPass = new javax.swing.JPasswordField();
        txtPass = new javax.swing.JPasswordField();
        regName = new javax.swing.JTextField();
        regContact = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        FROM5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Account");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 31, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 247, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketdetails.setFont(new java.awt.Font("Aftika ExtraBold", 0, 36)); // NOI18N
        ticketdetails.setForeground(new java.awt.Color(20, 31, 80));
        ticketdetails.setText("SIGN UP");
        jPanel2.add(ticketdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        confirm.setBackground(new java.awt.Color(46, 72, 187));
        confirm.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("CREATE ACCOUNT");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 240, 40));

        FROM7.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        FROM7.setForeground(new java.awt.Color(20, 31, 80));
        FROM7.setText("Already have an account?");
        jPanel2.add(FROM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(246, 247, 252));
        jButton1.setFont(new java.awt.Font("Aftika SemiBold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(20, 31, 80));
        jButton1.setText("Login.");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 50, -1));

        match.setFont(new java.awt.Font("Aftika SemiBold", 2, 10)); // NOI18N
        match.setForeground(new java.awt.Color(255, 51, 51));
        match.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(match, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 240, 20));

        regPass.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        regPass.setForeground(new java.awt.Color(196, 197, 201));
        regPass.setText("Password");
        regPass.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 227, 245)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        regPass.setEchoChar('\u0000');
        regPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                regPassFocusLost(evt);
            }
        });
        regPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPassActionPerformed(evt);
            }
        });
        jPanel2.add(regPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 40));

        txtPass.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        txtPass.setForeground(new java.awt.Color(196, 197, 201));
        txtPass.setText("Confirm Password");
        txtPass.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 227, 245)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        txtPass.setEchoChar('\u0000');
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 40));

        regName.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        regName.setForeground(new java.awt.Color(196, 197, 201));
        regName.setText("Name");
        regName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 227, 245)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        regName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                regNameFocusLost(evt);
            }
        });
        regName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNameActionPerformed(evt);
            }
        });
        jPanel2.add(regName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 40));

        regContact.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        regContact.setForeground(new java.awt.Color(196, 197, 201));
        regContact.setText("Contact No.");
        regContact.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 227, 245)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        regContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                regContactFocusLost(evt);
            }
        });
        jPanel2.add(regContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 40));

        txtUser.setFont(new java.awt.Font("Aftika Light", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(196, 197, 201));
        txtUser.setText("Email");
        txtUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 227, 245)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 500));

        name1.setFont(new java.awt.Font("Akira Expanded", 2, 48)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("JTransit");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 330, 50));

        FROM5.setFont(new java.awt.Font("Aftika SemiBold", 0, 14)); // NOI18N
        FROM5.setForeground(new java.awt.Color(255, 255, 255));
        FROM5.setText("Start your journey with us.");
        jPanel1.add(FROM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/landing-page.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 450, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 784, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

    String user = txtUser.getText();
    String regNameText = regName.getText();
    String regContactText = regContact.getText();
    String regPassText = new String(regPass.getPassword());
    String txtPassText = new String(txtPass.getPassword());
    
    ImageIcon userIcon = new ImageIcon(getClass().getResource("/assets/logo_1.png"));

    final String MESSAGE = "Please fill in all the required fields.";
    final String ERROR = "Passwords do not match. Please try again.";
    
    UIManager.put("OptionPane.background",new ColorUIResource(46,72,187));
    UIManager.put("Panel.background",new ColorUIResource(46,72,187));
    UIManager.put("OptionPane.messageForeground",new ColorUIResource(246,247,252));
    UIManager.put("Button.background",new Color(246,247,252));
    UIManager.put("Button.foreground",new Color(46,72,187));

    if (regNameText.equals("Name") || regContactText.equals("Contact No.") || regPassText.equals("Password") || txtPassText.equals("Confirm Password") || user.equals("Email")) {
        JOptionPane.showMessageDialog(null, MESSAGE, "Error", JOptionPane.ERROR_MESSAGE, userIcon);
    } else if (!validator){
        JOptionPane.showMessageDialog(null, ERROR, "Error", JOptionPane.ERROR_MESSAGE, userIcon);
    }else {
        dispose();
        User bus = new User();
        bus.userLogin(user, regPassText, regContactText, regNameText);

        try {
            String st = "INSERT INTO users (email, name, password, contactNumber) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = BusTicketing.sqlConn.prepareStatement(st);

            pstmt.setString(1, user);
            pstmt.setString(2, regNameText);
            pstmt.setString(3, regPassText);
            pstmt.setString(4, regContactText);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    
    }//GEN-LAST:event_confirmActionPerformed

    private void regPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         dispose();
         User bus = new User();  
         bus.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed

    }//GEN-LAST:event_txtPassKeyPressed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped

    }//GEN-LAST:event_txtPassKeyTyped

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
    if (Arrays.equals(regPass.getPassword(), txtPass.getPassword())) {
      validator = true;
      
      match.setText("");
      txtPass.setForeground(new Color(20, 31, 80));
    } else {
      validator = false;
      
      match.setText("Passwords do not match.");
      txtPass.setForeground(new Color(208, 67, 76));
    }
    }//GEN-LAST:event_txtPassKeyReleased

    private void regNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regNameFocusGained
        if (regName.getText().equals("Name")){
            regName.setText("");
            regName.setForeground(new Color(20, 31, 80));

        }
    }//GEN-LAST:event_regNameFocusGained

    private void regNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regNameFocusLost
        if (regName.getText().equals("")){
            regName.setText("Name");
            regName.setForeground(new java.awt.Color(196,197,201));
        }
    }//GEN-LAST:event_regNameFocusLost

    private void regContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regContactFocusGained
        if (regContact.getText().equals("Contact No.")){
            regContact.setText("");
            regContact.setForeground(new Color(20, 31, 80));

        }
    }//GEN-LAST:event_regContactFocusGained

    private void regContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regContactFocusLost
        if (regContact.getText().equals("")){
            regContact.setText("Contact No.");
            regContact.setForeground(new java.awt.Color(196,197,201));
        }
    }//GEN-LAST:event_regContactFocusLost

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Email")){
            txtUser.setText("");
            txtUser.setForeground(new Color(20, 31, 80));

        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().equals("")){
            txtUser.setText("Email");
            txtUser.setForeground(new java.awt.Color(196,197,201));
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void regPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regPassFocusGained
        if (Arrays.equals(regPass.getPassword(), "Password".toCharArray())){
            regPass.setText("");
            regPass.setEchoChar('\u2022');
            regPass.setForeground(new Color(20, 31, 80));
        }
    }//GEN-LAST:event_regPassFocusGained

    private void regPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regPassFocusLost
        if (Arrays.equals(regPass.getPassword(), "".toCharArray())){
            regPass.setText("Password");
            regPass.setEchoChar('\u0000');
            regPass.setForeground(new java.awt.Color(196,197,201));
        }
    }//GEN-LAST:event_regPassFocusLost

    private void regNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNameActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if (Arrays.equals(txtPass.getPassword(), "Confirm Password".toCharArray())){
            txtPass.setText("");
            txtPass.setEchoChar('\u2022');
            txtPass.setForeground(new Color(20, 31, 80));
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (Arrays.equals(txtPass.getPassword(), "".toCharArray())){
            txtPass.setText("Confirm Password");
            txtPass.setEchoChar('\u0000');
            txtPass.setForeground(new java.awt.Color(196,197,201));
        }
    }//GEN-LAST:event_txtPassFocusLost

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FROM5;
    private javax.swing.JLabel FROM7;
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel match;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField regContact;
    private javax.swing.JTextField regName;
    private javax.swing.JPasswordField regPass;
    private javax.swing.JLabel ticketdetails;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
