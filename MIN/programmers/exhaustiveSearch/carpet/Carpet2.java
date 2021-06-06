public class Carpet2 {
    public static void main(String[] args) {
        int brown = 24; // brown >= 8 && brown <= 5,000
        int yellow = 24; // yellow >= 1 && yellow <= 2,000,000

        System.out.println("answer = " + solution(brown, yellow));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int block = brown + yellow;
        for (int i = 3; i * 3 <= block; i++) {
            int width = i;
            int height = block / i;

            // 여러가지 경우의 수가 나올수 있으나 yellow 갯수에 따라 답은 하나로 도출된다.
            int insideBlock = (width - 2) * (height - 2);
            if(block % i == 0 && insideBlock == yellow) {
                answer[0] = Math.max(width, height);
                answer[1] = Math.min(width, height);
                break;
            }
        }
        return answer;
    }
}
