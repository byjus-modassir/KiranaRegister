package com.kirana.register.pojo.request.service;

import com.kirana.register.pojo.enums.CURRENCY;
import com.kirana.register.pojo.enums.TRANSACTION_TYPE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Modassir Ali
 * @created 27/12/23 2:49 am
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordTransactionServiceRequest {

    private Double amount;

    private CURRENCY currency;

    private TRANSACTION_TYPE transactionType;

    private String description;

    private Long timestamp;
}
