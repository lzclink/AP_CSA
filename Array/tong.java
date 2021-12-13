import java.util.*;
public class tong{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[1000];
        for(int i=0;;i++){
            int ins=scan.nextInt();
            if(ins%2==1) break;
            a[ins]++;
        }
        for(int i=0;i<1000;i++)
            if(a[i]!=0) System.out.println(i+": "+a[i]);
    }
}