package car_racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carsName) {
        this.cars = getCars(carsName);
    }

    private List<Car> getCars(String[] carsName) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(new Car(carsName[i]));
        }
        return cars;
    }
    public List<Car> play() {
        for (Car c:
             cars) {
            c.addScore(c.makeRandomNum(), c.getRaceScore());
        }
        return cars;
    }
    // 매 회차마다 문자열 출력
    public PrintResult printCurrent(List<Car> cars) {
        PrintResult result = new PrintResult(cars);
        for (Car c: cars) {
            result.writeCurrentResult(c);
        }System.out.println();
        return result;
    }

}
