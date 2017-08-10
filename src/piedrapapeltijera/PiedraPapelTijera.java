/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.HashMap;
import piedrapapeltijera.choice.Choice;
import piedrapapeltijera.choice.ChoicePaper;
import piedrapapeltijera.choice.ChoiceRock;
import piedrapapeltijera.choice.ChoiceScissor;

/**
 *
 * @author jlmp1
 */
public class PiedraPapelTijera {
    
    public static void main(String[] args) {
        HashMap<Integer, Choice> posiblesJugadas; 
        posiblesJugadas = PiedraPapelTijera.generarJugadas();
        Player p1, p2;
        p1 = new Player("Jugador 1");
        p2 = new Player("Jugador 2");
        
        System.out.println(p1);
        System.out.println(p2);
        
        
        do {
            
            
            
        } while (p1.getWins() < 3 && p2.getWins() < 3);
       
    }
    
    private static HashMap<Integer, Choice> generarJugadas() {
        HashMap<Integer, Choice> jugadas;
        jugadas = new HashMap<>();
        jugadas.put(0, new ChoiceRock());
        jugadas.put(1, new ChoicePaper());
        jugadas.put(2, new ChoiceScissor());
        return jugadas;
    }
    
    private static void jugar(Player p1, Player p2) {
        
        
        
    }
    
}
