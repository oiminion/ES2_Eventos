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
}
