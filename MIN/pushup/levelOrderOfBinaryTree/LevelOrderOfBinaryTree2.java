import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        this.val = x;
    }
}

public class LevelOrderOfBinaryTree2 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.left.right = new TreeNode(9);

        System.out.println(solve(root));
    }

    public static List<List<Integer>> solve(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root==null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<size; i++){
                // 1.현재 queue에 담아놓은 node.val을 list에 담고
                TreeNode node = queue.poll();
                list.add(node.val);

                // 2.next를 queue에 담음
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }

            // 3.list에 담겼던 것을 result에 담음
            result.add(list);
        }
        return result;
    }
}
