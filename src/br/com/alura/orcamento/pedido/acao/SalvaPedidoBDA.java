package br.com.alura.orcamento.pedido.acao;

import br.com.alura.orcamento.pedido.Pedido;

public class SalvaPedidoBDA implements AcaoAposConfirmacaoPedido {

    public void executarAcao(Pedido pedido){

        System.out.println("Simulacao de salvamento no banco de dados confirmando o pedido!");
    }
}
