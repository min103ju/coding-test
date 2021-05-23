import java.util.HashMap;
import java.util.Set;

public class Camouflage2 {
    
    public static void main(String[] args) {
        Camouflage2 solution = new Camouflage2();

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
        int answer = 1; //곱셈을 위해 1로 선언
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        //map 구하기
        for(int i =0; i<clothes.length; i++){
        	//의상종류, 갯수
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        //조합
        Set<String> keySet = clothesMap.keySet(); //의상종류.
        
        for(String key : keySet) {
        	answer *= clothesMap.get(key)+1; 
        }
        return answer-1; //아무것도 안입는 경우의 수 제거
    }
}
