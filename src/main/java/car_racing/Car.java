package car_racing;

import java.util.Random;

public class Car {
    private final String name;
    private final int randomNum;
    private final int raceScore;

    public Car(String name) {
        this.name = name;
        this.randomNum = makeRandomNum();
        this.raceScore = 0;
    }
    public int makeRandomNum() {
        Random random = new Random();
        return random.nextInt(9)+1; // 1~9
    }
    public int getCurrentScore(int randomNum, int raceScore) {
        if(randomNum >= 4) raceScore++;
        return raceScore;
    }
    public int getRandomNum() {
        return this.randomNum;
    }
    public int getRaceScore() {
        return raceScore;
    }

}
