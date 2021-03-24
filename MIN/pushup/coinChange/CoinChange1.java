import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CoinChange1 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println("CoinChange 1 : " +  solve(coins, amount));
    }

    public static int solve(int[] coins, int amount) {
        //check
        if(coins==null) return 0;
        if(coins.length==0) return 0;
        if(amount==0) return 0;

        //result
        int min = 999999999;

        //Queue
        Queue<Map<String,Integer>> queue = new LinkedList<>();

        // root is 11
        Map<String,Integer> root = new HashMap<>();
        root.put("value", amount);
        root.put("count", 0);
        queue.offer(root);

        while(!queue.isEmpty()){
            Map<String,Integer> map = queue.poll();

            for(int coin : coins){
                Map<String, Integer> node = new HashMap<>();
                int count = map.get("count");
                int value = map.get("value");
                value-=coin;
                count++;

                if(value > 0){
                    node.put("value", value);
                    node.put("count", count);
                    queue.offer(node);
                }

                //if count is zero, then calculate total sum
                if(value==0){
                    System.out.println("When remain value is zero, count is : " + count);
                    min = Math.min(min, count);
                } 
            }
            
        }

        return min;
    }

}
