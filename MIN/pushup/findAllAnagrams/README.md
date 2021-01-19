# Find All Anagrams

- 텍스트 문자열과 패턴 문자열이 주어지고, 텍스트 문자열에서 패턴이 존재하는 index 위치를 반환.

> Input : text = "BACDGABCDA", pattern = "ABCD";
> Output : [0,5,6]

> "**BACD**G**ABCDA**"
> index 0번째에서 BACD
> index 5번째에서 ABCD
> index 6번째에서 BCDA
---
> 1. 
> **Anagram** 비교 시 **ASCII 배열**을 사용하는 걸 추천
> 문자열 비교 시 문자열의 순서를 신경 써야하기 때문에 비교하는 것이 어렵다.
> **ASCII 배열**은 문자열의 아스키값을 동일하게 넣어놓기 때문에 비교가 수월하다.

> 2. 
> **ASCII 배열** 생성 기법
> int[] ascii = new int[256]; (128도 가능)
> ascii['A'] = 1; -> 'A'는 자동으로 배열 index로 치환된다.
> 'A'의 경우 65 index에 1을 등록한다.