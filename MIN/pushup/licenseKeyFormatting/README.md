# License Key Formatting

- 입력 받은 키 값을 정해진 format에 따라 변환하는 문제.

> 1. 
> Input : "8F3Z-2e-9-w"
> Input : 4
> Output : "8F3Z-2E9W"
> 2. 
> Input : "8-5g-3-J"
> Input : 4
> Output : "8-5G3J"
> **하이픈제거, 대문자변환, 끝의 4자리 끊기**

> 1. String : + 연산이나 concat을 사용하는 경우 새로운 new String 객체를 만들어 사용하기 때문에
> 메모리를 많이 잡아 먹는다.
> 2. StringBuffer : Multi Thread 환경에서 synchronized
> 3. StringBuilder : Asynchronized Single Thread
