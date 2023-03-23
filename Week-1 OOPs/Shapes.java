class Shape {
    public void area(int l, int b) {
        System.out.println("Rectangle area = " + l * b);
    }
    public void area(int a) {
        System.out.println("Square area = " + a * a);
    }

    public void area(double b , double h) {
        System.out.println("Triangle area = " + 0.5 * b * h);
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.area(6);
        shape1.area(6.0,1.2);
        shape1.area(4,2);
    }
}
// Compile - time polymorphism

