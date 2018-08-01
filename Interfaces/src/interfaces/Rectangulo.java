/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ESFOT
 */
public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
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
        
        return (2*base)+ (2*altura);
        
    }
    
    @Override
    public double calcularArea(){
     
        return base*altura;
    }

   
  
   
    
}
