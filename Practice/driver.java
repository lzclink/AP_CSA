import java.util.*;
public class driver{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter: ");
        String h=scan.next();
        HiddenWord p=new HiddenWord(h);
        while(true){
            String g=scan.next();
            System.out.println(p.getHint(g));
            if(p.getHint(g).equals(h)){
                break;
            }
        }
    }
}