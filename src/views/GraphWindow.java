/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.GeneralController;
import java.awt.Color;
import views.charts.ModelChart;

/**
 *
 * @author Andres
 */
public class GraphWindow extends javax.swing.JDialog {

    /**
     * Creates new form BothPanel
     * @param parent
     * @param modal
     */
    public GraphWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        generalController = GeneralController.getGeneralController();
        this.setLocationRelativeTo(parent);
        this.getContentPane().setBackground(Color.getHSBColor(227,243,243));
        this.getContentPane().setForeground(Color.getHSBColor(187,187,187));
        chart.addLegend("Costo total", new Color(245, 189, 135));
        chart.addLegend("Precio premio", new Color(135, 189,  245));
        chart.addLegend("Inversión final", new Color(189, 135, 245));
        chart.addData(new ModelChart(generalController.getUserInventory().getName(), generalController.getUserInventory().getData()));
        chart.addData(new ModelChart(generalController.getFirstCaseInventory().getName(), generalController.getFirstCaseInventory().getData()));
        chart.addData(new ModelChart(generalController.getSecondCaseInventory().getName(), generalController.getSecondCaseInventory().getData()));
        chart.addData(new ModelChart(generalController.getThirdCaseInventory().getName(), generalController.getThirdCaseInventory().getData()));
        lbBestOption.setText(generalController.getBestOption());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultsPanel1 = new javax.swing.JPanel();
        chart = new views.charts.Chart();
        jLabel4 = new javax.swing.JLabel();
        lbBestOptionText = new javax.swing.JLabel();
        lbBestOption = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultsPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        resultsPanel1.setBackground(new java.awt.Color(128, 210, 200));
        resultsPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Gráfico 1: Comparación de casos según el costo total, precio del premio e inversión final");

        lbBestOptionText.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lbBestOptionText.setText("<html>Se recomienda tomar el caso donde la inversión final sea menor. </html>");
        lbBestOptionText.setFocusCycleRoot(true);

        lbBestOption.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lbBestOption.setForeground(new java.awt.Color(255, 0, 0));
        lbBestOption.setText("Mejor opción");

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Mejor opción:");

        javax.swing.GroupLayout resultsPanel1Layout = new javax.swing.GroupLayout(resultsPanel1);
        resultsPanel1.setLayout(resultsPanel1Layout);
        resultsPanel1Layout.setHorizontalGroup(
            resultsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanel1Layout.createSequentialGroup()
                .addGroup(resultsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel4))
                    .addGroup(resultsPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lbBestOptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(resultsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBestOption, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(resultsPanel1Layout.createSequentialGroup()
                        .addContainerGap(160, Short.MAX_VALUE)
                        .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        resultsPanel1Layout.setVerticalGroup(
            resultsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(resultsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBestOption))
                    .addComponent(lbBestOptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        resultsPanel4.setBackground(new java.awt.Color(227, 243, 243));
        resultsPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f0ee5783540344eea0050f65ff12f81b (1).png"))); // NOI18N

        javax.swing.GroupLayout resultsPanel4Layout = new javax.swing.GroupLayout(resultsPanel4);
        resultsPanel4.setLayout(resultsPanel4Layout);
        resultsPanel4Layout.setHorizontalGroup(
            resultsPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(1146, Short.MAX_VALUE))
        );
        resultsPanel4Layout.setVerticalGroup(
            resultsPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(resultsPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resultsPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(resultsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private GeneralController generalController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.charts.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbBestOption;
    private javax.swing.JLabel lbBestOptionText;
    private javax.swing.JPanel resultsPanel1;
    private javax.swing.JPanel resultsPanel4;
    // End of variables declaration//GEN-END:variables
}
