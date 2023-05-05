/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.GeneralController;
import javax.swing.table.DefaultTableModel;
import models.Inventory;

/**
 *
 * @author cdvv
 */
public class ComparationPanel extends javax.swing.JPanel {

    private final GeneralController generalController;
    private DefaultTableModel tableModel;
    
    /**
     * Creates new form ComparationPanel
     */
    public ComparationPanel() {
        generalController  = GeneralController.getGeneralController();
        initComponents();
        tableModel = (DefaultTableModel)tbInventoryData.getModel();
        poblateTable();
    }
    
    private void poblateTable() {
        int j = tableModel.getRowCount();
        for (int i = 0; i < j; i++) {
          tableModel.removeRow(0);  
        }
        Inventory userInventory = generalController.getUserInventory();
        Inventory firstCase = generalController.getFirstCaseInventory();
        Inventory secondCase = generalController.getSecondCaseInventory();
        Inventory thirdCase = generalController.getThirdCaseInventory();
        tableModel.addRow(new Object[] {"Demanda esperada", 
                                        userInventory.getExpectedDemand(),
                                        firstCase.getExpectedDemand(),
                                        secondCase.getExpectedDemand(),
                                        thirdCase.getExpectedDemand()});
        tableModel.addRow(new Object[] {"Precio de la unidad",
                                        userInventory.getUnitaryPrice(), 
                                        firstCase.getUnitaryPrice(), 
                                        secondCase.getUnitaryPrice(), 
                                        thirdCase.getUnitaryPrice()});
        tableModel.addRow(new Object[] {"Costo de orden", 
                                        userInventory.getOrderingUnitaryCost(), 
                                        firstCase.getOrderingUnitaryCost(), 
                                        secondCase.getOrderingUnitaryCost(), 
                                        thirdCase.getOrderingUnitaryCost()});
        tableModel.addRow(new Object[] {"Costo unitario al almacenar", 
                                        userInventory.getStoringUnitaryCost(), 
                                        firstCase.getStoringUnitaryCost(), 
                                        secondCase.getStoringUnitaryCost(), 
                                        thirdCase.getStoringUnitaryCost()});
        tableModel.addRow(new Object[] {"Cantidad de unidades óptima", 
                                        userInventory.getUnitsToStore(), 
                                        firstCase.getUnitsToStore(), 
                                        secondCase.getUnitsToStore(), 
                                        thirdCase.getUnitsToStore()});
        tableModel.addRow(new Object[] {"Inventario promedio", 
                                        userInventory.getUnitsToStore()/2,
                                        firstCase.getUnitsToStore()/2,
                                        secondCase.getUnitsToStore()/2,
                                        thirdCase.getUnitsToStore()/2});
        tableModel.addRow(new Object[] {"Veces a ordenar", 
                                        userInventory.getTimesToOrder(),
                                        firstCase.getTimesToOrder(),
                                        secondCase.getTimesToOrder(),
                                        thirdCase.getTimesToOrder()});
        tableModel.addRow(new Object[] {"Costo total por órdenes",
                                        userInventory.getTotalOrderingCost(),
                                        firstCase.getTotalOrderingCost(),
                                        secondCase.getTotalOrderingCost(),
                                        thirdCase.getTotalOrderingCost()});
        tableModel.addRow(new Object[] {"Costo total por almacenaje",
                                        userInventory.getTotalStoringCost(), 
                                        firstCase.getTotalStoringCost(), 
                                        secondCase.getTotalStoringCost(), 
                                        thirdCase.getTotalStoringCost()});
        tableModel.addRow(new Object[] {"Costo total de las unidades",
                                        userInventory.getTotalUnitsCost(), 
                                        firstCase.getTotalUnitsCost(), 
                                        secondCase.getTotalUnitsCost(), 
                                        thirdCase.getTotalUnitsCost()});
        tableModel.addRow(new Object[] {"Costo total general",
                                        userInventory.getTotalCost(),
                                        firstCase.getTotalCost(),
                                        secondCase.getTotalCost(),
                                        thirdCase.getTotalCost()});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spInformationTable = new javax.swing.JScrollPane();
        tbInventoryData = new javax.swing.JTable();

        tbInventoryData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Demanda esperada", null, null, null, null},
                {"Precio de la unidad", null, null, null, null},
                {"Costo de ordenar", null, null, null, null},
                {"Costo de inventariado por unidad", null, null, null, null},
                {"Cantidad de unidades óptima", null, null, null, null},
                {"Costo total para ordenar", null, null, null, null},
                {"Costo total de inventariado", null, null, null, null},
                {"Costo total general", null, null, null, null}
            },
            new String [] {
                "Valores", "Inventario", "Caso 1 (210)", "Caso 2 (330)", "Caso 3 (440)"
            }
        ));
        tbInventoryData.setEnabled(false);
        tbInventoryData.setMaximumSize(new java.awt.Dimension(250, 100));
        tbInventoryData.setMinimumSize(new java.awt.Dimension(30, 100));
        spInformationTable.setViewportView(tbInventoryData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spInformationTable, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spInformationTable, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane spInformationTable;
    private javax.swing.JTable tbInventoryData;
    // End of variables declaration//GEN-END:variables
}
