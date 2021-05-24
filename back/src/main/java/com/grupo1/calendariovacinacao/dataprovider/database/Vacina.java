package com.grupo1.calendariovacinacao.dataprovider.database;

import com.grupo1.calendariovacinacao.dataprovider.Dose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacina")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Vacina {

    @Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;

    @Column(name = "data_vacina")
    private LocalDateTime dataVacina;

    @Enumerated(EnumType.STRING)
    private Dose dose;



}
