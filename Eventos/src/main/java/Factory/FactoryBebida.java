/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Bebida;
import Modelo.TipoItem;

/**
 *
 * @author Arthur
 */
public class FactoryBebida {
    public Bebida criarBebida(String nome, double custo, TipoItem tipoitem)
    {
        return new Bebida(nome, custo, tipoitem);
    }
}
