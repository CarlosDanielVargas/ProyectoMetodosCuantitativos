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
    private int optimalQuantity;
    private int extraUnits;
    private double totalCost;
    private int timesOrdered;
    

    public Inventory(int expectedDemand, double unitaryPrice, double orderingCost, double storingCost, int extraUnits) {
        this.expectedDemand = expectedDemand;
        this.unitaryPrice = unitaryPrice;
        this.orderingUnitaryCost = orderingCost;
        this.storingUnitaryCost = storingCost;
        this.extraUnits = extraUnits;
        this.optimalQuantity = 0;
    }

    public Inventory(int expectedDemand, double unitaryPrice, double orderingCost, double storingCost) {
        this.expectedDemand = expectedDemand;
        this.unitaryPrice = unitaryPrice;
        this.orderingUnitaryCost = orderingCost;
        this.storingUnitaryCost = storingCost;
        this.optimalQuantity = 0;
        this.extraUnits = 0;
    }
    
    
    
    public Inventory()   {
        this.expectedDemand = 0;
        this.unitaryPrice = 0;
        this.orderingUnitaryCost = 0;
        this.storingUnitaryCost = 0;
        this.optimalQuantity = 0;
        this.extraUnits = 0;
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

    public int getOptimalQuantity() {
        return optimalQuantity;
    }
    
    public void setOptimalQuantity(int optimalQuantity) {
        this.optimalQuantity = optimalQuantity;
    }

    public int getExtraUnits() {
        return extraUnits;
    }

    public void setExtraUnits(int extraUnits) {
        this.extraUnits = extraUnits;
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
    public int getTimesOrdered() {
        return timesOrdered;
    }

    public void setTimesOrdered(int timesOrdered) {
        this.timesOrdered = timesOrdered;
    }
}
