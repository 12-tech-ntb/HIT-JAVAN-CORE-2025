import static java.lang.Math.pow;

public class Cricle extends Shape {
    private double r;
    public static final double  pi = 3.14;

    public Cricle() {
    }

    public Cricle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return  Math.pow(r,2)*pi;
    }
}
