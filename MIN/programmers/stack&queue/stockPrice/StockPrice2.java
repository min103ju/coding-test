public class StockPrice2 {
    
    public static void main(String[] args) {
        StockPrice2 stockPrice2 = new StockPrice2();
        int[] prices = {1,2,3,2,3};

        print(stockPrice2.solution(prices));
    }

    public int[] solution(int[] prices) {

        int length = prices.length;
        int[] answer = new int[length];

        int i, j;
        for(i=0; i<length; i++) {
            //마지막은 0으로 초기화 되어있기 때문에 loop를 돌 필요가 없다.
            for(j=i+1; j<length; j++) {
                answer[i]++;
                if(prices[i] > prices[j]) break;
            }
        }

        return answer;   
    }

    public static void print(int[] answer) {
        for(int i : answer) {
            System.out.println(i);
        }
    }
}
