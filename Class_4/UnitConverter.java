import java.util.Scanner;
public class UnitConverter{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        double inch=scan.nextDouble();
        System.out.println(inch*(double)12);
    }
}