
package com.global;


/**
 * Optional Impors
 * */
import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;


public class BasicInputs {
    
    
    /**
     * My terminal sometimes fail to use command as input.
     * 
     * */
    
    /**
     * Close this after using it.
     */
    public static Scanner scanner = new Scanner(System.in);
    
    /**
     * System.out.println Shorthand. =)
     * */
    public static void print(String str) {
        System.out.println(str);
        System.out.flush();
    }
    
    public static void print(int num) {
        System.out.println(num);
        System.out.flush();
    }
    
    public static void print(Boolean num) {
        System.out.println(num);
        System.out.flush();
    }
    public static boolean Confirm(String str) {
        print(str);
        
        while(true) {
            print("\n[Y/n]: ");
            switch(inChar()){
              case 'y':
              case 'Y':
                return true;
                
              case 'n':
              case 'N':
                return false;
            }
        }
    }
    
    public static void clrscr() {
        /**
         * From Stackoverflow and has been modified
         * */
        
        try {
            // final String os = System.getProperty("os.name");

            // if (os.contains("Windows")) {
            //    // Deprecated 
            //     Runtime.getRuntime().exec("cls");
            // } else {
            //    // Deprecated
            //     Runtime.getRuntime().exec("clear");
            //     // Works on my terminal
            //     print("\033\143"); //For Linux
            // }
            
            for(int lines = 0; lines < 20; lines++) {
                print("");
            }
        } catch (final Exception e) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch(Exception err){}
        }
    }
    
    public static float inFloat() {
        while(true) {
            try {
                return Float.parseFloat(BasicInputs.inStr());
            } catch(Exception e) {
                // e.printStackTrace();
            }
        }
    }
    
    public static int inInt(){
        while(true){
            try {
                return Integer.parseInt(BasicInputs.inStr());
            } catch(Exception e){
                //e.printStackTrace();
            }
        }
    }
    
    public static char inChar(){
        return inStr().charAt(0);
    }
    
    public static String inStr(){
        
        String str = null;
        try {
            /**
             * If one of the input doesn't work, you can select
             * another methods.
             * 
             * Note: Uncomment the library/package first.
             * */
            // For outside of an IDE.
            // A
            // str = String.valueOf(System.console().readLine());
            
            // For others
            // B
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // str = String.valueOf(br.readLine());

            //str = String.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
            
            // C
        
            
            while(scanner.hasNextLine()) {
                str = scanner.nextLine();
                return str;
            }        
        
        } catch(Exception e){
            e.printStackTrace();
            print("Something went wrong.");
            System.exit(0);
        }
        
        return str;
    }
    
}

