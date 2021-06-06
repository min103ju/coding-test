public class Joystick3 {
    public static void main(String[] args) {
        Joystick1 joystick1 = new Joystick1();
        String name = "JEROEN";

        System.out.println("answer = " + joystick1.solution(name));
    }

    public int solution(String name) {
        int answer = 0;

        //A~Z의 차이값을 배열로 구하는 것.
        int[] diff = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,12,11,10,9,8,7,6,5,4,3,2,1};

        for(char c : name.toCharArray())
            answer += diff[c-'A'];

        int length=name.length();
        int min=length-1;

        for(int i=0; i<length; i++) {
            int next=i+1;
            while(next<length && name.charAt(next)=='A') {
                next++;
            }

            //length-next는 처음부터 뒤로 가는 것.
            //i와 length-next 중 min 값을 고르는 것.
            min = Math.min(min, i+length-next+Math.min(i,length-next));
        }

        return answer + min;
    }
}
