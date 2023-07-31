package rev.pe.math.linear.vec;

public class Vec2
{
    public double x;
    public double y;

    public Vec2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(Vec2 v) {
        x = v.x;
        y = v.y;
    }
    public double dot(Vec2 v) {
        return x*v.x + y*v.y;
    }

    public void plus(Vec2 v) {
        x += v.x;
        y += v.y;
    }

    public void mult(double a) {
        x*=a;
        y*=a;
    }

    private static final double EPSILON = 0.001;
    public static Vec2 normalize(Vec2 p) {
        double x = p.x;
        double y = p.y;
        double magnitude = Math.sqrt(x*x + y*y);

        if (magnitude < EPSILON) {
            return new Vec2(0,0);
        }
        return new Vec2(x/magnitude, y/magnitude);
    }
}
