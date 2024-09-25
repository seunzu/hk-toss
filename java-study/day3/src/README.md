### ArrayList

* 인덱스 기반 자료구조 → get ~> 무작위 접근 가능: O(1)
* 삽입, 삭제 → 배열에 임시배열 복사하는 방식: O(n)
* 포인터 저장하지 X → 연속된 메모리 안에 저장

### LinkedList

* 처음 노드부터 ~ 찾으려는 노드: 순차적 탐색: O(n)
* 삽입, 삭제 → 이전 노드와 다음 노드를 참조하는 상태만 변경: O(1)
* 포인터 사용 O → 저장공간 많이 차지

=> 검색: ArrayList / 삽입, 삭제: LinkedList

![image](https://github.com/user-attachments/assets/ad324be7-6c4f-4eb8-bad6-4047110acbad)