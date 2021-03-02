import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS2 {
    public static void main(String[] args){
        char[][] grid = 
                        {
                            {'1','1','1','0','1'},
                            {'1','1','0','0','0'},
                            {'1','1','0','0','1'},
                            {'0','0','0','0','1'}
                        };

        solve(grid);
    }

    public static void solve(char[][] grid){

        if(grid.length!=0||grid!=null) {

            int count=0;

            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[i].length; j++){
                    if(grid[i][j]=='1'){
                        count++;
                        System.out.println("i:"+i+",j:"+j);
                        bfs(grid, i, j);
                    }
                }
            }
            System.out.println("NumberOfIsland_BFS result : " + count);
        }
    }

    public static void bfs(char[][] grid, int x, int y){
        final int[][] dirs={{0,-1},{1,0},{0,1},{-1,0}};
        Queue<int[]> queue = new LinkedList<>();

        // '1'이 최초로 발견된 곳의 포인터를 기점으로 BFS를 하기 때문에
        // queue에 포인터를 담는다.
        queue.offer(new int[]{x,y});
        // 기발견된 곳은 'X'로 이미 서치함을 Marking한다.
        grid[x][y]='X';

        while(!queue.isEmpty()){
            // 기점
            int[] point=queue.poll();

            // 사방으로 포인터를 옮겨 육지인 곳을 찾는다.
            for(int[] dir : dirs){
                int x1=dir[0]+point[0];
                int y1=dir[1]+point[1];

                // grid의 범위에 대한 조건과 '1', 즉 육지를 발견 했을 때를 조건으로 하여 queue에 포인터를 담는다.
                if(x1>=0 && x1<grid.length && y1>=0 && y1<grid[x1].length && grid[x1][y1]=='1'){
                    grid[x1][y1]='X';
                    queue.offer(new int[]{x1,y1});
                }
            }
        }
        
    }
}
