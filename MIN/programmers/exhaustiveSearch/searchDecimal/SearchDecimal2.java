import java.util.Arrays;
import java.util.TreeSet;

public class SearchDecimal2 {
    class Solution {
        int[] num;
        TreeSet<Integer> set;
        boolean[] visited;
        int answer = 0;
        String numbers="";
        
        public int solution(String numbers) {
        num = new int[numbers.length()];
        set = new TreeSet();
        visited = new boolean[num.length];
        this.numbers = numbers;
            
            for (int i = 0; i < num.length; i++) { // num배열에 숫자 하나씩 뜯어서 저장
                //숫자로 변환 시키고 싶을때 쓰는 방법
                num[i] = numbers.charAt(i) - '0';
            }
    
            Arrays.sort(num);// 오름차순 정렬
    
            for (int i = 0; i < numbers.length(); i++) { // 숫자 조합 구하기
                int[] list = new int[i + 1];
                combination(0, i + 1, -1, list);
            }
    
            boolean[] prime = new boolean[set.last() + 1];
            prime[0] = prime[1] = true;
            // 소수 체크
            for (int i = 2; i <= Math.sqrt(set.last()); i++) {
                if (prime[i])
                    continue;
                for (int j = i + i; j <= set.last(); j += i) {
                    prime[j] = true;
                }
            }
            for(Integer i : set) {
                if(!prime[i])
                    answer++;
            }
            
            return answer;
        }
        
        void combination(int depth, int length, int com, int[] list) {
            if (depth == length) { // 종료 지점
                String tmp = "";
                for (int i = 0; i < list.length; i++) {// list에 들어있는 숫자 붙여서 set에 저장
                    tmp += list[i];
                }
                set.add(Integer.parseInt(tmp));
                return;
            }
    
            for (int i = 0; i < numbers.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    list[depth] = num[i];// list에 저장
                    combination(depth + 1, length, i, list);
                    visited[i] = false;
                }
    
            }
        }
    }
}
