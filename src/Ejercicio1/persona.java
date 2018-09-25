/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author T-101
 */
public class persona {
    
    float peso;
    float altura;
    float imc;

    public persona(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    void calcularIMC(){
    imc = peso / (altura * altura);
    }
    
}