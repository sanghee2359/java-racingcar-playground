package car_racing;

import java.util.Random;

public class Car {
    private final String name;
    private final int randomNum;

    public Car(String name) {
        this.name = name;
        this.randomNum = makeRandomNum();
    }
    public int makeRandomNum() {
        Random random = new Random();
        return random.nextInt(9)+1; // 1~9
    }
    public int getRandomNum() {
        return this.randomNum;
    }

}
