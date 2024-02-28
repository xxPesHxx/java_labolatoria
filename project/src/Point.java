public class Point
{
    public float x;
    public float y;


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
}