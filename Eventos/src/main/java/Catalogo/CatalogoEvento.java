/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Modelo.Evento;
import Modelo.Status;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class CatalogoEvento {
    private ArrayList<Evento> eventos;
    
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
}
