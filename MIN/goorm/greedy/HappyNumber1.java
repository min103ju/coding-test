import java.util.Optional;

public class HappyNumber1 {
    public static void main(String[] args) throws Exception {
		solution(Integer.parseInt("66"));
        //S0의 각 자리 숫들의 제곱의 합을 = S1
	} 

    public static void solution(int n) {
        int result=n;
        while(true) {
            int tempResult = result;
            result = 0;
            //새로운 result 계산
            //(1^2 + 6^2)
            for(int i=9; i>=0; i--) {
                double divide = Math.pow(10, i);
                int d = (int)(tempResult / divide);
                result += Math.pow(d,2);
                tempResult %= divide;
            } 

            System.out.println("Now Number is " + result);

            if(result==n) {
                System.out.println(n + " is Unhappy Number.");
                break;
            }
            if(result==1) {
                System.out.println(n + " is Happy Number.");
                break;
            }

        }

    }
}
