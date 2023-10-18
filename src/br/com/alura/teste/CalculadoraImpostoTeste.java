package br.com.alura.teste;

import br.com.alura.imposto.CalculadoraImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostoTeste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("2000"), 4);
        CalculadoraImposto calculadora = new CalculadoraImposto();
        System.out.println(calculadora.calcular(orcamento,new ISS()));
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
