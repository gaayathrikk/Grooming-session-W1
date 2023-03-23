public class AccessModifier extends StudentList{
    private int i = 100;
    private String s = "Sam";

    protected void display(){
        System.out.println("Student ID = " + i2 + "\nStudent name = " + s2);
    }
    private void show(){
        System.out.println("Student ID = " + i + "\nStudent name = " + s);
    }
    public void print(){
        System.out.println("Student ID = " + i3 + "\nStudent name = " + s3);
    }
    public static void main(String[] args) {
        AccessModifier pri = new AccessModifier();
        AccessModifier prot = new AccessModifier();
        AccessModifier pub = new AccessModifier();
        pri.show();
        prot.display();
        pub.print();
    }
}