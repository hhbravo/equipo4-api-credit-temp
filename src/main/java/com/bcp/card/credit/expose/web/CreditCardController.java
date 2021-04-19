package com.bcp.card.credit.expose.web;

import com.bcp.card.credit.business.CreditCardService;
import com.bcp.card.credit.model.api.CreditCardRequest;
import com.bcp.card.credit.model.api.CreditCardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.text.ParseException;

@RestController
@RequestMapping("card")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @PostMapping("/save")
    public Mono<CreditCardResponse> saveCreditCard(@RequestBody CreditCardRequest creditCardRequest) throws ParseException {
       return creditCardService.saveCredicard(creditCardRequest);
    }

    @GetMapping
    public String metodo(){
        return "I-";
    }
}
