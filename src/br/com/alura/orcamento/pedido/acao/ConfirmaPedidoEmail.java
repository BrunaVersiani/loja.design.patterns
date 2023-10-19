package br.com.alura.orcamento.pedido.acao;

import br.com.alura.orcamento.pedido.Pedido;

public class ConfirmaPedidoEmail implements AcaoAposConfirmacaoPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Simulacao envio email, confirmando pedido!");
    }
}
