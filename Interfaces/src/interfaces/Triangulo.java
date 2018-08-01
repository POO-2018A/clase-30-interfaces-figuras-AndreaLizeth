/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author ESFOT
 */
public class Triangulo implements Figura{
    double base;
    double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
     public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    @Override
    public double calcularPerimetro(){
      
        return base+ altura + (sqrt(pow(base,2)+pow(altura,2)));
    }
    
    @Override
    public double calcularArea(){
         
        return (base*altura)/2;
    }

   
    
    
}
