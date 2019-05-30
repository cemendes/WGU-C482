/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Eduardo
 */
public class Inhouse extends Part {
    
    //Setting property
    int machineID;

    //Constructor
    public Inhouse(int machineID, int partID, String name, double price, int inStock, int min, int max) {
        super(partID, name, price, inStock, min, max);
        this.machineID = machineID;
    }
    
    //Getters and setters
    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
    
    
    
    
}
