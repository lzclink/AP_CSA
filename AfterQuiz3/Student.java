import java.util.*;
public class Student
{
    //declare instance data 
    String name;
    double t1,t2;
    Scanner scan=new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
    //add body of constructor
    name=studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter"+name+"'s score for test1.");
        t1=scan.nextDouble();
        System.out.println("Enter"+name+"'s score for test2.");
        t2=scan.nextDouble();
    //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()//add header for getAverage
    {
    //add body of getAverage
    return (t1+t2)/2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public String getName()//add header for printName
    {
        return name;
    //add body of printName
    }
    public String toString(){
        String result= "Name: "+name+"  Test1: "+Double.toString(t1)+"   Test2: "+Double.toString(t2);
        return result;
    }
}