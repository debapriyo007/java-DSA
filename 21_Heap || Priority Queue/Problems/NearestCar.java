import java.util.PriorityQueue;

/**
 * NearestCar
 * LeetCode: https://leetcode.com/problems/k-closest-pts-to-origin/
 */
public class NearestCar {

    //creating a class Point which hold three thing 
    // x, y  quardinate and distance from origin and Squere of distance from origin
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int sqDistance;
        int index;
        Point(int x, int y, int sqDistance, int index) {
            this.x = x;
            this.y = y;
            this.sqDistance = sqDistance;
            this.index = index;
        }
        @Override
        public int compareTo(Point p1) {
            return this.sqDistance - p1.sqDistance; //this function is just give me ascending order sorting.
        }
    }

    public static void main(String[] args) {
        
        int pts[][] = {{3,3},{5,-1}, {-2,4}, {1,1}};
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i = 0;i<pts.length;i++) {
            int disSqr = pts[i][0]*pts[i][0] - pts[i][1]*pts[i][1];
           pq.add(new Point(pts[i][0], pts[i][1], disSqr, i));
        }

        //need to print k closest point from origin
        for(int i = 0;i<k;i++) {
           System.out.println("C"+ pq.remove().index);
        }
    }
}