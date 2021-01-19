# Longest SubString With At Most Two Distinct

- 주어진 문자열에서 2개의 문자를 포함하여 가장 긴 문자열의 길이를 구하는 것.
- 1. example : "ccaaabbbdd"
- line 35 : while문에서 char 2개의 문자열 중 가장 긴 문자열을 저장하고 반복하면서 
- 뒤의 char 2개 문자열과 계속해서 비교하고 max인 값을 저장한다.
  
- 2. example : "aabbaaabbbbbaa"
- counter가 2이상이 되지 않기 떄문에 line 28 while문을 돌지 않는다.

> Input : "ccaabbb";
> Output : 5, "aabbb"

> java.util.Map.getOrDefault(Object.key, V defaultValue)
> 찾는 키가 존재한다면 찾는 키의 값(Map.get(Object.key))을 반환하고,
> 없을 경우 기본값(defaultValue)을 반환 한다.