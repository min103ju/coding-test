import java.util.*;

public class Truck1 {

    public static void main(String[] args) {
        Truck1 truck1 = new Truck1();

        int[] truck_weights={7,4,5,6};
        int bridge_length=2, weight=10;

        System.out.println("answer = " + truck1.solution(bridge_length, weight, truck_weights));
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<int[]> queue = new LinkedList();
        for(int i=0; i<truck_weights.length; i++){
            int[] truck = {truck_weights[i], time + bridge_length};

            while(true) {
                if(weight >= truck[0]) {
                    queue.offer(truck);
                    weight -= truck[0];
                    break;
                } else if(time == queue.peek()[1]){
                    int[] poll = queue.poll();
                    weight += poll[0];
                }
                time++;
            }
        }
        return time + bridge_length;
    }
}
