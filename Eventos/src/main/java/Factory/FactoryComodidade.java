/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Categoria;
import Modelo.Comodidade;

/**
 *
 * @author Arthur
 */
public class FactoryComodidade {
    public Comodidade criarComodidade(String nome, double preco, Categoria categoria)
    {
        return new Comodidade(nome, preco, categoria);
    }
}
