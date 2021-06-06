import java.util.*;

public class Boat1 {

    public static void main(String[] args) {
        Boat1 boat1 = new Boat1();

        int[] people = {70, 50, 80, 50};
        int limit = 130;

        System.out.println("answer = " + boat1.solution(people, limit));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> remain = new ArrayList<>();
        List<Integer> boat = new ArrayList<>();

        for(int p : people) {
            remain.add(p);
        }

        while(remain.size() != 0) {
            int temp = limit;
            for(int i=0; i < remain.size(); i++) {
                int e = remain.get(i);
                if(temp >= e) {
                    boat.add(e);
                    remain.remove(i);
                    temp -= e;;
                    i=-1;
                }
                if(boat.size() == 2) break;
            }
            answer++;
            boat.clear();
        }

        return answer;
    }
}
