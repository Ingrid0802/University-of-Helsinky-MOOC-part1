/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity){
        price = initialPrice;
        quantity = initialQuantity;
        name = initialName;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
