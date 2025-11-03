/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Comida;
import Modelo.TipoItem;

/**
 *
 * @author Arthur
 */
public class FactoryComida {
    public Comida criarComida(String nome, double custo, TipoItem tipoitem)
    {
        return new Comida(nome, custo, tipoitem);
    }
}
