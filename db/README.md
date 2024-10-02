# SQL

관계형 데이터 베이스 관리 시스템(RDBMS)의 데이터를 관리하기 위해 설계된 특수 목적의 프로그래밍 언어

![image](https://github.com/user-attachments/assets/84136732-4de8-415c-899f-0d4979b4ac68)

### DDL (Data Definition Language): 데이터 정의어

테이블과 컬럼을 정의하는 명령어로 생성, 수정, 삭제 등 데이터 전체 골격을 결정하는 역할 담당

- `create`: 테이블 생성
- `alter`: 테이블 구조 수정
- `drop`: 테이블 삭제
- `rename`: 테이블 이름 변경
- `truncate`: 테이블 초기화

### DML(Data Manipulation Language): 데이터 조작어

데이터베이스 내부 데이터를 관리하기 위한 언어. 데이터를 조회, 추가, 변경, 삭제 등의 작업 수행

- `insert`: 데이터 추가
- `select`: 데이터 검색
- `update`: 데이터 수정
- `delete`: 데이터 삭제

=> CRUD

### DCL(Data Control Language): 데이터 제어어

데이터를 관리 목적으로 보안, 무결성, 회복, 병행 제어 등을 정의하는데 사용

- `grant`: 권한 정의
- `revoke`: 권한 삭제

<hr />

## 트랜잭션 4가지 특징: ACID

- 원자성(Atomicity): 데이터베이스에 트랜잭션이 모두 반영 or 전혀 반영 X
- 일관성(Consistency): 데이터 타입이 반환 후와 전이 동일
- 독립성(Isolation): 각각의 트랜잭션은 서로 간섭 불가
- 지속성(Dutability): 트랜잭션 성공적으로 완료 → 결과 영구적으로 반영

<hr />

```
select distinct name from coffees;
select name from coffees group by name;
```

- DISTINCT
  - 중복된 값 자체를 제거하기 위한 용도로 사용
  - 내부적으로 중복된 값을 제거하는 방식으로 동작. 고유한 값을 하나씩 비교하며 처리
- GROUP BY
  - 데이터를 그룹화하여 집계 연산을 수행하거나 특정 기준으로 데이터를 그룹화하는 데 사용
  - 데이터를 지정된 컬럼으로 그룹화하고, 각 그룹별로 집계된 결과나 그룹화된 데이터를 반환

=> 중복 제거를 원한다면 DISTINCT를 사용, 데이터 그룹화나 집계를 의도할 때는 GROUP BY를 사용

<hr />

### JOIN

두 개의 테이블을 서로 묶어서 하나의 결과를 만들어 내는 것

![image](https://github.com/user-attachments/assets/0bf2e9df-dbb8-4991-be61-16faa6b149e0)

- INNER JOIN(내부 조인): 두 테이블에 모두 지정한 열의 데이터가 있어야 함
- OUTER JOIN(외부 조인): 1개의 테이블에만 데이터가 있어도 됨
  - LEFT: 왼쪽 테이블의 모든 값 출력
  - RIGHT: 오른쪽 테이블의 모든 값 출력
  - FULL: 왼쪽 외부 조인 + 오른쪽 외부 조인
- CROSS JOIN(상호 조인): 한 테이블의 모든 행과 다른 테이블의 모든 행 조인
- SELF JOIN(자체 조인): 자신과 자신 조인 → 1개의 테이블 사용

[SQL 기본 문법: JOIN(INNER, OUTER, CROSS, SELF JOIN)](https://hongong.hanbit.co.kr/sql-기본-문법-joininner-outer-cross-self-join/)
