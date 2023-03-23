import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private List<Teacher> teachers;
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    @Override
    public String toString() {
        return name;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setStudent(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}

class Teacher{
    List<Student> students;
    private String teacherName;
  
    public String getTeacherName() {
        return teacherName;
    }
  
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudent(List<Student> students) {
        this.students = students;
    }
}

public class ManyToMany{
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherName("Maths Teacher");
        Teacher teacher2 = new Teacher();
        teacher2.setTeacherName("Science Teacher");
        
        Student s1 = new Student();
        s1.setName("Jack");
        Student s2 = new Student();
        s2.setName("Mark");
        Student s3 = new Student();
        s3.setName("John");

        List<Student> MathStudents = new ArrayList<Student>();
        MathStudents.add(s1);
        MathStudents.add(s3);

        List<Student> ScienceStudents = new ArrayList<Student>();
        ScienceStudents.add(s1);
        ScienceStudents.add(s2);
        ScienceStudents.add(s3);

        teacher1.setStudent(MathStudents);
        teacher2.setStudent(ScienceStudents);
        System.out.println(teacher1.getStudents() + " are the Students under the Teacher " + teacher1.getTeacherName());
        System.out.println(teacher2.getStudents() + " are the Students under the Teacher " + teacher2.getTeacherName());
    }
}