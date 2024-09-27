## Process(프로세스) vs. Thread(쓰레드)

### 프로세스 
cpu에 의해 메모리에 올려져 실행중인 프로그램

### 스레드
프로세스안에서 실질적으로 작업을 실행하는 단위

**생성 방법**
- Thread 상속 방식
1. Thread 클래스 상속한 클래스 정의
2. run() 메소드를 오버라이드 -> Thread 코드 작성
3. Thread 객체 생성
4. start() 메소드로 Thread 시작

```angular2html
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.start();
    }
}

class Test extends Thread {
    pulic void run() {
        System.out.println(this.getName());
    }
}
```

- Runnable 인터페이스 구현 방식
1. Runnable 인터페이스 구현하는 클래스 정의
2. run() 메소드를 오버라이드 -> Thread 코드 작성
3. Thread 객체 생성
4. start() 메소드로 Thread 시작

```angular2html
public class Main {
    public static void main(String[] args) {
        Runnable r = new Test();
        Thread test = new Thread(r);
        test.start();
    }
}

class Test implements Runnable {
    pulic void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
```