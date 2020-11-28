// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int N) {

        List<String> binaryStringList = new ArrayList();

        getBinary(N, binaryStringList);
        Collections.reverse(binaryStringList);
       
        return getBinaryMaxGapLength(binaryStringList);
    }

    //Get Binary 
    public int getBinary(int N, List<String> binaryStringList) {
        binaryStringList.add(String.valueOf(N % 2));
        int binary = N != 1 ? this.getBinary(N / 2, binaryStringList) : N;
        return binary;
    }

    // Get Max Gap Length
    public int getBinaryMaxGapLength(List<String> binaryStringList) {
        int max = 0, length = 0;

        for(int i=0; i < binaryStringList.size(); i++){
            int s = Integer.parseInt(binaryStringList.get(i));
            if(s == 1){
                max =  max > length ? max : length;
                length = 0;
            } else if(binaryStringList.size() - 1 != i) {
                length ++;
            }
        }

        return max;
    }

}
