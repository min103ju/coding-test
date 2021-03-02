# Maximum Depth Of Binary Tree

- 하나의 이진 트리에서 최고 깊이를 구하는 문제

> 1. Input
> TreeNode t1 = new TreeNode(3);          //root
> t1.left = new TreeNode(1);              //depth1
> t1.right = new TreeNode(4);             //depth1
> t1.left.left = new TreeNode(5);         //depth2
> t1.left.right = new TreeNode(8);        //depth2
> t1.left.left.left = new TreeNode(7);    //depth3
> 2. Output : 4

> **Recursive(재귀함수)**로 풀이
> 하나의 Node에서 left, right 모두 Search해야 한다.
