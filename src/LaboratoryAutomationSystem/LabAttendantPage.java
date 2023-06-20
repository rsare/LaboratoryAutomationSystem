package LaboratoryAutomationSystem;

import jpa_Core.*;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sare
 */
public class LabAttendantPage extends javax.swing.JFrame {

    LabAttendant labAttandentAcc;

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columNames = {"ID", "Patient", "Doctor", "Analysis Type"};

    public LabAttendantPage(LabAttendant labAttendant) {
        initComponents();
        setLocationRelativeTo(null);
        labAttandentAcc = labAttendant;

        tableModel.setColumnIdentifiers(columNames);
        jTable1.setModel(tableModel);
        refreshTable();
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        for (Person person : Database.getPeople()) {
            if (person instanceof Patient patient) {
                for (Analysisresult medicalAnalysis : patient.getAnalysisresultList()) {
                    Vector data = new Vector();
                    data.add(medicalAnalysis.getId());
                    data.add(medicalAnalysis.getPatientId().getName());
                    data.add(medicalAnalysis.getDoctorId().getName());
                    data.add(medicalAnalysis.getAnalysisType());
                    tableModel.addRow(data);
                }
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
        jTable1 = new javax.swing.JTable();
        concludeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("LAB ATTENDANT PANEL");
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
        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 740, 360));

        concludeButton.setText("Conclude");
        concludeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concludeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(concludeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, -1, -1));

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

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        if ((JOptionPane.showConfirmDialog(this, "Do You Want To Log Out?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
            LoginAndRegisterPage loginAndRegister = new LoginAndRegisterPage();
            loginAndRegister.show();
            dispose();
        } else {

        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void concludeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concludeButtonActionPerformed
        Analysisresult medicalAnalysis = null;
        tableModel.getValueAt(jTable1.getSelectedRow(), 0);
        for (Person person : Database.getPeople()) {
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                for (Analysisresult medicalAnalysis1 : patient.getAnalysisresultList()) {
                    medicalAnalysis1 = Database.findAnalysisResultByID((Integer) tableModel.getValueAt(jTable1.getSelectedRow(), 0));
                    medicalAnalysis = medicalAnalysis1;

                }
            }

        }
        ChoosingAnalysis choosingAnalysis = new ChoosingAnalysis(medicalAnalysis, this);
        choosingAnalysis.dispatchEvent(new WindowEvent(choosingAnalysis, WindowEvent.WINDOW_CLOSING));
        choosingAnalysis.show();


    }//GEN-LAST:event_concludeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton concludeButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOutButton;
    // End of variables declaration//GEN-END:variables
}
