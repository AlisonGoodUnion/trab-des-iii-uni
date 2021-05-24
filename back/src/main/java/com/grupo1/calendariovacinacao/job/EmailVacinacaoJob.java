package com.grupo1.calendariovacinacao.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class EmailVacinacaoJob {

    @Scheduled(fixedDelay = 10000)
    public void estruturaIniciaç(){
        log.info("Data execução: {}", LocalDateTime.now());
    }

}
