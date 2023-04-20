/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execution;
import controllers.InventoryManager;
import models.Inventory;

/**
 *
 * @author cdvv
 */
public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager(1000,9.99,10,1);
        Inventory inventory = manager.getInventory();
        manager.economicOrderQuantity();
        manager.calculateCosts();
        System.out.println("Caso 1");
        System.out.println(inventory.getOptimalQuantity());
        System.out.println(inventory.getTotalCost());
        System.out.println("Caso 2");
        inventory.setOptimalQuantity(200);
        inventory.setExtraUnits(10);
        manager.calculateCosts();
        System.out.println(inventory.getTotalCost());
        System.out.println("Caso 3");
        inventory.setOptimalQuantity(300);
        inventory.setExtraUnits(30);
        manager.calculateCosts();
        System.out.println(inventory.getTotalCost());
        System.out.println("Caso 4");
        inventory.setOptimalQuantity(400);
        inventory.setExtraUnits(40);
        manager.calculateCosts();
        System.out.println(inventory.getTotalCost());
    }
}
