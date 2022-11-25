
package com.methods;

import com.global.BasicInputs;
import com.global.Storage;
import com.objects.CarObject;

public class Add extends BasicInputs {
    
    
    public CarObject carList[] = Storage.carList;
    
    CarObject myCarObject = new CarObject();
    
    /*
    public String brand;
    public String model;
    public String type;
    public String color;
    public String torque;
    public String engine;
    
    public float price;
    
    public int id;
    
    */
    
    public Add() {
        clrscr();
        print("Add new Car.");
        print("Please, fill up the form.");
        
        this.get_model();
        
    }
    
    
    
    
    public void generate_id() {
        int len = 4; // Length of an ID
        
        int index;
        
        for(index = 0; index < len; index++) {
            
        }
    }
    /**
     * Get and validate inputs
     * */
    
    public void get_price() {
        float num;
        
        do {
            print("Price of the car: ");
            num = inFloat();
        } while(num < 0.5);
         
        this.myCarObject.price = num;
    }
    
    public void get_engine() {
        this.myCarObject.engine = this.get_validated_input("Engine of a car: ");
    }
    
    public void get_torque(){
        this.myCarObject.torque = this.get_validated_input("Torque of a car: ");
    }
    
    public void get_color() {
        this.myCarObject.color = this.get_validated_input("Color of a var: ");
    }
    
    public void get_type() {
        this.myCarObject.type = this.get_validated_input("Type of a car: ");
    }
    
    public void get_brand() {
        this.myCarObject.brand = this.get_validated_input("Brand of a car: ");
    }
    
    public void get_model() {
        this.myCarObject.model = this.get_validated_input("Model of a car: ");
    }
    
    private String get_validated_input(String placeholder) {
        String str;
        do {
            print(placeholder);
            str = inStr();
            
            str = str.trim();
        } while(str.isEmpty());
        
        return str;
    }
}