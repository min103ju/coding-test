class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        this.val = x;
    }
}

public class MaximumDepthOfBinaryTree1 {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(3);          //root
        t1.left = new TreeNode(1);              //depth1
        t1.right = new TreeNode(4);             //depth1
        t1.left.left = new TreeNode(5);         //depth2
        t1.left.right = new TreeNode(8);        //depth2
        t1.left.left.left = new TreeNode(7);    //depth3

        solve(t1);
    }

    public static void solve(TreeNode t1){

        int leftDepth=0, rightDepth=0;

        // left,right 모두 확인
        // left!=null && right!=null; -> left로 이동
        // left==null && right!=null; -> right로 이동
        // left==null && right==null; -> 현재 node가 최대 깊이

        //root에서 left 우선 조회
        while(t1 != null) {
            leftDepth++;

            if(t1.left!=null){
                t1=t1.left;
            } else if(t1.left==null&&t1.right!=null){
                t1=t1.right;
            } else {
                t1=null;
            }
        }

        //root에서 right 우선 조회
        while(t1 != null) {
            rightDepth++;
            
            if(t1.right!=null){
                t1=t1.right;
            } else if(t1.right==null&&t1.left!=null){
                t1=t1.left;
            } else {
                t1=null;
            }
        }

        int result = Math.max(leftDepth, rightDepth);

        System.out.println("result : " + result);
    }
}
