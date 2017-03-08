/**
 * Created by Filip on 2017-03-04.
 */
public class Graph {

    double width;
    double height;

    double Scale;

    char ID;

    public Graph(double width, double height, double Scale, char ID) {
        this.width = width;
        this.height = height;
        this.ID = ID;
        this.Scale = Scale;
    }

    public void Draw(Point point) {
        for(double y = 0; y <= this.height * this.Scale; y++) {
            for (double x = 0; x <= this.width * this.Scale; x++) {
                if(Math.round(y/this.Scale) == point.getY()-1 && Math.round(x/this.Scale) == point.getX()) {
                    System.out.print(point.ID);
                } else {
                    System.out.print(this.ID);
                }
            }
            System.out.println("");
        }
    }

    public void plotLinear(Linear func, Graph graph) {
        Point[] Points = func.allPoints(graph);

        for(double y = 1; y < graph.height * graph.Scale; y++) {
            for(Point i : Points) {
                if(i.getY() == y) {
                    System.out.print(i.ID);
                } else {
                    System.out.print(graph.ID);
                }
            }
            System.out.println("");
        }
    }
}
