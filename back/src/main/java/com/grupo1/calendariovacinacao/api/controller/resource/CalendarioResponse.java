package com.grupo1.calendariovacinacao.api.controller.resource;

import com.grupo1.calendariovacinacao.dataprovider.Dose;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CalendarioResponse {

    private long id;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private Dose dose;

}
