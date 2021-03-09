# Word Ladder

- 주어진 문자열을 시작과 끝으로 하여 문자열 배열에서 Linked List로 이어지게끔 하고 
- 총 이어진 Linked List의 size를 반환한다.

> 1. Input1 : beginWord = "hit", endWord = "cog"
> 2. Input2 : wordList = {"hot", "dot", "lot", "log", "cog"};
> 3. Output : 5
> "hit" -> "hot" -> "dot" -> "dog" -> "cog"

> **HashSet.remove(element)** 
> element가 Set에 존재할 경우 제거 하면서 remove된다.
> 그렇지 않다면 false를 반환한다.