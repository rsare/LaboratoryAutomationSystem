package LaboratoryAutomationSystem;

import jpa_Core.*;
import java.util.Vector;
import javax.sound.midi.Patch;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sare
 */
public class DoctorControlPage extends javax.swing.JFrame {

    Doctor doctorAcc;

    //Doctor doctor = (Doctor) LoginAndRegisterPage.account;
    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"ID", "Name", "Surname", "Test Counts"};

    public DoctorControlPage() {
        initComponents();

        tableModel.setColumnIdentifiers(columNames);

    }

    public DoctorControlPage(Doctor doctor) {
        initComponents();
        doctorAcc = doctor;

        tableModel.setColumnIdentifiers(columNames);
        jTable1.setModel(tableModel);

        refreshTable();
        setLocationRelativeTo(null);
    }

    private void refreshTable() {

        tableModel.setRowCount(0);
        for (Patient patient : doctorAcc.getPatients()) {

            Vector rowData = new Vector();

            rowData.add(patient.getId());
            rowData.add(patient.getName());
            rowData.add(patient.getSurname());
            rowData.add(patient.getAnalysisresultList().size());

            tableModel.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logOutButton = new javax.swing.JButton();
        urineButton = new javax.swing.JRadioButton();
        bloodButton = new javax.swing.JRadioButton();
        testRequestButton = new javax.swing.JButton();
        showResultButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("DOCTOR CONTROL PANEL");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 690, 70));

        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 760, 340));

        logOutButton.setBackground(new java.awt.Color(255, 255, 255));
        logOutButton.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(51, 153, 255));
        logOutButton.setText("LOG OUT");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        buttonGroup1.add(urineButton);
        urineButton.setSelected(true);
        urineButton.setText("Urine ");
        jPanel1.add(urineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        buttonGroup1.add(bloodButton);
        bloodButton.setText("Blood");
        jPanel1.add(bloodButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        testRequestButton.setText("Test Request");
        testRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testRequestButtonActionPerformed(evt);
            }
        });
        jPanel1.add(testRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        showResultButton.setText("Show Result");
        showResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultButtonActionPerformed(evt);
            }
        });
        jPanel1.add(showResultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 490, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        if ((JOptionPane.showConfirmDialog(this, "Do You Want To Log Out?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            LoginAndRegisterPage loginAndRegister = new LoginAndRegisterPage();
            loginAndRegister.show();
            dispose();
        } else {

        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void testRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testRequestButtonActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selected patient cannot found!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = (Integer) tableModel.getValueAt(jTable1.getSelectedRow(), 0);
        Patient patient = (Patient) Database.getUserByID(id);
        
        
        if (patient == null) {
            JOptionPane.showMessageDialog(this, "This patient cannot found!", "Patient Not Selected", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (buttonGroup1.isSelected(urineButton.getModel())) {
            UrineAnalysis urineAnalysis = new UrineAnalysis();
            Database.addAnalysis(urineAnalysis, doctorAcc, patient);
        } else {
            BloodAnalysis bloodAnalysis = new BloodAnalysis();
            Database.addAnalysis(bloodAnalysis, doctorAcc, patient);
        }

        
        refreshTable();
    }//GEN-LAST:event_testRequestButtonActionPerformed

    private void showResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultButtonActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selected patient cannot found!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ResultShowingForDoctor resultShowingForDoctor = new ResultShowingForDoctor(doctorAcc);
        resultShowingForDoctor.show();
        this.dispose();
    }//GEN-LAST:event_showResultButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorControlPage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bloodButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton showResultButton;
    private javax.swing.JButton testRequestButton;
    private javax.swing.JRadioButton urineButton;
    // End of variables declaration//GEN-END:variables
}
