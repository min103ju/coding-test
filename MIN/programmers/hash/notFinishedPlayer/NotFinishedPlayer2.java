import java.util.Arrays;

public class NotFinishedPlayer2 {
    public static void main(String[] args) {
        NotFinishedPlayer1 solution = new NotFinishedPlayer1();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println("answer = " + solution.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0 ; i < completion.length; i++) {
            if(!participant[i].contentEquals(completion[i]))
            return participant[i];
        }

        return participant[participant.length-1];
    }

}
