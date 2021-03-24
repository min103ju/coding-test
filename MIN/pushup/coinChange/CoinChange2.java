import java.util.Arrays;

public class CoinChange2 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println("CoinChange 2 : " +  solve(coins, amount));
    }

    public static int solve(int[] coins, int amount) {
        int max = amount+1;

        //Array dp is dummy data array.
        //To Create Array that is 0~amount, The array length is same amount array length.
        //Value doesn't matter anything.
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0]=0;

        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                //At least coin is less than total sum element
                //e.g) if total sum is '1', Doesn't calculate 2,5 coin. becouse of 2,5 coin is grater than '1'
                if(i >= coins[j]){
                    // dp[i-coins[j]+1 계산식은 결국 필요 코인 수를 구하는 계산식이다.
                    // e.g) i==4, coins==[1,2];
                    // When coin is '1', dp[3], This means needs to '1' coin from The number of coin to make '3'. (1,2)
                    // The number of coin is Three
                    // But coin is '2', dp[2], This means need to '2' coin from The number of coin to make '2' (2)
                    // The number of coin is Two
                    // In the avobe case, We need minimum case. That is coin is '2'
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
