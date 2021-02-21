import java.util.Stack;

public class BaseballGame1 {
    public static void main(String[] args){
        String[] input = {"5","-2","4","C","D","9","+","+"};

        System.out.println("result : " + solve(input));
    }

    public static int solve(String[] input) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int result=0;

        for(String str : input) {

            if(numberCheck(str)) {
                integerStack.push(Integer.parseInt(str));
            } else {
                stringCalculataion(str, integerStack);
                stringStack.push(str);
            }
        }

        while(!integerStack.empty()) {
            result+=integerStack.pop();
        }

        return result;
    }

    public static boolean numberCheck(String element) {
        for(char c : element.toCharArray()) {
            if(c >= 48 && c <= 57) {
                return true;
            }
        }

        return false;
    }

    public static void stringCalculataion(String str, Stack<Integer> integerStack) {

        switch (str) {
            case "C":
                integerStack.pop();
                break;
            case "D":
                int i = integerStack.peek(); 
                i *= 2;
                integerStack.push(i);
                break;
            case "+":
                int i1 = integerStack.pop(); 
                int i2 = integerStack.pop(); 
                integerStack.push(i2);
                integerStack.push(i1);
                integerStack.push(i1+i2);
                break; 
            default:
                break;
        }
    }
}
