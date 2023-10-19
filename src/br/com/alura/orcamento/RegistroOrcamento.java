package br.com.alura.orcamento;

import br.com.alura.DomainException;
import br.com.alura.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {
    private HttpAdapter http;

    /*Os padroes estruturais nos ajudam a relacionar classes de forma organizada
      e os padroes de infraestruturas devem ser abstraidos de interfaces*/

    public RegistroOrcamento(HttpAdapter http){
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if(!orcamento.isFinalizado()){
            throw new DomainException("O orcamento nao esta finalizado!");
        }

        //Exemplo de api para requisicao. Passe aqui uma api
        String url = "http://api.externa.valida";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url , dados);
    }

}
