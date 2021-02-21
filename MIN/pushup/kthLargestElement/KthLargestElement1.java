import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement1 {
    public static void main(String[] args) {
 
        int[] nums={3,2,1,5,6,4};
        int k=2;

        solveForArraySort(nums, k);

        solveForPriorityQueue(nums, k);

    }

    public static void solveForArraySort(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        System.out.println("Solve Array result : " + nums[nums.length-k]);

    }

    public static void solveForPriorityQueue(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<Integer>(nums.length, (a,b) -> b-a);

        for(int i : nums) {
            queue.offer(i);
        }
        
        int i=0;
        while(i < 2) {
            int n = queue.poll();
            if(i == 1) System.out.println("Solve Queue result : " + n);
            i++;
        }

    }
}
