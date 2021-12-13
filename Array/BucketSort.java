import java.util.*;
public class BucketSort{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        int[] a=new int[10000005];
        for(int i=0;i<n;i++){
            a[scan.nextInt()]++;
        }
        for(int i=0;i<10000005;i++){
            if(a[i]==0){
                continue;
            }
            else{
                for(int j=0;j<a[i];j++){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
    }
}