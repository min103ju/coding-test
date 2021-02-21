import java.util.ArrayList;
import java.util.List;



public class LevelOrderOfBinaryTree1 {
    public static void main(String[] args){
        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(4);
        tn.right = new TreeNode(5);
        tn.left.left = new TreeNode(6);
        tn.left.right = new TreeNode(7);
        tn.right.left = new TreeNode(8);
        tn.right.left.right = new TreeNode(9);

        solve(tn);
    }

    public static void solve(TreeNode tn){

        List<List<Integer>> result = new ArrayList<>();
        // now level search
        
        // next level left, right

        // 

        tn, 
        tn.left, tn.right, 
        tn.left.left, tn.left.right, tn.right.left, tn.right.right

        // root




        while(tn != null) {

            tn = tn.left;
        }
    }

}
