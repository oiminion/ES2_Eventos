/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Arthur
 */
public class Comodidade {
    private String nome;
    private double preco;
    private Categoria categoria;

    public Comodidade(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public double calcularCustoFixo(){
        if(categoria == Categoria.CUSTO_FIXO)
        {
            return this.preco;
        }
        return 0;
    }
    
    public double calcularCustoVariavel(int quantidade){
        if(categoria == Categoria.CUSTO_VARIAVEL)
        {
            return this.preco * quantidade;
        }
        return 0;
    }
}
