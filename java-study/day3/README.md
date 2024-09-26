## 컬렉션 프레임워크

![image](https://github.com/user-attachments/assets/a6254126-7f0a-42f2-a93f-36e9d132f2c9)


### List
- 순서가 있는 요소들의 컬렉션
    - 크기가 변할 수 있는 배열
- 중복 허용
* ``ArrayList``: 입력 순서대로 저장
* ``LinkedList``
* ↔ ``Array``: 배열 특징 인덱스가 있음/ 길이 정해져 있음
```
1 2 3 1 2 => {1 2 3 1 2}
```

### Set
- 중복되지 않는 요소들의 컬렉션
- *기본적으로는* 순서가 없음
* ``HashSet``: 순서 보장 X
* ``LinkedHashSet``: 입력 순서대로 정렬
* ``TreeSet``: 특정 순서대로 정렬(기본: 오름차순)
```
1 2 3 1 2 => {1 2 3} or {3 1 2}
```

### Map
* 키(key), 값(value) 쌍
    * 키는 중복될 수 없음
    - 값은 중복 가능
- 키마다 하나의 값이 있음

<hr />

## List

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

<hr />

### for each: 향상된 for 문
```
for (type 변수명: iterate) { 
   body-of-loop 
}
```
* 순서를 보장하지 않음
* index가 없는 것을 출력할 때 많이 씀
```
public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
    for (String number : numbers) {
        System.out.println(number);
    }
}

// 결과
one
two
three
```
