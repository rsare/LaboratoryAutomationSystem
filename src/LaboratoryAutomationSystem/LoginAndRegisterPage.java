package LaboratoryAutomationSystem;

import jpa_Core.*;
import LaboratoryAutomationSystem.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginAndRegisterPage extends javax.swing.JFrame {

    public static Person account;

    public LoginAndRegisterPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        sıgnUpLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        passwordForSıgnUpLabel = new javax.swing.JLabel();
        usernameforSıgnUpLabel = new javax.swing.JLabel();
        phoneNoLabel = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtPasswordForRegister = new javax.swing.JPasswordField();
        txtUsernameForRegister = new javax.swing.JTextField();
        labAttendantRegisterButton = new javax.swing.JButton();
        patientRegisterButton = new javax.swing.JButton();
        doctorRegisterButton = new javax.swing.JButton();
        sıgnInPanel = new javax.swing.JPanel();
        sıgnInLabel = new javax.swing.JLabel();
        txtUsernameForLogin = new javax.swing.JTextField();
        txtPasswordForLogin = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        sıgnInButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("BAYRAM HOSPITAL");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 670, 70));

        registerPanel.setBackground(new java.awt.Color(51, 51, 51));
        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sıgnUpLabel.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        sıgnUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        sıgnUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sıgnUpLabel.setText("SIGN UP");
        registerPanel.add(sıgnUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 205, -1));

        nameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name :");
        registerPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 76, 30));

        surnameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        surnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        surnameLabel.setText("Surname :");
        registerPanel.add(surnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 76, 30));

        passwordForSıgnUpLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passwordForSıgnUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordForSıgnUpLabel.setText("Password :");
        registerPanel.add(passwordForSıgnUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 76, 30));

        usernameforSıgnUpLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        usernameforSıgnUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameforSıgnUpLabel.setText("Username :");
        registerPanel.add(usernameforSıgnUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 76, 30));

        phoneNoLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        phoneNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoLabel.setText("Phone No :");
        registerPanel.add(phoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 76, 30));

        txtPhoneNo.setBackground(new java.awt.Color(204, 204, 204));
        txtPhoneNo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(76, 76, 76));
        registerPanel.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 143, 30));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(76, 76, 76));
        registerPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 143, 30));

        txtSurname.setBackground(new java.awt.Color(204, 204, 204));
        txtSurname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSurname.setForeground(new java.awt.Color(76, 76, 76));
        registerPanel.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 143, 30));

        txtPasswordForRegister.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordForRegister.setForeground(new java.awt.Color(76, 76, 76));
        registerPanel.add(txtPasswordForRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 143, 30));

        txtUsernameForRegister.setBackground(new java.awt.Color(204, 204, 204));
        txtUsernameForRegister.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsernameForRegister.setForeground(new java.awt.Color(76, 76, 76));
        registerPanel.add(txtUsernameForRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 143, 30));

        labAttendantRegisterButton.setBackground(new java.awt.Color(86, 142, 255));
        labAttendantRegisterButton.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        labAttendantRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        labAttendantRegisterButton.setText("SIGN UP AS A LAB ATTANDENT");
        labAttendantRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labAttendantRegisterButtonActionPerformed(evt);
            }
        });
        registerPanel.add(labAttendantRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 305, 150, 30));

        patientRegisterButton.setBackground(new java.awt.Color(86, 142, 255));
        patientRegisterButton.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        patientRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        patientRegisterButton.setText("SIGN UP AS A PATIENT");
        patientRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRegisterButtonActionPerformed(evt);
            }
        });
        registerPanel.add(patientRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 30));

        doctorRegisterButton.setBackground(new java.awt.Color(86, 142, 255));
        doctorRegisterButton.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        doctorRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        doctorRegisterButton.setText("SIGN UP AS A DOCTOR");
        doctorRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRegisterButtonActionPerformed(evt);
            }
        });
        registerPanel.add(doctorRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, 30));

        jPanel1.add(registerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 270, 340));

        sıgnInPanel.setBackground(new java.awt.Color(255, 255, 255));
        sıgnInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sıgnInLabel.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        sıgnInLabel.setForeground(new java.awt.Color(76, 76, 76));
        sıgnInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sıgnInLabel.setText("SIGN IN");
        sıgnInPanel.add(sıgnInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 35, 205, -1));

        txtUsernameForLogin.setBackground(new java.awt.Color(204, 204, 204));
        txtUsernameForLogin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsernameForLogin.setForeground(new java.awt.Color(76, 76, 76));
        sıgnInPanel.add(txtUsernameForLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 117, 143, 36));

        txtPasswordForLogin.setBackground(new java.awt.Color(204, 204, 204));
        txtPasswordForLogin.setForeground(new java.awt.Color(76, 76, 76));
        sıgnInPanel.add(txtPasswordForLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 171, 143, 37));

        usernameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(76, 76, 76));
        usernameLabel.setText("Username : ");
        sıgnInPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, -1, -1));

        passwordLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(76, 76, 76));
        passwordLabel.setText("Password :");
        sıgnInPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 179, 76, -1));

        sıgnInButton.setBackground(new java.awt.Color(86, 142, 255));
        sıgnInButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        sıgnInButton.setForeground(new java.awt.Color(255, 255, 255));
        sıgnInButton.setText("SIGN IN");
        sıgnInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sıgnInButtonActionPerformed(evt);
            }
        });
        sıgnInPanel.add(sıgnInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 292, 120, 30));

        jPanel1.add(sıgnInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 270, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\bayra\\OneDrive\\Masaüstü\\logo\\gerçekten son.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 70));

        jTextField1.setBackground(new java.awt.Color(0, 153, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Rumeysa Sare Bayram - 2121251032");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 450, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sıgnInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sıgnInButtonActionPerformed

        String password = String.valueOf(txtPasswordForLogin.getPassword());
        Person acc = Database.loginVerification(txtUsernameForLogin.getText(), password);

        if (acc == null) {
            JOptionPane.showMessageDialog(this, "This user does not exist!",
                    "User Not Found", JOptionPane.ERROR_MESSAGE);
        } else if (acc instanceof Doctor doctor) {
            LoginAndRegisterPage.account = acc;
            txtUsernameForLogin.setText("");
            txtPasswordForLogin.setText("");

            DoctorControlPage doctorControlPage = new DoctorControlPage(doctor);
            doctorControlPage.show();
            dispose();

        } else if (acc instanceof Patient) {
            LoginAndRegisterPage.account = acc;
            txtUsernameForLogin.setText("");
            txtPasswordForLogin.setText("");

            PatientControlPage patientControlPage = new PatientControlPage((Patient)acc);
            patientControlPage.show();
            dispose();

        } else if (acc instanceof LabAttendant labAttendant) {
            LoginAndRegisterPage.account = acc;
            txtUsernameForLogin.setText("");
            txtPasswordForLogin.setText("");

            LabAttendantPage labAttendantPage = new LabAttendantPage(labAttendant);
            labAttendantPage.show();
            dispose();
            

        }
    }//GEN-LAST:event_sıgnInButtonActionPerformed

    private void doctorRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRegisterButtonActionPerformed
        if (txtUsernameForRegister.getText().equals("") || txtPasswordForRegister.getText().equals("") || txtName.getText().equals("")
                || txtPhoneNo.getText().equals("") || txtSurname.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (Database.checkUsername(txtUsernameForRegister.getText())) {
            JOptionPane.showMessageDialog(this, "Username Already Exist.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "To verify that you are a doctor, please enter the verification code given to you by the hospital.",
                    "Authentication", JOptionPane.INFORMATION_MESSAGE);

            AuthenticationPageForDoctor authenticationPage = new AuthenticationPageForDoctor(txtName.getText(), txtSurname.getText(),
                    txtUsernameForRegister.getText(), txtPasswordForRegister.getText(), txtPhoneNo.getText());
            authenticationPage.show();
            dispose();

        }


    }//GEN-LAST:event_doctorRegisterButtonActionPerformed

    private void patientRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientRegisterButtonActionPerformed
        if (txtUsernameForRegister.getText().equals("") || txtPasswordForRegister.getText().equals("") || txtName.getText().equals("")
                || txtPhoneNo.getText().equals("") || txtSurname.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (Database.checkUsername(txtUsernameForRegister.getText())) {
            JOptionPane.showMessageDialog(this, "Username Already Exist.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else {
            
               Patient patient = new Patient(txtName.getText(), txtSurname.getText(), txtUsernameForRegister.getText(),txtPasswordForRegister.getText());

            Database.saveUser(patient);
            JOptionPane.showMessageDialog(this, "Successfully Created Patient Account ",
                    "Operation Successful", JOptionPane.INFORMATION_MESSAGE);

            txtUsernameForRegister.setText("");
            txtPasswordForRegister.setText("");
            txtName.setText("");
            txtPhoneNo.setText("");
            txtSurname.setText("");

        }
    }//GEN-LAST:event_patientRegisterButtonActionPerformed

    private void labAttendantRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labAttendantRegisterButtonActionPerformed
        if (txtUsernameForRegister.getText().equals("") || txtPasswordForRegister.getText().equals("") || txtName.getText().equals("")
                || txtPhoneNo.getText().equals("") || txtSurname.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Fill All Entries.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else if (Database.checkUsername(txtUsernameForRegister.getText())) {
            JOptionPane.showMessageDialog(this, "Username Already Exist.",
                    "Failure", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "To verify that you are a lab attendant, please enter the verification code given to you by the hospital.",
                    "Authentication", JOptionPane.INFORMATION_MESSAGE);

            AuthenticationPageForLabAttendant authenticationPage = new AuthenticationPageForLabAttendant(txtName.getText(), txtSurname.getText(),
                    txtUsernameForRegister.getText(), txtPasswordForRegister.getText(), txtPhoneNo.getText());
            authenticationPage.show();
            dispose();

        }
    }//GEN-LAST:event_labAttendantRegisterButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // testInit();
               Database.initEntitiyManager();
                new LoginAndRegisterPage().setVisible(true);
            }
        });
    }

