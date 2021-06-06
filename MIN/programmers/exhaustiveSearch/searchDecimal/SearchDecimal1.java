import java.util.HashSet;
import java.util.Set;

public class SearchDecimal1 {

    public static void main(String[] args) {
        SearchDecimal1 searchDecimal1 = new SearchDecimal1();
        String numbers = "1733";

        System.out.println("answer = " + searchDecimal1.solution(numbers));
    }

    public int solution(String numbers) {
        int answer = 0;

        char[] array = numbers.toCharArray();
        Set<Integer> set = new HashSet<>();

        int length = array.length;

        //소수 구하는 로직 알아보자
        //n/

        combineNumber(numbers);
        

        // if(checkDecimal(n)) set.add(n);

        return answer;
    }

    public boolean checkDecimal(int n) {

        if(n==1) return false;
        if(n==0) return false;

        for(int i=2; i< n-1; i++){
            if((n%i) == 0) return false;
        }

        return true;
    }   

    public String combineNumber(String n) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] array = n.toCharArray();
        int length = array.length;

        for(int i=0; i<length; i++) {
            if(i==length-1) {
                stringBuilder.append(array[i]);
            }
            stringBuilder.append(array[i] + combineNumber(n.substring(i+1)));
        }

        System.out.println(stringBuilder.toString());

        return stringBuilder.toString();
    }
}
