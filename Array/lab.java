import java.util.*;
public class lab{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of questions:");
        int n=scan.nextInt();
        //int[] key=new int[n+1];
        String[] key=new String[n+1];
        System.out.println("Enter the keys:");
        for(int i=1;i<=n;i++){
            key[i]=scan.next();
        }
        String check="y";
        String ans;
        int count;
        
        while(check.equals("y")){
            System.out.println("Enter the answers:");
            count=0;
            for(int i=1;i<=n;i++){
                ans=scan.next();
                if(key[i].equals(ans)){
                    count++;
                }
            }
            System.out.println("Correct: "+count+"/"+n+"  Percentage:"+((double)count/(double)n*100)+"%");
            
            while(true){
                System.out.println("Grade another quiz?(y/n)");
                
                check=scan.next();
                if(check.equals("y")||check.equals("n")){
                    break;
                }
                else{
                    System.out.println("Invalid input, plz try again!");
                }
            }
        }        
    }
}