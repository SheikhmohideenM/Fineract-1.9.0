///**
// * Licensed to the Apache Software Foundation (ASF) under one
// * or more contributor license agreements. See the NOTICE file
// * distributed with this work for additional information
// * regarding copyright ownership. The ASF licenses this file
// * to you under the Apache License, Version 2.0 (the
// * "License"); you may not use this file except in compliance
// * with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing,
// * software distributed under the License is distributed on an
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// * KIND, either express or implied. See the License for the
// * specific language governing permissions and limitations
// * under the License.
// */
//package org.apache.fineract.portfolio.loanproduct.data;
//
//import lombok.Getter;
//import org.apache.fineract.infrastructure.core.data.EnumOptionData;
//import org.apache.fineract.portfolio.rate.data.RateData;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//
//@Getter
//public class RebateData implements Serializable {
//
//    private Long id;
//
//    private Integer daysFrom;
//
//    private Integer daysTo;
//
//    private BigDecimal rebatePercentage;
//
//    private boolean active;
//
//    public RebateData(Long id, Integer daysFrom, Integer daysTo, BigDecimal rebatePercentage, boolean active) {
//        this.id = id;
//        this.daysFrom = daysFrom;
//        this.daysTo = daysTo;
//        this.rebatePercentage = rebatePercentage;
//        this.active = active;
//    }
//
//    public static RebateData instance(final Long id, final Integer daysFrom, final Integer daysTo, final BigDecimal percentage,
//                                    final boolean active) {
//        return new RebateData(id, daysFrom, daysTo, percentage, active);
//    }
//}
