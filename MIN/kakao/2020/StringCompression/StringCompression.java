package StringCompression;

import StringCompression.Another_Solution.Solution;

public class StringCompression {
    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";

        Solution solution = new Solution();
        int answer = solution.solution(s);

        System.out.println("answer : " + answer);
    }
}
