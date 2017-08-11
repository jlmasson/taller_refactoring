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
import piedrapapeltijera.player.Player;

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
        
        int roundsPlayed, draws;
        roundsPlayed = draws = 0;
        
        do {
            
            System.out.println("************** Round: " +
                (roundsPlayed + 1) + " *******************\n");
            System.out.println("Number of Draws: "+ draws + "\n");
            
            boolean empate;
            
            empate = jugar(p1, p2, posiblesJugadas);
            
            if (empate) {
                draws++;
                System.out.println("Draw in this round!!\n");
            }
            
            roundsPlayed++;
        		
        } while ((p1.getWins() < 3) && (p2.getWins() < 3));
       
        if (p1.getWins() == 3){
            System.out.println(p1.getNickname() + " wins the game!!!!!!");
        }else if(p2.getWins() == 3){
            System.out.println(p2.getNickname() + " wins the game!!!!!!");
        }
    }
    
    private static HashMap<Integer, Choice> generarJugadas() {
        HashMap<Integer, Choice> jugadas;
        jugadas = new HashMap<>();
        jugadas.put(0, new ChoiceRock());
        jugadas.put(1, new ChoicePaper());
        jugadas.put(2, new ChoiceScissor());
        return jugadas;
    }
    
    private static boolean jugar(Player p1, Player p2, 
            HashMap<Integer, Choice> posiblesJugadas) {
        Round round = new Round(p1, p2);
        p1.play(posiblesJugadas);
        p2.play(posiblesJugadas);

        System.out.println("----------------\n");
        System.out.println(p1);
        System.out.println(p2);
        round.play();
        System.out.println("----------------\n");
        
        return round.isDraw();
        
    }
    
}
