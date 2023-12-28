package com.kirana.register.pojo.request.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Modassir Ali
 * @created 27/12/23 11:17 am
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTransactionRequest {

    private Long startDate;

    private Long endDate;

    private Integer pageSize;

    private Integer pageIndex;
}
