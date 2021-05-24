package com.grupo1.calendariovacinacao.api.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioRequest {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private boolean habilitado;
    private String email;
    private String celular;
    private String senha;

}