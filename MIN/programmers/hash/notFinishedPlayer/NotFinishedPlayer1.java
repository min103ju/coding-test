import java.util.Arrays;
import java.util.Stack;

public class NotFinishedPlayer1 {

    public static void main(String[] args) {
        NotFinishedPlayer1 solution = new NotFinishedPlayer1();

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
