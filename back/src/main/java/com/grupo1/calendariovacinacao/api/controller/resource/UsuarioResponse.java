package com.grupo1.calendariovacinacao.api.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioResponse {

    private String id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private boolean habilitado;
    private String email;
    private String celular;

}
