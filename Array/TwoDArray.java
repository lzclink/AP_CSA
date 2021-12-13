public class TwoDArray {
    public static void main (String args[]){
        int[][] table = new int[5][10]; // create a 2-D array of 5 rows and 10 columns
        // load some values inside the array
        
        for (int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                table[row][col] = row * 10 + col;
            }
        }
        
        //print the array
        for (int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                System.out.print(table[row][col] + "\t");
            }
            System.out.println(); // empty line after each row
        }
    }
}