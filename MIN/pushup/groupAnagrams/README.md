# Group Anagrams

- 같은 문자로 만들어진 문자열을 List로 하여 반환

> 1. Input : ["eat","tea","tan","ate","nat","bat"]
> 2. Output : [
>   ["ate","eat","tea"],
>   ["nat","tan"],
>   ["bat] 
> ]

> 1. **Map의 key로 anagram을 통일 할수 있는 것을 사용**
> 이를 위해 각 String을 character별로 sort하여 사용
> 2. **Map의 value로 List를 사용**