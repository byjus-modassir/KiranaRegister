package com.kirana.register.pojo.response.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Modassir Ali
 * @created 27/12/23 2:49 am
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordTransactionServiceResponse {

    private Long transactionId;
}
