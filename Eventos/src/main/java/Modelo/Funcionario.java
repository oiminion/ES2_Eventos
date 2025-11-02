/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Arthur
 */
public class Funcionario {
    private String CPF;
    private String funcao;
    private double diaria;
    private double pagamentoTotal;

    public Funcionario(String CPF, String funcao, double diaria) {
        this.CPF = CPF;
        this.funcao = funcao;
        this.diaria = diaria;
    }
    
    public void calcularPagamentoTotal(double diaria, int duracaoEmDias)
    {
        this.pagamentoTotal = diaria * duracaoEmDias;
    }
}
