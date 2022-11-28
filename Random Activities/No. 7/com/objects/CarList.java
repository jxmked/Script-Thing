package com.objects;

public class CarList {
    public CarList(){

    }

    /**
     * Create Array list for 
     *    
     * String brand
     * String model
     * String type
     * String color
     * String torque
     * String engine
     * float price
     * int id
     * 
     */
    // Btw. I Found it!!!!
    public static CarObject[] carList = new CarObject[20];

    /**
     * Add method to add new car to the list
     * 
     * Note: 
     *  While Inserting, sort the Array according to Model
     *  to fullfill the `In displaying the list of cars, 
     *  it should be sorted ascending according to model`
     *  
     */
    public static boolean add_item(CarObject new_car) {
        carList[length()] = new_car;



        return false;
    }
    
    /**
     * Delete method to delete car from the list by ID
     */

    
     /**
      * Get Length
      */
    public static int length() {
        // Check if ID does exists
        int counted = 0;

        for(int index = 0; index < carList.length; index++) {
            try {
                if(! String.valueOf(carList[index].id).isEmpty()) {
                    counted++;
                }
            }catch(Exception e) {}
        }
        
        return counted;
    }

    
    public static boolean has(int id) {
        for(int index = 0; index < carList.length; index++) {
            try {
                if((! String.valueOf(carList[index].id).isEmpty()) && carList[index].id == id) {
                    return true;
                }
            }catch(Exception e) {}
        }

        return false;
    } 
}
