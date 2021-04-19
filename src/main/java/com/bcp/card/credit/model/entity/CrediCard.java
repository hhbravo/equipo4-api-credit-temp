package com.bcp.card.credit.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@ToString
@Builder
@Table("equipo4.tarjetacredito")
public class CrediCard {

    @Id
    private Long idtarjeta;
    private String nrotarjeta;
    private String nombretarjeta;
    private String aliastarjeta;
    private String cvv;
    private String fechaexpiracion;
    private String estado;
    private BigDecimal saldodisponible;
    private String moneda;
    private String nrocuentacargocreacion;
    private Boolean prendido;
    private Boolean compraxinternet;
    private Boolean compraxextranjero;
    private Boolean pagosmoviles;
    private Boolean notificacion;
    private String correo;
    private String celular;
    private String fechacreacion;
    private Long idusuario;

}
