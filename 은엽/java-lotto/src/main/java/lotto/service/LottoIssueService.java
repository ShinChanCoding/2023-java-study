package lotto.service;

import java.util.List;
import lotto.domain.IssuedLotto;
import lotto.domain.WinLotto;

public interface LottoIssueService {

    IssuedLotto issueLotto(long price);

    WinLotto issueWinLotto(List<Integer> numbers, int bonusNumber);

}
