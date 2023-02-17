/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro;

/**
 *
 * @author leidyC123-eas - juanDavid
 * @class Carro
 * version 1.0 
 * clase padre Carro
 */
public class Carro {
 
    public String Color;
    private char placa;
    protected String chasis;
    private String Marca;

    public Carro(String Color, char placa, String chasis) {
        this.Color = Color;
        this.placa = placa;
        this.chasis = chasis;
    }

    public Carro(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public char getPlaca() {
        return placa;
    }

   

    
    }

