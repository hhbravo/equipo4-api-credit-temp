package com.bcp.card.credit.business.impl;

import com.bcp.card.credit.business.CreditCardService;
import com.bcp.card.credit.dao.CrediCardRespository;
import com.bcp.card.credit.model.api.CreditCardRequest;
import com.bcp.card.credit.model.api.CreditCardResponse;
import com.bcp.card.credit.model.entity.CrediCard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class CreditCardServiceImpl implements CreditCardService {
    @Autowired
    private CrediCardRespository crediCardRespository;

    @Override
    public Mono<CreditCardResponse> saveCredicard(CreditCardRequest request) throws ParseException {
        return crediCardRespository.save(this.builderToCrediCard(request))
                .doOnError(throwable -> log.error("Message: {}", throwable.getMessage()))
                .map(this::toCreditCardResponse);
    }

    private CreditCardResponse toCreditCardResponse(CrediCard crediCard) {
        return CreditCardResponse.builder()
                .status(200)
                .message("Tarjeta generado con exito")
                .build();
    }

    private CrediCard builderToCrediCard(CreditCardRequest request) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return CrediCard
                .builder()
                .nrocuentacargocreacion(request.getNrocuentacargocreacion())
                .nrotarjeta(request.getNrotarjeta())
                .fechaexpiracion(request.getFechaexpiración())
                .moneda(request.getMoneda())
                .saldodisponible(request.getSaldodisponible())
                .nombretarjeta(request.getNombretarjeta())
                .aliastarjeta(request.getAliastarjeta())
                .celular(request.getCelular())
                .correo(request.getCorreo())
                .notificacion(true)
                .compraxinternet(true)
                .compraxextranjero(true)
                .prendido(true)
                .cvv(request.getCvv())
                .estado("REGISTRADO")
                .fechacreacion(dateFormat.format(new Date()))
                .idusuario(request.getIdusuario())
                .pagosmoviles(true)
                .build();
    }
}
