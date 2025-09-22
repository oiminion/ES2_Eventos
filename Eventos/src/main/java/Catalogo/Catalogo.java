/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Modelo.Categoria;
import Modelo.Evento;
import Modelo.Localizacao;
import Modelo.Status;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Catalogo {

    private ArrayList<Evento> eventos;

    public Catalogo() {
        this.eventos = new ArrayList<>();
    }
    
    public void alterarNomeComodidade(String nomeEvento, String nomeComodidade, String novoNome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.alterarNomeComodidade(nomeComodidade, novoNome);
            }
        }
    }

    public void alterarPrecoComodidade(String nomeEvento, String nomeComodidade, double novoPreco) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.alterarPrecoComodidade(nomeComodidade, novoPreco);
            }
        }
    }

    public void alterarCategoriaComodidade(String nomeEvento, String nomeComodidade, Categoria novaCategoria) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.alterarCategoriaComodidade(nomeComodidade, novaCategoria);
            }
        }
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }
    
    public void adicionarComodidade(String nomeEvento, String nome, double preco, Categoria categoria)
    {
        for (Evento e : eventos) {
            if (e.getNome().equals(nomeEvento)) {
                e.adicionarComodidade(nome, preco, categoria);
            }
        }
    }
    
    public void alterarStatusEvento(String nomeEvento, Status novoStatus) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.setStatus(novoStatus);
            }
        }
    }

    public void removerEvento(String nomeEvento) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                eventos.remove(evento);
            }
        }
    }

    public void cancelarEvento(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Evento buscarEvento(String busca) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(busca)) {
                return evento;
            }
        }
        return null;
    }

    public void removerComodidade(String nomeEvento, String nomeComodidade) {
        for (Evento e : eventos) {
            if (e.getNome().equalsIgnoreCase(nomeEvento)) {
                e.removerComodidade(nomeComodidade);
            }
        }
    }
    
    public String exibirRelatorioEventos(){
        String relatorio = "";
        for (Evento e : eventos) {
            relatorio += e.exibirRelatorio() + "\n";
        }
        return relatorio;
    }
    
    public void alterarNomeEvento(String nomeEvento, String novoNome){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.setNome(novoNome);
            }
        }
    }
    
    public void alterarDescricaoEvento(String nomeEvento, String novaDescricao){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.setDescricao(novaDescricao);
            }
        }
    }
    
    public void alterarQuantidadeConvidadosEvento(String nomeEvento, int novaQuantidadeConvidados){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.setQuantidadeConvidados(novaQuantidadeConvidados);
            }
        }
    }
    
    public void alterarLocalizacaoEvento(String nomeEvento, Localizacao novaLocalizacao){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.setLocalizacao(novaLocalizacao);
            }
        }
    }
    
    public void alterarPrecoAcomodacaoEvento(String nomeEvento, double novoPrecoAcomodacao){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                evento.setPrecoAcomodacao(novoPrecoAcomodacao);
            }
        }
    }
    
    public double calcularCustoFixo(String nomeEvento){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                return evento.calcularCustoFixo();
            }
        }
        return 0;
    }
    
    public double calcularCustoVariavel(String nomeEvento){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                return evento.calcularCustoVariavel();
            }
        }
        return 0;
    }
    
    public double calcularCustoTotal(String nomeEvento){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                return evento.calcularCustoTotal();
            }
        }
        return 0;
    }
    
    public double calcularCustoPorPessoa(String nomeEvento){
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                return evento.calcularCustoPorPessoa();
            }
        }
        return 0;
    }
}
