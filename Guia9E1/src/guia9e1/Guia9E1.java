/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9e1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author NiLe
 */
public class Guia9E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal p1 = new Perro("Chiquito",10,"Carne","Calleja");
        p1.alimentarse();
        
        Animal p2 = new Perro("Fernando", 20, "Vegetales", "Caniche");
        p2.alimentarse();
        
        Animal g1 = new Gato("Garfield", 50, "Lasagna", "Naranja");
        g1.alimentarse();
        
        Animal c1 = new Caballo("Spirit", 120, "Asado", "Pura Sangre");
        c1.alimentarse();
        
    }
    
}
