/**
 * Created by Filip on 2017-03-04.
 */
public class Point {

    double x;
    double y;

    char ID;

    public Point(double x, double y, char ID) {
        this.x = x;
        this.y = y;
        this.ID = ID;
    }
    double getX() {
        return this.x;
    }
    double getY() {
        return this.y;
    }
    public Point add(Point point) {
        return new Point(this.x + point.getX(), this.y + point.getY(), this.ID);
    }

}
