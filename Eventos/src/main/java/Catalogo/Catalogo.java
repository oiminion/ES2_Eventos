/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Modelo.Evento;
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
    
    public void adicionarEvento(Evento evento)
    {
        this.eventos.add(evento);
    }
    
    public Evento buscarEvento(String nomeEvento)
    {
        for(Evento i: eventos)
        {
            if(i.getNome().equals(nomeEvento))
            {
                return i;
            }
        }
        return null;
    }
    
    public String exibirEventos()
    {
        String resultado = "";
        for(Evento i: eventos)
        {
            resultado += i.exibirEvento();
        }
        return resultado;
    }
    
    public void removerEvento(Evento evento)
    {
        this.eventos.remove(evento);
    }
}
