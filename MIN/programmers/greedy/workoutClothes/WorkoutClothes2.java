public class WorkoutClothes2 {

    public static void main(String[] args) {
        WorkoutClothes2 workoutClothes2 = new WorkoutClothes2();
        int n = 5;
        int[] lost={2,4}, reserve={1,3,5};

        System.out.println("answer = " + workoutClothes2.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] all = new int[n];

        for(int l : lost) 
            all[l-1]--;

        for(int r : reserve) 
            all[r-1]++;

        for(int i=0; i<all.length; i++) {
            if(all[i] < 0) {

                //앞 사람에게 빌리기 
                if(i > 0 && all[i-1] > 0) {
                    all[i]++;
                    all[i-1]--;
                }

                //뒤 사람에게 빌리기
                if(i < all.length-1 && all[i+1] > 0) {
                    all[i]++;
                    all[i+1]--;
                }

            }
        }

        for(int i : all) {
            if(i >= 0) answer++;
        }

        return answer;
    }
}
