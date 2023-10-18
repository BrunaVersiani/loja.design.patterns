package br.com.alura.descontos;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMinimo extends Desconto {

    public DescontoValorMinimo(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento){
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
