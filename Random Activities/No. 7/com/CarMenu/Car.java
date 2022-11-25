

package com.CarMenu;

import com.global.BasicInputs;
import com.global.displayMenu;
import com.global.Storage;
import com.objects.CarObject;

import com.methods.Add;

public class Car extends BasicInputs {
    
    public Car() {
        /** Constructor **/
        clrscr();
        
        print("Welcome to Car Selection Program");
        print("\nPlease, select a program to proceed.\n");
        
        String menus[] = {
            "Add Car",
            "Delete Car",
            "Display List of Cars",
            "Exit Program"
        };
        
        displayMenu res;
        
        while(true) {
            res = new displayMenu(menus);
            
            switch(res.response()) {
                case 1: // Add car
                    new Add(); // Add Car
                    break;
                
                case 2: // Delete car
                    break;
                    
                case 3: // Display list of cars 
                    break;
                
                case 4: // Exit 
                    
                    // Confirm
                    if( BasicInputs.Confirm("\nProceed to exit?")) {
                        
                        print("\nThanks for using our program.\nExit.");
                        
                        System.exit(0);
                    }
                    
                    break;
            }
        }
        
        
        
    }
}

