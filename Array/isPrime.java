import java.util.*;
public class isPrime{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        while(true){
            System.out.println("If you want to quit, enter \"-1\"");
            
            boolean flag=true;
            int n=scan.nextInt();
            if(n==-1){
                break;
            }
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }      
            }
            System.out.println(flag?"Prime":"Not Prime");
        }
    }
}