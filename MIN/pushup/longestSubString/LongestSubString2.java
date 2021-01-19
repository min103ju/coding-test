import java.util.*;

public class LongestSubString2 {

    public static void main(String[] args) {

        String s = "aabbaaabbbbbaa";

        System.out.println("result : " + solve(s));

    }

    public static int solve(String s) {

        //1. Data structure
        int start=0, end=0, counter=0, length=0;
        Map<Character, Integer> map = new HashMap<>();

        //2. while 
        while(end < s.length()) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);

            //새로운 문자가 map에 등록 될 경우 counter++
            if(map.get(c) == 1) counter++;
            end++;

            while(counter > 2) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if(map.get(startChar)==0) counter--;
                start++;
            }

            length = Math.max(length, end-start);

        }

        return length;
    }
    
}
