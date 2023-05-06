/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package busticketing;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
/**
 *
 * @author Lathrell Pagsuguiron
 */
public class Receipt extends javax.swing.JFrame {
    
    BusDetails bus;
    boolean studentDiscount;
    
    /**
     * Creates new form Receipt
     */
    public Receipt() {
        
        initComponents();
        
    }
    
    public Receipt(BusDetails bus){
        this.bus = bus;
        this.studentDiscount = this.bus.busRoute.discountStudent;
        initComponents();
        receiptComponents();
        displayDateTime();
    }
    
    private void receiptComponents() {
        
       if (studentDiscount){
           student.setText("STUDENT");
       }else{
           student.setText("");
       }

       origin.setText(this.bus.from);
       destination.setText(this.bus.to);

       // Create a DecimalFormat object with the pattern "0.00"
       DecimalFormat df = new DecimalFormat("0.00");

       // Format the float value with two decimal places using the DecimalFormat object
       String priceString = "PHP " + df.format(this.bus.price);

       fee.setText(priceString);
       String randomNumber = getRandomNumberString();
       String slipRNumber = getRandomNumberString();

       vehicleNumber1.setText(randomNumber);
       slipNumber.setText(slipRNumber);

    }

    public static String getRandomNumberString() {
       // It will generate 6 digit random Number.
       // from 0 to 999999
       Random rnd = new Random();
       int number = rnd.nextInt(999999);
       // this will convert any number sequence into 6 character.
       return String.valueOf(number);

    }
    
    private void displayDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YY-MM-dd");
        String formattedDate = now.format(formatter);
        
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = now.format(timeFormatter);
        
        dateReceipt.setText(formattedDate);
        timeReceipt.setText(formattedTime);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleReceipt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        dateReceipt = new javax.swing.JLabel();
        fee = new javax.swing.JLabel();
        destination = new javax.swing.JLabel();
        snReceipt = new javax.swing.JLabel();
        routeReceipt = new javax.swing.JLabel();
        originReceipt = new javax.swing.JLabel();
        timeReceipt = new javax.swing.JLabel();
        destinationReceipt = new javax.swing.JLabel();
        cashReceipt = new javax.swing.JLabel();
        student = new javax.swing.JLabel();
        vnReceipt1 = new javax.swing.JLabel();
        vehicleNumber1 = new javax.swing.JLabel();
        slipNumber = new javax.swing.JLabel();
        route1 = new javax.swing.JLabel();
        origin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleReceipt.setFont(new java.awt.Font("Akira Expanded", 3, 27)); // NOI18N
        titleReceipt.setForeground(new java.awt.Color(38, 38, 38));
        titleReceipt.setText("JTransit");
        jPanel1.add(titleReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 40));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 38, 38));
        jLabel2.setText("Transaction Slip");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 150, -1));

        time.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(38, 38, 38));
        time.setText("KEEP TICKET FOR INSPECTION");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 240, 20));

        dateReceipt.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        dateReceipt.setForeground(new java.awt.Color(38, 38, 38));
        dateReceipt.setText("23-05-05");
        jPanel1.add(dateReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 20));

        fee.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 24)); // NOI18N
        fee.setForeground(new java.awt.Color(38, 38, 38));
        fee.setText("PHP");
        jPanel1.add(fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 40));

        destination.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        destination.setForeground(new java.awt.Color(38, 38, 38));
        destination.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        destination.setText("LIGAYA");
        jPanel1.add(destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 170, 40));

        snReceipt.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        snReceipt.setForeground(new java.awt.Color(38, 38, 38));
        snReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        snReceipt.setText("Slip Number");
        jPanel1.add(snReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, 40));

        routeReceipt.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        routeReceipt.setForeground(new java.awt.Color(38, 38, 38));
        routeReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        routeReceipt.setText("Route");
        jPanel1.add(routeReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 40));

        originReceipt.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        originReceipt.setForeground(new java.awt.Color(38, 38, 38));
        originReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        originReceipt.setText("Origin");
        jPanel1.add(originReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 40));

        timeReceipt.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        timeReceipt.setForeground(new java.awt.Color(38, 38, 38));
        timeReceipt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeReceipt.setText("16:03");
        jPanel1.add(timeReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 120, 20));

        destinationReceipt.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        destinationReceipt.setForeground(new java.awt.Color(38, 38, 38));
        destinationReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        destinationReceipt.setText("Destination");
        jPanel1.add(destinationReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 40));

        cashReceipt.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        cashReceipt.setForeground(new java.awt.Color(38, 38, 38));
        cashReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cashReceipt.setText("Cash");
        jPanel1.add(cashReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 40));

        student.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        student.setForeground(new java.awt.Color(38, 38, 38));
        student.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        student.setText("STUDENT");
        jPanel1.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 40));

        vnReceipt1.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        vnReceipt1.setForeground(new java.awt.Color(38, 38, 38));
        vnReceipt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vnReceipt1.setText("Vehicle Number");
        jPanel1.add(vnReceipt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 40));

        vehicleNumber1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        vehicleNumber1.setForeground(new java.awt.Color(38, 38, 38));
        vehicleNumber1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vehicleNumber1.setText("5550027");
        jPanel1.add(vehicleNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 110, 40));

        slipNumber.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        slipNumber.setForeground(new java.awt.Color(38, 38, 38));
        slipNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        slipNumber.setText("165984");
        jPanel1.add(slipNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 40));

        route1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        route1.setForeground(new java.awt.Color(38, 38, 38));
        route1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        route1.setText("CUBAO TO COGEO");
        jPanel1.add(route1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, 40));

        origin.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        origin.setForeground(new java.awt.Color(38, 38, 38));
        origin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        origin.setText("TIPQC");
        jPanel1.add(origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashReceipt;
    private javax.swing.JLabel dateReceipt;
    private javax.swing.JLabel destination;
    private javax.swing.JLabel destinationReceipt;
    private javax.swing.JLabel fee;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel origin;
    private javax.swing.JLabel originReceipt;
    private javax.swing.JLabel route1;
    private javax.swing.JLabel routeReceipt;
    private javax.swing.JLabel slipNumber;
    private javax.swing.JLabel snReceipt;
    private javax.swing.JLabel student;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timeReceipt;
    private javax.swing.JLabel titleReceipt;
    private javax.swing.JLabel vehicleNumber1;
    private javax.swing.JLabel vnReceipt1;
    // End of variables declaration//GEN-END:variables
}
