package Controle;

import Catalogo.Catalogo;
import Modelo.Categoria;
import Modelo.Comodidade;
import Modelo.Evento;
import Modelo.Localizacao;
import Modelo.Status;


/**
 *
 * @author Sayu
 */
public class Controlador {
    
    private Catalogo catalogo;
    
    public Controlador () {
        catalogo = new Catalogo();
    }

    public String criarOrganizador(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void adicionarEvento(String nome, String descricao, int quantidadeConvidados, Localizacao localizacao, double precoAcomodacao, String nomeOrganizador) {
        throw new UnsupportedOperationException("Not supported yet."); 
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

    public void exibirRelatorioEventos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void adicionarComodidade(Evento evento, String nome, double preco, Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); 
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
