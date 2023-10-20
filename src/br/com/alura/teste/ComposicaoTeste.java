package br.com.alura.teste;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.ProxyOrcamento;

import java.math.BigDecimal;

public class ComposicaoTeste {

    /*Composite percorre a estrutura de arvore representando itens e orcamentos de forma semelhante*/

    public static void main(String[] args) {

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("300")));

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("800")));
        novo.adicionarItem(antigo);

        ProxyOrcamento proxy = new ProxyOrcamento(novo);

        for(int i = 1; i <= 10; i++){
            System.out.println(proxy.getValor());

        }
    }
}
