# 웹서버 vs. WAS

## 웹 서버

내 컴퓨터에 http 통신 접근할 수 있게 도와주는 것

- HTTP 기반 동작
- 정적 리소스 제공
- ex. nginx, apahce

## WAS(Web Application Server)

내 컴퓨터에 http 통신 접근을 가능하게 해주고 코드를 돌리는 것

- HTTP 기반 동작
- 웹 서버 기능 + a
- ex. tomcat(톰캣), node

<hr />

# SSR vs. SPA vs. CSR

## SSR(ServerSideRender)

서버 측에서 렌더링 하는 방식

> java -> spring @Controller -> @RequestMapping("/") -> 메서드 실행 -> return "index";

- html 가져오기 n = 초기 로딩 짧음 그 후 김
- 검색 엔진 노출 good
- 많은 페이지 생성 시, 적은 자원: 한 번에 비교적 작은 코드를 가져와도 되니까
- js 쪼개져 있음
- 계속 페이지 새로고침되니까 사용감 비교적 안 좋음

## SPA(SinglePageApplication)

하나의 페이지로 구성된 웹 애플리케이션

> index.html, js, css -> js 보고 -> /register -> Register.jsx

next.js

- 초기 로딩 짧음
- 반응형: 유저 사용감 good

## CSR(ClientSideRender)

클라이언트 측에서 렌더링 하는 방식

> / -> /register(index.html, js, css -> js -> /-> Boards.jsx) (/) -> (js -> /register -> Register.jsx) (/register)

- html 가져오기 1 = 초기 로딩 김 그 후 로딩 짧음
- (사전적) 검색 엔진 노출 힘듦 => (요즘) 아님
- 많은 페이지 생성 시, 많은 자원: 한 번에 많은 코드 가져와야 하니까
  → 뭐가 많아질수록 단점
  → 페이지가 빠르게 뜰 수 있도록 코드를 짜야 함이 중요해짐
- js가 하나에 뭉쳐있음
- 반응형: 유저 사용감 good

