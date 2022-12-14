package baseball.generator;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BaseBallNumberGenerator implements NumbersGenerator {

    @Override
    public List<Integer> generate() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }

        return numbers;
    }
}
