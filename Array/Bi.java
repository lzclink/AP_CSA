import java.util.*;

public class Bi{
    static int[] a=new int[10000000];
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        BinarySearch.quickSort(a,0,n-1);
        
    }
}