package br.com.alura.teste;

import br.com.alura.descontos.CalculadoraDesconto;
import br.com.alura.imposto.CalculadoraImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontoTeste {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 5);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("5000"), 1);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
