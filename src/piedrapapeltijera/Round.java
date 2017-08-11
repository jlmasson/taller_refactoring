/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import piedrapapeltijera.choice.Choice;
import piedrapapeltijera.player.Player;

/**
 *
 * @author jlmp1
 */
public class Round {
    
    private Player p1;
    private Player p2;
    private boolean draw;

    public Round(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.draw = false;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void play() {
        Choice choiceP1 = this.p1.getJugadaActual();
        Choice choiceP2 = this.p2.getJugadaActual();

        int resultadoP1 = choiceP1.compareTo(choiceP2);
        boolean ganoP1 = (resultadoP1 == 1);
        boolean perdioP1 = (resultadoP1 < 0);

        if(ganoP1){
            this.p1.addWins();
            this.p1.winRound();
        } else if (perdioP1) {
            this.p2.addWins();
            this.p2.winRound();
        }
        else {
            this.draw = true;
        }
    }
}
