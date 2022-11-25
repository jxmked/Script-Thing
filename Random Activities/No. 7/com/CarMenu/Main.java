// @Package - Car Menu

package com.CarMenu;

import com.global.BasicInputs;
import com.global.Storage;
import com.objects.CarObject;

public class Main extends BasicInputs {
    
    public static void main(String[] args) {
        print("Welcome to Car Selection Program");
        print("\nPlease, select a program to proceed.\n");
        
        String menus[] = {
            "Add Car",
            "Delete Car",
            "Display List of Cars",
            "Exit Program"
        };
        
        int selected_menu;
        
        
        
        while(true) {
            switch(displayMenu(menus)) {
                case 1: // Add car
                    break;
                
                case 2: // Delete car
                    break;
                    
                case 3: // Display list of cars 
                    break;
                
                case 4: // Exit 
                    
                    // Confirm
                    if( BasicInputs.Confirm("\nProceed to exit?")) {
                        
                        print("\nThanks for using our program.\n Exit.");
                        
                        System.exit(0);
                    }
                    
                    break;
            }
        }
    }
    
    
    
    
    public static int displayMenu(String menus[]) {
        
        int menu_length = menus.length;
        int current_selected; 
        
        String border = "*~*~*~*~*~*~*~*~*~*~*";
        
        print(border);
        
        // Print Menus
        for (int index = 0; index < menu_length; index++) {
            print(String.format("%d. %s", index + 1, menus[index]));
        }
        
        print(border);
        
        print("Select program above");
        
        // Keep running until we get valid integer input
        do {
            
            current_selected = BasicInputs.inInt();
        } while(current_selected < 1 || current_selected > menu_length);
        
        return current_selected;
    }
}