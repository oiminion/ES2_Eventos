package Controle;

import Catalogo.CatalogoEvento;
import Modelo.Evento;
import Modelo.Localizacao;
import Modelo.Status;



/**
 *
 * @author Sayu
 */
public class ControladorEvento {

    public void adicionarEvento(String nome, String descricao, int quantidadeConvidados, Localizacao localizacao, double precoAcomodacao, String nomeOrganizador) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void cancelarEvento(Evento evento) {
        CatalogoEvento catalogoEvento = new CatalogoEvento();
        catalogoEvento.removerEvento(evento);
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

    public void alterarStatusEvento(Evento evento, Status novoStatus) {
        CatalogoEvento catalogoEvento = new CatalogoEvento();
        catalogoEvento.alterarStatusEvento(evento, novoStatus);
    }

    public double calcularCustoPorPessoaEvento(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public double calcularCustoTotal(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Evento buscarEvento(String busca) {
        throw new UnsupportedOperationException("Not supported yet."); 
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

}
