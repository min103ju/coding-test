import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MissingRanges1 {
    public static void main(String[] args) {
        int[] nums={2,3,5,50,75};
        int lower=0, upper=99;

        System.out.println(
            solve(nums, lower, upper).stream()
                                    .map(i->String.valueOf(i))
                                    .collect(Collectors.joining(","))
        );
    }

    public static List<String> solve(int[] nums, int lower, int upper) {

        //1
        List<String> result = new ArrayList<>();
        if(nums == null || nums.length==0) return result;

        //2
        if(lower<nums[0]){
            result.add(makeRange(lower, nums[0]-1));
        } else {
            result.add(makeRange(nums[0]+1, lower));
        }

        //3
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i]+1 != nums[i+1]) {
                result.add(makeRange(nums[i]+1, nums[i+1]-1));
            }
        }   

        //4
        int length=nums.length-1;
        result.add(makeRange(nums[length]+1, upper));

        return result;
    }

    public static String makeRange(int low, int high) {
        if(low == high)
            return String.valueOf(low);
        else
            return low + "->" + high;
    }

    /*
    public static void solve(int[] nums, int lower, int upper) {

        List<String> list = new ArrayList<>();

        //init validation(ex : null check)
        if(nums == null) {
            System.out.println("Array is null!");
        }

        if(nums[0] < lower) {
            System.out.println("nums[0] < lower!!");
        }

        if(nums[nums.length-1] > upper) {
            System.out.println("nums[nums.length-1] > upper!!");
        }

        //1. lower와 nums[0]을 비교 후 nums[0]만큼 lower에서 반복
        for(int i=lower; i < nums[0]; i++) {
            list.add(i);
        }
        list.add(nums[0]);
        
        //2. nums 순회, result++ 비교 후 nums에 해당 값이 있으면 해당 값 출력
        //없으면 for 반복으로 출력
        for(int i=1; i < nums.length-1; i++) {

            if(nums[i]+1 == nums[i+1]){
                list.add(nums[i]);
            } else {
                int num=nums[i];
                while(num < nums[i+1]) {
                    list.add(num);
                    num++;
                }
            }
        }

        //3. nums[nums.length-1]와 upper 비교 후 nums[nums.length-1]에서 upper만큼 순회 출력
        for(int i=nums[nums.length-1]; i<=upper; i++){
            list.add(i);
        }

        list.stream().forEach(x -> System.out.println(x + ","));
    }
    */
}
