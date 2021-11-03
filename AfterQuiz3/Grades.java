// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
    Student student1 = new Student("Mary");
    //create student2, "Mike"
        Student student2= new Student("Mike");
    //input grades for Mary
    student1.inputGrades();
    //print average for Mary
        System.out.println("Mary's average is: "+student1.getAverage());
    System.out.println();

    //input grades for Mike
    
    //print average for Mike
        student2.inputGrades();
    //print average for Miry
        System.out.println("Mike's average is: "+student2.getAverage());
    System.out.println();  
    
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
