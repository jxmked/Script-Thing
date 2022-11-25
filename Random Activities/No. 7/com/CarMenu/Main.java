// @Package - Car Menu

package com.CarMenu;

import com.CarMenu.*;

import com.tools.BasicInputs;

import com.Objects.CarObject;


public class Main {

    public CarObject Car_List[];
    
    
    public static void main(String[] args) {
        System.out.println("Welcome to Car Selection Program");
        System.out.println("\nPlease, select a program to proceed.\n");
        
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
                        
                        System.out.println("\nThanks for using our program.\n Exit.");
                        
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
        
        System.out.println(border);
        
        // Print Menus
        for (int index = 0; index < menu_length; index++) {
            System.out.println(String.format("%d. %s", index + 1, menus[index]));
        }
        
        System.out.println(border);
        
        System.out.println("Select program above");
        
        // Keep running until we get valid integer input
        do {
            current_selected = BasicInputs.inInt();
        } while(current_selected < 1 || current_selected > menu_length);
        
        return current_selected;
    }
}