package br.com.alura.teste;

import br.com.alura.orcamento.pedido.GeraPedido;
import br.com.alura.orcamento.pedido.GeraPedidoHandler;
import br.com.alura.orcamento.pedido.acao.ConfirmaPedidoEmail;
import br.com.alura.orcamento.pedido.acao.SalvaPedidoBDA;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Maria Julieta";
        BigDecimal valorOrcamento = new BigDecimal("1000");
        int quantidadeItens = 2;

      /*Como ficaria se o teste fosse via propt de comando:
       String cliente = args[0];
       BigDecimal valorOrcamento = new BigDecimal(args[1]);
       int quantidadeItens = Integer.parseInt(args[2]);
      */

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        //gerador.executaPedido(); Como é feito sem class handler
        //GeraPedidoHandler dadosHandler = new GeraPedidoHandler(/*dependencias passaria aqui*/);
        GeraPedidoHandler dadosHandler = new GeraPedidoHandler(Arrays.asList(new SalvaPedidoBDA(), new ConfirmaPedidoEmail()));
        dadosHandler.executaPedido(gerador);

    }
}
