/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Buffet;
import Modelo.CategoriaCusto;

/**
 *
 * @author Arthur
 */
public class FactoryBuffet {
    public Buffet criarBuffet(String nome, CategoriaCusto categoriaCusto)
    {
        return new Buffet(nome, categoriaCusto);
    }
}
