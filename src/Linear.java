import java.net.InterfaceAddress;

/**
 * Created by Filip on 2017-03-04.
 */
public class Linear {

    double k;
    double m;

    char ID;

    public Linear(double k, double m, char ID) {
        this.k = k;
        this.m = m;
        this.ID = ID;
    }

    public Point[] allPoints(Graph graph) {
        Point[] Points = new Point[(int) Math.floor(graph.width)];
        for(int i = 0; i < Points.length; i++) {
            Points[Points.length - i - 1] = new Point(i, Math.round((i * this.k) + this.m), this.ID);
        }
        return Points;
    }
}
