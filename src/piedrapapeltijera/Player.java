/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import piedrapapeltijera.choice.Choice;
import java.util.HashMap;

/**
 *
 * @author jlmp1
 */
public class Player {
    
    private String nickname;
    private Choice jugadaActual;
    private int wins;
    
    public Player(String nickname) {
        this.nickname = nickname;
        this.wins = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public Choice getJugadaActual() {
        return jugadaActual;
    }

    public void setJugadaActual(Choice jugadaActual) {
        this.jugadaActual = jugadaActual;
    }
    
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
    
    public void addWins() {
        this.wins++;
    }
    
    public void play(HashMap<Integer, Choice> posiblesJugadas) {
        int clave;
        clave = (int)(Math.random() * (3));
        this.jugadaActual = posiblesJugadas.get(clave);
    }
    
    public void winRound() {
        System.out.println(this.nickname + " Wins!\n");
    }
    
    @Override
    public String toString() {
        String info;
        info = this.nickname + ": " + this.jugadaActual + "\n";
        info += "Total wins: " + this.wins + "\n";
        return info;
    }
    
}
