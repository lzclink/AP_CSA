import java.util.Scanner;
public class Paint{
    public static void main(String[] args){
        final int COVERAGE = 350;
        int length,width,height;
        double totalSqFt;
        double paintneeded;
        int numwin,numdoor;
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter the length of the room.");
        length=scan.nextInt();
        System.out.println("Please enter the width of the room.");
        width=scan.nextInt();
        System.out.println("Please enter the height of the room.");
        height=scan.nextInt();
        System.out.println("Please enter the number of doors.");
        numdoor=scan.nextInt();
        System.out.println("Please enter the number of windows.");
        numwin=scan.nextInt();
        totalSqFt=length*height*2+width*height*2-numwin*15-numdoor*20;
        paintneeded=totalSqFt/COVERAGE;
        System.out.println("The length of the room is "+length+".");
        System.out.println("The width of the room is "+width+".");
        System.out.println("The height of the room is "+height+".");
        System.out.println("The number of doors  is "+numdoor+".");
        System.out.println("The number of windows is "+numwin+".");
        System.out.println("The number of gallons of paint needed is "+paintneeded+".");
        
    }
}