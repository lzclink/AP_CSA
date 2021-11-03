import java.util.*;
public class GPA{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double gpa=scan.nextDouble();
        if(gpa>=3.5){
            System.out.println("Congratulations, you made the Dean's list!");
        }
        else{
            System.out.println("Sorry, try again next semester.");
        }
    }
}