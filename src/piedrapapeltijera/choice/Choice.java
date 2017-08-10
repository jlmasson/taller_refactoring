/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera.choice;

/**
 *
 * @author Jose Luis Masson
 */
public abstract class Choice implements Comparable<Choice>{
    
    protected int id;
    protected String nombre;
    
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
