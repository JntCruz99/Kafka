package com.jntcruz.sdKafkaProduce.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jntcruz.sdKafkaProduce.dto.PagamentoDTO;
import com.jntcruz.sdKafkaProduce.produce.PagamentoRequestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired private PagamentoRequestProducer pagamentoRequestProducer;

    public String integrarPagamento (PagamentoDTO pagamento) {
        try {
            return pagamentoRequestProducer.sendMessage(pagamento);
        } catch (JsonProcessingException e) {
            return "Houve um erro ao solicitar pagamento "+ e.getMessage();
        }
    }
}