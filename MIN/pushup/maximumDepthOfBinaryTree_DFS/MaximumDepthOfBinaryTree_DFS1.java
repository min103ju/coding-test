import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        this.val = x;
    }
}

public class MaximumDepthOfBinaryTree_DFS1 {
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

        System.out.println("Maximum Depth Of Binary Tree DFS result : " + solve(grid));
        
    }

    public static int solve(TreeNode grid) {
        if(grid==null) return 0;

        int max=1;

        Stack<TreeNode> statck = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        statck.push(grid);
        depthStack.push(max);

        while(!statck.isEmpty()){
            TreeNode t1 = statck.pop();
            int count = depthStack.pop();
            max = Math.max(max, count);

            if(t1.left != null) {
                statck.push(t1.left);
                depthStack.push(count+1);
            }
            if(t1.right != null) {
                statck.push(t1.right);
                depthStack.push(count+1);
            }
        }

        return max;
    }
}
