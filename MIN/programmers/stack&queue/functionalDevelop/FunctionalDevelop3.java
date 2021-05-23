import java.util.Arrays;

public class FunctionalDevelop3 {
    
    public static void main(String[] args) {
        FunctionalDevelop3 func = new FunctionalDevelop3();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        func.println(func.solution(progresses, speeds));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfEnd = new int[100];
        int day = -1;

        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfEnd[day]++;
        }
        return Arrays.stream(dayOfEnd).filter(i -> i != 0).toArray();
    }

    public void println(int[] answer) {
        for(int i : answer) {
            System.out.println("[" + i + "]");
        }
    }
}
