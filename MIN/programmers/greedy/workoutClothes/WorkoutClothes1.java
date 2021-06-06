import java.util.*;
import java.util.stream.Collectors;

public class WorkoutClothes1 {

    //바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
    //최대한 많은 학생이 체육수업을 들어야 합니다.

    public static void main(String[] args) {
        WorkoutClothes1 workoutClothes1 = new WorkoutClothes1();
        int n = 5;
        int[] lost={2,4}, reserve={3};

        System.out.println("answer = " + workoutClothes1.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> lostList = Arrays.stream(lost)
                                        .boxed()
                                        .collect(Collectors.toList());

        //reserve
        Set<Integer> reverseSet = generateReserve(lost, reserve);

        for(int r : reverseSet) {

            for(int i=0; i<lostList.size(); i++) {
                if(r-1==lostList.get(i) || r+1==lostList.get(i)) {
                    answer++;
                    lostList.remove(i);
                }
            }
        }
        

        return answer + reverseSet.size();
    }

    public Set<Integer> generateReserve(int[] lost, int[] reserve) {

        Set<Integer> set = new HashSet<>();

        for(int l : lost){
            for(int r : reserve) {
                set.add(r);
                if(l==r) {
                    set.remove(r);
                }
            }
        }

        return set;
    }
}
