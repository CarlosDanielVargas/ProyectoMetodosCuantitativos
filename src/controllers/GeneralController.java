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
        this.firstCaseInventory = new Inventory(1000, 9.90, 10, 1, 210, 3000);
        this.secondCaseInventory = new Inventory(1000, 9.90, 10, 1, 320, 5000);
        this.thirdCaseInventory = new Inventory(1000, 9.90, 10, 1, 440, 8000);
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
    
    public void createUserInventory(int expectedDemand, double unitaryPrice, double orderingCost, double storingCost) {
        this.userInventory = new Inventory(expectedDemand, unitaryPrice, orderingCost, storingCost);
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
