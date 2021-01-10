import java.util.Stack;

public class LicenseKeyFormatting1 {
    
    public static void main(String[] args){

        int k = 4;
        String licenseKey1 = "8F3Z-2e-9-w";
        String licenseKey2 = "8-5g-3-J";

        solve(k, licenseKey1);
        solve(k, licenseKey2);
        
    }

    public static void solve(int k, String licenseKey){

        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();

        //1. 하이픈 제거
        //2. toUpper
        String str = licenseKey.replace("-", "").toUpperCase();

        for(char c : str.toCharArray()){
            stack.push(c);
        }

        int i=1;
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            if(i % k == 0 && i != str.length()){
                sb.append("-");
            }
            i++;
        }

        System.out.println("result : " + sb.reverse().toString());

    }
}
