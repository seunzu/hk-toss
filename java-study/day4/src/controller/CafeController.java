package controller;

import cafe.Coffee;
import service.CafeService;

import java.util.List;

import static global.Data.coffees;
import static global.Utils.sc;

public class CafeController {

    // 객체가 미리 생성 -> 동기화 문제 X 안전 But, 객체가 사용되지 않더라도 미리 메모리에 로드
//    private static final CafeController instance = new CafeController();
//
//    public static CafeController getInstance() {
//        return instance;
//    }

    // 지연 초기화 ~> 메모리 효율적으로 사용 But, 멀티스레드 환경에서는 동기화 신경 써야 함
    public static CafeController getInstance() {
        if (cafeController == null) {
            cafeController = new CafeController();
        }
        return cafeController;
    }

    private static CafeController cafeController;
    private final CafeService cafeService;

    public CafeController() {
        cafeService = CafeService.getInstance();
    }

    public void addCoffee() {
        // 유저에게 입력 받는 것
        System.out.println("입력해주세요");
        String st = sc.nextLine();
        String[] strings = st.split(" ");
        cafeService.coffeeAdd(strings);
        System.out.println("추가 완료");
    }

    public void removeCoffee() {
        String st = sc.nextLine();
        cafeService.coffeeAdd(new String[]{"fds", "fds"});
    }

    public void printAllCoffees() {
        List<Coffee> coffeeList = cafeService.getAllCoffees();
        if (coffeeList.isEmpty()) {
            System.out.println("없어요");
            return;
        }
        for (Coffee coffee : coffeeList) {
            System.out.println(coffee);
        }
    }
}
