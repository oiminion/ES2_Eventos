/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Localizacao;

/**
 *
 * @author Arthur
 */
public class FactoryLocalizacao {
    public Localizacao criarLocalizacao(String nome, double latitude, double longitude, double custoAluguelPorDia)
    {
        return new Localizacao(nome, latitude, longitude, custoAluguelPorDia);
    }
}
