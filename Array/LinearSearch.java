import java.util.*;
public class LinearSearch{
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
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        int[] a=new int[n+5];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("Sort or not? (Enter y/n) ");
        String d=scan.next();
        if(d.equals("y")){
            quickSort(a,0,n-1);
            System.out.println("Which number would you want to search?");
            int t=scan.nextInt();
            for(int i=0;i<n;i++){
                if(a[i]==t){
                    System.out.println(t+" is located at "+(i+1)+"'s place in the sorted array.");
                    System.exit(0);
                }
            }
            System.out.println("No such number.");
        }
        if(d.equals("n")){
            System.out.println("Which number would you want to search?");
            int t=scan.nextInt();
            for(int i=0;i<n;i++){
                if(a[i]==t){
                    System.out.println(t+" is located at "+(i+1)+"'s place in the inputed array.");
                    System.exit(0);
                }
            }
            System.out.println("No such number.");
        }
        else{
            System.out.println("Invalid inputs.");
        }
    }
}