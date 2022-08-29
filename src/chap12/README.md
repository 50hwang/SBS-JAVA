# <�ڹ� �����>

- ǥ�� ����� : Ű����κ��� �Է� -> ����ͷ� ���
- ���� ����� : ���Ϸκ��� �Է� -> ������� ���Ϸ� ���

## ��Ʈ��

> �����Ͱ� �ٴϴ� ��.

> ��ǻ�Ϳ� ����� ��ġ ���̿� ����� ���̰�, ������ ����� Ŭ������ �̿��ؼ� �����͸� �о���̰ų� ����ϰ� �Ǵ� ��.
  
- ��Ʈ���� ����

    1. ����Ʈ ��Ʈ�� : ����Ʈ ������ ������ ������� �̷����.
    2. ���� ��Ʈ�� : ���� ������ ������� �̷����.
        
        
- ��Ʈ�� Ŭ������ �̸��� ����, �����͸� �о���� ���� ��Ʈ������, ���� ���� ��Ʈ������ �� �� �ִ�.

    1. �Է� ��Ʈ�� : Ŭ�������� InputStream �Ǵ� Reader�� ����.
    2. ��� ��Ʈ�� : Ŭ�������� OutputStream �Ǵ� Writer�� ����.
 
 
- Ŭ�������� Stream���� ������ ����Ʈ ���� ��������� �̷������ Ŭ�����̰�, Reader/Writer�� ������ ���� ������ ������ ������� �̷������.

    1. ����Ʈ ���� ����� Ŭ���� : Ŭ�������� Stream���� ����.
    2. ���� ���� ����� Ŭ���� : Ŭ�������� Reader/Writer�� ����.
 
     
- ��Ʈ�� �߿� ���� �����͸� �а� ���µ� �̿��ϴ� ��Ʈ���� �ְ�, �ٸ� ��Ʈ���� ���� ������ �ϴ� ��Ʈ���� ����.
    - ���� ������ �ϴ� ��Ʈ���� ���� �����͸� �а� ���� ����� ����.
     
     
- ���� ��Ʈ�� Ŭ����
    1. InputStreamReader, OutputStreamReader
    2. BufferedInputStream, BufferedOutputStream
    3. DataInputStream, DataOutputStream
    
> ����� Ŭ������ ���� ������ ���� �˾ƺ� ��
 
## ǥ�� ����� Ŭ����

### Scanner Ŭ����

- Scanner Ŭ���� ������
    - Scanner(File source) : ���� ��ü�κ��� Scanner ��ü ����
    - Scanner(InputStream source) InputStream ��ü�κ��� Scanner ��ü ����
     
      
- Scanner Ŭ���� �޼ҵ�
    - void close() : Scanner ��ü�� ����
    - String next() : ���ڿ� �����͸� ����
    - boolean nextBoolean() : boolean �����͸� ����
    - byte nextByte() : byte �����͸� ����
    - short nextShort() : short �����͸� ����
    - int nextInt() : int �����͸� ����
    - long nextLong() : long �����͸� ����
    - float nextFloat() : float �����͸� ����
    - double nextDouble() : double �����͸� ����

### System Ŭ����

- System Ŭ������ �ʵ�
    - in : public static final InputStream in
    - out : public static final PrintStream out
    - err : public static final PrintStream err
  
 
- System.in
    - InputStream Ŭ������ �޼ҵ�
    - public abstract int read() throws IOException
  
  
- System.out
    - write �޼ҵ�
    - public abstract void write(int b) throws IOException : ���� b�� ���� 8��Ʈ�� ���
    - public void write(byte[] b) throws IOException : byte �迭 b�� ������ ���
    - public void write(byte[] b, int off, int len) throws IOException : �迭 b�� off ��ġ�κ��� len ���̸�ŭ ���
 
 
## ���� ����� Ŭ����

> ���� ó���� ��Ȯ�ϰ� �����ϱⰡ ��Ʊ� ������, �߻��� �� �ִ� ��� ���� ��Ȳ�� ���� ó���� �ʿ��ϴ�.

### ���� �Է�
 
- FileInputStream : ���Ϸκ��� ����Ʈ ������ �����͸� �о� ��.
- FileReader : ���Ϸκ��� ���� ������ �����͸� �о� ��.

### ���� ���

- FileOutputStream : ���Ϸ� ����Ʈ ������ �����͸� �����.
- FileWriter : ���Ϸ� ���� ������ �����͸� �����.
 
 
- NullPointerException : ������ ��� fis�� �ʱⰪ null�� �״�� ���� �ִ� �����ε� close()�� �õ��Ϸ��� �ϱ� ������ ������ ����