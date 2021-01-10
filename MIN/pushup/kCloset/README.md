# K Closest Points to Origin

- 주어진 배열의 원소(x,y 좌표)중 0,0 원점 좌표와 가까운 배열의 원소 K개를 반환.
  
> Input : point = [[1,3],[-2,2]]
> Input : K = 1
> Output : [[-2,2]]

> **x,y축 각각의 제곱의 값을 더하면 0,0으로부터의 절대거리가 나온다.**
> [1,3] -> pow(1) + pow(3) = 10
> [-2,2] -> pow(-2) + pow(2) = 8