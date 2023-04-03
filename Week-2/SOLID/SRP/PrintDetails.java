package SRP;

public class PrintDetails {
    private Student student;
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void printDetails(){
        System.out.println("Student name" + this.getStudent().getName());
    }
}
