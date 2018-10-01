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
public class rectangulo {
    float ancho;
    float alto;
    float area;

    public rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    void calcularArea(){
    area = ancho*alto;
    }
    
}
