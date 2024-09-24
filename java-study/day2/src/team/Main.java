package team;

// {"이세연", 14}, {"백승일", 22}, {"조예은", 3}
public class Main {
    public static void main(String[] args) {
        String[][] members = {{"이세연", "14"}, {"백승일", "22"}, {"조예은", "3"}};

        Team team = new Team("아메리카노", 3, "착하게 살자", members);
        team.print();
    }
}
