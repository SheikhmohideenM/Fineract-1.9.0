package org.apache.fineract.portfolio.loanaccount.data;

import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class LoanRebateData implements Serializable {

    private Long id;

    private Long loanId;

    private Integer daysFrom;

    private Integer daysTo;

    private BigDecimal rebatePercentage;

    private boolean active;

    public LoanRebateData(Long id, Long loanId, Integer daysFrom, Integer daysTo, BigDecimal rebatePercentage, boolean active) {
        this.id = id;
        this.loanId = loanId;
        this.daysFrom = daysFrom;
        this.daysTo = daysTo;
        this.rebatePercentage = rebatePercentage;
        this.active = active;
    }

    public static LoanRebateData instance(final Long id, final Long loanId, final Integer daysFrom, final Integer daysTo, final BigDecimal percentage,
                                      final boolean active) {
        return new LoanRebateData(id, loanId, daysFrom, daysTo, percentage, active);
    }
}
