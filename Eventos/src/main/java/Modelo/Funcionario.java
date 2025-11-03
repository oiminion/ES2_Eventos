/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Arthur
 */
public class Funcionario  extends Despesa{
    private String CPF;
    private String funcao;
    private double diaria;
    private double pagamentoTotal;

    public Funcionario(String nome, String CPF, String funcao, double diaria) {
        super(nome, CategoriaCusto.CUSTO_FIXO);
        this.CPF = CPF;
        this.funcao = funcao;
        this.diaria = diaria;
    }

    public double getPagamentoTotal() {
        return pagamentoTotal;
    }
    
    
    
    public void calcularPagamentoTotal(int duracaoEmDias)
    {
        this.pagamentoTotal = this.diaria * duracaoEmDias;
    }
}
