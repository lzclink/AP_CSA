import java.util.*;
public class Factorial{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Non-negative integer:");
        long a=scan.nextLong();
        int ans=1;
        while(a<0){
            System.out.println("It is not a Non-negative integer. Please enter a Non-negative integer!");
            a=scan.nextLong();
        }
        if(a==0){
            System.out.println("0!=1");
        }
        else{
            System.out.print(a+"!="+a);
            ans*=a;
            while(a>1){
                
                a--;
                ans*=a;
                System.out.print("*"+a);
                
            }
            System.out.println("="+ans);
        }
        
    }
}