/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import Entidades.Dni;
import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author droa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Daniel","Roa",42, new Dni('F', "1102988365"), new Perro("Bruno", "Mestizo", 5, "Mediano"));
        Persona p2 = new Persona("Gonzalo","Alvarez",38, new Dni('F', "82.456.578"), new Perro("Cirrus", "Mestizo", 2, "Mediano"));
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        System.out.println("Intercambio de Perros....");
        
        Perro pr_aux = new Perro();
        pr_aux=p1.getPerro();
        p1.setPerro(p2.getPerro());
        p2.setPerro(pr_aux);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
    
}
