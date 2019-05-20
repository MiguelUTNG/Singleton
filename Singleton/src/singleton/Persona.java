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
public class Persona {
    public String name;
    public String lastName;
    public int year;
    private static Persona instance  = new Persona();
    
    private Persona(){}
    
    public static Persona getIntance(){
        return instance;
    }
}
