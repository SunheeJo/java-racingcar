package racingcar;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String[] CarNames() {
        System.out.println("자동차들의 이름을 입력하세요(','로 구분): ");
        return splitString(scanner.nextLine());
    }

    public int opportunity() {
        System.out.println("경주 진행 횟수를 입력하세요: ");
        return scanner.nextInt();
    }

    public String[] splitString(String carNames) {
        return carNames.split(",");
    }
}
