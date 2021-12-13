import java.util.*;
public class AList{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        int l=a.size();
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            a.add(scan.nextInt());
        }
        for(int num:a){
            if(a==5){a.remove();};
        }        
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
}