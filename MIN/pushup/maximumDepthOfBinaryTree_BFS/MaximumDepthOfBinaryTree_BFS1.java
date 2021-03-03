import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree_BFS1 {
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

        System.out.println("MaximumDepthOfBinaryTree_BFS1 result : " + solve(grid));
    }

    public static int solve(TreeNode grid){
        if(grid==null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> valueQueue = new LinkedList<>();
        int rootDepth = 1, max=0;;
        queue.offer(grid);
        valueQueue.offer(rootDepth);

        while(!queue.isEmpty()){
            
            TreeNode tn=queue.poll();
            int depth=valueQueue.poll();
            max = Math.max(max, depth);
            
            if(tn.left!=null){
                queue.offer(tn.left);
                valueQueue.offer(depth+1);
            }

            if(tn.right!=null){
                queue.offer(tn.right);
                valueQueue.offer(depth+1);
            }
        }

        return max;

    }
}
