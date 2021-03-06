# 20210306 coding test



## lv1 ( warming-up ): [링크](https://programmers.co.kr/learn/courses/30/lessons/68644) 

### 풀이
```
func solution(_ numbers:[Int]) -> [Int] {
    var sumSet: Set<Int> = Set()
    for i in 0..<numbers.count-1 {
        for j in i+1..<numbers.count {
            sumSet.insert(numbers[i] + numbers[j])
        }
    }
    return sumSet.sorted{ $0 < $1 }
}
```

## lv2: [링크](https://programmers.co.kr/learn/courses/30/lessons/62048)

### 풀이
```
func solution(_ w:Int, _ h:Int) -> Int64{
    let gcdValue = gcd(w,h)
    
    return Int64((w * h) - (w + h - gcdValue))
}

func gcd(_ min: Int, _ max: Int) -> Int {
    let remain = min % max
    if remain == 0 {
        return max
    }
    else {
        return gcd(max, remain)
    }
}
```
