/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Notificacao;

/**
 *
 * @author Arthur
 */
public class FactoryNotificacao {
    public Notificacao criarNotificacao(String texto) {
        return new Notificacao(texto);
    }
}
