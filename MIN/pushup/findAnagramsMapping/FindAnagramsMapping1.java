import java.util.*;

public class FindAnagramsMapping1 {
    
    public static void main(String[] args) {
        int[] A = {11,27,45,31,50};
        int[] B = {50,11,31,45,27};

        solve(A, B);
    }

    public static void solve(int[] A, int[] B) {

        int[] result = new int[A.length];
        Map<Integer, Integer> map = new HashMap<>();

        // 1. A를 map에 담는다. key : A[i] : value : i
        for(int i=0; i<A.length; i++) {
            map.put(A[i], i);
        }

        // 2. B의 값을 키로 하여 map에서 추출하고 해당 value를 인덱스로 하여
        // result 배열에 B의 원소 인덱스를 저장
        for(int i=0; i<B.length; i++) {
            int index = map.get(B[i]);
            result[index] = i;
        }

        System.out.println("result : ");
        for(int i : result) {
            System.out.println( i + ",");
        }

    }
}
