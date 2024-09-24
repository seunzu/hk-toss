package person;

public class Main {
    public static void main(String[] args) {
        // 이름: 우재남
        // 나이: 30살
        String name = "우재남";
        int age = 30;
        Person person = new Person(name, age);
        person.print();
    }
}