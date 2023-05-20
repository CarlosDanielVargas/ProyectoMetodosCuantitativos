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
public class InventoryManager {
    
    private static InventoryManager INVENTORY_MANAGER;
    private Inventory inventory;

    private InventoryManager() {
    }

    public static InventoryManager getInventoryManager() {
        if (INVENTORY_MANAGER == null) {
            INVENTORY_MANAGER = new InventoryManager();
        }
        return INVENTORY_MANAGER;
    }
    
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    public void economicOrderQuantity() {
        double a = (2*this.inventory.getExpectedDemand()*this.inventory.getOrderingUnitaryCost())/this.inventory.getStoringUnitaryCost();
        this.inventory.setUnitsToStore((int)Math.ceil(Math.sqrt(a)));
    }
    
    public double[] getData(){
        return inventory.getData();
    }
    
    public void makeCalculations(){
        int quantity = this.inventory.getUnitsToStore();
        int timesOrdered = (int)Math.ceil(this.inventory.getExpectedDemand()/quantity);
        double orderingCost = Math.round(this.inventory.getExpectedDemand()*this.inventory.getOrderingUnitaryCost()/quantity);
        double storingCost = Math.round(quantity/2*this.inventory.getStoringUnitaryCost());
        double unitCost = this.inventory.getExpectedDemand()*this.inventory.getUnitaryPrice();
        double totalCost = orderingCost + storingCost + unitCost;
        this.inventory.setTotalCost(totalCost);
        this.inventory.setTotalOrderingCost(orderingCost);
        this.inventory.setTotalStoringCost(storingCost);
        this.inventory.setTotalUnitsCost(unitCost);
        this.inventory.setTimesToOrder(timesOrdered);
    }
    
}
