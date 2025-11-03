/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.CategoriaCusto;
import Modelo.DespesaAdicional;

/**
 *
 * @author Arthur
 */
public class FactoryDespesaAdicional {
    public DespesaAdicional criarDespesaAdicional(String nome, CategoriaCusto categoriaCusto, String descricao, double custo)
    {
        return new DespesaAdicional(nome, categoriaCusto, descricao, custo);
    }
}
