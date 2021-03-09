public class WordSearch2 {
    public static void main(String[] args){
        char[][] grid=  {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println("WordSearch2 result : " + solve(grid, word));
    }

    public static boolean solve(char[][] grid, String word){
        if(grid==null || grid.length==0 || grid[0].length==0) return false;
        if(word==null || word.isEmpty()) return false;

        int x=grid.length;
        int y=grid[0].length;

        boolean[][] visited = new boolean[x][y];

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(dfs(visited, grid, i, j, 0, word)) return true;
            }
        }

        return false;
    }

    public static boolean dfs(boolean[][] visited, char[][] grid, int x, int y, int start, String word){

        System.out.println("word index : " + start);

        int[][] directions = {
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
        };

        int xLength=grid.length;
        int yLength=grid[0].length;
        // 종료 조건
        if(start==word.length()) return true;
        if(x<0 || x>=xLength) return false;
        if(y<0 || y>=yLength) return false;
        if(visited[x][y]) return false;

        visited[x][y]=true;
        if(grid[x][y]==word.charAt(start)){
            for(int[] direction : directions){
                int xMoved = x+direction[0];
                int yMoved = y+direction[1];
                if(dfs(visited, grid, xMoved, yMoved, start+1, word)) return true;
            }
        }

        return false;
    }
}
