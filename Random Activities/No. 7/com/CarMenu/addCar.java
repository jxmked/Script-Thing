package com.CarMenu;


import com.Objects.CarObject;
import com.CarMenu.addMethod;


public class addCar extends addMethod {
    
    /**
     * 
     * Add Car to the array list
     * 
     * */
     
    private CarObject car_list[];
    
    public addCar(CarObject car_list[]) {
        this.car_list = car_list;
        
        
        System.out.println(Data);
        //this.header();
        
    }
    
    
    public static void header() {
        // Some decorations
        System.out.println("\n\n\n");
        System.out.println("Add Car Program");
        System.out.println("\n");
        
        
    }
    
    
    
    
    
}  



