public class NumberOfIsland_DFS1 {
    public static void main(String[] args){
        // char[][] island = {{'1','1','1','0','1'},
        //                      {'1','1','0','0','0'},
        //                      {'1','1','0','0','1'},
        //                      {'0','0','0','0','1'}};

        char[][] island = {{'1','0','1','0','1'},
                             {'1','1','1','0','0'},
                             {'1','1','0','0','1'},
                             {'0','0','0','0','1'}};

        // char[][] island = {{'1','1','1','0','1'},
        //                      {'0','1','0','0','0'},
        //                      {'1','1','0','0','1'},
        //                      {'0','0','0','0','1'}};

        System.out.println("result : " + solve(island));
    }

    public static int solve(char[][] island){
        // 1. 배열을 0,0 부터 순회

        // 2. '1'을 만나는 경우 count++
        
        // 3. 현재 원소에서 인접한 '1' 원소가 있는지 확인 (상,하,좌,우) - DFS, 재귀함수

        // 4. '1'이 발견되면 'X'로 치환
        //    '0'이면 넘어가고 제외
        int count=0;
        for(int i=0; i<island.length; i++){
            for(int j=0; j<island[i].length; j++){
                if(island[i][j]=='1'){
                    // count가 ++되는 순간 dsf 알고리즘을 통하여 'X'로 치환되기 때문에
                    // 다음 for문이 와도 모두 'X'를 만나기 때문에 count가 증가하지 않는다.
                    // 떨어져있는 '1'을 만나야 count가 증가하고 
                    // 이때 다시 dsf 알고리즘이 동작한다.
                    count++;
                    dsf(island, i, j);
                }
            }
        }

        return count;
    }

    public static void dsf(char[][] island, int i, int j){
        // 제외 조건
        // 1. '0'인 경우
        // 2. index값이 0보다 작은 경우
        // 3. index값이 length보다 큰 경우

        int m=island.length, n=island[0].length;
        // island[i][j]!='1' 조건은 'X'를 고려해서 사용한 조건이다.
        if(i<0 || i>=m || j<0 || j>=n || island[i][j]!='1') return ;
        island[i][j]='X';

        dsf(island, i-1, j);
        dsf(island, i, j-1);
        dsf(island, i+1, j);
        dsf(island, i, j+1);
    }

}
