# <java.lang.String 계열 클래스> (지난 시간에 이어 계속)

## StringBuffer 인스턴스 생성자의 종류


- [String, StringBuffer, StringBuilder 차이](https://opentutorials.org/module/782/6083)
 
 
1. `StringBuffer()`
    - 크기 16인 빈 문자열이 생성됨
    
2. `StringBuffer(int capacity)`
    - capacity값을 주면 그 크기로 빈 문자열이 생성됨
    
3. `StringBuffer(String str)`
    - 문자열 str로 초기화하는 인스턴스가 생성됨

```
Code07을 통해서 StringBuffer의 각종 메소드들과 동작 원리를 이해하자.
```

- `String` 클래스는 `toString()` 메소드와 `equals()` 메소드가 오버라이딩되어 있다.
    - 하지만, `StringBuffer`, `StringBuilder` 클래스는 `toString()` 메소드만 오버라이딩되어 있다.
    
    
## StringBuilder

- 실제로 생성자도 같고, 같은 메소드들이 많이 존재한다.
- 가장 큰 차이
    1. `StringBuffer` : 스레드에서 이용 가능
    2. `StringBuilder` : 스레드에서 이용 불가
  
```
Code08을 통해서 StringBuffer의 각종 메소드들과 동작 원리를 이해하자.
```

# <java.lang.Math 클래스>

## 필드 종류
1. `static double E` : 자연 로그 e 값
2. `static double PI` : 원주율 PI 값

## 메소드 종류
1. `static double abs(double a)` : a의 절대값
2. `static double ceil(double a)` : a 이상의 수 중에서 가장 작은 정수(올림)
3. `static double floor(double a)` : a 이하의 수 중에서 가장 큰 정수(버림)
4. `static double max(double a, double b)` : a와 b 중에서 큰 값
5. `static double min(double a, double b)` : a와 b 중에서 작은 값
6. `static double pow(double a, double b)` : a의 b승
7. `static long round(double a)` : a를 반올림한 값을 반환
8. `static double sqrt(double a)` : a의 루트 값을 반환

# <Number 클래스>

## 포함하고 있는 것
- `byte`
- `short`
- `integer`
- `long`
- `float`
- `double`

## 메소드의 종류
1. `byte byteValue()` : byte 값으로 반환
2. `abstract double doubleValue()` : double 값으로 반환
3. `abstract float floatValue()` : float 값으로 반환
4. `abstract int intValue()` : int 값으로 반환
5. `abstract long longValue()` : long 값으로 반환
6. `short shortValue()` : short 값으로 반환

# <auto-boxing / auto-unboxing>

- boxing : 기본 데이터를 인스턴스로 변환하는 것
    - ex) `Integer x = new Integer(100);`
        - 기본 자료형의 데이터 -> 객체
        - 굳이 저렇게 쓰지 않고, `Integer x = 100;` //자동(auto-)
- unboxing : 인스턴스로 된 데이터를 기본 데이터형으로 변환하는 것
    - ex) `int y = x.intValue();`
        - 객체 -> 기본 자료형의 데이터
        
# <java.util.Random 클래스>

- Random 클래스의 생성자
    1. Random() : 임의의 값을 생성할 수 있는 인스턴스 생성
        - random number generator라고 함
    2. Random(long seed) : seed 값으로 임의의 값을 생성할 수 있는 인스턴스 생성

- Random 클래스의 메소드
    1. int nextInt() : 다음의 임의의 정수를 생성.
    2. int nextInt(int bound) : bound 내의 다음의 임의의 정수를 생성
  
```
Code11을 통해서 StringBuffer의 각종 메소드들과 동작 원리를 이해하자.
```

```
> 코드 응용문제

Math.Random을 이용하여 컴퓨터가 1에서 100 사이의 정수를 임의로 선택하도록 합니다.
사용자에게 컴퓨터가 선택한 수를 맞추는 코드를 작성해 보세요.
몇 번만에 숫자를 맞추는지 실행 결과처럼 출력하도록 합니다.

> 실행 결과

컴퓨터가 1부터 100 사이의 하나의 정수를 선택했습니다.
**** 컴퓨터가 선택한 수를 맞춰 보세요 ****
--------------------------------
1과 100 사이의 값을 입력하세요 : 50 (사용자 입력)
더 작은 수를 입력하세요.
1과 100 사이의 값을 입력하세요 : 30 (사용자 입력)
더 작은 수를 입력하세요.
1과 100 사이의 값을 입력하세요 : 20 (사용자 입력)
더 큰 수를 입력하세요.
1과 100 사이의 값을 입력하세요 : 25 (사용자 입력)
더 작은 수를 입력하세요.
1과 100 사이의 값을 입력하세요 : 23 (사용자 입력)
더 작은 수를 입력하세요.
1과 100 사이의 값을 입력하세요 : 21 (사용자 입력)
컴퓨터가 선택한 수를 맞췄습니다.
시도 횟수는 7번 입니다.


```



        
### 다음 시간에 할 것

1. Random 클래스
2. 코드 작성 문제(컴퓨터가 결정한 숫자를 맞추는 문제)
    - 컴퓨터가 제시한 숫자 : int hiddenNumber <- 랜덤
    - 내가 맞출 숫자 : int guessNumber <- 유저 입력
    - 맞추면 "Good!", 틀리면 "Uh-oh!"
    - 시도 횟수 : int usedChance (++usedChance)