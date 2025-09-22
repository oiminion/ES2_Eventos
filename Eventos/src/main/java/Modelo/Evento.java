/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Factory.FactoryComodidade;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Evento {

    private String nome;
    private String descricao;
    private int quantidadeConvidados;
    private Localizacao localizacao;
    private double precoAcomodacao;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Status status;
    private String nomeOrganizador;
    private ArrayList<Comodidade> comodidades;

    public Evento(String nome, String descricao, int quantidadeConvidados, Localizacao localizacao, double precoAcomodacao, String nomeOrganizador) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeConvidados = quantidadeConvidados;
        this.localizacao = localizacao;
        this.precoAcomodacao = precoAcomodacao;
        this.nomeOrganizador = nomeOrganizador;
    }
    
    public void alterarNomeComodidade(String nomeComodidade, String novoNome) {
        for (Comodidade comodidade : comodidades) {
            if (comodidade.getNome().equalsIgnoreCase(nomeComodidade)) {
                comodidade.setNome(novoNome);
            }
        }
    }

    public void alterarPrecoComodidade(String nomeComodidade, double novoPreco) {
        for (Comodidade comodidade : comodidades) {
            if (comodidade.getNome().equalsIgnoreCase(nomeComodidade)) {
                comodidade.setPreco(novoPreco);
            }
        }
    }

    public void alterarCategoriaComodidade(String nomeComodidade, Categoria novaCategoria) {
        for (Comodidade comodidade : comodidades) {
            if (comodidade.getNome().equalsIgnoreCase(nomeComodidade)) {
                comodidade.setCategoria(novaCategoria);
            }
        }
    }
    
    public String exibirRelatorio() {
        return "Nome: " + this.nome + "\n"
                + "Descricao: " + this.descricao + "\n"
                + "Convidados: " + this.quantidadeConvidados + "\n"
                + "Status: " + this.status + "\n"
                + "Custo Total: " + String.valueOf(calcularCustoTotal()) + "\n"; 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeConvidados() {
        return quantidadeConvidados;
    }

    public void setQuantidadeConvidados(int quantidadeConvidados) {
        this.quantidadeConvidados = quantidadeConvidados;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public double getPrecoAcomodacao() {
        return precoAcomodacao;
    }

    public void setPrecoAcomodacao(double precoAcomodacao) {
        this.precoAcomodacao = precoAcomodacao;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNomeOrganizador() {
        return nomeOrganizador;
    }

    public void setNomeOrganizador(String nomeOrganizador) {
        this.nomeOrganizador = nomeOrganizador;
    }

    public ArrayList<Comodidade> getComodidades() {
        return comodidades;
    }

    public void setComodidades(ArrayList<Comodidade> comodidades) {
        this.comodidades = comodidades;
    }
    
    public void removerComodidade(String nomeComodidade) {
        for (Comodidade comodidade : comodidades) {
            if (comodidade.getNome().equalsIgnoreCase(nomeComodidade)) {
                comodidades.remove(comodidade);
            }
        }
    }
    
    public void adicionarComodidade(String nome, double preco, Categoria categoria)
    {
        FactoryComodidade fComodidade = new FactoryComodidade();
        Comodidade comodidade = fComodidade.criarComodidade(nome, preco, categoria);
        comodidades.add(comodidade);
    }
    
    public double calcularCustoFixo(){
        double total = 0;
        for (Comodidade comodidade : comodidades) {
            total += comodidade.calcularCustoFixo();
        }
        return total;
    }
    
    public double calcularCustoVariavel(){
        double total = 0;
        for (Comodidade comodidade : comodidades) {
            total += comodidade.calcularCustoVariavel(quantidadeConvidados);
        }
        return total;
    }
    
    public double calcularCustoTotal(){
        double total = 0;
        for (Comodidade comodidade : comodidades) {
            total += comodidade.calcularCustoFixo();
            total += comodidade.calcularCustoVariavel(quantidadeConvidados);
        }
        return total;
    }
    
    public double calcularCustoPorPessoa(){
        double total = 0;
        for (Comodidade comodidade : comodidades) {
            total += comodidade.calcularCustoFixo();
            total += comodidade.calcularCustoVariavel(quantidadeConvidados);
        }
        return total/quantidadeConvidados;
    }
}
