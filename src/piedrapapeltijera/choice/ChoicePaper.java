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
public class ChoicePaper extends Choice {

    public ChoicePaper() {
        this.id = 1;
        this.nombre = "Paper";
    }

    @Override
    public int compareTo(Choice o) {
        if (this.id == o.id) {
            return 0;
        }
        else if (o.id == 0) {
            return 1;
        }
        return -1;
    }
    
}
