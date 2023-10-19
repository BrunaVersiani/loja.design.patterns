package br.com.alura.teste;

import br.com.alura.http.JavaHttpClient;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class HttpAdapterTeste {

    /*O padrao Adapter pode ajudar a trocar detalhes de infraestrutura */

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
