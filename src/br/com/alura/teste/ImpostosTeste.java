package br.com.alura.teste;

import br.com.alura.imposto.CalculadoraImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class ImpostosTeste {

    /*Padrao decorator voce decora um objeto com novas caracteristicas, sem alterar o codigo já existente*/

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("8000")));

        CalculadoraImposto calculadora = new CalculadoraImposto();

        System.out.println(calculadora.calcular(orcamento,new ISS(null)));
        System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));

    }
}
