import java.util.*;
public class InsertSort{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        int[] a=new int[n+5];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int std=a[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(a[j]>std){
                    a[j+1]=a[j];
                }
                else{
                    break;
                }
            }
            a[j+1]=std;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}