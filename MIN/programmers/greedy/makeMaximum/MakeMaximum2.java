public class MakeMaximum2 {

    public static void main(String[] args) {
        MakeMaximum2 makeMaximum2 = new MakeMaximum2();

        String number = "1231234";
        int k = 3;

        System.out.println("answer = " + makeMaximum2.solution(number, k));
    }
    
    public String solution(String number, int k) {
        int idx = 0;
        char max;
	StringBuilder answer = new StringBuilder();

	if(number.charAt(0) == '0') return "0";
	for(int i = 0; i < number.length() - k; i++) {
		max = '0';
        //j <= k + i; 아직도 이해 안감...
		for(int j = idx; j <= k + i; j++) {
	        	if(max < number.charAt(j)) {
	        		max = number.charAt(j); 
                    idx = j + 1;
	        	}
		}			
		answer.append(max);
	}
        return answer.toString();
    }
}
