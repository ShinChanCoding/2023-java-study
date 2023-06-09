package lotto;

import java.util.List;
import lotto.console.Controller;
import lotto.domain.IssuedLotto;
import lotto.domain.WinLotto;
import lotto.service.LottoIssueService;
import lotto.service.StatisticsService;

public class LottoGame {

    private final Controller controller;
    private final LottoIssueService lottoIssueService;
    private final StatisticsService statisticsService;

    private LottoGame() {
        // TODO
        controller = null;
        lottoIssueService = null;
        statisticsService = null;
    }

    public static void run() {
        LottoGame lottoGame = new LottoGame();

        try {
            lottoGame.start();
        } catch (IllegalArgumentException e) {

        }
    }

    private void start() {
        IssuedLotto issuedLotto = issueLotto();
        WinLotto winLotto = issueWinLotto();
        compileStatistics(issuedLotto, winLotto);
    }

    private IssuedLotto issueLotto() {
        long price = controller.getPrice();

        IssuedLotto issuedLotto = lottoIssueService.issueLotto(price);

        return null;
    }

    private WinLotto issueWinLotto() {
        List<Integer> numbers = controller.getWinNumber();
        int bonusNumber = controller.getBonusNumber();

        WinLotto winLotto = lottoIssueService.issueWinLotto(numbers, bonusNumber);

        return null;
    }

    private void compileStatistics(IssuedLotto issuedLotto, WinLotto winLotto) {
        statisticsService.compileStatistics(null, null);
    }

}
