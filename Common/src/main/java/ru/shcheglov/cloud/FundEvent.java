package ru.shcheglov.cloud;

import java.math.BigDecimal;

public class FundEvent extends AbstractFinancialEvent {

    public FundEvent() {
    }

    public FundEvent(String originService, String destinationService, BigDecimal sum) {
        super(originService, destinationService, sum);
    }
}
