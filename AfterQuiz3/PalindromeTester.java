import java.util.*;
public class PalindromeTester{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Please enter the string to be tested. If you want to quit. Just enter \"quit\"");
            String in=scan.nextLine();
            if(in.equals("quit")) break;
            PalindromeTool cs=new PalindromeTool(in);
            if(cs.isP()) System.out.println("It is.");
            else System.out.println("It isn't.");
        }
    }
    
}