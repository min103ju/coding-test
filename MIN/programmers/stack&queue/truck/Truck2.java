import java.util.*;

public class Truck2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> queue = new LinkedList<>();
        int time = 0, idx = 0;

        while(idx < truck_weights.length) {

            if(!queue.isEmpty() && queue.peek()[1] == time){
                int[] truck = queue.poll();
                weight += truck[0];
            }

            //다음 트럭으로 넘어가는 기준 = 다리(queue)에 트럭이 올라갔을때
            if(weight >= truck_weights[idx]) {
                queue.offer(new int[]{truck_weights[idx], time + bridge_length});
                weight -= truck_weights[idx++];
            }

            time++;
        }
        return time + bridge_length;
    }
