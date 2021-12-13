
import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
    Item item;
    double ttP=0;
    String itemName;
    double itemPrice;
    int quantity;
     Scanner scan = new Scanner(System.in);
    String keepShopping = "y";
    ArrayList<Item> cart=new ArrayList<Item>();
    do{
            System.out.print ("Enter the name of the item: "); 
            ttP=0;
            itemName = scan.next();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            Item n=new Item(itemName,itemPrice,quantity);
            cart.add(n);
            for(int i=0;i<cart.size();i++){
                System.out.println(cart.get(i).getName()+"\t"+cart.get(i).getPrice()+"\t"+cart.get(i).getQuantity());
                ttP+=cart.get(i).getOPrice()*cart.get(i).getQuantity();
            }
            System.out.println("Total Price is: "+ttP);
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
    }while(keepShopping.equals("y"));
    System.out.println("Please pay: "+ttP);
    }
}
