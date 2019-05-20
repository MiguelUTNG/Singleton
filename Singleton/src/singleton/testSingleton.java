/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Miguel
 */
public class testSingleton {
    public static void main(String[] args) {
        Persona p  = Persona.getIntance();
        Persona p1 = Persona.getIntance();
        
        p.name = "Miguel";
        p.lastName = "Camacho";
        System.out.println(p1.name);
    }
   
}
