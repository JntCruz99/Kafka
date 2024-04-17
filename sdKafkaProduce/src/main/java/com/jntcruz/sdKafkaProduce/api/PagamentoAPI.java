package com.jntcruz.sdKafkaProduce.api;


import com.jntcruz.sdKafkaProduce.dto.PagamentoDTO;
import com.jntcruz.sdKafkaProduce.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoAPI {
    @Autowired private PagamentoService pagamentoService;

    @PostMapping
    public String pagar (@RequestBody PagamentoDTO pagamento) {
        return pagamentoService.integrarPagamento(pagamento);
    }
}