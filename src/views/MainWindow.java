/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.GeneralController;
import controllers.UIController;
import javax.swing.BorderFactory;

/**
 *
 * @author cdvv
 */
public class MainWindow extends javax.swing.JFrame {

    private final GeneralController generalController;
    private final UIController uIController;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        this.generalController = GeneralController.getGeneralController();
        this.uIController = UIController.getUIController();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnActions = new javax.swing.JPanel();
        btAddData = new javax.swing.JButton();
        btnMakeCalculations = new javax.swing.JButton();
        btnSeeData = new javax.swing.JButton();
        btnSeeComparations = new javax.swing.JButton();
        tbTitle = new javax.swing.JLabel();
        pnHeader = new javax.swing.JPanel();
        pnData = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 400));
        setResizable(false);

        pnActions.setBackground(new java.awt.Color(0, 51, 102));

        btAddData.setText("Agregar datos");
        btAddData.setBorderPainted(false);
        btAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDataActionPerformed(evt);
            }
        });

        btnMakeCalculations.setText("Calcular cantidad óptima");
        btnMakeCalculations.setBorderPainted(false);
        btnMakeCalculations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeCalculationsActionPerformed(evt);
            }
        });

        btnSeeData.setText("Ver resultados");
        btnSeeData.setBorderPainted(false);
        btnSeeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDataActionPerformed(evt);
            }
        });

        btnSeeComparations.setText("Comparar escenarios");
        btnSeeComparations.setBorderPainted(false);
        btnSeeComparations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeComparationsActionPerformed(evt);
            }
        });

        tbTitle.setBackground(new java.awt.Color(255, 255, 255));
        tbTitle.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tbTitle.setForeground(new java.awt.Color(255, 255, 255));
        tbTitle.setText("Acciones");

        javax.swing.GroupLayout pnActionsLayout = new javax.swing.GroupLayout(pnActions);
        pnActions.setLayout(pnActionsLayout);
        pnActionsLayout.setHorizontalGroup(
            pnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeeComparations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnActionsLayout.createSequentialGroup()
                        .addGroup(pnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSeeData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMakeCalculations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAddData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnActionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tbTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnActionsLayout.setVerticalGroup(
            pnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActionsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btAddData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMakeCalculations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeeData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeeComparations)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pnHeader.setBackground(new java.awt.Color(0, 102, 204));
        pnHeader.setPreferredSize(new java.awt.Dimension(694, 80));

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDataActionPerformed
        btAddData.setEnabled(false);
        pnData.removeAll();
        DataFormPanel pnForm = new DataFormPanel();
        pnData.add(pnForm);
        pnData.revalidate();
        pnData.repaint();
        pnForm.revalidate();
        pnForm.repaint();
    }//GEN-LAST:event_btAddDataActionPerformed

    private void btnMakeCalculationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeCalculationsActionPerformed
        if(generalController.getUserInventory() == null) {
            uIController.popUpErrorMessage("No se han guardado los datos para poder realizar los cálculos", "Error", rootPane);
        } else {
            uIController.popUpMessage("Los datos se calcularon satisfactoriamente", "Datos calculaddos", rootPane);
        }
    }//GEN-LAST:event_btnMakeCalculationsActionPerformed

    private void btnSeeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDataActionPerformed
        btAddData.setEnabled(true);
        pnData.removeAll();
        InformationPanel pnInfo = new InformationPanel();
        pnInfo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnData.add(pnInfo);
        pnData.revalidate();
        pnData.repaint();
        pnInfo.revalidate();
        pnInfo.repaint();
    }//GEN-LAST:event_btnSeeDataActionPerformed

    private void btnSeeComparationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeComparationsActionPerformed
        pnData.removeAll();
        ComparationPanel pnInfo = new ComparationPanel();
        pnInfo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnData.add(pnInfo);
        pnData.revalidate();
        pnData.repaint();
        pnInfo.revalidate();
        pnInfo.repaint();
    }//GEN-LAST:event_btnSeeComparationsActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
            mainWindow.setLocationRelativeTo(null);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddData;
    private javax.swing.JButton btnMakeCalculations;
    private javax.swing.JButton btnSeeComparations;
    private javax.swing.JButton btnSeeData;
    private javax.swing.JPanel pnActions;
    private javax.swing.JPanel pnData;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JLabel tbTitle;
    // End of variables declaration//GEN-END:variables
}
