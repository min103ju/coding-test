import java.util.*;

public class GroupAnagrams2 {
    public static void main(String[] args) {
        String[] anagrams = {"eat","tea","tan","ate","nat","bat"};

        solve(anagrams);
    }

    public static void solve(String[] anagrams){
        //1
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap();

        //2
        for(String anagram : anagrams) {
            char[] c = anagram.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if(map.containsKey(key)) {
                map.get(key).add(anagram);
            } else {
                List<String> list = new ArrayList<>();
                list.add(anagram);
                map.put(key, list);
            }
        }

        result.addAll(map.values());

        System.out.println(result);
    }
}
