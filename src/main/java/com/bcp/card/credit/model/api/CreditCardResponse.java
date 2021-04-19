package com.bcp.card.credit.model.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCardResponse {

    private Integer status;
    private String message;
}
