# Word Search

- 주어진 matrix에서 순차적으로 인접한 문자를 방문하여 word에 방문한 문자가 모두 포함되어 
있는지를 판별하는 문제

> 1. Input : {
> {'A','B','C','E'},
> {'S','F','C','S'},
> {'A','D','E','E'}
> }
> 2. Input : "ABCCED"
> 3. Output : true

> **return** 
> 해당 method의 진행을 바로 종료한다.
> **DFS**
> BFS는 root에서 인접한 순으로 모든 노드를 순회하면서 검색한다면
> DFS는 방문한 곳에서 부터 인접한 순으로 노드를 순회한다.