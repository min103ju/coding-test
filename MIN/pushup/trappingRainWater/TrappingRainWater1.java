import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater1 {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};

        solve(heights);
    }

    public static void solve(int[] heights) {

        // 1
        int result = 0;

        // 2
        // 배열을 순회하면서 현재 index와 비교하여 높거나 같은 height를 구한다.
        for(int i=0; i<heights.length-1; i++) {

            List<Integer> subBlock = new ArrayList<>();
            subBlock.add(heights[i]);

            for(int j=i+1; j<heights.length; j++) {
                subBlock.add(heights[j]);
                if(heights[i] <= heights[j]){
                    // 3
                    // 현재 index의 height와 정해진 height 사이에 얼마나 몇 블럭의 물이 있는지 계산한다.
                    result += calculationWaterHeight(subBlock);
                    i=j;
                    subBlock = new ArrayList<>();
                    subBlock.add(heights[i]);
                }
            }
        }   

        System.out.println("result : " + result);
        
    }

    public static int calculationWaterHeight(List<Integer> subBlock) {

        int result = 0;

        if(subBlock != null && subBlock.size() != 0) {

            System.out.println("subBlock : " + subBlock);

            int start=1, end=subBlock.size()-1;
            int startHeight = subBlock.get(0);
            int endHeight = subBlock.get(end);

            int criteria = Math.min(startHeight, endHeight);

            for(int i=start; i<subBlock.size()-1; i++){
                result += criteria - subBlock.get(i);
            }

            System.out.println("subResult : " + result);

            return result;
        } else {
            return result;
        }

    }
}
