import java.util.PriorityQueue;

public class Hotter1 {

    public static void main(String[] args) {
        Hotter1 hotter1 = new Hotter1();
        int K = 7;
        int[] scoville = {1, 2, 3, 9, 10, 12};

        System.out.println("answer = " + hotter1.solution(scoville, K));
    }

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int s : scoville) {
            queue.offer(s);
        }

        int answer = 0;

        while(queue.peek() < K) {
            if(queue.size() <= 1) return -1;
            int one = queue.poll();
            int two = queue.poll();
            
            queue.offer(getScoville(one, two));
            answer++;
        }

        return answer;
    }

    public int getScoville(int l, int s) {
        return l + (s * 2);
    }
}
