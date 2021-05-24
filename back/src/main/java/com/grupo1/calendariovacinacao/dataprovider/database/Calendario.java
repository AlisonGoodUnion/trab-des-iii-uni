package com.grupo1.calendariovacinacao.dataprovider.database;

import com.grupo1.calendariovacinacao.dataprovider.Dose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calendario")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Calendario {

    @Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private LocalDateTime dataInicial;

    private LocalDateTime dataFinal;

    private Integer idadeMinima;

    private Integer idadeMaxima;

    @Enumerated(EnumType.STRING)
    private Dose dose;



}
