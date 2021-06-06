import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumNumber2 {

    public static void main(String[] args) {
        MaximumNumber2 max = new MaximumNumber2();

        int[] numbers = {0, 0, 0};

        System.out.println("answer = " + max.solution(numbers));
    }

    public String solution(int[] numbers) {
        String answer = "";
        String[] strNumbers = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNumbers,  (a,b) -> (b+a).compareTo(a+b));

        //sort 했으나 0자리에 "0"이 있다면 그 수는 0이어야 한다
        //문자열 만드는 것이 아닌 수를 만드는 것임을 생각하자.
        if(strNumbers[0].equals("0")) return "0";
        
        for(String s : strNumbers) {
            answer += s;
        }
        
        return answer;
    }
}
