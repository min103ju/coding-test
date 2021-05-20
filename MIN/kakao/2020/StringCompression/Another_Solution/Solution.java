package StringCompression.Another_Solution;

public class Solution {
    public int solution(String s){
        int answer = s.length();

        for(int i=1; i <= s.length()/2; i++){
            int result = getSplitedLength(s, i, 1).length();
            answer = Math.min(answer, result);
        }

        return answer;
    }    

    public String getSplitedLength(String s, int splitLength, int repeat){
        if(s.length() < splitLength) return s;

        String preString = s.substring(0, splitLength);
        String postString = s.substring(splitLength);

        if(!postString.startsWith(preString)){
            if(repeat == 1) return preString + getSplitedLength(postString, splitLength, 1);
            return repeat + preString + getSplitedLength(postString, splitLength, 1);
        }

        return getSplitedLength(postString, splitLength, repeat + 1);
    }
}
