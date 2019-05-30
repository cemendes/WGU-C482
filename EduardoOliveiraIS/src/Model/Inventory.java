/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Eduardo Oliveira
 */
public class Inventory {
    
    //Defining properties
    Product[] products = new Product[10];
    Part[] allParts = new Part[10];

    public Inventory() {
    }
    
    public void addProduct(int productID, String name, double price, int inStock, int min, int max) {
        Product p = new Product(productID, name, price, inStock, min, max);
        System.out.println(p);
        
    }

    @Override
    public String toString() {
        return "Inventory{" + "products=" + products + ", allParts=" + allParts + '}';
    }

}
