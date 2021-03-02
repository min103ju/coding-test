# Maximum Depth Of BinaryTree_DFS

- 하나의 이진 트리에서 최고 깊이를 구하는 문제, DFS로 문제풀이

> 1. Input
> TreeNode t1 = new TreeNode(3);          //root
> t1.left = new TreeNode(1);              //depth1
> t1.right = new TreeNode(4);             //depth1
> t1.left.left = new TreeNode(5);         //depth2
> t1.left.right = new TreeNode(8);        //depth2
> t1.left.left.left = new TreeNode(7);    //depth3
> 2. Output : 4

> **DFS**로 풀이
> Stack을 사용

> **max variable**을 사용하는 것이 중요
> root를 기준으로 좌우에 있는 Tree에서 어떤 쪽이 Depth가 더 깊을지 알수가 없다.
> 만약 max variable을 사용하지 않게되면 stack에서 나중에 pop한 쪽의 depth만 출력할 뿐
> 해당 depth가 maximum depth란 보장을 없다.
