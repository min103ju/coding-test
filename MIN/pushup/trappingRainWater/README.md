# Trapping Rain Water

- 주어진 배열을 벽돌의 height로 보고, 비가 온다고 가정했을때 고이는 영역의 갯수를 반환

> 1. Input : {0,1,0,2,1,0,1,3,2,1,2,1}
> 2. Ouput : 6

> **강의풀이**
> 각 배열 원소 기준으로 left값과 right값을 구한뒤, height 값을 빼준다.
> max값 보다 작은 값은 물에 침수되지, 물을 가두진 못한다.
> 1. 배열 원소를 왼쪽에서 오른쪽으로 순회하면서 max 값이 기준이 된다.
> 2. 오른쪽에서 왼쪽으로 순회하면서 max값이 기준이 된다.
> 3. 각 left와 rigt를 비교하여 작은 값이 물을 가두는 값이 되고 거기에 height block을 빼면
> 쌓인 물의 height값이 된다.

> **내 풀이**
> 1. 왼쪽에서 오른쪽으로 순회하면서 Sub Array를 구한다.
> 2. Sub Array를 구하는 기준은 현재 index를 기준으로 height가 크거나 같은 height가 만나면 Sub Array가 
> 만들어진다.
> 3. Sub Array안에 쌓인 물의 높이를 구하고 Sub Array를 구할 당시의 index를 기준으로 다시 Sub Array를 구한다.