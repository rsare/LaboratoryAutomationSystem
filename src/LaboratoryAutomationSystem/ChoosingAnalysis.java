package LaboratoryAutomationSystem;

import jpa_Core.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ChoosingAnalysis extends javax.swing.JFrame {
    
    Analysisresult medicalAnalysis;
    LabAttendantPage labAttendantPage;
    
    DefaultListModel lowDefaultListModel = new DefaultListModel();
    DefaultListModel normalDefaultListModel = new DefaultListModel();
    DefaultListModel highDefaultListModel = new DefaultListModel();
    
    public ChoosingAnalysis() {
        initComponents();
        for (String urineExaminations : Analysisresult.urineExaminations) {
            testTypeComboBox.addItem(urineExaminations);
        }
        jListLow.setModel(lowDefaultListModel);
        jListNormal.setModel(normalDefaultListModel);
        jListHigh.setModel(highDefaultListModel);
        setLocationRelativeTo(null);
        
    }
    
    public ChoosingAnalysis(Analysisresult medicalAnalysis, LabAttendantPage labAttendantPage) {
        initComponents();
        this.labAttendantPage = labAttendantPage;
        testTypeComboBox.removeAllItems();
        if (medicalAnalysis.getAnalysisType().equals(Analysisresult.analysisTypes[0])) {
            for (String bloodExamination : Analysisresult.bloodExaminations) {
                testTypeComboBox.addItem(bloodExamination);
                this.medicalAnalysis = medicalAnalysis;
            }
        } else {
            for (String urineExaminations : Analysisresult.urineExaminations) {
                testTypeComboBox.addItem(urineExaminations);
            }
            this.medicalAnalysis = medicalAnalysis;
        }
        
        jListLow.setModel(lowDefaultListModel);
        jListNormal.setModel(normalDefaultListModel);
        jListHigh.setModel(highDefaultListModel);
        refreshList();
        
    }
    
    public void refreshList() {
        if (medicalAnalysis.getAnalysisType().equals(Analysisresult.analysisTypes[0])) {
            for (int i = 0; i < medicalAnalysis.getResult().length; i++) {
                if (medicalAnalysis.getResult()[i] == null) {
                    continue;
                }
                if (medicalAnalysis.getResult()[i].equals(Analysisresult.low)) {
                    lowDefaultListModel.addElement(Analysisresult.bloodExaminations[i]);
                } else if (medicalAnalysis.getResult()[i].equals(Analysisresult.normal)) {
                    normalDefaultListModel.addElement(Analysisresult.bloodExaminations[i]);
                } else {
                    highDefaultListModel.addElement(Analysisresult.bloodExaminations[i]);
                }
            }
            
        } else {
            for (int i = 0; i < medicalAnalysis.getResult().length; i++) {
                if (medicalAnalysis.getResult()[i] == null) {
                    continue;
                }
                if (medicalAnalysis.getResult()[i].equals(Analysisresult.low)) {
                    lowDefaultListModel.addElement(Analysisresult.urineExaminations[i]);
                } else if (medicalAnalysis.getResult()[i].equals(Analysisresult.normal)) {
                    normalDefaultListModel.addElement(Analysisresult.urineExaminations[i]);
                } else {
                    highDefaultListModel.addElement(Analysisresult.urineExaminations[i]);
                }
                
            }
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        testTypeComboBox = new javax.swing.JComboBox<>();
        resultValueComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLow = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListNormal = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHigh = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rmvButtonForLow = new javax.swing.JButton();
        rmvButtonForNormal = new javax.swing.JButton();
        rmvButtonForHigh = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        headerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        resultValueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low (<5)", "Normal", "High(>10)" }));

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListLow);

        jScrollPane2.setViewportView(jListNormal);

        jScrollPane3.setViewportView(jListHigh);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LOW");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NORMAL");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("HIGH");

        rmvButtonForLow.setText("REMOVE");
        rmvButtonForLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvButtonForLowActionPerformed(evt);
            }
        });

        rmvButtonForNormal.setText("REMOVE");
        rmvButtonForNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvButtonForNormalActionPerformed(evt);
            }
        });

        rmvButtonForHigh.setText("REMOVE");
        rmvButtonForHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvButtonForHighActionPerformed(evt);
            }
        });

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        headerLabel.setBackground(new java.awt.Color(51, 153, 255));
        headerLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("RESULT SCREEN");
        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(rmvButtonForLow)
                .addGap(186, 186, 186)
                .addComponent(rmvButtonForNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rmvButtonForHigh)
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(testTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(resultValueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(204, 204, 204)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultValueComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(testTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rmvButtonForLow)
                    .addComponent(rmvButtonForNormal)
                    .addComponent(rmvButtonForHigh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (lowDefaultListModel.contains(testTypeComboBox.getSelectedItem()) || normalDefaultListModel.contains(testTypeComboBox.getSelectedItem()) || highDefaultListModel.contains(testTypeComboBox.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "The test has already been completed.", "Failure", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (resultValueComboBox.getSelectedItem() == "Low (<5)") {
            lowDefaultListModel.addElement(testTypeComboBox.getSelectedItem());
            medicalAnalysis.getResult()[testTypeComboBox.getSelectedIndex()] = Analysisresult.low;
        } else if (resultValueComboBox.getSelectedItem() == "Normal") {
            normalDefaultListModel.addElement(testTypeComboBox.getSelectedItem());
            medicalAnalysis.getResult()[testTypeComboBox.getSelectedIndex()] = Analysisresult.normal;
        } else {
            highDefaultListModel.addElement(testTypeComboBox.getSelectedItem());
            medicalAnalysis.getResult()[testTypeComboBox.getSelectedIndex()] = Analysisresult.high;
        }
        

    }//GEN-LAST:event_addButtonActionPerformed

    private void rmvButtonForLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvButtonForLowActionPerformed
        if (jListLow.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "No Value Selected !", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String selectedValue = jListLow.getSelectedValue();
        int index;
        for (int i = 0; i < Analysisresult.bloodExaminations.length; i++) {
            if (selectedValue.equals(Analysisresult.bloodExaminations[i]) || selectedValue.equals(Analysisresult.urineExaminations[i])) {
                medicalAnalysis.getResult()[i] = "";
            }
            
        }
        lowDefaultListModel.removeElementAt(jListLow.getSelectedIndex());

    }//GEN-LAST:event_rmvButtonForLowActionPerformed

    private void rmvButtonForNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvButtonForNormalActionPerformed
        if (jListNormal.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "No Value Selected !", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String selectedValue = jListNormal.getSelectedValue();
        int index;
        for (int i = 0; i < Analysisresult.bloodExaminations.length; i++) {
            if (selectedValue.equals(Analysisresult.bloodExaminations[i]) || selectedValue.equals(Analysisresult.urineExaminations[i])) {
                medicalAnalysis.getResult()[i] = "";
            }
            
        }
        normalDefaultListModel.removeElementAt(jListNormal.getSelectedIndex());
    }//GEN-LAST:event_rmvButtonForNormalActionPerformed

    private void rmvButtonForHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvButtonForHighActionPerformed
        if (jListHigh.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "No Value Selected !", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String selectedValue = jListHigh.getSelectedValue();
        int index;
        for (int i = 0; i < Analysisresult.bloodExaminations.length; i++) {
            if (selectedValue.equals(Analysisresult.bloodExaminations[i]) || selectedValue.equals(Analysisresult.urineExaminations[i])) {
                medicalAnalysis.getResult()[i] = "";
            }
            
        }
        highDefaultListModel.removeElementAt(jListHigh.getSelectedIndex());
    }//GEN-LAST:event_rmvButtonForHighActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (!lowDefaultListModel.contains(testTypeComboBox.getSelectedItem()) && !normalDefaultListModel.contains(testTypeComboBox.getSelectedItem()) && !highDefaultListModel.contains(testTypeComboBox.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Selected Value Never Added !", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (lowDefaultListModel.contains(testTypeComboBox.getSelectedItem())) {
            lowDefaultListModel.removeElement(testTypeComboBox.getSelectedItem());
        } else if (normalDefaultListModel.contains(testTypeComboBox.getSelectedItem())) {
            normalDefaultListModel.removeElement(testTypeComboBox.getSelectedItem());
        } else {
            highDefaultListModel.removeElement(testTypeComboBox.getSelectedItem());
        }
        if (resultValueComboBox.getSelectedItem() == "Low (<5)") {
            lowDefaultListModel.addElement(testTypeComboBox.getSelectedItem());
            medicalAnalysis.getResult()[testTypeComboBox.getSelectedIndex()] = Analysisresult.low;
        } else if (resultValueComboBox.getSelectedItem() == "Normal") {
            normalDefaultListModel.addElement(testTypeComboBox.getSelectedItem());
            medicalAnalysis.getResult()[testTypeComboBox.getSelectedIndex()] = Analysisresult.normal;
        } else {
            highDefaultListModel.addElement(testTypeComboBox.getSelectedItem());
            medicalAnalysis.getResult()[testTypeComboBox.getSelectedIndex()] = Analysisresult.high;
        }
        

    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        boolean control = true;
        for (String results : medicalAnalysis.getResult()) {
            if ("".equals(results) || results == null) {
                control = false;
                break;
            }
        }
        if (control == true) {
            medicalAnalysis.setStatus(Analysisresult.testsConcluded);            
            
        }
        labAttendantPage.refreshTable();
        setVisible(false);
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChoosingAnalysis.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosingAnalysis.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosingAnalysis.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosingAnalysis.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosingAnalysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListHigh;
    private javax.swing.JList<String> jListLow;
    private javax.swing.JList<String> jListNormal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> resultValueComboBox;
    private javax.swing.JButton rmvButtonForHigh;
    private javax.swing.JButton rmvButtonForLow;
    private javax.swing.JButton rmvButtonForNormal;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> testTypeComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
