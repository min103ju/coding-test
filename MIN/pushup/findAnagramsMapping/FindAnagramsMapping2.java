import java.util.HashMap;
import java.util.Map;

public class FindAnagramsMapping2 {
    
    public static void main(String[] args) {
        int[] A = {11,27,45,31,50};
        int[] B = {50,11,31,45,27};

        solve(A, B);
    }

    public static void solve(int[] A, int[] B) {

        int result[] = new int[A.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<B.length; i++) {
            map.put(B[i], i);
        }

        for(int i=0; i<A.length; i++) {
            result[i] = map.get(A[i]);
        }

        System.out.println("result : ");
        for(int i : result) {
            System.out.println( i + ",");
        }
    }
}
