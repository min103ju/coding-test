import java.util.LinkedList;
import java.util.Queue;

public class Maze1_BFS2 {
    public static void main(String[] args) {
        int[][] map = {
            {0,0,1,0,0},
            {0,0,0,0,0},
            {0,0,0,1,0},
            {1,1,0,1,1},
            {0,0,0,0,0}
        };

        int[] start = {0,4};
        int[] destination = {4,4};

        System.out.println("Maze1 BFS2 Result : " + solve(map, start, destination));

    }

    public static boolean solve(int[][] map, int[] start, int[] destination) {
        int m = map.length;
        int n = map[0].length;
        int[][] directions = {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        };

        if(start[0]==destination[0] && start[1]==destination[1]) return true;

        boolean[][] visited = new boolean[m][n];

        visited[start[0]][start[1]] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);

        while(!queue.isEmpty()){
            int[] point = queue.poll();
            for(int[] direction : directions){
                //move to direction;
                int x = point[0]+direction[0];
                int y = point[1]+direction[1];

                // Ball never stop unless it meets the wall.
                while(x >= 0 && x < m && y >= 0 && y < n && map[x][y]==0){
                    x+=direction[0];
                    y+=direction[1];
                }

                //if face to wall back to point
                x-= direction[0];
                y-= direction[1];

                //check visited 
                if(visited[x][y]) continue;
                visited[x][y] = true;
                printMap(visited);
                //check destination
                if(x==destination[0] && y==destination[1]) return true;
                queue.offer(new int[]{x,y});
                
            }
        }
        return false;
    }

    public static void printMap(boolean[][] visited){
        if(visited==null||visited.length==0) return;
        
        System.out.println("============================================");

        for(int i=0; i<visited.length; i++){
            for(int j=0; j<visited[i].length; j++){
                System.out.print(visited[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
