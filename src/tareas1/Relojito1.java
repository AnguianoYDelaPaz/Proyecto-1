/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class Relojito1 extends Thread {
    @Override
    public void run () {
        while(true){
            try {
                LocalTime hora = LocalTime.now();
                System.out.println(hora.toString());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}
