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

    public void alterarNomeEvento(Evento evento, String novoNome) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void alterarDescricaoEvento(Evento evento, String novaDescricao) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void alterarQuantidadeConvidadosEvento(Evento evento, int novaQuantidadeConvidados) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void alterarLocalizacaoEvento(Evento evento, Localizacao novaLocalizacao) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void alterarPrecoAcomodacaoEvento(Evento evento, double novoPrecoAcomodacao) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void alterarStatusEvento(String nomeEvento, Status novoStatus) {
        catalogo.alterarStatusEvento(nomeEvento, novoStatus);
    }

    public double calcularCustoPorPessoaEvento(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public double calcularCustoTotal(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String buscarEvento(String busca) {
        Evento evento = catalogo.buscarEvento(busca);
        return evento.exibirRelatorio();
    }

    public void exibirEvento(Evento evento) {
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

    public void removerComodidade(Evento evento, Comodidade comodidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
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

    public double calcularCustoFixo(Evento evento, Comodidade comodidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public double calcularCustoVariavel(Evento evento, Comodidade comodidade) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
