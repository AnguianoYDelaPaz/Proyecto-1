/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.*;

/**
 *
 * @author T-101
 */
public class Probar {

    public static void main(String[] args) {
        
        //Pregunta 1
        
        Opcion op1 = new Opcion("En un árbol", false);
        Opcion op2 = new Opcion("En una piña", true);
        Opcion op3 = new Opcion("En un zapato", false);
        Opcion op4 = new Opcion("En una piedra", false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        Pregunta p1 = new Pregunta("¿En qué vive Bob Esponja?", opciones);
        
        //Pregunta 2
        
        Opcion op11 = new Opcion("Pescar medusas", true);
        Opcion op12 = new Opcion("Cocinar Cangreburgers", false);
        Opcion op13 = new Opcion("Ir a la playa", false);
        Opcion op14 = new Opcion("Dormir", false);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p11 = new Pregunta("¿Qué le gusta hacer en sus días libres?", opciones1);
        
         //Pregunta 3
        
        Opcion op21 = new Opcion("Patricio", true);
        Opcion op22 = new Opcion("Calamardo", false);
        Opcion op23 = new Opcion("Plankton", false);
        Opcion op24 = new Opcion("Arenita", false);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        Pregunta p21 = new Pregunta("¿Quién es su mejor amigo?", opciones2);
        
        //Pregunta 4
        
        Opcion op31 = new Opcion("El balde de carnada", false);
        Opcion op32 = new Opcion("Escuela de botes", false);
        Opcion op33 = new Opcion("El crustáceo cascarudo", true);
        Opcion op34 = new Opcion("La escupidera de Salty", false);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        Pregunta p31 = new Pregunta("¿En dónde trabaja?", opciones3);
        
        //Pregunta 5
        
        Opcion op41 = new Opcion("Cocinar", false);
        Opcion op42 = new Opcion("Conducir", true);
        Opcion op43 = new Opcion("Bailar", false);
        Opcion op44 = new Opcion("Ser Asertivo", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        Pregunta p41 = new Pregunta("¿En que es pésimo Bob Esponja?", opciones4);
        
        //Pregunta 6
        
        Opcion op51 = new Opcion("Kevin", false);
        Opcion op52 = new Opcion("Gary", true);
        Opcion op53 = new Opcion("Pedro", false);
        Opcion op54 = new Opcion("Jeffrey", false);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        Pregunta p51 = new Pregunta("¿Cómo se llama su caracol?", opciones5);
        
        //Pregunta 7
        
        Opcion op61 = new Opcion("Van a la Choza de los Pequeñines", false);
        Opcion op62 = new Opcion("Son Hombres", false);
        Opcion op63 = new Opcion("Saben Karate", false);
        Opcion op64 = new Opcion("Serán golpeados por todos los clientes del bar (del bar)", true);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        Pregunta p61 = new Pregunta("“Todos los bebes que soplan burbujas…”", opciones6);
        
        //Pregunta 8
        
        Opcion op71 = new Opcion("15 de febrero", true);
        Opcion op72 = new Opcion("21 de agosto", false);
        Opcion op73 = new Opcion("02 de noviembre", false);
        Opcion op74 = new Opcion("03 de octubre", false);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        Pregunta p71 = new Pregunta("¿Cuándo se celebra el Día internacional de Molestar a Calamardo?", opciones7);
        
        //Pregunta 9
        
        Opcion op81 = new Opcion("Pez", false);
        Opcion op82 = new Opcion("Hombre", false);
        Opcion op83 = new Opcion("Cacahuate", true);
        Opcion op84 = new Opcion("Percebe", false);
        ArrayList<Opcion> opciones8 = new ArrayList<>();
        opciones8.add(op81);
        opciones8.add(op82);
        opciones8.add(op83);
        opciones8.add(op84);
        Pregunta p81 = new Pregunta("Bob y Patricio cantan “Soy un…”", opciones8);
        
        //Pregunta 10
        
        Opcion op91 = new Opcion("Parche el Pirata", true);
        Opcion op92 = new Opcion("El picador criminal mutilador", false);
        Opcion op93 = new Opcion("Larry la lagosta", false);
        Opcion op94 = new Opcion("El viejo Jenkins", false);
        ArrayList<Opcion> opciones9 = new ArrayList<>();
        opciones9.add(op91);
        opciones9.add(op92);
        opciones9.add(op93);
        opciones9.add(op94);
        Pregunta p91 = new Pregunta("El admirador #1 de Bob Esponja es", opciones9);
        
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p11);
        preguntas.add(p21);
        preguntas.add(p31);
        preguntas.add(p41);
        preguntas.add(p51);
        preguntas.add(p61);
        preguntas.add(p71);
        preguntas.add(p81);
        preguntas.add(p91);
        
        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getTitulo());
            for (Opcion opcion : pregunta.getOpciones()) {
                System.out.println(opcion.getTitulo());

            }
        }
        //Ahora probaremos el modelo

    }
}
