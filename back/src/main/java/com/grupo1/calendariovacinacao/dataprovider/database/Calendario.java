package com.grupo1.calendariovacinacao.dataprovider.database;

import com.grupo1.calendariovacinacao.dataprovider.Dose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "calendario")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDateTime dataInicial;

    private LocalDateTime dataFinal;

    private Integer idadeMinima;

    private Integer idadeMaxima;

    @Enumerated(EnumType.STRING)
    private Dose dose;



}
