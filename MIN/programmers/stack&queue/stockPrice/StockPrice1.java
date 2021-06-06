import java.util.*;

public class StockPrice1 {
    
    public static void main(String[] args) {
        StockPrice1 stockPrice1 = new StockPrice1();
        int[] prices = {1,2,3,2,3};

        stockPrice1.print(stockPrice1.solution(prices));
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int idx=0, length=prices.length-1;
        Queue<Integer> queue = new LinkedList<>();

        while(idx <= length) {
            for(int i=idx; i <= length; i++) {
                //비교
                if(prices[idx] > prices[i] || i==length) {
                    queue.offer(i-idx);
                    idx += 1;
                    break;
                }
            }
        }

        for(int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public void print(int[] answer) {
        for(int i : answer) {
            System.out.println(i);
        }
    }
}
