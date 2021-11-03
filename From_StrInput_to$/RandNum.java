import java.util.Random;
public class RandNum{
    public static void main(String[] args){
        Random rand=new Random();
        /*
        int n1=rand.nextInt(10);
        
        int n2=rand.nextInt(501);
        
        int n3=rand.nextInt(10)+1;
        
        int n4=rand.nextInt(499)+1;
        
        int n5=rand.nextInt(26)+25;
        
        int n6=rand.nextInt(25)-10;
        
        double n7=rand.nextDouble()*4;
        
        double n8=rand.nextDouble()*9+3;
        */
        int a=rand.nextInt(20)+1;
        int b=rand.nextInt(20)+1;
        System.out.println("sine : "+Math.sin(a+b)+"  cosine : "+Math.cos(a+b));
    }
}
