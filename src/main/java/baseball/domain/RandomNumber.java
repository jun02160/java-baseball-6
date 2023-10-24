package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 랜덤 세 자리 수를 생성하기 위한 라이브러리 호출 pickNumberInRange(시작 범위, 끝 범위) : 한 자리 수 랜덤 추출 메서드
 */
public class RandomNumber {

    private List<Integer> num;

    public RandomNumber() {
        num = new ArrayList<>();
    }

    public List<Integer> make() {

        while (num.size() < 3) {
            int tmp = Randoms.pickNumberInRange(1, 9);
            if (!num.contains(tmp)) {
                num.add(tmp);
            }
        }
        return num;
    }


}
