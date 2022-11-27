package com.CarMenu;

import com.objects.CarList;
import com.objects.CarObject;

public class Main extends com.global.BasicInputs {

    public static void main(String[] args) {
        atexit();

        /**
         * Feed CarList with sample data
         */
        feed_sample_data();
        print(CarList.length());
        //new com.CarMenu.Car();

    }

    public static void feed_sample_data() {
        
        CarObject[] sample_data = CarList.carList;

        sample_data[0] = new CarObject();
        sample_data[0].brand = "carObject";
        sample_data[0].model = "Vios GR-S";
        sample_data[0].color = "Red";
        sample_data[0].engine = "Dual VVT-I, 4-Cylinder In-Line - DOHC 16V EFI";
        sample_data[0].type = "Sedan";
        sample_data[0].id = com.methods.Add.generate_id();
        sample_data[0].price = 1035000;
        sample_data[0].torque = "140Nm";

        sample_data[1] = new CarObject();
        sample_data[1].brand = "Honda";
        sample_data[1].model = "1.5 VX CVT Honda SENSING";
        sample_data[1].color = "Lunar Silver Metallic";
        sample_data[1].engine = "1.5L i-VTEC DOHC In-line 4-cylinder";
        sample_data[1].type = "Station Wagon";
        sample_data[1].id = com.methods.Add.generate_id();
        sample_data[1].price = 1390000;
        sample_data[1].torque = "145Nm";

        sample_data[2] = new CarObject();
        sample_data[2].brand = "Nissan";
        sample_data[2].model = "3.7L Premium MT";
        sample_data[2].color = "Red";
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
