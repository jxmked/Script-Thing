



public class Main {
    
    
    public static void main(String[] args) {
        
        // Define variables
        int row, column, row_index, column_index;
        
        // Get Row 
        System.out.println("Enter row length of an array: ");
        row = inInt();
        
        // Get Column
        System.out.println("\nEnter column length of an array: ");
        column = inInt();
        
        // Define 2d Array
        int array[][] = new int[row][column];
        
        
        // Get array values
        System.out.println(String.format("\nEnter %d elements to store in array:", row * column));
        
        // Row
        for (row_index = 0; row_index < row; row_index++) {
            //Column
            for (column_index = 0; column_index < column; column_index++) {
                // Get input
                array[row_index][column_index] = inInt();
            }
        }
        
        
        // Print 2d Array
        
        System.out.println("");
        
        // Row
        for (row_index = 0; row_index < row; row_index++) {
            //Column
            for (column_index = 0; column_index < column; column_index++) {
                // Print
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