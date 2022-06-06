import java.util.*;
public class testARL{
    
    
    public static List<Integer> getR(){
        List<Integer> list=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("How many integers?");
        int length=scan.nextInt();
        for(int i=0;i<length;i++){
            int newNum=(int)(Math.random()*101);
            list.add(newNum);
        }
        
    
        return list;
    }
    
    
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        String ch=" ";
        Integer it=new Integer(8);
        arr.add(ch+8);
        System.out.println(arr.get(0));
    }
}