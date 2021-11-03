import java.util.Scanner;
public class sphere{
    public static void main(String args[]){
        final double PI=3.1415926;
        System.out.println("Please enter the radius.");
        Scanner scan = new Scanner(System.in);
        double r=scan.nextDouble();
        System.out.println("The volume is "+(4/3*(PI*Math.pow(r,3))));
        System.out.println("The surface area is "+(4*PI*Math.pow(r,2)));
    }
}