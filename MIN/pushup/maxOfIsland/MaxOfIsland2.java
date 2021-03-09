public class MaxOfIsland2 {
    public static void main(String[] args){
        char[][] grid = 
                        {
                            {'1','1','0','0','1'},
                            {'0','1','1','0','0'},
                            {'0','0','0','0','0'},
                            {'1','1','0','1','1'},
                            {'1','0','1','1','1'},
                            {'1','0','1','1','1'}
                        };

        System.out.println("MaxOfIsland2 result : " + solve(grid));
    }

    public static int solve(char[][] grid){
        if(grid==null||grid.length==0) return 0;

        int max=0;
        int rowSize=grid.length, colSize=grid[0].length;
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                if(grid[i][j]=='1'){
                    int size=dfs(grid, i, j, 0);
                    max=Math.max(max, size);
                }
            }
        }
        return max;
    }

    public static int dfs(char[][] grid, int x, int y, int size){
        int[][] directions = {
            {0,-1},
            {1,0},
            {0,1},
            {-1,0}
        };

        for(int[] direction : directions){
            int moveX=x+direction[0];
            int moveY=y+direction[1];
            if(validation(moveX, moveY, grid)){
                size++;
                size = dfs(grid, moveX, moveY, size);
            }
        }
        return size;
    }

    public static boolean validation(int x, int y, char[][] grid) {
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[x].length && grid[x][y]=='1'){
            grid[x][y]='X';
            return true;
        } else {
            return false;
        }
    }
}
