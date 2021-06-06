import java.util.Arrays;

public class MaximumNumber1 {

    public static void main(String[] args) {
        MaximumNumber1 max = new MaximumNumber1();

        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println("answer = " + max.solution(numbers));
    }

    public String solution(int[] numbers) {

        String answer = "";

        String[] strNumbers = new String[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        //2개 더하여 b+a 와 a+b를 비교하여 어떤게 더 큰 것인지 확인
        Arrays.sort(strNumbers, (a,b) -> (b+a).compareTo(a+b));

        print(strNumbers);

        if(strNumbers[0].equals("0")) return "0";
        
        for(String a : strNumbers) {
            answer += a;
        }

        return answer;
    }

    public void print(String[] str) {
        for(String s : str) {
            System.out.println("s = " + s);
        }
    }
}