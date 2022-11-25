
package com.methods;

import com.global.BasicInputs;
import com.global.Storage;
import com.objects.CarObject;
import com.global.Helpers;

public class Add extends BasicInputs {
    
    
    public CarObject carList[] = Storage.carList;
    
    CarObject myCarObject = new CarObject();

    public Add() {
        clrscr();
        print("Add new Car.");
        print("Please, fill up the form.");
        
        this.get_brand();
        this.get_model();
        this.get_type();
        this.get_color();
        this.get_torque();
        this.get_engine();
        this.get_price();
        this.generate_id();
        
        print("\n");
        print("This car with this specification will be added to your list.");
        print("");
        
        print(String.format("Brand: %s", this.myCarObject.brand));
        print(String.format("Model: %s", this.myCarObject.model));
        print(String.format("Type: %s", this.myCarObject.type));
        print(String.format("Color: %s", this.myCarObject.color));
        print(String.format("Torque: %s", this.myCarObject.torque));
        print(String.format("Engine: %s", this.myCarObject.engine));
        print(String.format("Price: %.2f", this.myCarObject.price));
        print(String.format("Generated car ID: %s", this.myCarObject.id));
        print("");
        if(Confirm("Are you sure to add this car to your list?")) {
            
            print("Car has been added.");
            print("Press enter to continue...");
            inStr();
        }

        clrscr();
    }
    
    public void add_new_car(CarObject new_car) {
        
    }

    public void generate_id() {
        int len = 4; // Length of an ID
        
        int index, rand;
        
        String sb;
        while(true) {
            sb = ""; // String Builder
            
            for(index = 0; index < len; index++) {
                // Convert double into integer
                rand = (int) Math.round(Math.random() * 9);
                
                sb = String.format("%s%d", sb, rand);
            }
            
            try {
                this.myCarObject.id = Integer.parseInt(sb);
                break;
            } catch(Exception e) {
                
            }
        }
       
    }
    
    /**
     * Get and validate inputs
     * */
    
    public void get_price() {
        float num;
        
        do {
            print("");
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
        String res = this.get_validated_input("Color of a car: ");
        this.myCarObject.color = Helpers.ucfirst(res);
    }
    
    public void get_type() {
        String res = this.get_validated_input("Type of a car: ");
        this.myCarObject.type = Helpers.ucfirst(res);
    }
    
    public void get_brand() {
        String res = this.get_validated_input("Brand of a car: ");
        this.myCarObject.brand = Helpers.ucfirst(res);
    }
    
    public void get_model() {
        this.myCarObject.model = this.get_validated_input("Model of a car: ");
    }
    
    private String get_validated_input(String placeholder) {
        String str;
        do {
            print("");
            print(placeholder);
            
            str = inStr();
            str = str.trim();
        } while(str.isEmpty());
        
        return str;
    }
}
