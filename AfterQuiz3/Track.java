import java.util.*;
public class Track{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of first Band");
        BandBooster b1=new BandBooster(scan.nextLine());
        System.out.println("Enter the name of second Band");
        BandBooster b2=new BandBooster(scan.nextLine());
        for(int i=1;i<=3;i++){
            System.out.println("Enter the number of boxes sold by "+ b1.getName() +" this week: ");
            b1.updateSales(scan.nextInt());
            System.out.println("Enter the number of boxes sold by "+ b2.getName() +" this week: ");
            b2.updateSales(scan.nextInt());
        }
        System.out.println(b1);
        System.out.println(b2);
    }
}