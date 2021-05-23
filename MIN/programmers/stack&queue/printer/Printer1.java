import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;


public class Printer1 {
    
    public static void main(String[] args) {
        Printer1 printer = new Printer1();
        int[] priorites = {2,1,3,2};
        // 1,3,2,2
        // 3,2,2,1
        // 2,2,1
        // 2,1
        

        int location = 2;

        System.out.println("answer = " + printer.solution(priorites, location));
    }

    public int solution(int[] priorites, int location) {
       int answer = 1;

       PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

       for(int priority : priorites) {
           priorityQueue.offer(priority);
       }

       while(!priorityQueue.isEmpty()) {
           for(int i=0; i < priorites.length; i++) {
               if(priorityQueue.peek() == priorites[i]){
                   if(i==location) return answer;
                   priorityQueue.poll();
                   answer++;
               }
           }
       }

       return answer;
    }
}
