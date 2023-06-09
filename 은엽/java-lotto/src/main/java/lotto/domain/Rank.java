package lotto.domain;

public enum Rank {

    // TODO: Emum 활용하기

    FIFTH(3, 5_000),
    FOURTH(4, 50_000),
    THIRD(5, 1_500_000),
    SECOND(5, 30_000_000),
    FIRST(6, 2_000_000_000),
    ;

    private final int count;
    private final int prizeMoney;

    Rank(int count, int prizeMoney) {
        this.count = count;
        this.prizeMoney = prizeMoney;
    }

}
