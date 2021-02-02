# Spiral Matrix

- 2차원의 배열을 육안으로 보았을때 시계방향 나선형의 모양 순서로 1차원 배열로 재조합 하여 반환 

> 1. Input

>         {1,2,3}, 
>         {4,5,6}, 
>         {7,8,9}

> Output : {1,2,3,6,9,8,7,4,5}

> **Point**
> 1. 모든 배열의 원소가 선회하도록 하는 Loop가 필요
> 2. matrix의 rowStart, rowEnd, colStart, colEnd값을 선언해 놓는것이 필요
> 3. row의 length와 col의 length가 다른 경우가 있다
> 이때, row와 col 중 length가 더 큰 곳에서 start와 end가 역전 하는 순간이 발생하고
> 추가로 result로 반환하기 때문에 조건을 걸어 주어야 한다.
> 1. rowStart <= rowEnd
> 2. colStart <= colEnd