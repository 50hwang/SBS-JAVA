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

### System 클래스

- System 클래스의 필드
    - in : public static final InputStream in
    - out : public static final PrintStream out
    - err : public static final PrintStream err
  
 
- System.in
    - InputStream 클래스의 메소드
    - public abstract int read() throws IOException
  
  
- System.out
    - write 메소드
    - public abstract void write(int b) throws IOException : 정수 b의 하위 8비트를 출력
    - public void write(byte[] b) throws IOException : byte 배열 b의 내용을 출력
    - public void write(byte[] b, int off, int len) throws IOException : 배열 b의 off 위치로부터 len 길이만큼 출력
 
 
## 파일 입출력 클래스


### 파일 입력
 
- FileInputStream : 파일로부터 바이트 단위로 데이터를 읽어 옴.
- FileReader : 파일로부터 문자 단위로 데이터를 읽어 옴.

### 파일 출력

- FileOutputStream : 파일로 바이트 단위의 데이터를 출력함.
- FileWriter : 파일로 문자 단위의 데이터를 출력함.
 
> 파일 처리를 정확하게 수행하기가 어렵기 때문에, 발생할 수 있는 모든 예외 상황에 대한 처리가 필요하다.
 
- NullPointerException : 파일이 없어서 fis가 초기값 null을 그대로 갖고 있는 상태인데 close()를 시도하려고 하기 때문에 나오는 예외

### fileReader를 이용한 파일 입력
 
- FileReader 생성자
    1. FileReader(File file) : File 객체를 통하여 FileReader 객체를 생성
    2. FileReader(String fileName) : 파일명을 이용하여 FileReader 객체를 생성
 
 
- FileReader 메소드
    1. int read() : 파일로부터 한 문자를 읽어오고, 읽어온 데이터를 반환
    2. int read(char[] cbuf) : 파일로부터 읽어온 문자들을 배열 -> cbuf에 저장
    3. int read(char[] cbuf, int offset, int length) : 파일로부터 length 개의 문자를 읽어와서 배열 -> cbuf[offset] 위치부터 저장
 
 ```
 문제)
  
 파일 student.txt에는 각 줄에 [학생번호, 이름, 성적]이 저장되어 있음.
 모두 10명의 학생 정보가 저장되어 있다고 할 때, 학생들의 정보를 읽어서 각 학생을 객체로 생성하여 객체 바열에 저장하는 프로그램을 작성하시오.
 
 student.txt 내용)
 1 David 80
 2 Andrew 92
 3 Cindy 77
 4 Paul 82
 5 Tom 73
 6 Alice 85
 7 Elizabeth 79
 8 Daniel 100
 9 Sarah 81
 10 Jennifer 95
 
 실행 결과)
 == Student List ==
 ------------------
 1 : David( 80 )
 2 : Andrew( 92 )
 3 : Cindy( 77 )
 4 : Paul( 82 )
 5 : Tom( 73 )
 6 : Alice( 85 )
 7 : Elizabeth( 79 )
 8 : Daniel( 100 )
 9 : Sarah( 81 )
 10 : Jennifer( 95 )
 
 ```


