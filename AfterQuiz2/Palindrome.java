import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word to be tested.");
        String str;
        boolean flag=true;
        while(true){
            str=scan.nextLine();
            if(str.equals("quit")) break;
            str=str.toLowerCase();
            for(int i=0;i<=str.length()/2-1;i++){
                if(str.charAt(str.length()-i-1)!=str.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag==true) System.out.println("It is a Palindrome");
            if(flag==false) System.out.println("It isn't a Palindrome");
            System.out.println("If you want to keep tests, you can enter a new word to be tested. \nIf you want to quit, just enter \"quit\"");
            flag=true;
        }
    }
}