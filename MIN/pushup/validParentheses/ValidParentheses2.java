import java.util.Stack;

public class ValidParentheses2 {
    public static void main(String[] args){
        String exp="{[]}";

        System.out.println("result :"+solve(exp));
    }

    public static boolean solve(String exp){
        if(exp.length()%2!=0) return false;
        
        Stack<Character> stack=new Stack<>();
        for(char c : exp.toCharArray()){
            switch (c) {
                case ')':
                    if(!stack.empty() && stack.peek()=='(') stack.pop();
                    break;
                case ']':
                    if(!stack.empty() && stack.peek()=='[') stack.pop();
                    break;
                case '}':
                    if(!stack.empty() && stack.peek()=='{') stack.pop();
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }

        return stack.empty();
    }
}
