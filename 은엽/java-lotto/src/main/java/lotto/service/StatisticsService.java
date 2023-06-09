package lotto.service;

import lotto.domain.IssuedLotto;
import lotto.domain.WinLotto;

public interface StatisticsService {

    // TODO: return 타입은 자유롭게 바꿔보세요.
    void compileStatistics(IssuedLotto issuedLotto, WinLotto winLotto);

}
