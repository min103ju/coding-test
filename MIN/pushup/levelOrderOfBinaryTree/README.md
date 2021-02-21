# Level Order Of BinaryTree

- Tree Node의 level 별로 순차적인 배열을 반환

> 1. TreeNode사용
> 2. Input :
>       3
>      / \
>     4   5
>    / \ 
>   6  7
> 3. Output : [[3],[4,5],[6,7]]

> **BFS(너비 우선 탐색, Breadth-First Search)**
> Root 노드에서 시작하여 인접한 노드를 먼저 탐색하는 방법
> 깊이보단 너비를 우선적으로 탐색하는 경우이다.
> Queue를 이용(next left, right node를 queue에 넣어 다음 반복문에서 사용)
> 반대 개념은 **DFS(깊이 우선 탐색, Deep-First Search)**, 보통 Stack을 이용