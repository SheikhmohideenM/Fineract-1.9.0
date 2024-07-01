package org.apache.fineract.portfolio.loanaccount.rebate.repo;

import org.apache.fineract.portfolio.loanaccount.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LoanRebateRepository extends JpaRepository<Loan, Long>, JpaSpecificationExecutor<Loan> {
}
