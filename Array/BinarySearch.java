import java.util.*;
public class BinarySearch{
    static int[] a=new int[10000000];
    public static void quickSort(int[] a, int left, int right){
        int std=a[left];
        int i=left,j=right;
        if(right<=left){
            return;
        }
        else{
            while(i<j){
                while(j>i&&a[j]>std){
                    j--;
                }
                if(i<j){
                    a[i]=a[j];  
                    i++;
                }
                while(i<j&&a[i]<=std){
                    i++;
                }
                if(i<j){
                    a[j]=a[i];
                    j--;
                }
            }
            a[i]=std;
            quickSort(a,left,i-1);
            quickSort(a,i+1,right);
        }
    }
    public static int binarySearch(int[] s, int l, int target){
        int left=0,right=l-1;
        int middle;
        while(left<=right){
            middle=(right+left)/2;
            if(target>s[middle]){
                left=middle+1;
            }
            if(target<=s[middle]){
                right=middle-1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        quickSort(a,0,n-1);
        System.out.println("Which number would you want to search?");
        int t=scan.nextInt();
        System.out.println("It is located at the "+(binarySearch(a,n,t)+1)+"'s place in the sorted array.");
    }
}