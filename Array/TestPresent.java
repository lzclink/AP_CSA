
import java.util.*;
public class TestPresent{
    public static void main(String[] args){
        final int N=0x7fffffff-10;
        int sum=0;
        int min=0,max=0;
        Scanner scan=new Scanner(System.in);
        int[] a=new int[N];
        //int n=scan.nextInt();
        for(int i=1;i<=10;i++){
            a[scan.nextInt()]=6;
        }
        int test=scan.nextInt();
        if(a[test]==6){
            System.out.println("It has");
        }
        else{
            System.out.println("No");
        }
    }
}