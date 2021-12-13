import java.util.*;
public class Size{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        int n=scan.nextInt();
        int[] s=new int[n+1];
        int[] count=new int[n+2];
        for(int i=0;i<n;i++){
            s[i]=rand.nextInt(n)+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(s[i]+" ");
            count[s[i]]++;
        }
        //System.out.println();
        //System.out.println();
        //for(int i=1;i<=n;i++){
        //    System.out.print(count[i]+" ");
        //}
        System.out.println();
        for(int i=1;i<=n;i++){
            if(count[i]>1){
                System.out.println("number: "+i+" occured more than once.");
            }
        }
        System.out.println();
    }
}