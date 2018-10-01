/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class triangulo {
    float base;
    float altura;
    float area;

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        
    }
   
   void calcularArea(){
    area = (base*altura)/2;
    }
     
    
}
