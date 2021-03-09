import java.util.*;

public class WordLadder1 {
    public static void main(String[] args){
        String beginWord = "hit", endWord = "cog";
        String[] wordList = {"hot", "dot", "lot", "log", "cog"};

        System.out.println("Result : " + solve(beginWord, endWord, Arrays.asList(wordList)));
    }

    public static int solve(String begin, String end, List<String> wordList){


        Queue<String> queue = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);

        queue.offer(begin);
        dict.remove(begin);
        int level=1;

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0; i<size; i++){
                String str = queue.poll();
                if(str.equals(end)) return level;
                for(String neighbor : neighbors(str, dict)) {
                    queue.offer(neighbor);
                }
            }
            System.out.println("Queue : " + queue);
            level++;
        }

        return level;
    }

    public static List<String> neighbors(String str, Set<String> dict){

        List<String> res = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            char[] chars = str.toCharArray();
            for(char ch='a'; ch<='z'; ch++){
                chars[i] = ch;
                String word = new String(chars);
                if(dict.remove(word)){
                    res.add(word);
                }
            }
        }
        return res;
    }
    
}
