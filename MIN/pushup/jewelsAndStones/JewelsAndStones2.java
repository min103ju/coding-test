
import java.util.*;

public class JewelsAndStones2 {
    
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(solve(jewels, stones));
    }

    public static int solve(String jewels, String stones){
        Set<Character> set = new HashSet<>();
        int result = 0;

        for(char jewel : jewels.toCharArray()) {
            set.add(jewel);
        }

        for(char stone : stones.toCharArray()) {
            if(set.contains(stone)) result++;
        }

        return result;
    }
}
