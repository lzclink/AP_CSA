import java.util.*;
public class ChargeAccountStatement{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Previous Balance ? ");
        double preBalance=scan.nextDouble();
        System.out.println("Additional Charges ? ");
        double addCharge=scan.nextDouble();
        
        System.out.println("CS CARD International Statement");
        System.out.println("===============================\n");
        System.out.println("Previous Balance:\t"+(((int)(preBalance*100))/100)+"."+(((int)(preBalance*100))%100)+"$");
        System.out.println("Additional Charges:\t"+(((int)(addCharge*100))/100)+"."+(((int)(addCharge*100))%100)+"$");
        double interest=(preBalance+addCharge)*0.02;
        System.out.println("Interest:\t"+(((int)(interest*100))/100)+"."+(((int)(interest*100))%100)+"$\n");
        double nb=(preBalance+addCharge)*1.02;
        System.out.println("Interest:\t"+(((int)(nb*100))/100)+"."+(((int)(nb*100))%100)+"$");
        if(nb<50){
            System.out.println("Minimum Payment:\t"+(((int)(nb*100))/100)+"."+(((int)(nb*100))%100)+"$");
        }
        else if(nb>=50&&nb<=300){
            System.out.println("Minimum Payment:\t50.00$");
        }
        else{
            nb=nb*0.2;
             System.out.println("Minimum Payment:\t"+(((int)(nb*100))/100)+"."+(((int)(nb*100))%100)+"$");
        }
    }
}