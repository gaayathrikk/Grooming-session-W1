package OCP;

public class Sphere {
    public double radius;

    public double getVolume(double radius){
        double vol_sum = 0;
            vol_sum += (4 / 3) * Math.PI * radius;
        return vol_sum;
    }
}
