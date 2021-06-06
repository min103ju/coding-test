import java.util.Stack;

public class RemoveParis1 {

    public static void main(String[] args) {
        String s = "cdcd";

        System.out.println("answer = " + solution(s));
    }

    public static int solution(String s) {

        int answer = 0;
        
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            
            if (stack.isEmpty() || stack.peek() != c) {
                stack.add(c);
                continue;
            }

            if (stack.peek() == c) {
                stack.pop();
                continue;
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        }

        return answer;
    }
}