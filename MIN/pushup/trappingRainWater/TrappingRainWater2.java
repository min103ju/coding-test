public class TrappingRainWater2 {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("result : " + solve(heights));
    }

    public static int solve(int[] heights) {
        int result = 0;
        if(heights == null || heights.length <= 2) return result;

        int[] left = new int[heights.length];
        int[] right = new int[heights.length];

        //1. left
        int max = heights[0];
        left[0] = heights[0];
        
        for(int i=1; i<heights.length; i++) {
            if(max < heights[i]){
                left[i] = heights[i];
                max = heights[i];
            } else {
                left[i] = max;
            }
        }

        //2. right
        max = heights[heights.length-1];
        right[heights.length-1] = heights[heights.length-1];

        for(int i=heights.length-2; i >= 0; i--){
            if(max < heights[i]) {
                right[i] = heights[i];
                max = heights[i];
            } else {
                right[i] = max;
            }
        }

        //3. get minimum
        for(int i=0; i<heights.length; i++){
            result += Math.min(left[i], right[i]) - heights[i];
        }

        return result;
        
    }
}
