import java.util.*;
public class Salary{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input the current salary.");
        double salary=scan.nextDouble();
        System.out.println("Please input the rate.");
        String rate=scan.next();
        if(rate.equals("Excellent")){
            System.out.println("new salary is:"+(salary*1.06));
        }
        else if(rate.equals("Good")){
            System.out.println("new salaryb is:"+(salary*1.04));
        }
        else{
            System.out.println("new salary is:"+(salary*1.015));
        }
    }
}