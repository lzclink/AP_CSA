import java.util.Scanner;
public class dis{
    public static void main(String args[]){
        System.out.println("Please enter the first one.");
        Scanner scan = new Scanner(System.in);
        double x1=scan.nextDouble();
        double y1=scan.nextDouble(); 
        //System.out.println(x1+" "+y1);
        System.out.println("Please enter the second one.");
        double x2=scan.nextDouble();
        double y2=scan.nextDouble(); 
        System.out.println("Distance is "+Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }
}