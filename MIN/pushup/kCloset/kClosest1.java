import java.util.*;

public class kClosest1 {

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        solve(points, k);
    }

    public static void solve(int[][] points, int k) {

        //1. priorityqueue에 원소를 등록(제곱 오름차순으로 우선순위)
        Queue<int[]> queue = new PriorityQueue<>(points.length, (a,b) -> (cal(a) - cal(b)));

        for(int[] point : points) {
            queue.offer(point);
        }

        //2. k수만큼 queue.pop();
        while(k > 0){
            System.out.println(Arrays.toString(queue.poll()));
            k--;
        }

    }

    public static int cal(int[] n){
        double result = Math.pow(n[0], 2) + Math.pow(n[1], 2);
        return (int) Math.round(result);
    }

}
