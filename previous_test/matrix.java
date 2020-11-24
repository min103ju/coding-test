class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        // given
        int[][] answer = {};
        
        // when
        if(validation(arr1, arr2)){
            answer = new int[arr1.length][arr1[0].length];
            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[i].length; j++) {
                    //then
                    answer[i][j] = arr1[i][j] + arr2[i][j];       
                }
            }
        }
        
        return answer;
    }
    
    public boolean validation(int[][] arr1, int[][] arr2){
        if(arr1.length == 0 || arr1[0].length == 0){
            System.out.println("행렬의 크기가 0입니다.");
            return false;
        }
        
        if(arr1.length > 500 || arr1[0].length > 500){
            System.out.println("행렬의 크기가 500을 초과합니다..");
            return false;
        }
        
        return true;
    }
}