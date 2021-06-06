import java.util.*;

public class Camouflage3 {
    
    public static void main(String[] args) {
        Camouflage3 solution = new Camouflage3();

        //String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] clothes = {
            {"yellowhat", "headgear"}, 
            {"green_turban", "headgear"},
            {"bluesunglasses", "eyewear"}, 
            {"crowmask", "face"}, 
            {"bluesunglasses", "face"}, 
            {"smoky_makeup", "face"}
        };

        System.out.println("answer : " + solution.solution(clothes));
    }

    public int solution(String[][] clothes) {

        int answer=1;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
            //key - clothe type
            String key = clothes[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(String key : map.keySet()) {
            //특정 옷 종류를 안입는 경우를 위해 +1
            answer *= map.get(key) + 1;
        }

        return answer-1;
    }
}
