package car_racing;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class PrintResult {

    private final List<Car> result;
    public PrintResult(List<Car> result) {
        this.result = result;
    }
    public void writeCurrentResult(Car car){
        StringBuilder sb = new StringBuilder();
        sb.append(car.getName()).append(" : ");
        for (int i = 0; i < car.getRaceScore(); i++) {
            sb.append("-");
        }
        System.out.println(sb);
    }

    // 최대값 찾기
    public List<Car> findHighestScore() {
        OptionalInt maxScore = result.stream()
                .mapToInt(Car::getRaceScore)
                .max();

        return maxScore.isPresent() ?
                result.stream()
                        .filter(car -> car.getRaceScore() == maxScore.getAsInt())
                        .collect(Collectors.toList())
                : Collections.emptyList(); // 최대값이 없으면 빈 리스트 반환
    }
    public void finalResult(List<Car> result) {
        if (result.isEmpty()) {
            return;
        }
        String resultString = getResultString(result);
        System.out.println(resultString + "가 최종 우승했습니다.");
    }

    private String getResultString(List<Car> result) {
        StringBuilder sb = new StringBuilder();

        for (Car car : result) {
            sb.append(car.getName()).append(", ");
        }

        // 마지막 ", " 제거
        int length = sb.length();
        if (length > 0) sb.delete(length - 2, length);

        return sb.toString();
    }

}
