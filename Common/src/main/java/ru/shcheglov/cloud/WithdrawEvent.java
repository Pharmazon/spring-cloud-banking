package ru.shcheglov.cloud;

import java.math.BigDecimal;

public class WithdrawEvent extends AbstractFinancialEvent {

    public WithdrawEvent() {
    }

    public WithdrawEvent(String originService, String destinationService, BigDecimal sum) {
        super(originService, destinationService, sum);
    }
}
