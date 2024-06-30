/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.fineract.portfolio.loanproduct.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.apache.fineract.infrastructure.core.domain.AbstractPersistableCustom;

import java.math.BigDecimal;

@Entity
@Table(name = "m_product_rebate")
public class RebatePolicy extends AbstractPersistableCustom {

    @Column(name = "days_from", nullable = false)
    private Integer daysFrom;

    @Column(name = "days_to", nullable = false)
    private Integer daysTo;

    @Column(name = "rebate_percentage", nullable = false)
    private BigDecimal rebatePercentage;

    @Column(name = "is_active", nullable = false)
    private boolean active;

    public RebatePolicy() {
    }

    public RebatePolicy(Integer daysFrom, Integer daysTo, BigDecimal rebatePercentage, boolean active) {
        this.daysFrom = daysFrom;
        this.daysTo = daysTo;
        this.rebatePercentage = rebatePercentage;
        this.active = active;
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
}
