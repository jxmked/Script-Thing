package com.CarMenu;

import com.global.displayMenu;
import com.methods.Add;
import com.methods.Delete;
import com.methods.Print;

public class Car extends com.global.BasicInputs {
    
    public Car() {
        /** Constructor **/
        String menus[] = {
            "Add Car",
            "Delete Car",
            "Display List of Cars",
            "Exit Program"
        };
        
        displayMenu res;
        
        while(true) {
            clrscr();
            
            print("Welcome to Car Selection Program");
            print("\nPlease, select a program to proceed.\n");
            
            res = new displayMenu(menus);
            
            switch(res.response()) {
                case 1: // Add car
                    new Add(); // Add Car
                    break;
                
                case 2: // Delete car
                    new Delete();
                    break;
                    
                case 3: // Display list of cars 
                    new Print();
                    break;
                
                case 4: // Exit 
                    
                    // Confirm
                    if( Confirm("\nProceed to exit?")) {
                        
                        print("\nThanks for using our program.\nExit.");
                        
                        System.exit(0);
                    }
                    
                    break;
            }
        }
        
    }
}

