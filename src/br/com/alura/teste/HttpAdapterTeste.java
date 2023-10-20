package br.com.alura.teste;

import br.com.alura.http.JavaHttpClient;
import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class HttpAdapterTeste {

    /*O padrao Adapter pode ajudar a trocar detalhes de infraestrutura */

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));

        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
