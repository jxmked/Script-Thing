package com.methods;

import com.objects.CarList;

public class Delete extends com.global.BasicInputs {

    public Delete() {
        if(CarList.length() <= 0) {
            clrscr();
            print("No item to delete");
            print("Press enter to back");
            inStr();
            return;
        }

        while (print_ui()) {}
    }

    public static boolean print_ui() {
        clrscr();

        print("Select an ID of a car to delete.");

        int car_list_length = CarList.length();

        for (int i = 0; i < car_list_length; i++) {
            print("");
            Print.print_car(CarList.carList[i]);
        }

        int input = get_id();

        if (input == 0)
            return false; // Exit

        confirm_deletion(input);

        return true; // Rerun
    }

    /**
     * Display car specification to check if the selected car
     * is correct and confirm to delete
     * 
     * @param id
     * @return void
     */
    public static void confirm_deletion(int id) {
        clrscr();

        print("Are you sure to delete this car?");
        print("");

        try {
            Print.print_car(CarList.get_car_by_id(id));
        } catch (Exception e) {
            print("Car ID not found");
            return;
        }

        print("");

        if (Confirm("Confirm")) {
            CarList.delete(id); // Delete by ID
        }
    }

    /**
     * Get valid input or exit to main menu
     * 
     * @return 0 to exit
     * @return id to confirm the deletion
     */
    public static int get_id() {
        int input;

        do {
            print("");
            print("Car ID to delete or enter 0 to back: ");
            input = inInt();

            if (input == 0)
                return 0;

            if (CarList.has(input))
                return input;

            print("Please, enter a valid input.");
            print("");

        } while (true);
    }
}
