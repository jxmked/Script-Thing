package com.objects;

/**
 * Everytime the array has been modified, 
 * We need to defragment it and sort to meet 
 * the visual expectation.
 * */
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
    
    public static CarObject[] carList = new CarObject[20];

    /**
     * Add method to add new car to the list
     */
    public static boolean add_item(CarObject new_car) throws Exception {
        int index = length();
        
        if(index >= carList.length) {
            throw new Exception("No empty slots");
        }
        
        if(index == 0) {
            carList[index] = new_car;
            return true;
        }
        
        // Check if the CarObject array has empty slots in between
        
        /**
         * This thing can be a problem if the size of the array
         * is too large. 
         * */
        int num = 0;
        
        while(true) {
            if(num >= carList.length) throw new Exception("No available slots");
            
            try {
                if(! String.valueOf(carList[num].id).isEmpty()){
                    num++;
                }
            } catch(Exception e) {
                break;
            } 
        }
        
        carList[num] = new_car;
        sort();
        return true;
        
    }
    
    /**
     * Delete method to delete car from the list by ID
     */
    public static boolean delete(int id) {
            
         // look for id 
        for(int index = 0; index < carList.length; index++) {
            try {
                if(! String.valueOf(carList[index].id).isEmpty() && carList[index].id == id) {
                    carList[index] = null;
                    
                    defragment();
                    sort();
                    
                    return true;
                }
            }catch(Exception e) {}
        }
        
        return false;
    }
    
    public static CarObject get_car_by_id(int id) throws Exception{
        
        for(int index = 0; index < carList.length; index++) {
            try {
                if(! String.valueOf(carList[index].id).isEmpty() && carList[index].id == id) {
                    return carList[index];
                }
            }catch(Exception e) {}
        }
        
        throw new Exception("ID not found");
    }
    
    /**
     * Get Length
     */
    public static int length() {
        
        int counted = 0, index;
        
        for(index = 0; index < carList.length; index++) {
            try {
                /**
                 * Check if ID does exists to confirm that
                 * that index of an array is not empty
                 * */
                if(! String.valueOf(carList[index].id).isEmpty()) {
                    counted++;
                }
            }catch(Exception e) {}
        }
        
        return counted;
    }
    
    public static void defragment() {
        /**
         * Remove empty array in between
         * 
         * Moving objects close together to those gaps
         * */
        CarObject[] temp = new CarObject[carList.length];
        
        int new_index = 0, index;
        
        for(index = 0; index < carList.length; index++) {
            try {
                if(! String.valueOf(carList[index].id).isEmpty()) {
                    temp[new_index] = carList[index];
                    new_index++;
                }
            }catch(Exception e) {}
        }
        
        // Overwrite old data
        carList = temp;
    }
    
    public static void sort() {
        
        defragment();
        
        int len, i, j;
        
        CarObject[] sample = CarList.carList;
        len = CarList.length();
        
        CarObject temp;
        
        // Bubble sort
        for(i = 0; i < len - 1; i++) {
            for (j = i + 1; j < len; j++) {
                if(sample[i].model.toUpperCase().compareTo(sample[j].model.toUpperCase()) > 0) {
                    temp = sample[i];  
                    sample[i] = sample[j];  
                    sample[j] = temp;  
                }
            }
        }
    }
    
    public static boolean has(int id) {
        /**
         * Check if ID does exists 
         * */
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
