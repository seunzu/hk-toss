package util;

import cafe.Coffee;

public class CoffeeThread extends Thread{

    private final Coffee coffee;

    public CoffeeThread(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        coffee.setStatus("저장 완료");
    }
}
