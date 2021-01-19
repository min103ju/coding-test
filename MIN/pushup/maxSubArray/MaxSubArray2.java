public class MaxSubArray2 {
    
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        solve(nums);

    }

    public static void solve(int[] nums) {
        
        int newSum = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            // 1. 
            // 내가 이중 for문으로 search 하던 것을 
            // 새로운 배열 원소와 기존에 계속 더하던 것을 비교
            // 새로운 원소가 크면 기존에 연속적으로 더하던 것을 버림(newSum + nums[i])
            newSum = Math.max(nums[i], newSum + nums[i]); 

            // 2.
            // newSum은 연속적인 원소의 합이고
            // 1.의 경우 기존 연속적인 원소의 합중 max를 저장해놓고 있지 않는다.
            // ex) 4 + -1 + 2 + 1 = 6
            // 바로 다음에 6 + -5 = 1
            // 1과 -5를 비교 하여 1을 저장
            // 6은 이미 사라짐.
            max = Math.max(newSum, max);
            
        }

        System.out.println("result : " + max);

    }

}
