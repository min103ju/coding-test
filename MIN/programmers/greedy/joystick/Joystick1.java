public class Joystick1 {

    //조이스틱으로 알파벳 이름을 완성하세요.
    //조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.

    public static void main(String[] args) {
        Joystick1 joystick1 = new Joystick1();
        String name = "JEROEN";

        System.out.println("answer = " + joystick1.solution(name));
    }

    public int solution(String name) {
        int length=name.length(), moveCharacter=0, moveIndex=name.length()-1;

        //
        char[] charArray = name.toCharArray();
        for(int i=0; i < length; i++) {
            
            moveCharacter += Math.min(charArray[i]-'A', 'Z'-charArray[i]+1);

            int next = i+1;
            
            while(next < length  && charArray[next]=='A') {
                next++;
            }

            moveIndex = Math.min(moveIndex, (i * 2) + length - next);
            
        }

        return moveCharacter + moveIndex;
    }

}
