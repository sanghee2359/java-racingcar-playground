package car_racing;

import java.util.Scanner;

import static car_racing.Car.splitCarNames;

public class CarRacing {
    public void racing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = sc.nextLine();
        Cars cars = new Cars(splitCarNames(carNames));


        System.out.println("시도할 회수는 몇회인가요?");
        int racingNum = sc.nextInt();

        System.out.println("실행결과");
        PrintResult current = null;
        while (racingNum > 0) {
            current = cars.printCurrent(cars.play());
            racingNum--;
        }

        if(current != null) current.finalResult(current.findHighestScore());

    }
    public CarRacing() {
        racing();
    }

    public static void main(String[] args){
        new CarRacing();
    }
}
