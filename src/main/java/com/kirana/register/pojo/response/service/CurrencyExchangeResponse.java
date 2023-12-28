package com.kirana.register.pojo.response.service;

import com.kirana.register.pojo.enums.CURRENCY;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Modassir Ali
 * @created 28/12/23 3:24 am
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrencyExchangeResponse {

    private Double amount;

    private CURRENCY currency;
}
