package lotto.console;

import java.util.List;

public interface Controller {

    /**
     * 사용자가 구매할 로또의 가격을 입력받는다.
     *
     * @return 사용자가 구매할 로또 수량
     */
    long getPrice();

    /**
     * 당첨번호를 입력받는다.
     *
     * @return 당첨번호 목록
     */
    List<Integer> getWinNumber();

    /**
     * 보너스 번호를 입력받는다.
     *
     * @return 보너스 번호
     */
    int getBonusNumber();

}