[[10분 테코톡] 신세한탄의 CSR&SSR](https://www.youtube.com/watch?v=YuqB8D6eCKE)

<hr />

# Spring vs. SpringBoot

## Spring

- 스프링 프레임워크의 핵심 모듈을 모아서 만든 프레임워크
- 개발자가 직접 설정 파일을 작성하여 스프링 컨테이너를 구성하고, 필요한 빈 객체를 등록하고, 빈 객체 간의 의존성을 설정해야 함
- 특정한 구성을 위해 추가적인 라이브러리와 설정이 필요
  => 개발자가 직접 설정 파일을 작성하고, 빈 객체를 등록하고, 빈 객체 간의 의존성을 설정하는 것을 요구

## SpringBoot

- 스프링 프레임워크를 보다 쉽게 사용할 수 있도록 만든 프레임워크
  - 내장 서버 제공
- 개발자가 설정 파일을 작성할 필요 없이, 프로젝트의 설정과 라이브러리 의존성을 자동으로 처리해주는 기능을 제공
  - 스프링 MVC, 스프링 Data JPA, 스프링 Security 등의 기능을 자동으로 설정
  - Actuator라는 모니터링과 관리를 위한 기능을 제공 -> 애플리케이션의 상태 모니터링
- 실행 가능한 JAR 파일을 만들 수 있음
  => 개발자가 보다 쉽게 스프링을 사용할 수 있도록 설정과 의존성 처리 등을 자동으로 처리

[spring 과 springBoot의 차이점](https://www.inflearn.com/blogs/3315?srsltid=AfmBOop2zdfxJ0G4V8-Eq_nAppsnVHiTGUGCZGZIokDURb3663ZrYgED)

<hr />

# Spring 3대 요소

## IoC/DI

### IoC(Inversion of Control): 제어의 역전

- 기존 프로그램

  - 클라이언트 구현 객체: 스스로 필요한 서버 구현 객체 생성, 연결, 실행
    = 구현 객체가 스스로 프로그램의 제어 흐름을 조종

- IoC
  - 구현 객체(Impl): 자신의 로직을 실행하는 역할만 담당
    => 프로그램 제어 흐름 -> 클라이언트 X IoC 컨테이너가 통솔

=> 내가 작성한 코드를 제어, 대신 실행 -> 프레임워크
<br />But, 내가 작성한 코드가 직접 제어의 흐름 담당 -> 라이브러리

### DI(Dependency Injection) 의존성 주입

의존관계 주입 2가지

- 정적 의존 관계: 클래스가 `import` 코드만 보고 의존관계 쉽게 판단할 수 있음
  - 어떤 구현체가 주입되어 사용되는지 알 수 X
- 동적인 객체 의존 관계: 애플리케이션 실행 시점(런타임)에 실제 생성된 객체 인스턴스의 참조가 연결된 의존 관계
  - 실행 시점에 외부에서 실제 구현 객체 생성, 클라이언트에 전달 -> 클라이언트와 서버의 실제 의존관계 연결: 의존관계 주입
    => 정적인 클래스 의존관계 변경 X, 동적인 객체 인스턴스 의존관계 쉽게 변경 Oriented

=> `AppConfig`처럼 객체를 생성하고 관리하면서 의존관계를 연결해 주는 것: IoC 컨테이너 or DI 컨테이너

## AOP(Aspect Oriented Programming) 관점 지향 프로그래밍

애플리케이션에 공통적으로 나타나는 부가적인 기능들을 독립적으로 모듈화하는 프로그래밍 모델
<br /> `@Transactional`이라는 선언적 트랜잭션 기능을 구현

## PSA(Portable Service Abstraction) 서비스 추상화

서비스 추상화 ~> 특정 환경이나 서버, 기술에 종속 X 유연한 애플리케이션을 개발
<br/>= 추상화 계층 사용 -> 어떤 기술을 내부에 숨기고 개발자에게 편의성 제공
<br/>ex. Spring Web MVC, Transaction

[스프링의 3대 요소](https://blogshine.tistory.com/480)

<hr />

# `@Autowired`

필요한 의존 객체의 타입에 해당하는 빈을 찾아 주입
= 스프링 컨테이너에 등록한 빈에게 의존관계 주입이 필요할 때 DI(의존성 주입)을 도와주는 어노테이션

## 생성자

Constructor 생성자 ~> 의존 관계 주입하는 방법

### 장점

- 의존성 주입 대상 필드를 `final`로 객체 선언 O
  - 생성자에서 무조건 설정
- 객체가 생성될 때 딱 한 번 호출되는 것 보장
  - 의존관계가 변하지 X 경우, 필수 의존관계에 사용
- 생성자가 하나일 경우 생략 가능

### 단점

- (-) 순환 참조

## 필드(field)

### 장점

- 제일 간단한 방법

### 단점

- 의존 관계가 잘 보이지 않아 추상적 -> 의존성 관계 복잡해질 수 있음
- SRP(단일 책임 원칙)에 위배
- DI 컨테이너와 강한 결합 -> 외부 사용 용이 X
  - 단위 테스트시 의존성 주입 용이 X
- 의존성 주입 대상 필드를 `final`로 선언 X -> 객체 변경 가능

## 수정자(setter)

### 장점

- 의존성 선택적으로 필요한 경우

### 단점

- 의존성 주입 대상 필드를 `final`로 선언 X -> 객체 변경 가능

클래스의 종속성을 자동으로 연결 = 종속성과 밀접하게 연결되어 있음
<br />-> 코드의 유연성 ↓, 장기적인 유지 관리 어려워짐

```
@Service
public class TestService {

  @Autowired
  private TestRepository testrepository;

  // ...
}
```

=> 대신에 생성자 주입 사용

## 생성자 주입

- 결합 감소: 생성자 주입은 클래스 구현 세부 사항에서 종속 클래스 분리
- 순환참조 방지: 생성자 주입은 필요한 인자 먼저 확인 -> 인자에 해당하는 빈 생성
- 불변성 보장: `final` 키워드 사용
  - 컴파일 오류 ~> 누락 X

=> 기본적으로 생성자 주입 사용, 필수값이 아닌 경우 setter 주입 방식을 옵션으로 부여, 필드 주입 사용 X

```
@Controller
public class TestController {

  private final TestService testService;

  public TestController (TestService testService) {
    this.testService = testService;
  }

  // ...
}
```

[@Autowired란 무엇인가?](https://devlog-wjdrbs96.tistory.com/166)
<br/>[@Autowired를 지양하는 이유](https://velog.io/@joypeb/Java-Autowired%EB%A5%BC-%EC%A7%80%EC%96%91%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0)

<hr />

# MVC(Model, View, Controller)

## Model(모델)

클라이언트에게 응답으로 돌려주는 작업의 처리 결과 데이터

## View(뷰)

Model을 이용하여 웹 브라우저와 같은 애플리케이션의 화면에 보이는 리소스(Resource)를 제공하는 역할

## Controller(컨트롤러)

클라이언트 측의 요청을 직접적으로 전달받는 엔드포인드(Endpoint)로써 Model과 View의 중간에서 상호작용을 해주는 역할
클라이언트 측의 요청을 전달받아 비즈니스 로직을 거친 후, Model 데이터가 만들어지면 이 Model 데이터를 View로 전달하는 역할

<hr />

## `Record`

- 보일러 플레이트 코드가 불필요하게 큼
  - 최소한의 변경(인자, 혹은 결과 타입)으로 여러 곳에서 재사용 되면 반복적으로 비슷한 형태를 가지고 있는 코드
  - `getter`,`setter`, `equals`, `hashCode`, `toString` 등
    -> 데이터 간결하게 표현하기 위한 방법(객체 지향), 불변 데이터 모델링 집중, 데이터 지향 메소드 자동 구현
    <br />But, `Beans` 대체하기 위한 기술 X + 어노테이션 지향적인 코드 생성하기 위함 X
- Java 16
- 다른 클래스 상속 X, 인터페이스 구현 O
  - `extends` X, `implements` O
- 필드 `private final` 처리 및 `Setter` 미구현 ~> 불변성 제공
  - `abstract`로 선언 X
- `Getter` 구현
  - 필드명과 동일하게 생성
- `equals()` 구현
- `hashCode()` 구현
- `toString()` 구현
  => Entity가 아닌 DTO로 사용

```
public record StoreRequest(String name, String address, short openTime, short closeTime) {}

```

[[Java] record에 대하여](https://velog.io/@pp8817/record)

[Java Record - Spring에서의 사용 사례와 함께](https://velog.io/@gongmeda/Java-Record-톺아보기-Spring-에서의-Record-사용-사례와-함께)

## `Optional<T>`

- java8에 새로 추가
- null이 올 수 있는 값을 감싸는 Wrapper 클래스
  - → 다양한 메소드 제공
- 참조하더라도 NPE(NullPointerException)이 발생하지 않도록 도와줌

[[Spring] Optional 처리](https://velog.io/@ryuneng2/Spring-Optional)

<hr />

리소스(data)를 꺼내 주자

- endpoint /stores
- method
  - GET R
  - POST C
  - PUT(POST), PATCH(POST) U body o
  - DELETE(GET) D body x

<br />
- 전체 스토어를 가져온다.( /stores ) (GET)
- 스토어에 추가한다. (/stores) (POST)
- 스토어 안에 id=1 번인거를 가져와라. (/stores/1) (GET)
- 스토어 안에 이름이 커피가 들어간 친구들 뽑아와라. (/stores?name=커피&opentime=10) (GET)
- 1번 스토어 이름을 커피로 바꾸고 싶다.
  - (/stores/1, {name="커피", "ㄹㅇㄴ","ㅇㄴㅁ"}) (PUT)
  - setName("커피")
- 나머지 것은 두고 슬쩍 수정 PATCH (패치노트)
  - [1][2][3]<-[new3]
- 전에 있던놈을 갈아 치운다 PUT
- 스토어 1번을 지운다 (stores/1) (DELETE)

### 정리

1. URL 복수형 만 사용해라 (/store x)
2. 명사만 사용해라 (/stores/create x) -> /stores POST
3. 소문자로 작성해라 (/storesCreate) -> (/store_create)
4. 언더바(\_) 말고 하이픈(-)으로 작성해라 (/store_create) -> (/store-create)

[REST API 제대로 알고 사용하기](https://meetup.nhncloud.com/posts/92)
