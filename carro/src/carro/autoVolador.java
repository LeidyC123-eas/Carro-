/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author leidyC123-eas - juanDavid 
 * @class autoVolador
 * @version 1.0
 * Clase de un autoVolador que hereda de la clase carro para su implementacion 
 */
public class autoVolador extends Carro {
    public boolean esta_volando=false;

    public autoVolador(String Color, char placa, String chasis) {
        super(Color, placa, chasis);
    }

    public autoVolador(String Color) {
        super(Color);
    }

    public boolean isEsta_volando() {
        return esta_volando;
    }

    public void setEsta_volando(boolean esta_volando) {
        this.esta_volando = esta_volando;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
  /**
   * Metoso volar para que nuestro carro vuele o aterrice
   * @param estado 
   *el estado es un booleano que contrala si esta volando o no 
   */
   
    
    
    public void Volar(boolean estado){
        this.esta_volando=estado;
    }
}