import java.util.*;

public class GroupAnagrams1 {
    public static void main(String[] args) {
        String[] anagrams = {"eat","tea","tan","ate","nat","bat"};

        solve(anagrams);
    }

    public static void solve(String[] anagrams){

        // 1. Data Structure
        List<int[]> asciiList = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();

        // 2. Anagram Sort & Convert Ascii Code
        Arrays.sort(anagrams);
        for(String anagram : anagrams){
            asciiList.add(convertToAscii(anagram));
        }

        // 3. Remove Duplication
        asciiList = removeDuplication(asciiList);

        // 4. Check
        asciiList.stream().forEach(x -> {
            List<String> list = new ArrayList<>();
            for(int i=0; i < anagrams.length; i++) {
                if(check(x, convertToAscii(anagrams[i]))){
                    list.add(anagrams[i]);
                }
            }
            result.add(list);
        });

        System.out.println(result);
       
    }

    public static List removeDuplication(List<int[]> asciiList) {
        for(int i=0; i < asciiList.size()-1; i++) {
            for(int j=i+1; j < asciiList.size(); j++) {
                if(check(asciiList.get(i), asciiList.get(j))) {
                    asciiList.remove(j);
                    j=i+1;
                }
            }
        }
        return asciiList;
    }

    public static int[] convertToAscii(String anagram) {
        int[] ascii = new int[256];
        for(char c : anagram.toCharArray()) {
            ascii[c]++;
        }
        return ascii;
    }

    public static boolean check(int[] orgAscii, int[] toAscii) {
        for(int i=0; i<orgAscii.length; i++) {
            if(orgAscii[i] != toAscii[i]){
                return false;
            }
        }
        return true;
    }

}
