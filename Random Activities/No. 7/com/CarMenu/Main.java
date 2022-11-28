package com.CarMenu;

import com.objects.CarList;
import com.objects.CarObject;

public class Main extends com.global.BasicInputs {

    public static void main(String[] args) {
        // atexit();

        /**
         * Feed CarList with sample data
         */
        feed_sample_data();

        CarList.defragment();
        CarList.sort();

        /**
         * Start main menu
         */
        new com.CarMenu.Car();

        scanner.close();
    }

    public static void feed_sample_data() {

        CarObject[] sample_data = CarList.carList;

        sample_data[0] = new CarObject();
        sample_data[0].brand = "Toyota";
        sample_data[0].model = "Vios GR-S";
        sample_data[0].color = "Red";
        sample_data[0].engine = "Dual VVT-I, 4-Cylinder In-Line - DOHC 16V EFI";
        sample_data[0].type = "Sedan";
        sample_data[0].id = com.methods.Add.generate_id();
        sample_data[0].price = 1035000;
        sample_data[0].torque = "140Nm";

        /**
         * To test defragmenting and sorting
         */
        sample_data[3] = new CarObject();
        sample_data[3].brand = "Honda";
        sample_data[3].model = "BR-V";
        sample_data[3].color = "Lunar Silver Metallic";
        sample_data[3].engine = "1.5L i-VTEC DOHC In-line 4-cylinder";
        sample_data[3].type = "Station Wagon";
        sample_data[3].id = com.methods.Add.generate_id();
        sample_data[3].price = 1390000;
        sample_data[3].torque = "145Nm";

        sample_data[2] = new CarObject();
        sample_data[2].brand = "Nissan";
        sample_data[2].model = "370Z";
        sample_data[2].color = "Passion Red";
        sample_data[2].engine = "3.7-liter, DOHC, 24-valve V6 (VQ37)";
        sample_data[2].type = "Sports Car";
        sample_data[2].id = com.methods.Add.generate_id();
        sample_data[2].price = 2779000;
        sample_data[2].torque = "363Nm";
    }

    public static void atexit() {
        // Call before exit
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                /**
                 * Close before exiting the program
                 */
                scanner.close();
                print("\n\nProgram Ended.");
            }
        }));
    }
}
