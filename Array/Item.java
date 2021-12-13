import java.text.NumberFormat;
import java.util.*;
public class Item{
    private String name;
    private double p;
    private int q;
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    public Item(String name,double p,int q){
        this.name=name;
        this.p=p;
        
        this.q=q;
    }
    public String getName(){
        return name;
    }
    public double getOPrice(){
        return p;
    }
    public String getPrice(){
        return nf.format(p);
    }
    public int getQuantity(){
        return q;
    }
    public String toString(){
        return name+"\t\t"+((int)(p*100))/100.0+"\t\t"+q;
    }
}