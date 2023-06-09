package lotto.validation;

import java.util.List;

public final class Validator {

    private Validator() {

    }

    // TODO: 여러 검증 로직을 짜보세요
    public static void validateLottoLength(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

}
