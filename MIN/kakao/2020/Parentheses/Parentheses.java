
package Parentheses;

public class Parentheses {
    public static void main(String[] args){
        String p = "(()())()";
        Solution solution = new Solution();
        
        String answer = solution.solution(p);

        System.out.println("answer : " + answer);
    }
}