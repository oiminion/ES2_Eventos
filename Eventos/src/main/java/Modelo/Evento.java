/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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
    private double custoPorPessoa;
    private double custoTotal;
    
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

    public double getCustoPorPessoa() {
        return custoPorPessoa;
    }

    public void setCustoPorPessoa(double custoPorPessoa) {
        this.custoPorPessoa = custoPorPessoa;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }
    
    
    
}
