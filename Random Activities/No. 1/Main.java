
// import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class Main {
    
    
    public static void main(String[] args) {
        
        clrscr();
        System.out.println("Welcome\n");
        
        if(Confirm("Do you want to continue?") == false){
            System.out.println("Ended");
            System.exit(0);
        }
        
        while(true){
            switch(Menu()){
              case 1:
                // Display Multiplication Table
                int n = 10;
                
                do {
                    clrscr();
                    System.out.println("Multiplication Table (1-10)");
                    System.out.println("Printing...\n");
                    
                    for(int i = 1;i <= n;i++){
                        for(int j = 1;j <= 10;j++){
                            System.out.println(String.format("%d * %d = %d", i, j, i * j));
                        }
                        System.out.println("*-*~*-*~*-*~*-*~*-*~*-*~*-*~*-*\n");
                    }
                } while(Confirm("\nGo back to main menu?") == false);
              break;
                
              case 2:
                // Check if number is Even or Odd
                int num;
                String res;
                
                do {
                    clrscr();
                    
                    System.out.println("Check if the number is even or odd");
                    
                    System.out.print("Enter a number: ");
                    num = inInt();
                    
                    if(num <= 0){
                        continue;
                    }
                    
                    res = (num % 2 == 0) ? "Even" : "Odd";
                    
                    System.out.println(String.format("\nNumber %d is %s", num, res));
                    
                } while(Confirm("\nGo back to main menu?") == false);
              break;
                
              case 3:
                // Display a Pyramid with 10 layers of asterisk
                
                do {
                    clrscr();
                    System.out.println("Pyramid with 10 layers of asterisk\n");
                    
                    for(int i = 1; i <= 10; i++){
                        for(int j = 0; j < (10 - i); j++){
                            System.out.print(" ");
                        }
                        
                        for(int k = 0; k < i; k++){
                            System.out.print("* ");
                        }
                        
                        System.out.println("");
                    }
                    
                } while(Confirm("\nGo back to main menu?") == false);
              break;
                
              case 4:
                if(Confirm("\nDo you want to exit?")){
                    System.out.println("Ended");
                    System.exit(0);
                }
              break;
            }
        } 
    }
    
    public static int Menu(){
        /** Menu **/
        clrscr();
        
        System.out.println("Choose a program to run.");
        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("A. Display Multiplication Table (1-10) Created Using Nested Looping");
        System.out.println("B. Identifying an Inputted Number if Odd or Even");
        System.out.println("C. Displaying a Pyramid with 10 Layers using the Asterisk Symbol");
        System.out.println("D. Exit the program");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*\n");
        
        char[] letters = { 'a', 'b', 'c', 'd' };
        char nl;
        while(true){
            System.out.print("Letter: ");
            
            nl = Character.toLowerCase(inChar());
                
            for(int i = 0; i < letters.length; i++){
                if(nl == letters[i]){
                    return i + 1;
                }
            }
        }
    }
    
    public static boolean Confirm(String str) {
        System.out.print(str);
        
        while(true) {
            System.out.print("\n[Y/n]: ");
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
            final String os = System.getProperty("os.name");
                
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
                // Works on my terminal
                System.out.print("\033\143"); //For Linux
            }
        } catch (final Exception e) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch(Exception err){}
        }
    }
    
    public static int inInt(){
        while(true){
            try {
                return Integer.parseInt(inStr());
            } catch(Exception e){
                // e.printStackTrace();
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
            str = String.valueOf(System.console().readLine());
            
            /** For others
            // B
            str = String.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
            
            // C
            Scanner sc = new Scanner(System.in, "UTF-8");
            str = String valueOf(sc.readLine());
            sc.close();
            */
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong.");
            System.exit(0);
        }
        return str;
    }
}

/**
 * Written by Jovan De Guia
 * Github Username: Jxmked
 * */