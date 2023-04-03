package SRP;
public class Percentage {
    private Student student;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private int maths;
    private int physics;
    private int chemistry;
    
    public void calculatePercentage(){
        int percentage = ((maths/2) + (physics/4) + (chemistry/4));
        System.out.println("Student's : " + percentage);
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
}