//    public static void testInit() {
//        //Default admin account
//        Doctor doctor1 = new Doctor("Zahid", "Baltacı", "123",
//                "zahid", "05360666561");
//        Doctor doctor2 = new Doctor("Emirhan", "Soylu", "123", "emirhan", "05063640557");
//
//        //Default lab attendant account
//        LabAttendant labAttendant1 = new LabAttendant("Sare", "Bayram", "123",
//                "sare", "05425923130");
//
//        //Default patient account
//        Patient patient1 = new Patient("Ahmet", "Ak", "123", "ahmet", "123232132");
//        patient1.setDoctor(doctor2);
//        doctor2.getMyPatients().add(patient1);
//        Patient patient2 = new Patient("Mehmet", "Ak", "123", "mehmet", "32322321");
//        patient2.setDoctor(doctor1);
//        doctor1.getMyPatients().add(patient2);
//        Patient patient3 = new Patient("Meryem", "Kılıç", "123", "meryemki", "05511365622");
//        patient3.setDoctor(doctor2);
//        doctor2.getMyPatients().add(patient3);
//
//        Database.getPeople().add(doctor1);
//        Database.getPeople().add(doctor2);
//
//        Database.getPeople().add(labAttendant1);
//
//        Database.getPeople().add(patient1);
//        Database.getPeople().add(patient2);
//        Database.getPeople().add(patient3);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doctorRegisterButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton labAttendantRegisterButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordForSıgnUpLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton patientRegisterButton;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JButton sıgnInButton;
    private javax.swing.JLabel sıgnInLabel;
    private javax.swing.JPanel sıgnInPanel;
    private javax.swing.JLabel sıgnUpLabel;
    protected javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPasswordForLogin;
    protected javax.swing.JPasswordField txtPasswordForRegister;
    protected javax.swing.JTextField txtPhoneNo;
    protected javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsernameForLogin;
    protected javax.swing.JTextField txtUsernameForRegister;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameforSıgnUpLabel;
    // End of variables declaration//GEN-END:variables
}
