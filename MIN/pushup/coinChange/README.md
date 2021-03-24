# Coin Change

- 주어진 배열의 원소는 코인이며, 해당 코인들을 합하여 amount를 만드는데 드는 최소 코인의 갯수를 구하라
- 같은 코인을 중복 사용해도 무방하다

> 1. 
> Input : coins = [1,2,5]
> Input : amount = 11
> 2. 
> Output : 3
> Explanation : 5 + 5 + 1 = 11 -> 총 3개 코인 사용

> **DP(Dynamic Programing) 문제**
> Dynamic Programing(동적프로그래밍)
> 어려운 문제를 여러 개의 하위 문제로 쪼개고, 이 하위 문제들을 먼저 해결 한 후 이를 이용해서 더 큰 문제를 풀어나가는 방법
> DFS와 차이점?
> DFS는 Search의 개념이고, Dynamic Programing은 하위 문제들의 결과값을 먼저 구한 후 bottom-up 순으로 해결해 나가는 알고리즘이다.