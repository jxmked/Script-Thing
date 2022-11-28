package com.methods;

import com.objects.CarList;
import com.objects.CarObject;

public class Print extends com.global.BasicInputs {

    public Print() {
        clrscr();

        if(CarList.length() <= 0) {
            print("No item to display");
            print("Press enter to back");
            inStr();
            return;
        }

        int car_list_length, i;
        car_list_length = CarList.length();
        
        print("List of available cars.");
        print(String.format("Displaying item %d out of %d", car_list_length, CarList.carList.length));

        for (i = 0; i < car_list_length; i++) {
            print("");
            print_car(CarList.carList[i]);
        }

        print("");
        print("Press enter to go back to menu");

        inStr();
    }

    /**
     * Preview a single CarObject
     * 
     * @param carObject
     */
    public static void print_car(CarObject carObject) {

        String model = carObject.model;
        String brand = carObject.brand;
        String type = carObject.type;
        String color = carObject.color;
        String torque = carObject.torque;
        String engine = carObject.engine;
        int id = carObject.id;
        float price = carObject.price;

        print(String.format("Car ID: %d", id));
        print(String.format("  Brand: %s", brand));
        print(String.format("  Model: %s", model));
        print(String.format("  Color: %s", color));
        print(String.format("  Type: %s", type));
        print(String.format("  Engine: %s", engine));
        print(String.format("  Torque: %s", torque));
        print(String.format("  Price: ₱%s", format_price(price)));
    }

    /**
     * Reverse the string
     * 
     * @param str
     * @return string
     */
    public static String rev_str(String str) {
        int str_len = str.length();
        String new_str = "";

        for (int i = str_len - 1; i >= 0; i--) {
            new_str = String.format("%s%s", new_str, str.charAt(i));
        }

        return new_str;
    }

    /**
     * Format floating price value
     * -- Good looking --
     * 
     * @param price
     * @return
     */
    public static String format_price(float price) {

        if (price == 0) {
            return "0.00";
        }

        String num, // Integer string
                rev_str, // Integer string reversed
                formatted_rev = "", // Integer string with formatted commas
                str_price; // Float String

        // Convert float to string. Use format to prevent
        // Sacrificing Precision
        str_price = String.format("%f", price);

        // Get the index of decimal
        // We're trimming it out
        final int dec_index = str_price.indexOf(".");

        // Remove decimal value
        num = str_price.substring(0, dec_index);
        final int num_length = num.length();

        if (num_length <= 3) {
            return String.format("%s%s", num, str_price.substring(num_length, num_length + 3));
        }

        // Reverse string
        rev_str = rev_str(num);

        // Add commas
        for (int i = 0; i < num_length; i += 3) {
            try {
                String sample = rev_str.substring(i, ((i + 3) >= num_length) ? num_length : i + 3);

                if (i == 0) {
                    formatted_rev = sample;
                    continue;
                }

                formatted_rev = String.format("%s,%s", formatted_rev, sample);
            } catch (Exception e) {
            }
        }

        return String.format("%s%s", rev_str(formatted_rev), str_price.substring(num_length, num_length + 3));
    }

}
