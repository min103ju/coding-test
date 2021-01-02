
public class DailyTemperature1 {
    
    public static void main(String[] args){
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};

        DailyTemperature1 dt = new DailyTemperature1();
        dt.solve(nums);
    }

    public int[] solve(int[] nums) {

        int[] result = new int[nums.length];

        if(nums != null){
            
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i] < nums[j]) {
                        result[i] = j-i;
                        break;
                    } 
                }
            }

            println(result);
        } 

        return result;
    }
    
    public void println(int[] result){
        for(int n : result){
            System.out.println("result : " + n);
        }
    }
}
