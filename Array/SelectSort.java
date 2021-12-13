import java.util.*;
public class SelectSort{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        int[] a=new int[n+5];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[flag]){
                    flag=j;
                }
            }
            int ins=a[i];
            a[i]=a[flag];
            a[flag]=ins;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}