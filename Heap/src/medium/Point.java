package medium;

public class Point implements Comparable<Point>{

    int x;
    int y;
    int dist;
    int i;

    public Point(int x, int y, int dist, int i) {
        this.x = x;
        this.y = y;
        this.dist = dist;
        this.i = i;
    }

    @Override
    public int compareTo(Point p2) {

        //ascending order sorting;
        return this.dist-p2.dist;
    }
}
