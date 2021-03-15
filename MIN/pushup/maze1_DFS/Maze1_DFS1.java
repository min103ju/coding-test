
public class Maze1_DFS1 {
    public static void main(String[] args) {
        int[][] maze = {
            {0,0,1,0,0},
            {0,0,0,0,0},
            {0,0,0,1,0},
            {1,1,0,1,1},
            {0,0,0,0,0}
        };

        int[] start = {0,4};
        int[] destination = {4,4};

        System.out.println("Maze1 DFS1 Result : " + solve(maze, start, destination));
    }

    public static boolean solve(int[][] maze, int[] start, int[] destination) {
        if(maze==null) return false;
        if(maze.length==0 || maze[0].length==0) return false;
        if(start[0]==destination[0] && start[1]==destination[1]) return true;

        boolean result = true;

        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[start[0]][start[1]] = true;

        int[][] directions = {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        };

        for(int[] dir : directions){
            result = dfs(maze, visited, destination, dir, start[0], start[1]);
        }

        return result;

    }

    public static boolean dfs(int[][] maze, boolean[][] visited, int[] destination, int[] direction, int x, int y) {

        int m = maze.length;
        int n = maze[0].length;

        while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y]==0){
            x+=direction[0];
            y+=direction[1];
        }
        x-=direction[0];
        y-=direction[1];

        if(visited[x][y]) return false;
        visited[x][y]=true;
        printVisited(visited);

        if(x==destination[0] && y==destination[1]) return true;
        
        int[][] directions = {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        };

        for(int[] dir : directions){
            if(dfs(maze, visited, destination, dir, x, y)){
                return true;
            }
        }
        
        return false;
    }

    public static void printVisited(boolean[][] visited) {
        if(visited==null) return;

        System.out.println("=============================================");
        
        for(int i=0; i<visited.length; i++) {
            for(int j=0; j<visited[i].length; j++){
                System.out.print(visited[i][j] + "\t");
            }
            System.out.println();
        }
    }
}