public class PlusOne2 {
    
    public static void main(String[] args){
        // int[] digits = {1,2,3};   
        // int[] digits = {9,9,9};   
        // int[] digits = {8,9,9};   
        int[] digits = {2,1,9,9,9};   

        solve(digits);
    }

    public static void solve(int[] digist) {
        int index = digist.length - 1;
        int carry = 1;

        while(index >=0 && carry > 0) {
            
            digist[index] = (digist[index] + 1) % 10;

            if(digist[index] == 0){
                carry = 1;
            } else {
                carry = 0;
            }

            index--;

        }

        // 맨 처음 원소의 자릿수를 올리게 될 경우 lenth를 하나 늘리고 
        // 0번째 원소를 1로 채운다.
        // carry==1인 경우만 해당
        if(carry == 1){
            digist = new int[digist.length + 1];
            digist[0] = 1;
        }   

        print(digist);
    }

    public static void print(int[] result) {
        for(int i : result) {
            System.out.println("val : " + i);        
        }
    }
}
