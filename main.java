/**
 * Created by Filip on 2017-03-04.
 */
public class main {
    public static void main(String[] args) {
        Graph graph = new Graph(20, 100, 1 ,' ');
        Linear func = new Linear(0.1, 0, '\u2022');
        graph.plotLinear(func, graph);
    }
}
