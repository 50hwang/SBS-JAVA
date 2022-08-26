# <자바 입출력>

- 표준 입출력 : 키보드로부터 입력 -> 모니터로 출력
- 파일 입출력 : 파일로부터 입력 -> 결과물을 파일로 출력

## 스트림

> 데이터가 다니는 길.

> 컴퓨터와 입출력 장치 사이에 연결된 길이고, 적절한 입출력 클래스를 이용해서 데이터를 읽어들이거나 출력하게 되는 것.
  
- 스트림의 종류

    1. 바이트 스트림 : 바이트 단위로 데이터 입출력이 이루어짐.
    2. 문자 스트림 : 문자 단위로 입출력이 이루어짐.
        
        
- 스트림 클래스의 이름을 보면, 데이터를 읽어오기 위한 스트림인지, 쓰기 위한 스트림인지 알 수 있다.

    1. 입력 스트림 : 클래스명이 InputStream 또는 Reader로 끝남.
    2. 출력 스트림 : 클래스명이 OutputStream 또는 Writer로 끝남.
 
 
- 클래스명이 Stream으로 끝나면 바이트 단위 입출력으로 이루어지는 클래스이고, Reader/Writer로 끝나면 문자 단위로 데이터 입출력이 이루어진다.

    1. 바이트 단위 입출력 클래스 : 클래스명이 Stream으로 끝남.
    2. 문자 단위 입출력 클래스 : 클래스명이 Reader/Writer로 끝남.
 
     
- 스트림 중에 직접 데이터를 읽고 쓰는데 이용하는 스트림이 있고, 다른 스트림에 보조 역할을 하는 스트림이 있음.
    - 보조 역할을 하는 스트림은 직접 데이터를 읽고 쓰는 기능은 없다.
     
     
- 보조 스트림 클래스
    1. InputStreamReader, OutputStreamReader
    2. BufferedInputStream, BufferedOutputStream
    3. DataInputStream, DataOutputStream
    
> 입출력 클래스의 계층 구조에 대해 알아볼 것
 
## 표준 입출력 클래스

### Scanner 클래스

- Scanner 클래스 생성자
    - Scanner(File source) : 파일 객체로부터 Scanner 객체 생성
    - Scanner(InputStream source) InputStream 객체로부터 Scanner 객체 생성
     
      
- Scanner 클래스 메소드
    - void close() : Scanner 객체를 닫음
    - String next() : 문자열 데이터를 읽음
    - boolean nextBoolean() : boolean 데이터를 읽음
    - byte nextByte() : byte 데이터를 읽음
    - short nextShort() : short 데이터를 읽음
    - int nextInt() : int 데이터를 읽음
    - long nextLong() : long 데이터를 읽음
    - float nextFloat() : float 데이터를 읽음
    - double nextDouble() : double 데이터를 읽음
