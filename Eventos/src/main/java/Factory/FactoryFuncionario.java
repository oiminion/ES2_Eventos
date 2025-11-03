/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Modelo.Funcionario;

/**
 *
 * @author Arthur
 */
public class FactoryFuncionario {
    public Funcionario criarFuncionario(String nome, String CPF, String funcao, double diaria)
    {
        return new Funcionario(nome, CPF, funcao, diaria);
    }
}
