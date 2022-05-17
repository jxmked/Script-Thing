
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
                        
                        for(int i = 1; i <= n; i++){
                            for(int j = 1; j <= 10;j++){
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
                        
                        System.out.println("Enter a number: ");
                        num = inInt();
                        
                        if(num <= 0){
                            continue;
                        }
                        
                        if(num % 2 == 0){
                            res = "Even";
                        }else{
                            res = "Odd";
                        }
                        
                        System.out.println(String.format("Number %d is %s", num, res));
                            
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
        
        do {
            System.out.print("Letter: ");
            
            char nl = Character.toLowerCase(inChar());
                
            for(int i = 0; i < letters.length; i++){
                if(nl == letters[i]){
                    return i + 1;
                }
            }
        } while(true);
    }
    
    public static boolean Confirm(String str) {
        System.out.print(str);
        
        do {
            try{
                System.out.print("\n[Y/n]: ");
                switch(inChar()){
                    case 'y':
                    case 'Y':
                        return true;
                        
                    case 'n':
                    case 'N':
                        return false;
                }
            } catch(Exception err) {}
        } while(true);
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
                String str; 
                // For outside of an IDE
                str = String.valueOf(System.console().readLine());
                
                /** For others
                // str = String.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
                
                Scanner sc = new Scanner(System.in, "UTF-8");
                str = String.valueOf(sc.readLine());
                sc.close();
                * */ 
                
                return Integer.parseInt(str);
            } catch(Exception e){
                // e.printStackTrace();
            }
        }
    }
    public static char inChar(){
        
        // For outside of an IDE
        return System.console().readLine().charAt(0);
        
        /** For others
        // return new BufferedReader(new InputStreamReader(System.in)).readLine().charAt(0);
        
        Scanner sc = new Scanner(System.in, "UTF-8");
        char res = sc.readLine().charAt(0);
        sc.close();
        return res; */
        
    }
}

/**
 * Written by Jovan De Guia
 * Github Username: Jxmked
 * */