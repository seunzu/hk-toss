package team;

import person.Person;

public class Team {
    String name;
    int num;
    String goal;
    Person[] members ;

    public Team(String name, int num, String goal, String[][] memberData) {
        this.name = name;
        this.num = num;
        this.goal = goal;
        this.members = new Person[num];
        for (int i = 0; i < num; i++) {
            String memberName = memberData[i][0];
            int memberAge = Integer.parseInt(memberData[i][1]);
            this.members[i] = new Person(memberName, memberAge);
        }
    }

    public void print() {
        System.out.println("팀명: " + name + ", 팀 인원수: " + num + ", 팀 목표: " + goal);
        System.out.print("멤버: ");
        for (Person member : members) {
            member.print();
        }
        System.out.println();
    }
}
