/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos1;

/**
 *
 * @author T-101
 */
public class Tipos1 {
    public static void main(String[] args) {
        
        //Familia Integrales
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
        b = (byte)l;
        l = b;
        i = b;
        s = (short)i;
        s = (short)l;
        l = s;
        
        //Familia Flotantes
        float f = 3.4f;
        float f2 = 2;
        double d = 3.4;
        //byte b2 = (byte)300;
        //System.out.println(b2);
    }
    
}
