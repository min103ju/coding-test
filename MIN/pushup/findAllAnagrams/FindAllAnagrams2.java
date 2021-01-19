import java.util.*;

public class FindAllAnagrams2 {
 
    public static void main(String[] args) {
        String text = "BACDGABCDA", pattern = "aAbB";

        solve(text, pattern);
    }

    public static void solve(String text, String pattern) {

        List<Integer> result = new ArrayList<>();

        // 문자를 아스키 배열 코드로 변경
        int[] patArr = new int[256];
        for(int i=0; i<pattern.length(); i++) {
            patArr[pattern.charAt(i)]++;
            // * 아스키 배열 인덱스에 증가 1처리
        }

        // text에서 pattern의 length를 뺀 만큼 반복
        // pattern길이 보다 짧은 문자열은 의미가 없기 떄문
        for(int i=0; i<text.length()-pattern.length()+1; i++) {
            int[] txtArr = new int[256];
            for(int j=0; j<pattern.length(); j++){

                // i부터 4개의 문자열을 txtArr에 넣는다.
                txtArr[text.charAt(i+j)]++;
            }

            if(check(patArr, txtArr)) {
                result.add(i);
            }
        }
        
        for(int i : result) {
            System.out.println(i + ",");
        }

    }   

    public static boolean check(int[] patArr, int[] txtArr) {
        // 아스키 배열이 아닌 Character로 비교 시 
        // 비교가 어렵다.
        // 아스키 배열의 경우 문자의 순서와 상관없이 비교가 가능하지만
        // 문자열의 비교는 순서도 신경써야 하기 때문
        // ex) "ABCD"와 "BCDA" 는 문자열로는 다르지만 아스키 배열의 값을 같다.
        for(int i=0; i<patArr.length; i++) {
            if(patArr[i] != txtArr[i]){
                return false;
            }
        }
        return true;
    }

}
