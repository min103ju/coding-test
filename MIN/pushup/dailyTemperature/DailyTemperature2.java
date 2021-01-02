import java.util.Stack;

public class DailyTemperature2 {
    
    public static void main(String[] args){
        
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};

        DailyTemperature2 dt = new DailyTemperature2();
        dt.solve(nums);

    }

    public int[] solve(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        if(nums != null){

            for(int i=0; i<nums.length; i++){
                while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                    int index = stack.pop();
                    result[index] = i - index;
                }
                stack.push(i);
            }
            
        }
        println(result);

        return nums;
    }

    public void println(int[] result){
        for(int n : result){
            System.out.println("result : " + n);
        }
    }
}
