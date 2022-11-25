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
        char res;
        while(true) {
            print("\n[Y/n]: ");
            
            res = inChar();
            
            if(String.valueOf(res).trim().isEmpty()) {
                continue;
            }

            switch(res){
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
            final String os = System.getProperty("os.name");
            ProcessBuilder processBuilder = new ProcessBuilder();
            
            if (os.contains("Windows")) {
                processBuilder.command("cls||clear");
            } else {
                // Works on my terminal
                // System.out.print("\033\143"); //For Linux
                // ---- or ----
                // https://stackoverflow.com/questions/2979383/how-to-clear-the-console
                // System.out.print("\033[H\033[2J");  
                // System.out.flush(); 
                // ---- or ----
                processBuilder.command("clear");
            }
            
            processBuilder.start();
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
        String str;

        do {
            str = inStr();

            if(str == null)
                System.exit(0);
            
            str.trim();
        } while(str.isEmpty());
        
        return str.charAt(0);

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

