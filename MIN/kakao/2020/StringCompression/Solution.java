package StringCompression;

public class Solution {

    public int solution(String s) {

        int answer = s.length();
        
        //압축 길이 추출 loop
        for(int i=1; i <= s.length()/2; i++){
            String resultString = "";
            int position = 0;

            //unit 추출 loop
            while(position + i <= s.length()){
                int count = 0;
                String unit = s.substring(position, position + i);
    
                //unit 비교 loop
                while(position + i <= s.length()){
                    if(unit.equals(s.substring(position, position + i))) {
                        count++;
                        position += i;
                    } else {
                        break;
                    }
                }
                resultString += count > 1 ? count + unit : unit;
            }

            if((position + i) - s.length() >= 0) {
                resultString += s.substring(position);
            }
            System.out.println("resultString : " + resultString);
            answer = Math.min(answer, resultString.length());
        }

        return answer;

    }

}
