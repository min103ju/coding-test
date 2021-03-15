
public class Maze1_DFS2 {
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

        System.out.println("Maze1 DFS2 Result : " + solve(maze, start, destination));
    }

    public static boolean solve(int[][] maze, int[] start, int[] destination) {
        if(maze==null) return false;
        if(maze.length==0 || maze[0].length==0) return false;
        if(start[0]==destination[0] && start[1]==destination[1]) return true;

        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];

        return dfs(maze, start, destination, visited);
    }

    public static boolean dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited) {

        int[][] directions = {
            {-1,0},
            {0,-1},
            {1,0},
            {0,1}
        };

        int x = start[0], y = start[1];
        int m = maze.length, n = maze[0].length;
        
        if(x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) return false;

        visited[x][y] = true;
        printVisited(visited);
        if(x==destination[0]&&y==destination[1]) return true;

        for(int[] direction : directions) {
            x = start[0];
            y = start[1];
            while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y]==0){
                x+=direction[0];
                y+=direction[1];
            }
            x-=direction[0];
            y-=direction[1];

            if(dfs(maze, new int[]{x,y}, destination, visited)) return true;
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