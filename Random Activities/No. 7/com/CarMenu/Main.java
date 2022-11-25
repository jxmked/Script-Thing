package com.CarMenu;

public class Main extends com.global.BasicInputs {

    public static void main(String[] args) {
        atexit();
        new com.CarMenu.Car();

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
