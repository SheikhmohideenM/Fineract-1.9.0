package org.apache.fineract.portfolio.loanaccount.domain.rebateLoan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.apache.fineract.infrastructure.core.domain.AbstractPersistableCustom;

import java.math.BigDecimal;

@Entity
@Table(name = "m_loan_rebate_policy")
public class LoanRebatePolicy extends AbstractPersistableCustom{

    @Column(name = "days_from", nullable = false)
    private Integer daysFrom;

    @Column(name = "days_to", nullable = false)
    private Integer daysTo;

    @Column(name = "rebate_percentage", nullable = false)
    private BigDecimal rebatePercentage;

    @Column(name = "is_active", nullable = false)
    private boolean active;

    @Column(name = "m_loan_id", nullable = false)
    private Long loanId;

    public LoanRebatePolicy() {
    }

    public LoanRebatePolicy(Integer daysFrom, Integer daysTo, BigDecimal rebatePercentage, boolean active, Long loanId) {
        this.daysFrom = daysFrom;
        this.daysTo = daysTo;
        this.rebatePercentage = rebatePercentage;
        this.active = active;
        this.loanId = loanId;
    }

    public Integer getDaysFrom() {
        return daysFrom;
    }

    public void setDaysFrom(Integer daysFrom) {
        this.daysFrom = daysFrom;
    }

    public Integer getDaysTo() {
        return daysTo;
    }

    public void setDaysTo(Integer daysTo) {
        this.daysTo = daysTo;
    }

    public BigDecimal getRebatePercentage() {
        return rebatePercentage;
    }

    public void setRebatePercentage(BigDecimal rebatePercentage) {
        this.rebatePercentage = rebatePercentage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }
}
