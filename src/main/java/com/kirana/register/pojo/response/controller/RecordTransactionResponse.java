package com.kirana.register.pojo.response.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Modassir Ali
 * @created 27/12/23 2:50 am
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordTransactionResponse {

    private Long transactionId;
}
