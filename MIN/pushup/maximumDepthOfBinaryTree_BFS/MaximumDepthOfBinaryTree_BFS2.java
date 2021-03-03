import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree_BFS2 {
    public static void main(String[] args){
        TreeNode grid = new TreeNode(3);          //root
        grid.left = new TreeNode(1);              //depth1
        grid.right = new TreeNode(4);             //depth1
        grid.left.left = new TreeNode(5);         //depth2
        grid.left.right = new TreeNode(8);        //depth2
        grid.left.left.left = new TreeNode(7);    //depth3
        
        grid.right.right = new TreeNode(4);             //depth2
        grid.right.right.right = new TreeNode(4);       //depth3
        grid.right.right.right.right = new TreeNode(4); //depth4

        System.out.println("MaximumDepthOfBinaryTree_BFS2 result : " + solve(grid));
    }

    public static int solve(TreeNode grid){
        if(grid==null) return 0;

        int result=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(grid);

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0; i<size; i++){
                TreeNode tn=queue.poll();

                if(tn.left!=null){
                    queue.offer(tn.left);
                }
                if(tn.right!=null){
                    queue.offer(tn.right);
                }
            }
            result++;
        }

        return result;
    }
}
