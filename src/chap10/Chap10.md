## StringBuffer 인스턴스 생성자의 종류


- [String, StringBuffer, StringBuilder 차이](https://opentutorials.org/module/782/6083)
 
 
1. StringBuffer()
    - 크기 16인 빈 문자열이 생성됨
    
2. StringBuffer(int capacity)
    - capacity값을 주면 그 크기로 빈 문자열이 생성됨
    
3. StringBuffer(String str)
    - 문자열 str로 초기화하는 인스턴스가 생성됨

```
Code07을 통해서 StringBuffer의 각종 메소드들과 동작 원리를 이해하자.
```

- String 클래스는 toString() 메소드와 equals() 메소드가 오버라이딩되어 있다.
    - 하지만, StringBuffer, StringBuilder 클래스는 toString() 메소드만 오버라이딩되어 있다.
    
    
## StringBuilder

- 실제로 생성자도 같고, 같은 메소드들이 많이 존재한다.
- 가장 큰 차이
    1. StringBuffer : 스레드에서 이용 가능
    2. StringBuilder : 스레드에서 이용 불가
  
   
1. 이
2. ㅇ