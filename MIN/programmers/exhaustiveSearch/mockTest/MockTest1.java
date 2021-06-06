import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest1 {

    public static void main(String[] args) {
        MockTest1 mock = new MockTest1();
        int[] answers = {1,3,2,4,2};

        mock.print(mock.solution(answers));
    }

    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        int[] firstAnswers = {1,2,3,4,5};
        int[] secondAnswers = {2,1,2,3,2,4,2,5};
        int[] thirdAnswers = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answers.length; i++){
            //first
            if(answers[i]==firstAnswers[i%5]) { 
                answer[0]++;
            }

            //second
            if(answers[i]==secondAnswers[i%8]) { 
                answer[1]++;
            }

            //third
            if(answers[i]==thirdAnswers[i%10]) { 
                answer[2]++;
            }
        }

        return generateAnswer(answer);
    }

    public int[] generateAnswer(int[] answer){

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[answer.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = answer[i];
        }

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            if(answer[i] == arr[2]) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public void print(int[] answers) {
        for(int answer : answers) {
            System.out.println("answer = " + answer);
        }
    }
}
