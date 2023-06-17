/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Inventory;

/**
 *
 * @author cdvv
 */
public class GeneralController {
    
    private Inventory userInventory;
    private final Inventory firstCaseInventory;
    private final Inventory secondCaseInventory;
    private final Inventory thirdCaseInventory;
    private static GeneralController GENERAL_CONTROLLER;
    private final InventoryManager inventoryManager;

    private GeneralController() {
        this.firstCaseInventory = new Inventory(1000, 9.90, 10, 1, 210, 3000, "Caso 1 (210)");
        this.secondCaseInventory = new Inventory(1000, 9.90, 10, 1, 320, 5000, "Caso 2 (330)");
        this.thirdCaseInventory = new Inventory(1000, 9.90, 10, 1, 440, 8000, "Caso 3 (440)");
        this.inventoryManager = InventoryManager.getInventoryManager();
        calculateCases();
    }

    public Inventory getUserInventory() {
        return userInventory;
    }

    public Inventory getFirstCaseInventory() {
        return firstCaseInventory;
    }

    public Inventory getSecondCaseInventory() {
        return secondCaseInventory;
    }

    public Inventory getThirdCaseInventory() {
        return thirdCaseInventory;
    }

    public static GeneralController getGeneralController() {
        if (GENERAL_CONTROLLER == null) {
            GENERAL_CONTROLLER = new GeneralController();
        }
        return GENERAL_CONTROLLER;
    }
    
    public String getBestOption() {
        if (userInventory.getData()[2] < firstCaseInventory.getData()[2] && userInventory.getData()[2] < secondCaseInventory.getData()[2] && userInventory.getData()[2] < thirdCaseInventory.getData()[2]) {
            return "<html>" + userInventory.getName() + " cuya inversión final es de $" + userInventory.getData()[2] + "</html>";
        } else if (firstCaseInventory.getData()[2] < secondCaseInventory.getData()[2] && firstCaseInventory.getData()[2] < thirdCaseInventory.getData()[2] && firstCaseInventory.getData()[2] < userInventory.getData()[2]) {
            return "<html>" + firstCaseInventory.getName() + " cuya inversión final es de $" + firstCaseInventory.getData()[2] + "</html>";
        } else if (secondCaseInventory.getData()[2] < firstCaseInventory.getData()[2] && secondCaseInventory.getData()[2] < thirdCaseInventory.getData()[2] && secondCaseInventory.getData()[2] < userInventory.getData()[2]) {
            return "<html>" + secondCaseInventory.getName() + " cuya inversión final es de $" + secondCaseInventory.getData()[2] + "</html>";
        } else {
            return "<html>" + thirdCaseInventory.getName() + " cuya inversión final es de $" + thirdCaseInventory.getData()[2] + "</html>";
        }
    }
    
    public void createUserInventory(int expectedDemand, double unitaryPrice, double orderingCost, double storingCost) {
        this.userInventory = new Inventory(expectedDemand, unitaryPrice, orderingCost, storingCost, "Inventario dado");
        inventoryManager.setInventory(userInventory);
        inventoryManager.economicOrderQuantity();
        inventoryManager.makeCalculations();
    }
    
    private void calculateCases() {
        inventoryManager.setInventory(firstCaseInventory);
        inventoryManager.makeCalculations();
        inventoryManager.setInventory(secondCaseInventory);
        inventoryManager.makeCalculations();
        inventoryManager.setInventory(thirdCaseInventory);
        inventoryManager.makeCalculations();
    }
    
    
    
}
