/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static java.lang.Math.pow;

/**
 *
 * @author ESFOT
 */
public class Cuadrado implements Figura {
    double ladoC;

    public Cuadrado(double ladoC) {
        this.ladoC = ladoC;
    }

    
    
    public double getLado() {
        return ladoC;
    }

    public void setLado(double ladoC) {
        this.ladoC = ladoC;
    }
    
    
    
    @Override
    public double calcularPerimetro(){
        
        return (4*ladoC);
    }
    
    @Override
    public double calcularArea(){
     
        return pow(ladoC,2);
    }

   
    
    
    
}
