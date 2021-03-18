# Course Schedule

- 코스 0을 수강하기 위해 일부 코스에는 전제 조건이 있을 수 있습니다.
- 먼저 코스1을 수강해야 합니다.
- [0,1] 총 과정 수와 전제 조건 쌍이 주어지면 모든 과정을 마칠 수 있는지 반환.

> 1. 
> Input : [[1,0], [0,1]]
> Input : int course = 4
> Output : false
> 2. 
> Input : [[1,0], [2,1], [3,2]]
> Input : int course = 4
> Output : true

> **Topological Sort로 풀이**
> Topological Sort란?
> 순환이 없는 정렬