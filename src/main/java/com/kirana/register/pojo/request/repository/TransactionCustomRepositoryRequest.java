package com.kirana.register.pojo.request.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Modassir Ali
 * @created 27/12/23 11:43 am
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionCustomRepositoryRequest {

    private Long startDate;

    private Long endDate;
}
