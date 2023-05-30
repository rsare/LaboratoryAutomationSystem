package LaboratoryAutomationSystem;

import CorePackage.MedicalAnalysis;
import CorePackage.Patient;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatientControlPage extends javax.swing.JFrame {

    DefaultTableModel analysisTableModel = new DefaultTableModel();
    String[] columnNames = {"Analysis", "Result", "Doctor Name"};

    public PatientControlPage(Patient patient) {
        initComponents();
        setLocationRelativeTo(null);
        for (MedicalAnalysis medicalAnalysis : patient.getMyMedicalAnalysis()) {
            analysisComboBox.addItem(medicalAnalysis);

        }
        analysisTableModel.setColumnIdentifiers(columnNames);
        analysisTable.setModel(analysisTableModel);
        refreshtable();
    }

    public void refreshtable() {
        analysisTableModel.setRowCount(0);
        MedicalAnalysis selectedMedicalAnalysis = (MedicalAnalysis) analysisComboBox.getSelectedItem();
        for (int i = 0; i < selectedMedicalAnalysis.getResult().length; i++) {
            if (selectedMedicalAnalysis.getMedicalAnalysisType().equals(MedicalAnalysis.analysisType[0])) {
                Vector vector = new Vector();
                vector.add(MedicalAnalysis.bloodExaminations[i]);
                vector.add(selectedMedicalAnalysis.getResult()[i]);
                vector.add(selectedMedicalAnalysis.getDoctor());
                analysisTableModel.addRow(vector);

            } else {
                Vector vector = new Vector();
                vector.add(MedicalAnalysis.urineExaminations[i]);
                vector.add(selectedMedicalAnalysis.getResult()[i]);
                vector.add(selectedMedicalAnalysis.getDoctor());
                analysisTableModel.addRow(vector);

            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        analysisTable = new javax.swing.JTable();
        analysisComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("PATIENT CONROL PANEL");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 690, 70));

        logOutButton.setBackground(new java.awt.Color(255, 255, 255));
        logOutButton.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(51, 153, 255));
        logOutButton.setText("LOG OUT");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        analysisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Analysis", "Result", "Doctor Name"
            }
        ));
        jScrollPane1.setViewportView(analysisTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 730, 350));

        analysisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(analysisComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "Do You Want To Log Out?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            LoginAndRegisterPage loginAndRegister = new LoginAndRegisterPage();
            loginAndRegister.show();
            dispose();
        } else {

        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void analysisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisComboBoxActionPerformed
        refreshtable();
    }//GEN-LAST:event_analysisComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(PatientControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new PatientControlPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> analysisComboBox;
    private javax.swing.JTable analysisTable;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    // End of variables declaration//GEN-END:variables
}
