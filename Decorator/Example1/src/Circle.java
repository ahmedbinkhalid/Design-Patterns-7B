/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
public class Circle implements Shape {
    private double price;
    
    public Circle(double price){
        this.price = price;
    }

    @Override
    public void draw() {
        double totalCost = computeCost();
        System.out.println("Shape: Circle, Cost: " + totalCost);
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    private double computeCost() {
        return getPrice();
    }
   
}
