import java.util.*;
public class bubbleSort{
    public static void main(String[] agrs){
        double s[]=new double[10000];
        int n;
        double ins;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
            s[i]=scan.nextDouble();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(s[i]>s[j]){
                    ins=s[j];
                    s[j]=s[i];
                    s[i]=ins;
                }
            }
        }
        for(int i=1;i<=n;i++)
            System.out.print(s[i]+" ");
        System.out.print("\n");
    }
}