package com.CarMenu;

import com.global.BasicInputs;

public class Main {
    
    public static void main(String[] args) {
        atexit();
        new Car();
    }

    public static void atexit() {
        // Call before exit
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                /**
                 * Close before exiting the program
                 */
                BasicInputs.scanner.close();
                BasicInputs.print("Program Ended.");
            }
        }));
    }
    
}
