/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entregable1;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
    ArrayList<Usuario> usuarios;
    int id = 0;

    public PersistenciaUsuario() {
        usuarios = new ArrayList<>();
    }
    public void guardar (Usuario u)
    throws Exception{
        File f = new File ("usuarios");
        if(f.exists())usuarios = leerTodos();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
        public void borrar (Usuario u)
    throws Exception{
        File f = new File ("usuarios");
        if(f.exists())usuarios = leerTodos();
        usuarios.get(id);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        usuarios.remove(id);
        oos.writeObject(usuarios);
    }
    public ArrayList <Usuario> leerTodos()throws Exception{
        File f = new File ("usuarios");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        usuarios = (ArrayList<Usuario>)ois.readObject();
        return usuarios;
    }
 
}
