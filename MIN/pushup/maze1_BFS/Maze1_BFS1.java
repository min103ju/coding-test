import java.util.LinkedList;
import java.util.Queue;

public class Maze1_BFS1 {
    public static void main(String[] args) {
        int[][] map = {
            {0,0,1,0,0},
            {0,0,0,0,0},
            {0,0,0,1,0},
            {1,1,0,1,1},
            {0,0,0,0,0}
        };

        int[] start = {0,4};
        int[] destination = {3,2};

        System.out.println("Maze1 BFS1 Result : " + solve(map, start, destination));

        System.out.println("Now Map : " + map);
    }

    public static boolean solve(int[][] map, int[] start, int[] destination) {
        
        int[][] directions = {
            {-1,0},
            {0,-1},
            {1,0},
            {0,1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] point = queue.poll();

                if(point[0]==destination[0] && point[1]==destination[1]) return true;

                int presentPoint = bfs(map, point[0], point[1], destination);
                if(presentPoint==0){
                    for(int[] direction : directions){
                        queue.offer(new int[]{point[0]+direction[0], point[1]+direction[1]});
                    }
                } 
            }
        }

        return false;
    }

    public static int bfs(int[][] map, int x, int y, int[] destination){
        if(x < 0 || x >= map.length || y < 0 || y >= map[x].length) return 1;
        System.out.println("move to this way");
        System.out.println("x : [" + x + "]");
        System.out.println("y : [" + y + "]");
        int tempValue = map[x][y];
        map[x][y]=9;
        return tempValue;
    }
}
