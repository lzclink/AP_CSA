import java.util.Scanner;
public class CalculatorDriver {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the first number");
        int x = scan.nextInt();
        //System.out.println("Enter the second number");
        //int y = scan.nextInt();
        
        CalculatorDriven calc = new CalculatorDriven(x);
        int cifang=scan.nextInt();
        //System.out.println("The addition of the numbers is "+ calc.add());
        //System.out.println("The difference of the numbers is "+ calc.diff());
        //System.out.println("The multiplication of the numbers is "+ calc.product());
        //System.out.println("The division of the numbers is "+ calc.div());
        //System.out.println("The remainder of the numbers is "+ calc.rem());
        calc.ercifang=cifang;
        System.out.println(calc.pingfang());
    }
}