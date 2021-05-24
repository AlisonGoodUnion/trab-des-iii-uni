package com.grupo1.calendariovacinacao.dataprovider.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Usuario {

    @Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    private boolean habilitado;

    private String email;

    private String celular;

    private String senha;

}
