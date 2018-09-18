/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraccion;
import java.util.Scanner;
/**
 *
 * @author T-101
 */
public class AplicacionAreas {
    public static void main(String[] args) {
        int opc;
        float a, pi=3.1416f, l, b, h, r;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido, escoge una opción:");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Triangulo");
        System.out.println("3.- Circulo");
        opc = sc.nextInt();
        switch (opc)
        {
            case 1:
                System.out.println("Dame el lado de tu cuadrado");
                l = sc.nextFloat();
                a = l*l;
                System.out.println("El area del cuadrado es: " + a);
                break;
            case 2:
                System.out.println("Dame la altura de tu triangulo");
                h = sc.nextFloat();
                System.out.println("Dame la base de tu triangulo");
                b = sc.nextFloat();
                a= (b * h)/2;
                System.out.println("El area del triangulo es: " + a);
                break;
            case 3:
                System.out.println("Dame el radio de tu circulo");
                r = sc.nextFloat();
                a = pi * (r*r);
                System.out.println("El area del circulo es: " + a);
                break;
        }  
    }
}
