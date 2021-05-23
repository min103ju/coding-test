import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionalDevelop1 {

    //뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포
    //progresses는 순서가 있다.

    public static void main(String[] args) {
        //[93, 30, 55]	[1, 30, 5]	[2, 1]
        FunctionalDevelop1 func = new FunctionalDevelop1();

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = func.solution(progresses, speeds);
        System.out.println("answer = ");
        func.println(answer);
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        //작업이 100% 완료되는 일 수를 Queue에 넣고
        //맨처음 작업을 빼고 뺀 일 수 p와 Queue에 맨 앞에 있는 수 f를  비교
        //p > f면 기능 배포 갯수를 +1
        //아니면 다음으로 넘어가고 

        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i=0; i < progresses.length; i++) {
            queue.offer(calculateCompleteDay(progresses[i], speeds[i]));
        }

        // ================================================================================
        
        int deployFunctionCount = 1;
        while(!queue.isEmpty()) {

            int count = queue.poll();

            if(queue.peek() != null && count >= queue.peek()) {
                deployFunctionCount++;
            } else {
                list.add(deployFunctionCount);
                deployFunctionCount = 1;
            }
        }

        // ================================================================================

        answer = convertToArray(list);

        return answer;
    }

    public int calculateCompleteDay(int progress, int speed) {
        int remainProgress = 100 - progress;
        return (int)Math.ceil(remainProgress / (double)speed);
    }

    public int[] convertToArray(List<Integer> list) {
        int[] array = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public void println(int[] answer) {
        for(int i : answer) {
            System.out.println("[" + i + "]");
        }
    }
}
