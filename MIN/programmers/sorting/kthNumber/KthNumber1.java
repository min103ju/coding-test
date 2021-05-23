import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KthNumber {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNumber max = new KthNumber();
        max.print(max.solution(array, commands));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {

            List<Integer> subList = Arrays.stream(array)
                                          .boxed()
                                          .collect(Collectors.toList())
                                          .subList(commands[i][0]-1, commands[i][1]);
                                          
            Collections.sort(subList);
            answer[i] = subList.get(commands[i][2]-1);

        }

        return answer;
    }

    public void print(int[] answer) {
        for(int a : answer) {
            System.out.println("answer = " + a);
        }
    }
}