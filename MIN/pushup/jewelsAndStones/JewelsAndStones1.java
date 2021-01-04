public class JewelsAndStones1 {
    
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(solve(jewels, stones)); 

    }

    public static int solve(String jewels, String stones){

        int result = 0;

        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    result++;
                }
            } 
        }

        return result;
    }
}
