import java.util.Arrays;

public class Boat2 {

    public static void main(String[] args) {
        Boat2 boat2 = new Boat2();

        int[] people = {70, 50, 80, 50};
        int limit = 130;

        System.out.println("answer = " + boat2.solution(people, limit));
    }
    
    public int solution(int[] people, int limit) {
        int answer = 0;

        //정렬 후 최소값과 최대값을 sum하여 확인하는 문제
        Arrays.sort(people);

        int min = 0;

        for(int max = people.length-1; min <= max; max--) {
            if(people[min] + people[max] <= limit) 
                min++;
            answer++;
        }

        return answer;
    }
}
