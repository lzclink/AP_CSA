import java.util.*;
public class Driver{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Driven tool=new Driven();
        
        System.out.println("Enter numbers of elements: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("Increasing order: input true; false otherwise ");
        boolean ff=scan.nextBoolean();
        // We offer two sort methods options
        //a=tool1.slSort(a,ff); 
        a=tool.inSort(a,ff);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Your target?");
        int target=scan.nextInt();
        // We offer two search methods options
        System.out.println(tool.Binary(a,target));
        //System.out.println(tool.Linear(a,target));
    }
}