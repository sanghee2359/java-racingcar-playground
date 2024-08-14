package car_racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    Car car1, car2, car3;
    @BeforeEach
    void setup(){
        car1 = new Car("pobi");
        car2 = new Car("crong");
        car3 = new Car("honux");
    }

    @Test
    @DisplayName("1번 경주를 진행할 때 모두 0 또는 1")
    void car_racing() {
        String[] names = {"pobi", "crong", "honux"};
        Cars cars = new Cars(names);
        List<Car> carResult = cars.play();
        assertThat(carResult.get(0).getRaceScore()).isLessThanOrEqualTo(1); // 1이하
        assertThat(carResult.get(1).getRaceScore()).isLessThanOrEqualTo(1); // 1이하
        assertThat(carResult.get(2).getRaceScore()).isLessThanOrEqualTo(1); // 1이하
    }

}