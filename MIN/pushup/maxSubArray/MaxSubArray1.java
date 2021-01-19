public class MaxSubArray1 {
    
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        solve(nums);

    }

    public static void solve(int[] nums) {
        
        int beforMax = 0;
        int newMax = 0;

        for(int i=0; i < nums.length-1; i++){

            beforMax = nums[i];

            for(int j=i+1; j < nums.length; j++){
                
                beforMax = beforMax + nums[j];

                newMax = Math.max(newMax, beforMax);

            }    
        }

        System.out.println("result : " + newMax);

    }

}
