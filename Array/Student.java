public class Student{
    private int studentID;
    private String studentName;
    public Student(String n,int id){
        this.studentID=id;
        this.studentName=n;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(int n){
        studentID=n;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(String n){
        studentName=n;
    }
}