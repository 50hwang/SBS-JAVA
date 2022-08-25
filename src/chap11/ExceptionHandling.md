# <예외 처리>

- 자바에는 두 종류가 있다.
    1. 컴파일 에러 : 컴파일 시 발생하는 에러(잘못된 문법 기술)
    2. 런타임 에러 : 프로그램 실행 시에 발생하는 에러
        - 에러 : 프로그램 코드로 수습 불가 (ex. 메모리 부족 등...)
        - 예외 : 프로그램 코드로 수습 가능 (ex. 배열 인덱스 오류 등...)

## 예외 처리하기

1. try-catch-finally 구문 이용하기

```
try {
	// 예외가 발생할 가능성이 있는 코드
} catch (Exception1 e1) {
	// Exception1이 발생했을 경우, 이를 처리하기 위한 코드
} catch (Exception1 e1) {
	// Exception2이 발생했을 경우, 이를 처리하기 위한 코드
} catch (ExceptionN eN) {
	// ExceptionN이 발생했을 경우, 이를 처리하기 위한 코드
} finally {
	// 무조건 수행되는 코드 -> 붙여도 되고, 안 붙여도 되는 optional
}
```

2. throws 이용하기

- Throwable 클래스에서 알아야 할 두 메소드
    1. String getMessage() : 예외에 대한 설명을 반환
    2. void printStackTrace() : 발생한 예외에 대한 정보를 반환