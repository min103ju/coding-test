# Meeting Room

- 같은 시간에 회의실 예약이 겹치지 않도록 하는 것
- 입력값은 이차원 배열을 입력 받으며 배열안의 배열의 값은 size 2인 배열을 받는다. index[0] = 시작시간(분), index[1] = 종료시간(분)을 뜻한다.
> [0,30] -> 0분 부터 30분까지 예약
1. 
> input : [[0,30],[0,5],[15,20]]
> output : false
2. 
> input : [[7,10],[2,4]]
> output : true

* Comparator 비교
> Comparator 비교시 a-b의 결과값에 따라 달라진다.
> 1. a-b = 음수, 혹은 0일 경우 위치는 그대로 유지한다.
> 2. a-b = 양수 일 경우 a와 b가 위치가 변경된다.
> 3. example 
>

```
Comparator<Interval> Comp = new Comparator<Interval>() {

    @Override
    public int compare(Interval a, Interval b) {
        // TODO Auto-generated method stub
        return a.start - b.start;
    }

};

OR 

Collections.sort(list, (a,b) -> a - b);
```