import java.util.Comparator;
import java.util.*;

public class kClosest2 {

    public static void main(String[] args){
        kClosest2 kClosest2 = new kClosest2();

        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        int[][] result = kClosest2.solve(points, k); 
        kClosest2.print(result);
    }

    public int[][] solve(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>(points.length, comp);
        int[][] result = new int[k][2];
        int idx = 0;

        for(int[] p : points) {
            queue.offer(p);
        }
        while(idx < k) {
            result[idx] = queue.poll();
            idx++;
        }
        return result;
    }

    Comparator<int[]> comp = new Comparator<>(){

        @Override
        public int compare(int[] a, int[] b) {
            int aPoint = (int) (Math.pow(a[0], 2) + Math.pow(a[1], 2));
            int bPoint = (int) (Math.pow(b[0], 2) + Math.pow(b[1], 2));
            return aPoint - bPoint;
        }
        
    };

    public void print(int[][] result) {
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.println(result[i][j]);
            }
            System.out.println();
        }
    }
    
}
