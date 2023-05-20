/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;

/**
 *
 * @author Andres
 */
public class InformationWindow extends javax.swing.JDialog {

    /**
     * Creates new form InformationWindow
     */
    public InformationWindow(java.awt.Frame parent, boolean modal, InformationPanel pnInfo) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.getContentPane().setBackground(Color.getHSBColor(227,243,243));
        this.getContentPane().setForeground(Color.getHSBColor(187,187,187));
        pnInfo.setBackground(Color.getHSBColor(227,243,243));
        pnInfo.setForeground(Color.getHSBColor(187,187,187));
        pnInfo.setSize(resultsPanel.getWidth(), resultsPanel.getHeight());
        pnInfo.setAlignmentX(resultsPanel.getAlignmentX());
        pnInfo.setAlignmentY(resultsPanel.getAlignmentY());
        resultsPanel.add(pnInfo);
        resultsPanel.revalidate();
        resultsPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultsPanel = new javax.swing.JPanel();
        resultsPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(227, 243, 243));
        setMaximumSize(new java.awt.Dimension(32767, 32767));

        resultsPanel.setBackground(new java.awt.Color(227, 243, 243));
        resultsPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultsPanel4Layout.setVerticalGroup(
            resultsPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(resultsPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resultsPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JPanel resultsPanel4;
    // End of variables declaration//GEN-END:variables
}
