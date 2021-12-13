import java.util.*;
public class Shopping{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        ShoppingCart sc=new ShoppingCart(100);
        while(true){
            System.out.println("Add a new item with the form: \"Name\" \"Price\" \"Quantity\", which is separated by space. You can check out by entering \"end\"");
            String s=scan.next();
            if(s.equals("end")){
                System.out.println("Please pay: $"+sc.getTotalPrice());
                break; 
            }
            double p=scan.nextDouble();
            int q=scan.nextInt();
            Item ins=new Item(s,p,q);
            sc.addToCart(ins);
            System.out.println(sc);
        }
    }
}