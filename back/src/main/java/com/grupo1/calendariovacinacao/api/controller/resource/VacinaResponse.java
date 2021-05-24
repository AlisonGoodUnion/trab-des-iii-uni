package com.grupo1.calendariovacinacao.api.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VacinaResponse {

    private Long id;
    private CalendarioResponse calendario;
    private UsuarioResponse usuario;
    private LocalDateTime dataVacina;

}
