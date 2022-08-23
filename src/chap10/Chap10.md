# <java.lang.String �迭 Ŭ����> (���� �ð��� �̾� ���)

## StringBuffer �ν��Ͻ� �������� ����


- [String, StringBuffer, StringBuilder ����](https://opentutorials.org/module/782/6083)
 
 
1. `StringBuffer()`
    - ũ�� 16�� �� ���ڿ��� ������
    
2. `StringBuffer(int capacity)`
    - capacity���� �ָ� �� ũ��� �� ���ڿ��� ������
    
3. `StringBuffer(String str)`
    - ���ڿ� str�� �ʱ�ȭ�ϴ� �ν��Ͻ��� ������

```
Code07�� ���ؼ� StringBuffer�� ���� �޼ҵ��� ���� ������ ��������.
```

- `String` Ŭ������ `toString()` �޼ҵ�� `equals()` �޼ҵ尡 �������̵��Ǿ� �ִ�.
    - ������, `StringBuffer`, `StringBuilder` Ŭ������ `toString()` �޼ҵ常 �������̵��Ǿ� �ִ�.
    
    
## StringBuilder

- ������ �����ڵ� ����, ���� �޼ҵ���� ���� �����Ѵ�.
- ���� ū ����
    1. `StringBuffer` : �����忡�� �̿� ����
    2. `StringBuilder` : �����忡�� �̿� �Ұ�
  
```
Code08�� ���ؼ� StringBuffer�� ���� �޼ҵ��� ���� ������ ��������.
```

# <java.lang.Math Ŭ����>

## �ʵ� ����
1. `static double E` : �ڿ� �α� e ��
2. `static double PI` : ������ PI ��

## �޼ҵ� ����
1. `static double abs(double a)` : a�� ���밪
2. `static double ceil(double a)` : a �̻��� �� �߿��� ���� ���� ����(�ø�)
3. `static double floor(double a)` : a ������ �� �߿��� ���� ū ����(����)
4. `static double max(double a, double b)` : a�� b �߿��� ū ��
5. `static double min(double a, double b)` : a�� b �߿��� ���� ��
6. `static double pow(double a, double b)` : a�� b��
7. `static long round(double a)` : a�� �ݿø��� ���� ��ȯ
8. `static double sqrt(double a)` : a�� ��Ʈ ���� ��ȯ

# <Number Ŭ����>

## �����ϰ� �ִ� ��
- `byte`
- `short`
- `integer`
- `long`
- `float`
- `double`

## �޼ҵ��� ����
1. `byte byteValue()` : byte ������ ��ȯ
2. `abstract double doubleValue()` : double ������ ��ȯ
3. `abstract float floatValue()` : float ������ ��ȯ
4. `abstract int intValue()` : int ������ ��ȯ
5. `abstract long longValue()` : long ������ ��ȯ
6. `short shortValue()` : short ������ ��ȯ

# <auto-boxing / auto-unboxing>

- boxing : �⺻ �����͸� �ν��Ͻ��� ��ȯ�ϴ� ��
    - ex) `Integer x = new Integer(100);`
        - �⺻ �ڷ����� ������ -> ��ü
        - ���� ������ ���� �ʰ�, `Integer x = 100;` //�ڵ�(auto-)
- unboxing : �ν��Ͻ��� �� �����͸� �⺻ ������������ ��ȯ�ϴ� ��
    - ex) `int y = x.intValue();`
        - ��ü -> �⺻ �ڷ����� ������
        
### ���� �ð��� �� ��

1. Random Ŭ����
2. �ڵ� �ۼ� ����(��ǻ�Ͱ� ������ ���ڸ� ���ߴ� ����)