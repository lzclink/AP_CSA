import java.util.Scanner;
public class BaseConvert{
    public static void main (String[] args){
        int base;        
        int base10Num;   
        int maxNumber;   
        int place0;      
        int place1;      
        int place2;      
        int place3;      
        String baseBNum = new String (""); 
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println ("Base Conversion Program");
        System.out.println();
        System.out.print ("Please enter a base (2 - 9): ");
        base = scan.nextInt();
        maxNumber=base*base*base*base-1;
        System.out.println("The valid range of your input must be in 0-"+maxNumber+".");
        System.out.print ("Please enter a base 10 number to convert: ");
        base10Num = scan.nextInt();
        place0=base10Num%base;
        base10Num/=base;
        place1=base10Num%base;
        base10Num/=base;
        place2=base10Num%base;
        base10Num/=base;
        place3=base10Num%base;
        baseBNum=baseBNum+place3+place2+place1+place0;
        System.out.println(baseBNum);
    }
}