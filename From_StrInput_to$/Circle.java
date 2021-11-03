import java.util.Scanner;
public class Circle{
    public static void main(String[] args){         
    final double PI = 3.14159;
    Scanner scan= new Scanner (System.in);
    double radiusA;
    System.out.println("Please enter the radius of A.");
    radiusA=scan.nextInt();
    double areaA = PI * radiusA * radiusA;
    double circumferenceA= PI*2*radiusA;
    System.out.println("The area of a circle with radius " + radiusA +
    " is " + areaA+"circumference is "+circumferenceA);
    double radiusB;
    System.out.println("Please enter the radius of B.");
    radiusB=scan.nextInt();
    double areaB = PI * radiusB * radiusB;
    double circumferenceB = PI*2*radiusB;
    System.out.println("The area of a circle with radius " + radiusB +
    " is " + areaB+"circumference is "+circumferenceB);
    double ratio=areaA/areaB;
    System.out.println("The ratio of A to B is "+ratio);
    }
}