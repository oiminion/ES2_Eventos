/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Arthur
 */
public class DespesaAdicional extends Despesa{
    private String descricao;
    private double custoPorConvidado;

    public DespesaAdicional(String nome, CategoriaCusto categoriaCusto, String descricao, double custoPorConvidado) {
        super(nome, categoriaCusto);
        this.descricao = descricao;
        this.custoPorConvidado = custoPorConvidado;
    }

    public double getCustoPorConvidado() {
        return custoPorConvidado;
    }
    
    
    
    public void calcularCustoTotalDespesaFixa(double custoPorConvidado)
    {
        this.custoPorConvidado += custoPorConvidado;
    }
    
    public void calcularCustoTotalDespesaVariavel(double custoPorConvidado, int quantidadeConvidados)
    {
        this.custoPorConvidado += custoPorConvidado * quantidadeConvidados;
    }
    
    public void alterarDespesaAdicional(String novoNome, String novaCategoriaCusto, String novaDescricao, double novoCustoPorConvidado)
    {
        super.alterarDespesa(novoNome, novaCategoriaCusto);
        this.descricao = novaDescricao;
        this.custoPorConvidado = novoCustoPorConvidado;
    }
}
