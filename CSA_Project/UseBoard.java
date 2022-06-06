import java.util.*;
public class UseBoard{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int rows,cols;
        String str[];
        System.out.println("Rows?");
        rows=scan.nextInt();
        System.out.println("Cols?");
        cols=scan.nextInt();
        str=new String[rows];
        System.out.println("The Board? You can input it with its original format. \nYou don't need to input them in 1 line.");
        for(int i=0;i<rows;i++){
            str[i]=scan.next();
        }
        String theB=new String("");
        for(int i=0;i<rows;i++){
            theB+=str[i];
        }
        Board b1=new Board(rows,cols,theB);
        System.out.println(b1.win()?"The current board contains a legitimate path from S to E. ":"There is no legitimate path from S to E!");
    }
}