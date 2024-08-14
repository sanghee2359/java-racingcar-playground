package car_racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    @DisplayName("자동차마다 갖게될 랜덤숫자 생성")
    void car_randomNum() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("crong");

        assertThat(car1.getRandomNum()).isNotZero();
        assertThat(car2.getRandomNum()).isNotZero();
    }

}