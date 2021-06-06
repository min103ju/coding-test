public class Carpet1 {

    public static void main(String[] args) {
        int brown = 10; // brown >= 8 && brown <= 5,000
        int yellow = 24; // yellow >= 1 && yellow <= 2,000,000
        // width >= height

        System.out.println("answer = " + solution(brown, yellow));
    }

    public static int[] solution(int brown, int yellow) {

        if(!validateBrown(brown)) return null;
        if(!validateYellow(yellow)) return null;
        
        int[] answer = new int[2]; // { width, height }

        // yellow 
        // 루트를 씌우고 정수로 떨어지면 정사각형
        // 루트를 씌운 값이 실수이면 반올림하고 loop로 돌려서 나온 나눈값과 결과값을 비교하여 
        // max를 width, min을 height
        // width + 1, height + 1을 return

        double rootResult = Math.sqrt(yellow);

        // 숫자의 정수/실수 판별 법
        if((rootResult % 1) != 0) {
            int index = (int)Math.round(rootResult);
            answer = getWidthHeight(index, yellow);
        } else {
            int result = (int)Math.round(rootResult);
            answer[0] = result;
            answer[1] = answer[0];
        }

        answer[0] += 2;
        answer[1] += 2;

        return answer;
    }

    public static int[] getWidthHeight(int initIndex, int yellow) {
        int[] resultWidthHeight = new int[2];
        for(int i = initIndex; i <= yellow; i++) {
            if((yellow % i) == 0) {
                int result = yellow / i;
                resultWidthHeight[0] = Math.max(result, i);
                resultWidthHeight[1] = Math.min(result, i);
                return resultWidthHeight;
            }
        }
        return null;
    }

    public static boolean validateBrown(int brown) {
        return brown >= 8 && brown <= 5000;
    }

    public static boolean validateYellow(int yellow) {
        return yellow >= 1 && yellow <= 2000000;
    }
    
}
