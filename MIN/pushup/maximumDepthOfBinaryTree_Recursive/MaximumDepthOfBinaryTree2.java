public class MaximumDepthOfBinaryTree2 {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);          //root
        t1.left = new TreeNode(1);              //depth1
        t1.right = new TreeNode(4);             //depth1
        t1.left.left = new TreeNode(5);         //depth2
        t1.left.right = new TreeNode(8);        //depth2
        t1.left.left.left = new TreeNode(7);    //depth3

        System.out.println("result : " + solve(t1));
    }

    public static int solve(TreeNode tree){
        if(tree==null) return 0;

        int leftMax = solve(tree.left);
        int rightMax = solve(tree.right);

        return Math.max(leftMax, rightMax)+1;
    }
}
