package com.global;

public class displayMenu extends com.global.BasicInputs {

    private int __response;

    /**
     * Display a list of selection and accepts and validate an input
     * 
     * @param menus
     */
    public displayMenu(String menus[]) {

        int menu_length = menus.length;

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
            this.__response = inInt();
        } while (this.__response < 1 || this.__response > menu_length);
    }

    /**
     * Get the response from displayMenu
     * 
     * @return integer
     */
    public int response() {
        return this.__response;
    }

}
