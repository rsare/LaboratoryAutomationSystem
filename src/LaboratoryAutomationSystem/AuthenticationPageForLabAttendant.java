package LaboratoryAutomationSystem;

import CorePackage.Database;
import CorePackage.LabAttendant;
import javax.swing.JOptionPane;

/**
 *
 * @author sare
 */
public class AuthenticationPageForLabAttendant extends javax.swing.JFrame {

    String name;
    String surname;
    String username;
    String password;
    String phoneNo;

    public AuthenticationPageForLabAttendant(String name, String surname, String username, String password, String phoneNo) {
        initComponents();
        setLocationRelativeTo(null);

        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        authenticationCodeLabel = new javax.swing.JLabel();
        txtAuthentication = new javax.swing.JTextField();
        authenticationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 197));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("LAB ATTENDANT AUTHENTICATION PAGE");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 30));

        authenticationCodeLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        authenticationCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        authenticationCodeLabel.setText("Your Authentication Code :");
        jPanel1.add(authenticationCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 30));

        txtAuthentication.setBackground(new java.awt.Color(204, 204, 204));
        txtAuthentication.setForeground(new java.awt.Color(76, 76, 76));
        jPanel1.add(txtAuthentication, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 120, 30));

        authenticationButton.setBackground(new java.awt.Color(255, 255, 255));
        authenticationButton.setForeground(new java.awt.Color(51, 153, 255));
        authenticationButton.setText("Confirm Your Account");
        authenticationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(authenticationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void authenticationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticationButtonActionPerformed

        String authenticationPasswordForLabAttendant = "123";
        LoginAndRegisterPage loginAndRegister = new LoginAndRegisterPage();

        if (txtAuthentication.getText().equals(authenticationPasswordForLabAttendant)) {
            JOptionPane.showMessageDialog(this, "Successfully Created Lab Attendant Account ",
                    "Operation Successful", JOptionPane.INFORMATION_MESSAGE);

            LabAttendant labAttendant = new LabAttendant(loginAndRegister.txtName.getText(), loginAndRegister.txtSurname.getText(),
                    password, username,
                    loginAndRegister.txtPhoneNo.getText());
            Database.getPeople().add(labAttendant);

            loginAndRegister.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Your authentication code is incorrect. For security you are redirected to registration and login page. ",
                    "Wrong Authentication Code", JOptionPane.ERROR_MESSAGE);

            loginAndRegister.show();
            dispose();
        }
    }//GEN-LAST:event_authenticationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AuthenticationPageForLabAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForLabAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForLabAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForLabAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticationButton;
    private javax.swing.JLabel authenticationCodeLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAuthentication;
    // End of variables declaration//GEN-END:variables
}
