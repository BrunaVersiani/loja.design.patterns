package br.com.alura.descontos;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
       Desconto cadeiaDescontos = new DescontoQuantidadeMinima(new DescontoValorMinimo(new SemDesconto()));

       return cadeiaDescontos.calcular(orcamento);
    }
}
