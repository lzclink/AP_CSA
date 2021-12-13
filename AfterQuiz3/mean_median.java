import java.util.*;
public class mean_median{
    public static void main(String args[]){
        int a[]=new int [100];
        int sum=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            a[i]=scan.nextInt();
            sum+=a[i];
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(a[j]>a[i]){
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(i+": "+a[i]);
            System.out.println("mean: "+(sum/n));
            System.out.println("median: "+a[13]);
        }
    }
}