package com.bcp.card.credit.model.api;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreditCardRequest {

    private String nrotarjeta;
    private String nombretarjeta;
    private String aliastarjeta;
    private String cvv;
    private String fechaexpiración;
    private BigDecimal saldodisponible;
    private String moneda;
    private String nrocuentacargocreacion;
    private String correo;
    private String celular;
    private Long idusuario;

}
