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
`@Transactional`이라는 선언적 트랜잭션 기능을 구현

## PSA(Portable Service Abstraction) 서비스 추상화

서비스 추상화 ~> 특정 환경이나 서버, 기술에 종속 X 유연한 애플리케이션을 개발
<br/>= 추상화 계층 사용 -> 어떤 기술을 내부에 숨기고 개발자에게 편의성 제공
<br/>ex. Spring Web MVC, Transaction

[스프링의 3대 요소](https://blogshine.tistory.com/480)
