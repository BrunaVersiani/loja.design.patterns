package br.com.alura.teste;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class ComposicaoTeste {

    /*Composite percorre a estrutura de arvore representando itens e orcamentos de forma semelhante*/

    public static void main(String[] args) {

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("300")));

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("800")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());

    }
}
