import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule1 {
    public static void main(String[] args){
        int[][] nums = {
            {1,0},
            {2,1},
            {3,2}
        };

        int course = 4;

        System.out.println("Course Schedule : " + solve(nums, course));
    }

    public static boolean solve(int[][] nums, int course) {
        if(nums==null) return false;
        if(nums.length==0) return false;

        Queue<Integer> queue = new LinkedList<>();
        int numsLength = nums.length;
        int inDegree[] = new int[course];
        int inDegreeLength = inDegree.length;

        for(int i=0; i<numsLength; i++){
            inDegree[nums[i][1]]++;
        }

        for(int i=0; i<inDegreeLength; i++){
            if(inDegree[i]==0) queue.offer(i);
        }

        while(!queue.isEmpty()){
            int x = queue.poll();

            for(int i=0; i<numsLength; i++){
                if(x==nums[i][0]) {
                    inDegree[nums[i][1]]--;
                    if(inDegree[nums[i][1]]==0) queue.offer(nums[i][1]);
                }
            }
        }

        for(int i=0; i<inDegreeLength; i++){
            if(inDegree[i]!=0) return false;
        }

        return true;
    }
}
