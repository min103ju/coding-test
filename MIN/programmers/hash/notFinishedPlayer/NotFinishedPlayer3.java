import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NotFinishedPlayer3 {
    public static void main(String[] args) {
        NotFinishedPlayer3 solution = new NotFinishedPlayer3();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println("answer = " + solution.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for(String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for(String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) != 0) answer = key;
        }

        return answer;
    }
}
