import java.util.ArrayList;
import java.util.*;

public class MakeMaximum1 {

    public static void main(String[] args) {
        MakeMaximum1 makeMaximum1 = new MakeMaximum1();

        String number = "1231234";
        int k = 3;

        System.out.println("answer = " + makeMaximum1.solution(number, k));
    }

    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int cnt = number.length()-k;
        int left = 0;

        //현재 선택한 수를 제외하고 오른편에 아직 선택해야할 갯수와 같거나 많은 수가 있어야 한다.
        int right = number.length()-cnt;
        int idx = left;

        
        while(cnt > 0){
            int max = 0;
            for(int i=left; i<=right; i++) {
                int n = number.charAt(i);
                if(n > max) {
                    max = n;
                    idx = i;
                }
            }
            left = idx+1;
            //현재 선택한 수를 제외하고 오른편에 아직 선택해야할 갯수와 같거나 많은 수가 있어야 한다.
            right = number.length() - --cnt;
            answer.append(number.charAt(idx));
        }
        

        return answer.toString();
    }
}   
