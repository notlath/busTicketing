/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package busticketing;
import java.text.DecimalFormat;

public class BusDetails extends javax.swing.JFrame {

        public double price;
        public String to;
        public String from;

        JTransit jTransit;
        public BusRoute busRoute;

        public BusDetails() {
            
            initComponents();
        }
        public BusDetails(double price, String from, String to, JTransit jTransit, BusRoute busRoute) {
            this.price = price;
            this.from = from;
            this.to = to;
            this.jTransit = jTransit;
            this.busRoute = busRoute;

            initComponents();
            detailComponents();
        }

        public BusDetails(BusRoute busRoute, Receipt receipt) {
            this.busRoute = busRoute;
            initComponents();
        }

        private void detailComponents() {
            optionsLabel.setText("From: " + this.from);
            destinationLabel.setText("To: " + this.to);

            DecimalFormat dF = new DecimalFormat("0.00");
            priceLabel.setText("Price: P" + dF.format(this.price));
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        destinationLabel = new javax.swing.JLabel();
        optionsLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        subname1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Bus Details");
        setPreferredSize(new java.awt.Dimension(750, 511));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(20, 31, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(603, 436));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        destinationLabel.setFont(new java.awt.Font("Aftika ExtraBold", 0, 24)); // NOI18N
        destinationLabel.setForeground(new java.awt.Color(255, 255, 255));
        destinationLabel.setText("To: ");
        jPanel1.add(destinationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 410, -1));

        optionsLabel.setFont(new java.awt.Font("Aftika ExtraBold", 0, 24)); // NOI18N
        optionsLabel.setForeground(new java.awt.Color(255, 255, 255));
        optionsLabel.setText("From: ");
        jPanel1.add(optionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 320, -1));

        priceLabel.setFont(new java.awt.Font("Aftika ExtraBold", 0, 24)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Fee:");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 410, 50));

        print.setBackground(new java.awt.Color(49, 77, 199));
        print.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        print.setForeground(new java.awt.Color(246, 247, 252));
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 160, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/busdetails.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        back.setBackground(new java.awt.Color(246, 247, 252));
        back.setFont(new java.awt.Font("Aftika Bold", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(20, 31, 80));
        back.setText("BACK TO HOME");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 51));

        name1.setFont(new java.awt.Font("Akira Expanded", 3, 28)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("JTransit");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        subname1.setFont(new java.awt.Font("Aftika Light", 0, 10)); // NOI18N
        subname1.setForeground(new java.awt.Color(255, 255, 255));
        subname1.setText("Bus Ticketing System");
        jPanel1.add(subname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
    Receipt receipt = new Receipt(this);
    receipt.setVisible(true);
    
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(BusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton print;
    private javax.swing.JLabel subname1;
    // End of variables declaration//GEN-END:variables
}
