package Controle;

import Catalogo.Catalogo;
import Factory.FactoryEvento;
import Factory.FactoryNotificacao;
import Modelo.Categoria;
import Modelo.Comodidade;
import Modelo.Evento;
import Modelo.Localizacao;
import Modelo.Notificacao;
import Modelo.Status;
import java.util.ArrayList;


/**
 *
 * @author Sayu
 */
public class Controlador {
    
    private Catalogo catalogo;
    private ArrayList<Notificacao> notificacoes;
    
    public Controlador () {
        catalogo = new Catalogo();
        notificacoes = new ArrayList<>();
    }

    public String criarOrganizador(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void adicionarEvento(String nome, String descricao, int quantidadeConvidados, Localizacao localizacao, double precoAcomodacao, String nomeOrganizador) {
        FactoryEvento fEvento = new FactoryEvento();
        Evento novoEvento = fEvento.criarEvento(nome, descricao, quantidadeConvidados, localizacao, precoAcomodacao, nomeOrganizador);
        catalogo.adicionarEvento(novoEvento);
        FactoryNotificacao fNotificacao = new FactoryNotificacao();
        Notificacao notificacao = fNotificacao.criarNotificacao(nome);
        notificacoes.add(notificacao);
    }

    public void cancelarEvento(String nomeEvento) {
        catalogo.removerEvento(nomeEvento);
    }

    public void alterarNomeEvento(String nomeEvento, String novoNome) {
        catalogo.alterarNomeEvento(nomeEvento, novoNome); 
    }

    public void alterarDescricaoEvento(String nomeEvento, String novaDescricao) {
        catalogo.alterarDescricaoEvento(nomeEvento, novaDescricao); 
    }

    public void alterarQuantidadeConvidadosEvento(String nomeEvento, int novaQuantidadeConvidados) {
        catalogo.alterarQuantidadeConvidadosEvento(nomeEvento, novaQuantidadeConvidados); 
    }

    public void alterarLocalizacaoEvento(String nomeEvento, Localizacao novaLocalizacao) {
        catalogo.alterarLocalizacaoEvento(nomeEvento, novaLocalizacao);
    }

    public void alterarPrecoAcomodacaoEvento(String nomeEvento, double novoPrecoAcomodacao) {
        catalogo.alterarPrecoAcomodacaoEvento(nomeEvento, novoPrecoAcomodacao);
    }

    public void alterarStatusEvento(String nomeEvento, Status novoStatus) {
        catalogo.alterarStatusEvento(nomeEvento, novoStatus);
    }

    public double calcularCustoPorPessoaEvento(String nomeEvento) {
        return catalogo.calcularCustoPorPessoa(nomeEvento);
    }

    public double calcularCustoTotal(String nomeEvento) {
        return catalogo.calcularCustoTotal(nomeEvento);
    }

    public String buscarEvento(String busca) {
        Evento evento = catalogo.buscarEvento(busca);
        return evento.exibirRelatorio();
    }

    public Evento exibirEvento(String nomeEvento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void exibirRelatorio() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String exibirRelatorioEventos() {
        return catalogo.exibirRelatorioEventos();
    }

    public void adicionarComodidade(String nomeEvento, String nome, double preco, Categoria categoria) {
        catalogo.adicionarComodidade(nomeEvento, nome, preco, categoria);
    }

    public void removerComodidade(String nomeEvento, Comodidade comodidade) {
        catalogo.removerComodidade(nomeEvento, nomeEvento);
    }

    public void alterarNomeComodidade(String nomeEvento, String nomeComodidade, String novoNome) {
        catalogo.alterarNomeComodidade(nomeEvento, nomeComodidade, novoNome);
    }

    public void alterarPrecoComodidade(String nomeEvento, String nomeComodidade,double novoPreco) {
        catalogo.alterarPrecoComodidade(nomeEvento, nomeComodidade, novoPreco);
    }

    public void alterarCategoriaComodidade(String nomeEvento, String nomeComodidade, Categoria novaCategoria) {
        catalogo.alterarCategoriaComodidade(nomeEvento, nomeComodidade, novaCategoria);
    }

    public double calcularCustoFixo(String nomeEvento) {
        return catalogo.calcularCustoFixo(nomeEvento);
    }

    public double calcularCustoVariavel(String nomeEvento) {
        return catalogo.calcularCustoVariavel(nomeEvento);
    }
    
}
