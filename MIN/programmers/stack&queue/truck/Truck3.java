import java.util.LinkedList;
import java.util.Queue;

public class Truck3 {

    public static void main(String[] args) {
        Truck3 truck3 = new Truck3();

        int[] truck_weights={7,4,5,6};
        int bridge_length=2, weight=10;

        System.out.println("answer = " + truck3.solution(bridge_length, weight, truck_weights));
    }

    class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }
    }


    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for(int t : truckWeights) {
            waitQ.offer(new Truck(t));
        }

        int time = 0;
        int curWeight = 0;

        while(!waitQ.isEmpty() || !moveQ.isEmpty()) {

            time++;

            if(moveQ.isEmpty()) {
                Truck truck = waitQ.poll();
                curWeight += truck.weight;
                moveQ.offer(truck);
                continue;
            }

            for(Truck t : moveQ) {
                t.moving();
            }

            if(moveQ.peek().move > bridgeLength) {
                Truck truck = moveQ.poll();
                curWeight -= truck.weight;
            }

            if(!waitQ.isEmpty() && (curWeight + waitQ.peek().weight) <= weight) {
                Truck truck = waitQ.poll();
                curWeight += truck.weight;
                moveQ.offer(truck);
            }
        }

        return time;
        
    }
}
