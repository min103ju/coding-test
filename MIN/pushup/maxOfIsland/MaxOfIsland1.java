import java.util.LinkedList;
import java.util.Queue;

public class MaxOfIsland1 {
    public static void main(String[] args){
        char[][] island = 
                        {
                            {'1','1','0','0','1'},
                            {'0','1','1','0','0'},
                            {'0','0','0','0','0'},
                            {'1','1','0','1','1'},
                            {'1','0','1','1','1'},
                            {'1','0','1','1','1'}
                        };

        System.out.println("MaxOfIsland1 result : " + solve(island));
    }

    public static int solve(char[][] island){

        if(island==null) return 0;
        int max=0;

        for(int i=0; i<island.length; i++){
            for(int j=0; j<island[i].length; j++){

                if(island[i][j]=='1'){
                    int islandSize=bfs(island, i, j);
                    max = Math.max(max, islandSize);
                }
            }    
        }

        return max;
    }

    public static int bfs(char[][] island, int x, int y){
        int islandSize = 0;
        int[][] fourDirectionPoint = {
            {0,-1},
            {1,0},
            {0,1},
            {-1,0}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});

        while(!queue.isEmpty()){
        
            int[] point=queue.poll();
            // move to direction
            // if matching condition, offer into queue
            for(int[] direction : fourDirectionPoint){
                int moveX=point[0]+direction[0];
                int moveY=point[1]+direction[1];

                if(validation(moveX, moveY, island)){
                    islandSize++;
                    queue.offer(new int[]{moveX, moveY});
                }
            }
        }

        return islandSize;
    }
    
    public static boolean validation(int x, int y, char[][] island) {
        if(x >= 0 && x < island.length && y >= 0 && y < island[x].length && island[x][y]=='1'){
            island[x][y]='X';
            return true;
        } else {
            return false;
        }
    }
}
