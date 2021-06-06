import java.util.Stack;

public class MakeMaximum3 {

    public static void main(String[] args) {
        MakeMaximum3 makeMaximum3 = new MakeMaximum3();

        String number = "4177252841";
        int k = 4;

        System.out.println("answer = " + makeMaximum3.solution(number, k));
    }
    
    public String solution(String number, int k) {
        char[] result = new char[number.length()-k];
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < number.length(); i++) {
            char c = number.charAt(i);

            //k는 pop하면서 차감
            while(!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }

        for(int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }

        return new String(result);
    }
}
