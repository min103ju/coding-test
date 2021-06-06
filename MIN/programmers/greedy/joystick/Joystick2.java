public class Joystick2 {
    public static void main(String[] args) {
        Joystick2 joystick2 = new Joystick2();
        String name = "JEAAAN";

        System.out.println("answer = " + joystick2.solution(name));
    }

    public int solution(String name) {
        int answer = 0;

        int len = name.length();

        //최대 move 값
        int minMove = len-1;

        for(int i=0; i<len; i++){
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

            //좌우: 연속된 A의 등장에 따라 최소 움직임이 달라진다.
            int next = i+1;

            while(next < len && name.charAt(next) == 'A')
                next++;

            //i+i -> 현재까지 왔다가 다시 돌아가는 움직이는 수
            //len-next -> 전체 문자열에서 A를 제외한 나머지 문자 갯수

            int move = i+len-next+i;
            minMove = Math.min(minMove, move);
        }
        
        answer += minMove;

        return answer;
    }

}
