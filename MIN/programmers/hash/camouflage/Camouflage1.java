import java.util.*;

public class Camouflage1 {
    public static void main(String[] args) {
        Camouflage1 solution = new Camouflage1();

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

    //clothes [이름][종류]
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        for(String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }

        return answer - 1;
       
    }
}
