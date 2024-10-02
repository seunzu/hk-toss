# SQL

관계형 데이터 베이스 관리 시스템(RDBMS)의 데이터를 관리하기 위해 설계된 특수 목적의 프로그래밍 언어

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

## 트랜잭션 4가지 특징: ACID

- 원자성(Atomicity): 데이터베이스에 트랜잭션이 모두 반영 or 전혀 반영 X
- 일관성(Consistency): 데이터 타입이 반환 후와 전이 동일
- 독립성(Isolation): 각각의 트랜잭션은 서로 간섭 불가
- 지속성(Dutability): 트랜잭션 성공적으로 완료 → 결과 영구적으로 반영
