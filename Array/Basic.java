import java.util.*;

public class Basic{
    public static void main(String[] agrs){
        int sum=0;
        int min=0,max=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of salespeople.");
        int n=scan.nextInt();
        int[] s=new int[n];        
        for(int i=0;i<n;i++){
            System.out.print(i+": ");
            s[i]=scan.nextInt();
            if(s[i]>s[max]){
                max=i;
            }
            if(s[i]<s[min]){
                min=i;
            }
            sum+=s[i];
        }
        System.out.println("Sum: "+sum+" Average: "+(sum/s.length));
        System.out.println("Least: "+min+": "+s[min]+"   Largest: "+max+": "+s[max]);
    }
}