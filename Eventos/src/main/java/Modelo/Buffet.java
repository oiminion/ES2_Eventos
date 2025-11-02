/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Buffet {
    private ArrayList<ItemBuffet> ItensBuffet; 
    private double custoTotal;
    
    public Buffet()
    {
        this.ItensBuffet = new ArrayList<>();
    }
    
    public void calcularCustoTotal()
    {
        double result = 0;
        for(ItemBuffet i: ItensBuffet)
        {
            result += i.getCusto();
        }
        this.custoTotal = result;
    }
}
