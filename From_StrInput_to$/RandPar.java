import java.util.Random;
public class RandPar{
    public static void main(String[] args){
        Random rand=new Random();
        int b=rand.nextInt(21)+10;
        int h=rand.nextInt(21)+10;
        int a=rand.nextInt(21)+10;
        System.out.println("Area: "+(b*h)+" Perimeter: "+(2*(a+b)));
    }
}