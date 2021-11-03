import java.util.*;
public class Raise{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input the current salary.");
        double salary=scan.nextDouble();
        System.out.println("Please input the rate.");
        int rate=scan.nextInt();
        if(rate==1){
            System.out.println("new salary is:"+(salary*1.06));
        }
        else if(rate==2){
            System.out.println("new salaryb is:"+(salary*1.04));
        }
        else{
            System.out.println("new salary is:"+(salary*1.015));
        }
    }
}