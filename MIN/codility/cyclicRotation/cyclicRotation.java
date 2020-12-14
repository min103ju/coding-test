// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] result = new int[A.length];

        // given
        // A is Integer Array
        // K rotaion number

        // when
        for(int i=0; i < A.length; i++) {
            // 1. now index + k >= array size -> change index = (now index + k) - array size 
            int chgIndex = i + K;
            if(chgIndex >= A.length){
                chgIndex = chgIndex - A.length;
                result[chgIndex] = A[i];
            }
            // 2. change index -> now index + K
            else {
                result[chgIndex] = A[i];
            }
        } 

        // then
        return result;

    }
}
