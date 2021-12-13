public class ShoppingCart{
    private Item[] cart=new Item[100];
    private int capacity,itemCount;
    private double totalPrice;
    public ShoppingCart(int cap){
        capacity=cap;
        itemCount=0;
        totalPrice=0;
        cart=new Item[capacity];
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void increaseSize(){
        capacity+=3;
        Item[] ins=new Item[capacity];
        for(int i=0;i<capacity-3;i++){
            ins[i]=cart[i];
        }
        cart=ins;
    }
    public void addToCart(Item a){
        if(itemCount>=capacity){
            this.increaseSize();
        }
        cart[itemCount]=a;
        itemCount++;
        totalPrice+=a.getOPrice()*a.getQuantity();
    }
    public String toString(){
        String str="\t\tShopping Cart\nItem\t\tUnitPrice\tQuantity\tTotal\n";
        for(int i=0;i<itemCount;i++){
            str+=cart[i]+"\t\t"+(cart[i].getOPrice()*cart[i].getQuantity())+"\n";
        }
        str+="Total Price of cart: $"+totalPrice;
        return str;
    }
}