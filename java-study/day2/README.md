## 객체지향
### 특징
1. 객체(Object): 객체는 속성(데이터)과 메소드(행동)를 갖는 것
2. 클래스(Class): 클래스는 객체를 생성하기 위한 템플릿
3. 상속(Inheritance): 상속은 한 클래스의 속성과 메소드를 다른 클래스가 받아들이는 것
4. 캡슐화(Encapsulation): 캡슐화는 객체의 속성(data fields)과 메소드를 하나로 묶고, 실제 구현 내용 일부를 외부에 감추어 은닉하는 것
5. 다형성(Polymorphism): 다형성은 하나의 메소드나 클래스가 있으면 그것들을 다양한 방법으로 동작시키는 기능 (Override, Overloading)

### SOLID 설계 원칙
![image](https://github.com/user-attachments/assets/b474e3e7-a134-469c-906d-84fa86c30953)

* SRP (Single Responsibility): 단일 책임 원칙
  * 클래스는 단 한 개의 책임(기능)
* OCP (Open-Closed): 개방-폐쇄 원칙
  * 확장에 열려있고 변경에 닫혀있음
  * 기존의 코드 변경 X 수정하거나 추가할 수 있어야 함
* LSP (Liskov Substitution): 리스코프 치환 원칙
  * 상위 타입 객체를 하위 타입 객체로 치환해도 정상적으로 동작해야 함
* ISP (Interface Segregation): 인터페이스 분리 원칙
  * 자신이 사용하는 메소드에만 의존해야 함
  * 인터페이스를 각각 사용에 맞게 끔 잘게 분리
* DIP (Dependency Inversion): 의존 역전 원칙
  * 구체화된 클래스보다 추상 클래스나 인터페이스에 의존해야 함
  * 대상의 상위 요소(추상 클래스 or 인터페이스)로 참조
---
### 오버로딩(Overloading) vs 오버라이딩(Overriding)

- 오버로딩
    * 이름은 같은데 아규먼트를 다르게 설계해서 재사용성을 늘리는 것
    * = 메서드 이름, != 매개변수 유형과 개수
    * 기본에 없던 새로운 메서드 정의
- 오버라이딩 @Override
    * 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용하는 것
    * = 메서드 이름, 파라미터 개수와 타입
    * 상속받은 메서드의 내용만 변경

실제 ``toString()`` 메서드 구현
```agsl
public String toString() {
    return getClass().getName()+"@"+Integer.toHexString(hashCode());
}
```
객체 이름이나 주소값이 아닌 객체의 고유 정보 출력하고 싶음
```agsl
@Override
public String toString() {
   return "name: " + name  ", age : " + age;
}
```
=> 오버라이딩 통해 ``toString()`` 메소드 재정의

---

### 접근 제어자
- public: 이 접근 제어자가 붙은 클래스, 메서드, 필드는 어떤 클래스에서도 접근이 가능
- protected: 이 접근 제어자가 붙은 필드와 메서드는 동일 패키지 내의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서 접근이 가능
- default(선언 없음): 이 접근 제어자가 붙은 클래스, 필드, 메서드는 동일 패키지 내의 클래스에서만 접근이 가능
- private: 이 접근 제어자가 붙은 필드와 메서드는 해당 클래스 내에서만 접근이 가능

---
### 상속
![image](https://github.com/user-attachments/assets/42b8ad78-88f2-45e6-9f48-df1acb3b9aa8)
![image](https://github.com/user-attachments/assets/44205b93-157b-4868-adc9-88699d2ca9c6)


### 추상
``abstract``

![image](https://github.com/user-attachments/assets/616aac89-5010-4438-972d-b6b98fbf56ec)

- ``abstract``로 선언한 메소드 자식 클래스에서 반드시 구현(오버라이딩)

### 인터페이스
``implements``
- 추상 클래스
- 모든 멤버 변수는 ``public static final``
- 인터페이스로만 상속 받을 수 있음
- 다중 상속 받는 것이 가능(<-> 클래스)

--- 
