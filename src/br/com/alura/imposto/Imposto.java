package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto proximoImposto;

    public Imposto(Imposto proximoImposto) {
        this.proximoImposto = proximoImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorProximoImposto = BigDecimal.ZERO;

        if(proximoImposto != null){
            valorProximoImposto = proximoImposto.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorProximoImposto);
    }
}
