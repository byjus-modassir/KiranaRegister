package com.kirana.register.pojo.response.controller;

import com.kirana.register.pojo.dto.TransactionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Modassir Ali
 * @created 27/12/23 11:28 am
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTransactionResponse {

    private List<TransactionDto> transactions;

    private Long totalEntries;

    private Integer pageSize;

    private Integer pageIndex;
}
