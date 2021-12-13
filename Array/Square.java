import java.util.Scanner;
public class Square{
    int[][] square;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size){
        square=new int[size][size];
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row){
        int sumR=0;
        for(int i=0;i<square.length;i++){
            sumR+=square[row][i];
        }
        return sumR;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col){
        int sumC=0;
        for(int i=0;i<square.length;i++){
            sumC+=square[i][col];
        }
        return sumC;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag(){
        int sumD1=0;
        for(int i=0;i<square.length;i++){
            sumD1+=square[i][i];
        }
        return sumD1;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag(){
        int sumD2=0;
        for(int i=0;i<square.length;i++){
            sumD2+=square[i][square.length-i-1];
        }
        return sumD2;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic(){
        int index=0;
        int[] test=new int[square.length*square.length+2];
        for(int i=0;i<square.length;i++){
            test[index]=sumRow(i);
            index++;
            test[index]=sumCol(i);
            index++;
        }   
        test[index]=sumMainDiag();
        index++;
        test[index]=sumOtherDiag();
        int flag=test[0];
        for(int i=0;i<=index;i++){
            if(test[i]!=flag){
                return false;
            }
        }
        return true;
    }
    //--------------------------------------
    //read info into the square from the input stream associated with the 
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan){
        for(int i=0;i<square.length;i++){
            for(int j=0;j<square.length;j++){
                square[i][j]=scan.nextInt();
            }
        }
    }
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare(){
        for(int i=0;i<square.length;i++){
            for(int j=0;j<square.length;j++){
                System.out.print(square[i][j]+" ");
            }
            System.out.println();
        }
    }
}
