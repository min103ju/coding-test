import java.util.*;

public class TwoSum2 {
    
    public static void main(String[] args) {
        int[] nums = {2,8,10,21};
        int target = 10;

        TwoSum2 twoSum2 = new TwoSum2();

        int[] result = twoSum2.solve(nums, target);
        
    }

    public int[] solve(int[] nums, int target) {
        if(nums != null){
            Map<Integer, Integer> map = new HashMap<>();
            int[] result = new int[2];

            for(int i=0; i<nums.length; i++){
                if(map.containsKey(nums[i])) {
                    result[0] = map.get(nums[i]) + 1;
                    result[1] = i + 1;
                } else {
                    map.put(target - nums[i], i);
                }
            }
            println(result);
            return result;
        } else {
            return null;
        }
    }

    public void println(int[] result){
        for(int i : result){
            System.out.println("result : " + i);
        }
    }


}
