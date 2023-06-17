/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cdvv
 */
public class Inventory {
    
    private int expectedDemand;
    private double unitaryPrice;
    private double orderingUnitaryCost;
    private double storingUnitaryCost;
    private double totalOrderingCost;
    private double totalStoringCost;
    private double totalUnitsCost;
    private int unitsToStore;
    private double totalCost;
    private int timesToOrder;
    private double prizePrice;
    private String name;
    

    public Inventory(int expectedDemand, double unitaryPrice, double orderingCost, double storingCost, String name) {
        this.expectedDemand = expectedDemand;
        this.unitaryPrice = unitaryPrice;
        this.orderingUnitaryCost = orderingCost;
        this.storingUnitaryCost = storingCost;
        this.unitsToStore = 0;
        this.prizePrice = 0;
        this.name = name;
    }

    public Inventory(int expectedDemand, double unitaryPrice, double orderingUnitaryCost, double storingUnitaryCost, int unitsToStore, double prizePrice, String name) {
        this.expectedDemand = expectedDemand;
        this.unitaryPrice = unitaryPrice;
        this.orderingUnitaryCost = orderingUnitaryCost;
        this.storingUnitaryCost = storingUnitaryCost;
        this.unitsToStore = unitsToStore;
        this.prizePrice = prizePrice;
        this.name = name;
    }
    
    
    public Inventory()   {
        this.expectedDemand = 0;
        this.unitaryPrice = 0;
        this.orderingUnitaryCost = 0;
        this.storingUnitaryCost = 0;
        this.unitsToStore = 0;
        this.prizePrice = 0;
        this.name = "";
    }

    public int getExpectedDemand() {
        return expectedDemand;
    }

    public void setExpectedDemand(int expectedDemand) {
        this.expectedDemand = expectedDemand;
    }

    public double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public double getOrderingUnitaryCost() {
        return orderingUnitaryCost;
    }

    public void setOrderingUnitaryCost(double orderingUnitaryCost) {
        this.orderingUnitaryCost = orderingUnitaryCost;
    }

    public double getStoringUnitaryCost() {
        return storingUnitaryCost;
    }

    public void setStoringUnitaryCost(double storingUnitaryCost) {
        this.storingUnitaryCost = storingUnitaryCost;
    }

    public int getUnitsToStore() {
        return unitsToStore;
    }
    
    public void setUnitsToStore(int unitsToStore) {
        this.unitsToStore = unitsToStore;
    }

    public double getTotalOrderingCost() {
        return totalOrderingCost;
    }

    public void setTotalOrderingCost(double totalOrderingCost) {
        this.totalOrderingCost = totalOrderingCost;
    }

    public double getTotalStoringCost() {
        return totalStoringCost;
    }

    public void setTotalStoringCost(double totalStoringCost) {
        this.totalStoringCost = totalStoringCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalUnitsCost() {
        return totalUnitsCost;
    }

    public void setTotalUnitsCost(double totalUnitsCost) {
        this.totalUnitsCost = totalUnitsCost;
    }
    public int getTimesToOrder() {
        return timesToOrder;
    }

    public void setTimesToOrder(int timesToOrder) {
        this.timesToOrder = timesToOrder;
    }

    public double getPrizePrice() {
        return prizePrice;
    }

    public void setPrizePrice(double prizePrice) {
        this.prizePrice = prizePrice;
    }
    
    public double[] getData() {
        return new double[]{totalCost, prizePrice, (totalCost - prizePrice)};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inventory{" + "expectedDemand=" + expectedDemand + ", unitaryPrice=" + unitaryPrice + ", orderingUnitaryCost=" + orderingUnitaryCost + ", storingUnitaryCost=" + storingUnitaryCost + ", totalOrderingCost=" + totalOrderingCost + ", totalStoringCost=" + totalStoringCost + ", totalUnitsCost=" + totalUnitsCost + ", unitsToStore=" + unitsToStore + ", totalCost=" + totalCost + ", timesToOrder=" + timesToOrder + '}';
    }
    
    
}
