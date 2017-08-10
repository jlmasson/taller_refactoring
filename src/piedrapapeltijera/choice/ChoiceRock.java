/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera.choice;

/**
 *
 * @author jlmp1
 */
public class ChoiceRock extends Choice {
    
    public ChoiceRock() {
        this.id = 0;
        this.nombre = "Rock";
    }

    @Override
    public int compareTo(Choice o) {
        if (this.id == o.id) {
            return 0;
        }
        else if (o.id == 2) {
            return 1;
        }
        return -1;
    }
    
}
