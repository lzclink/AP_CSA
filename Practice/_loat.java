import java.util.*;
public class _loat{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double x=scan.nextDouble();
//        for(double i=0.000001;i<=100;i+=0.000001){
//            if(!(3.0==(x+i)*(3.0/(x+i)))){
//                System.out.println(x+i);
//            }
//        }
        System.out.println((3.0==x*(3.0/x)));
    }
}