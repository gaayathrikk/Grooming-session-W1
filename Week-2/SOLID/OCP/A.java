package OCP;

public class A {
 
    //  Main driver method
    public static void main(String args[])
    {
        Cuboid cb1 = new Cuboid();
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;
 
        Cuboid cb2 = new Cuboid();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;
 
        Sphere sp1 = new Sphere();
        sp1.radius = 5;
 
        Sphere sp2 = new Sphere();
        sp2.radius = 2;
 
        Cuboid cuboid = new Cuboid();
 
        double c_vol1 = cuboid.get_total_volume(cb1);
 
        // Print and display the total volume
        System.out.println("The total volume is " + c_vol1);
    }
}