/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Evento;
import java.time.LocalDateTime;

/**
 *
 * @author Arthur
 */
public class FactoryEvento {
    public Evento criarEvento(String nome, String descricao, int quantidadeConvidados, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim)
    {
        return new Evento(nome, descricao, quantidadeConvidados, dataHoraInicio, dataHoraFim);
    }
}
