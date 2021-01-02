# Daily Temperature

- 매일 앞으로 데일리 온도와 비교하여 온도가 높아졌을때의 날이 몇일 차이가 나는지 배열로 출력한다.
  
> Input : {73, 74, 75, 71, 69, 72, 76, 73};
> Output : {1, 1, 4, 2, 1, 1, 0, 0};
> 73은 바로 뒤에 75, 온도가 높아진 날이 나오므로 1
> 75는 4일 뒤에 76, 온도가 높아진 날이 나오므로 4

* java.util.Stack.peek() : stack.pop()과 달리 맨 상위의 원소를 제거하지 않고 반환한다.

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