package br.com.alura.orcamento;

import java.math.BigDecimal;

public class ProxyOrcamento implements Orcavel {

    /*Proxy pode ser usado por motivo de perfomance ou de seguranca como interceptar classes e executar regras de seguranca*/
    private BigDecimal valor;

    private Orcamento orcamento;

    public ProxyOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        //Se nullo pega da class orcamento, se nao pega do proxy (exemplo de memoria cache)
        if (valor == null) {
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }

}
