package lotto.domain;

public class WinLotto {

    private final Lotto WinLotto;
    private final int bonusNumber;

    public WinLotto(Lotto winLotto, int bonusNumber) {
        WinLotto = winLotto;
        this.bonusNumber = bonusNumber;
    }

}
