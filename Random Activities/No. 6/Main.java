
// import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;



public class Main {
    
    
    public static void main(String[] args) {
        
        // Define variables
        int row, column, row_index, column_index;
        
        // Get row 
        System.out.println("Enter row length of an array: ");
        row = inInt();
        
        // Get column
        System.out.println("Enter column length of an array: ");
        column = inInt();
        
        // Enter array elements
        System.out.println(String.format("Enter %d elements to store in array:", row * column));
        
        
        // Define 2d array
        int[][] array = new int[row][column];

        // Fill array
        // Row
        for(row_index = 0; row_index < row; row_index++) {
            
            // Column
            for(column_index = 0; column_index < column; column_index++) {
                // Get input the store to array
                array[row_index][column_index] = inInt();
            }
        }
        
        
        System.out.println("");
        
        // Print 2d array
        for(row_index = 0; row_index < row; row_index++) {
            for(column_index = 0; column_index < column; column_index++) {
                System.out.println(String.format("Row[%d]: Column[%d]: %d", row_index, column_index, array[row_index][column_index]));
            }
        }
        
        System.out.println("");
        
        
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