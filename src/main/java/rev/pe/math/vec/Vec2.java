package rev.pe.math.vec;

public class Vec2
{
    public double x;
    public double y;

    public Vec2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dot(Vec2 v) {
        return x*v.x + y*v.y;
    }
}
