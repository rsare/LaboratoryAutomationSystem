package LaboratoryAutomationSystem;

import jpa_Core.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatientControlPage extends javax.swing.JFrame {

    DefaultTableModel analysisTableModel = new DefaultTableModel();
    String[] columnNames = {"Analysis", "Result", "Doctor Name"};

    public PatientControlPage(Patient patient) {
        initComponents();
        setLocationRelativeTo(null);
       for (Analysisresult medicalAnalysis : patient.getAnalysisresultList()) {
            analysisComboBox.addItem(medicalAnalysis);

        }
        analysisTableModel.setColumnIdentifiers(columnNames);
        analysisTable.setModel(analysisTableModel);
        refreshtable();
    }

    public void refreshtable() {
        System.out.println("metodun başındayım");
        analysisTableModel.setRowCount(0);
        Analysisresult selectedMedicalAnalysis = (Analysisresult) analysisComboBox.getSelectedItem();

        if(selectedMedicalAnalysis.getAnalysisId() instanceof BloodAnalysis){
            System.out.println("başındayım");
            Vector vector = new Vector();
            vector.add(Analysisresult.bloodExaminations[0]);
            vector.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getWbc());
            Vector vector1 = new Vector();
            vector1.add(Analysisresult.bloodExaminations[1]);
            vector1.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getNeu());
            Vector vector2 = new Vector();
            vector2.add(Analysisresult.bloodExaminations[2]);
            vector2.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getLym());
            Vector vector3 = new Vector();
            vector3.add(Analysisresult.bloodExaminations[3]);
            vector3.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getMono());
            Vector vector4 = new Vector();
            vector4.add(Analysisresult.bloodExaminations[4]);
            vector4.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getEos());
            Vector vector5 = new Vector();
            vector5.add(Analysisresult.bloodExaminations[5]);
            vector5.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getBaso());
            Vector vector6 = new Vector();
            vector6.add(Analysisresult.bloodExaminations[6]);
            vector6.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getRbc());
            Vector vector7 = new Vector();
            vector7.add(Analysisresult.bloodExaminations[7]);
            vector7.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getHgb());
            Vector vector8 = new Vector();
            vector8.add(Analysisresult.bloodExaminations[8]);
            vector8.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getHct());
            Vector vector9 = new Vector();
            vector9.add(Analysisresult.bloodExaminations[9]);
            vector9.add(((BloodAnalysis)selectedMedicalAnalysis.getAnalysisId()).getMcv());
            vector.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector1.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector2.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector3.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector4.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector5.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector6.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector7.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector8.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector9.add(selectedMedicalAnalysis.getDoctorId().getName());
            analysisTableModel.addRow(vector);
            analysisTableModel.addRow(vector1);
            analysisTableModel.addRow(vector2);
            analysisTableModel.addRow(vector3);
            analysisTableModel.addRow(vector4);
            analysisTableModel.addRow(vector5);
            analysisTableModel.addRow(vector6);
            analysisTableModel.addRow(vector7);
            analysisTableModel.addRow(vector8);
            analysisTableModel.addRow(vector9);
        }else if(selectedMedicalAnalysis.getAnalysisId() instanceof UrineAnalysis){
            System.out.println("else ifin başındayım");
             Vector vector = new Vector();
            vector.add(Analysisresult.urineExaminations[0]);
            vector.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getGlukoz());
            Vector vector1 = new Vector();
            vector1.add(Analysisresult.urineExaminations[1]);
            vector1.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getProtein());
            Vector vector2 = new Vector();
            vector2.add(Analysisresult.urineExaminations[2]);
            vector2.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getBilirubin());
            Vector vector3 = new Vector();
            vector3.add(Analysisresult.urineExaminations[3]);
            vector3.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getUrobilinojen());
            Vector vector4 = new Vector();
            vector4.add(Analysisresult.urineExaminations[4]);
            vector4.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getPh());
            Vector vector5 = new Vector();
            vector5.add(Analysisresult.urineExaminations[5]);
            vector5.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getHemoglobin());
            Vector vector6 = new Vector();
            vector6.add(Analysisresult.urineExaminations[6]);
            vector6.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getKeton());
            Vector vector7 = new Vector();
            vector7.add(Analysisresult.urineExaminations[7]);
            vector7.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getNitrit());
            Vector vector8 = new Vector();
            vector8.add(Analysisresult.urineExaminations[8]);
            vector8.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getLokositEsteraz());
            Vector vector9 = new Vector();
            vector9.add(Analysisresult.urineExaminations[9]);
            vector9.add(((UrineAnalysis)selectedMedicalAnalysis.getAnalysisId()).getDansite());
            vector.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector1.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector2.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector3.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector4.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector5.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector6.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector7.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector8.add(selectedMedicalAnalysis.getDoctorId().getName());
            vector9.add(selectedMedicalAnalysis.getDoctorId().getName());
            analysisTableModel.addRow(vector);
            analysisTableModel.addRow(vector1);
            analysisTableModel.addRow(vector2);
            analysisTableModel.addRow(vector3);
            analysisTableModel.addRow(vector4);
            analysisTableModel.addRow(vector5);
            analysisTableModel.addRow(vector6);
            analysisTableModel.addRow(vector7);
            analysisTableModel.addRow(vector8);
            analysisTableModel.addRow(vector9);
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
