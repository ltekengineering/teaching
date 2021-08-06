/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class22;

/**
 *
 * @author lkhan
 */
public class Cars {

    private String make;
    private String model;
    private int year;
    private int milage;
    private String fuelType;
    
    //Constructor with just the empty constructor
    public Cars(){
        
    }

// Constructor with year, make and model
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
//Constructor with all variables
    public Cars(String make, String model, int year, int milage, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milage = milage;
        this.fuelType = fuelType;
    }
    //All Mutators
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    //All Accessors
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMilage() {
        return milage;
    }

    public String getFuelType() {
        return fuelType;
    }

}
