import java.util.Arrays;
import java.util.Stack;

public class NotFinishedPlayer1 {

    public static void main(String[] args) {
        PhoneNumberList1 solution = new PhoneNumberList1();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println("answer = " + solution.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //sort 후 stack에 push
        Stack<String> participantStack = pushStack(participant);
        Stack<String> completionStack = pushStack(completion);

        //completion의 peek과 participant의 pop과 비교 후 같지 않으면 answer의 선언
        answer = comparePlayers(participantStack, completionStack);

        return answer;
    }

    public Stack<String> pushStack(String[] players) {

        //unit 코드로 변환 후 비교 sort
        Arrays.sort(players);

        Stack<String> stack = new Stack<String>();

        for(String player : players) {
            stack.push(player);
        }

        return stack;
    }

    public String comparePlayers(Stack<String> participantStack, Stack<String> completionStack) {
        
        while(!participantStack.isEmpty()) {

            String player = participantStack.pop();

            if(player.contentEquals(completionStack.peek())){
                completionStack.pop();
            } else {
                return player;
            }

        }

        return null;
    }
}
