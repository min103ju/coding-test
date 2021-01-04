# Meeting Room2

- 입력된 2차원 배열의 원소(예약시간[시작시간, 종료시간]) 중 필요한 예약실의 갯수를 구하는 문제

> 1. 
> Input : [[0,30],[5,10],[15,20]]
> Output: 2
> 2. 
> Input : [[7,10],[2,4]]
> Output: 1

> **Min(or Max)Heap**
> Binary Search Tree(시간복잡도 : O(nlogn))
> PriorityQueue 사용
> PriorityQueue? 
> 일반적인 Queue처럼 FIFO가 아닌 Queu내에서 우선순위를 정하고 우선순위가 
> 높은 원소대로 Out하게 되는 자료구조.
> Heap?
> PriorityQueue를 위하여 만들어진 자료구조.
> 완전 이진트리의 일종
> PriorityQueue에 원소를 넣는 method는 offer(), add()가 있다(offer()를 주로 사용)
> PriorityQueue의 원소를 FO하는 method는 poll(), remove()가 있다.(remove()를 주로 사용)
> PriorityQueue의 최상위 원소를 제거하지 않고 조회만 하는 method는 peek()이 있다.
> 여러 개의 값들 중에서 최댓값이나 최솟값을 빠르게 찾아내도록 만들어진 자료구조.
> 1. maxheap - 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진트리
> 2. minheap - 부모 노드의 키 값이 자식 노드의 키 값보다 작거나 같은 완전 이진트리