/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Modelo.Categoria;
import Modelo.Evento;
import Modelo.Status;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Catalogo {

    private ArrayList<Evento> eventos;

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

    }

    public void alterarStatusEvento(Evento evento, Status novoStatus) {
        for (Evento e : eventos) {
            if (evento.equals(e)) {
                e.setStatus(novoStatus);
            }
        }
    }

    public void removerEvento(Evento evento) {
        for (Evento e : eventos) {
            if (evento.equals(e)) {
                eventos.remove(e);
            }
        }
    }

    public void cancelarEvento(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Evento buscarEvento(String busca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void removerComodidade(String nomeEvento, String nomeComodidade)
    {
        for(Evento e : eventos){
            if(e.getNome().equals(nomeEvento))
            {
                e.removerComodidade(nomeComodidade);
            }
        }
    }
}
