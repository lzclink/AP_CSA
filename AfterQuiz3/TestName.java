import java.util.*;
public class TestName{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the first person. Format: firstname middlename lastname");
        Name person1=new Name(scan.next(),scan.next(),scan.next());
        System.out.println("Enter the name of the second person. Format: firstname middlename lastname");
        Name person2=new Name(scan.next(),scan.next(),scan.next());
        
        
        System.out.println(person1.firstMiddleLast());
        System.out.println(person1.lastFirstMiddle());
        System.out.println(person1.initials());
        System.out.println(person1.length());
        
        
        System.out.println(person2.firstMiddleLast());
        System.out.println(person2.lastFirstMiddle());
        System.out.println(person2.initials());
        System.out.println(person2.length());
        
        
        if(person1.equals(person2)==true){
            System.out.println("They have the same name.");
        }
        else{
            System.out.println("They don't have the same name");
        }
    }
}