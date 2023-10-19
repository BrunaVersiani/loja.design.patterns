package br.com.alura.orcamento.pedido;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.pedido.acao.AcaoAposConfirmacaoPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //Lista de observadores que serao notificados quando disparado o evento, inversao de controle. Dessa forma eu diminuo o aclopamento e não preciso ficar chamando class por class
    private List<AcaoAposConfirmacaoPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposConfirmacaoPedido> acoes) {
        this.acoes = acoes;
    }

    /*Nesta class deve ser passado o  construtor com injecao de dependencias: repository, service, etc.

    Dessa maneira fica fora do padrao, já que orientaçaõ a objetos basease em juntar dados e comportamentos,
     com tudo o handler e bem comumente utilizado para termos uma melhor organização de codigo.*/

    public void executaPedido(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
