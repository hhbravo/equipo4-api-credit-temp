package com.bcp.card.credit.business;


import com.bcp.card.credit.model.api.CreditCardRequest;
import com.bcp.card.credit.model.api.CreditCardResponse;
import reactor.core.publisher.Mono;

import java.text.ParseException;

public interface CreditCardService {

    Mono<CreditCardResponse> saveCredicard(CreditCardRequest request) throws ParseException;
}
