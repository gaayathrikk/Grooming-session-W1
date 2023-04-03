package OCP;

public class Cuboid {
    public double length;
    public double breadth;
    public double height;

    public double get_total_volume(Cuboid cuboid) {
        double vol_sum = 0;
        vol_sum += cuboid.length * cuboid.breadth
                * cuboid.height;
        return vol_sum;
    }
}
