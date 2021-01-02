public class TwoSum1 {

    public static void main(String[] args) {

        TwoSum1 twoSum1 = new TwoSum1();

        int[] nums = {2,8,10,21};
        int target = 10;

        twoSum1.twoSum(nums, target);

    }

    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];

        for(int i=0; i < nums.length-1; i++){
            for(int j=1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }

        println(result);

        return result;

    }

    public void println(int[] result) {
        for(int n : result){
            System.out.println("result : " + n);
        }
    }
    
}
