## Stack & Queue
![image](https://github.com/user-attachments/assets/1f05d47b-4c5d-4a42-b6b1-ec05209506aa)

### Stack(스택)
* LIFO(Last In First Out): 후입 선출
<br />= 마지막(최근)에 넣은 것을 먼저 뺌
* 순차적으로 데이터 추가 삭제 → ArrayList 같은 배열 기반 컬렉션 클래스가 적합
* ``push()``: 데이터를 스택에 추가, 해당 값 반환
* ``peek()``: 스택의 마지막 요소 반환, 변화 X
* ``pop()``: 스택의 마지막 요소 제거, 해당 값 반환
* ``empty()``: 비어있는지 여부 반환

```angular2html
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
```

### Queue(큐)
* FIFO(First In First Out): 선입 선출
<br />= 먼저 넣은 것(오래된 것) 먼저 뺌
* ``add()``: 데이터를 큐에 추가
* ``remove()``: 첫 번째 요소 삭제, 해당 값 반환(예외)
* ``poll()``: 첫 번째 요소 삭제, 해당 값 반환(null)
* ``peek()``: 첫 번째 요소 확인


```angular2html
import java.util.Queue;
import java.util.LinkedList;
 
Queue<Integer> queue = new LinkedList<>();
```



<hr />

## BFS & DFS
![image](https://github.com/user-attachments/assets/e65f94aa-7572-4cec-97bd-ff40c4377f73)


### BFS(Breadth First Search)
- 다차원 배열에서 각 칸을 방문할 때 너비 우선으로 탐색
* 큐
* 상하좌우로 퍼져나감, 거리 순으로 방문
* 현재 보는 칸으로부터 추가되는 인접한 칸은 거리가 현재 보는 칸보다 1만큼 더 떨어져있다 
<br />→ DFS에서 성립 X => 거리 계산 시 DFS 사용 X 
<br />→ 다차원 배열(순회하는 문제)에서 BFS 사용
* Flood Fill, 거리 측정



### DFS(Depth First Search)
- 다차원 배열에서 각 칸을 방문할 때 깊이 우선으로 탐색
* 스택
* Flood Fill, 그래프, 트리

<hr />

## 디자인 패턴
- 생성 패턴
  - **팩토리 메서드**
  - 추상 팩토리
  - 빌더
  - 프로토타입
  - 싱글턴
- 구조 패턴
- 행동 패턴

### 팩토리 메서드(Factory Method) = 정적 생성 메서드
메서드를 정의, 직접 생성자 호출(``new``연산자)을 사용하여 객체를 생성하는 대신
객체 생성에 사용되어야 함
<br /> 자식 클래스들은 이 메서드를 오버라이드 -> 생성될 객체들의 클래스 변경할 수 있음

- 코드의 높은 수준의 유연성 제공

출처: [자바로 작성된 팩토리 메서드](https://refactoring.guru/ko/design-patterns/factory-method/java/example)

```
public class Coffee {

    // 팩토리 메서드
    public static Coffee of(String name, int price, String season, String type) {
    }

    private Coffee(String name, int price, String season, String type) {
    }
```



