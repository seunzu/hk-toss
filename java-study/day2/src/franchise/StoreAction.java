package franchise;

import burger.Food;

public interface StoreAction {
    /*
    가게 이름 : 매머드
    열리는 시간 : 9
    닫는 시간 : 19
    메뉴는 아메리카노, 라떼
    평균 가격은 1500
    메뉴는 총 2개
    메뉴의 총 가격은 3000원 입니다.
    */
    void print();

    boolean addMenu(Food food);

    boolean removeMenu(String name);

    String getMenuArr();
}
