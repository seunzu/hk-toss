package person;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toCustomString() {
        return "이름: " + name + ", 나이: " + age + "살";
    }

    public void print() {
        System.out.println(toCustomString());
    }
}
