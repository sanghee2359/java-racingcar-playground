package car_racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String[] carsName) {
        this.cars = getCars(carsName);
    }

    private List<Car> getCars(String[] carsName) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(new Car(carsName[0]));
        }
        return cars;
    }
    public List<Car> play() {
        for (Car c:
             cars) {
            c.getCurrentScore(c.makeRandomNum(), c.getRaceScore());
        }
        return cars;
    }

}
