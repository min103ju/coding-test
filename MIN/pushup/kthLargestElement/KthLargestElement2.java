import java.util.*;

public class KthLargestElement2 {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=2;

        solve_array(nums, k);
        solve_pq(nums, k);
    }

    public static void solve_array(int[] nums, int k) {

        int length = nums.length;
        Arrays.sort(nums);
        System.out.println("Solve Array result : " + nums[length-k]);

    }

    public static void solve_pq(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comp);

        for(int val : nums) {
            pq.offer(val);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println("Solve Queue result : " + pq.peek());

    }

    static Comparator<Integer> Comp = new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            return a-b;
        };
    };
}
