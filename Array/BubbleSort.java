import java.util.*;
public class BubbleSort{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        int[] a=new int[n+5];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        /*
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int ins=a[i];
                    a[i]=a[j];
                    a[j]=ins;
                }
            }
        }
        */
        for(int i=0;i<n;i++){
            for(int j=n-2;j>=i;j--){
                if(a[j]>a[j+1]){
                    int ins=a[j];
                    a[j]=a[j+1];
                    a[j+1]=ins;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}