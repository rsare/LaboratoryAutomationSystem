package LaboratoryAutomationSystem;

import CorePackage.Database;
import CorePackage.Doctor;
import CorePackage.LabAttendant;
import javax.swing.JOptionPane;

/**
 *
 * @author sare
 */
public class AuthenticationPageForDoctor extends javax.swing.JFrame {

    String name;
    String surname;
    String username;
    String password;
    String phoneNo;

    public AuthenticationPageForDoctor(String name, String surname, String username, String password, String phoneNo) {
        initComponents();
        setLocationRelativeTo(null);

        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        authenticationCodeLabel = new javax.swing.JLabel();
        authenticationButton = new javax.swing.JButton();
        txtAuthentication = new javax.swing.JTextField();
        headerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authenticationCodeLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        authenticationCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        authenticationCodeLabel.setText("Your Authentication Code :");
        jPanel1.add(authenticationCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 30));

        authenticationButton.setBackground(new java.awt.Color(255, 255, 255));
        authenticationButton.setForeground(new java.awt.Color(51, 153, 255));
        authenticationButton.setText("Confirm Your Account");
        authenticationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(authenticationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, 30));

        txtAuthentication.setBackground(new java.awt.Color(204, 204, 204));
        txtAuthentication.setForeground(new java.awt.Color(76, 76, 76));
        jPanel1.add(txtAuthentication, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 120, 30));

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("DOCTOR AUTHENTICATION PAGE");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authenticationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticationButtonActionPerformed
        String authenticationPasswordForDoctor = "123";
        LoginAndRegisterPage loginAndRegister = new LoginAndRegisterPage();

        if (txtAuthentication.getText().equals(authenticationPasswordForDoctor)) {

            JOptionPane.showMessageDialog(this, "Successfully Created Doctor Account ",
                    "Operation Successful", JOptionPane.INFORMATION_MESSAGE);

            Doctor doctor = new Doctor(loginAndRegister.txtName.getText(), loginAndRegister.txtSurname.getText(),
                    password, username,
                    loginAndRegister.txtPhoneNo.getText());
            Database.getPeople().add(doctor);

            loginAndRegister.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Your authentication code is incorrect. For security you are redirected to registration and login page. ",
                    "Wrong Authentication Code", JOptionPane.ERROR_MESSAGE);

            loginAndRegister.show();
            dispose();
        }
    }//GEN-LAST:event_authenticationButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthenticationPageForDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
