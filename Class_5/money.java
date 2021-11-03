import java.util.Scanner;
public class money{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a decimal number");
        double m=scan.nextDouble();
        System.out.print((int)m/10+" ten dollar bills\n"+((int)m%10)/5+" five dollar bills\n"+(int)m%5+" one dollar bills\n"+((int)(m*100)%100)/25+" quarters\n"+(((int)(m*100)%100)%25)/10+" dimes\n");
    }
}