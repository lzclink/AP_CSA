import java.util.Scanner;
import java.io.*;

public class SquareTest{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("C:/Users/15011/Desktop/CSA/In_Class/Array/magicData.txt"));
        int count = 1;
        int size = scan.nextInt();
        while(size!=-1){
            Square sq1=new Square(size);
            sq1.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            sq1.printSquare();
            for(int i=0;i<size;i++){
                System.out.println("rows "+(i+1)+": "+sq1.sumRow(i));
            }
            for(int i=0;i<size;i++){       
                System.out.println("columns "+(i+1)+": "+sq1.sumCol(i));
            }
            System.out.println("main diagonal: "+sq1.sumMainDiag());
            System.out.println("other diagonal: "+sq1.sumOtherDiag());
            System.out.println(sq1.magic()?"It is a magic square":"It isn't a magic square.");
            size = scan.nextInt();
            count++;
        }
    }
}
