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
public class Circulo implements Figura {
    protected final double PI = 3.1416;
    double radio;

    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    
    public double calcularArea(){
              
        return PI*pow(radio,2);
    }

    
    @Override
    
    public double calcularPerimetro() {
        
        return 2*radio*PI;
    }
}
