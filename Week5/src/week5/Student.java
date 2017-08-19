package week5;



public class Student
{
    private final String name;
    private final String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public Student() {
        this("", "");
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.studentID;        
    }

    public String toString() {
        return this.name + " (" + this.studentID + ")";
    }


}
