import java.util.Scanner;
public class IdealWeight{
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the foot part of your height.");
        int foot=scan.nextInt();
        System.out.println("Please enter the foot part of your height.");
        int inch=scan.nextInt();
        inch+=foot*12;
        inch-=5*12;
        System.out.println("For females, the okay range is: "+((inch*5+100)*0.85)+" to "+((inch*5+100)*1.15));
        System.out.println("For males, the okay range is: "+((inch*6+106)*0.85)+" to "+((inch*6+106)*1.15));      
    }
}