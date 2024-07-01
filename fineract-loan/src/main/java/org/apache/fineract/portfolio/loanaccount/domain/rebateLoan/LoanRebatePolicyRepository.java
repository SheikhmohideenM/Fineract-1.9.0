package org.apache.fineract.portfolio.loanaccount.domain.rebateLoan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LoanRebatePolicyRepository extends JpaRepository<LoanRebatePolicy, Long>, JpaSpecificationExecutor<LoanRebatePolicy> {
}
