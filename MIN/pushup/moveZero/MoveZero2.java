
public class MoveZero2 {

    public static void main(String[] args){

        int[] nums = {0,3,2,0,8,5};
        int index = 0;

        //1
        for(int i=0; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        //2
        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }

        //3
        for(int n : nums) {
            System.out.println(n);
        }

    }
    
}
