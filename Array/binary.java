import java.util.*;
public class binary{
    public static int binarySearch(int arr[], int target){
        int left=0,right=arr.length-1;
        int middle;
        while(left<=right){
            middle=(left+right)/2;
            if(arr[middle]>=target){
                right=middle-1;
            }
            if(arr[middle]<target){
                left=middle+1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=i;
            int j;
            for(j=i+1;j<n;j++){
                if(a[flag]>a[j]){
                    flag=j;
                }
            }
            int ins=a[i];
            a[i]=a[flag];
            a[flag]=ins;
        }
        int s=scan.nextInt();
        System.out.println((binarySearch(a,s)+1)+"'s");
        //for(int i=0;i<n;i++){
        //    System.out.print(a[i]+" ");
        //}
        //System.out.println();
        
    }
}