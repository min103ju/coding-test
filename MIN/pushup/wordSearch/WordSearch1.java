public class WordSearch1 {
    public static void main(String[] args){
        char[][] grid=  {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println("WordSearch1 result : " + solve(grid, word));
    }

    public static boolean solve(char[][] grid, String word) {
        if(grid==null || grid.length<=0) return false;

        boolean result = false;

        //dfs
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                result = dfs(grid, i, j, word);
            }
        }

        // return word==null || word.isEmpty() ? true : false;
        return result;
        //word.length == 0 -> true, != 0 false
    }

    public static boolean dfs(char[][] grid, int i, int j, String word){

        System.out.println("word : " + word);

        if(word.isEmpty()) return true;

        if(i>=0 && i<grid.length && j>=0 && j<grid[i].length && grid[i][j]!='X') {
            char character = grid[i][j];
            int[][] directions = {
                {0,1},
                {0,-1},
                {1,0},
                {-1,0}
            };

            char firstCharacter = word.charAt(0);
            if(firstCharacter == character){
                word = word.replaceFirst(String.valueOf(character), "");
                for(int[] direction : directions){
                    int x = i + direction[0];
                    int y = j + direction[1];
    
                    dfs(grid, x, y, word);
                }
                grid[i][j]='X';
            }
        } 

        return false;

    }
}
