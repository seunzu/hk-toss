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


