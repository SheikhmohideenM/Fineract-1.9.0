package org.apache.fineract.portfolio.loanaccount.exception;

import org.apache.fineract.infrastructure.core.exception.AbstractPlatformResourceNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;

public class InterestRateNotFoundException extends AbstractPlatformResourceNotFoundException {

    public InterestRateNotFoundException(final Long id) {
        super("error.msg.rate.id.invalid", "Rebate with identifier " + id + " does not exist", id);
    }

    public InterestRateNotFoundException(final String name) {
        super("error.msg.rate.id.invalid", "Rebate with name " + name + " does not exist", name);
    }

    public InterestRateNotFoundException(String name, EmptyResultDataAccessException e) {
        super("error.msg.rate.id.invalid", "Rebate with name " + name + " does not exist", name, e);
    }

    public InterestRateNotFoundException(Long id, EmptyResultDataAccessException e) {
        super("error.msg.rate.id.invalid", "Rebate with identifier " + id + " does not exist", id, e);
    }
}