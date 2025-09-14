package controller;

import model.Player;

public class Game {

    private Player a;
    private Player b;
    private int komi;

    public Game(Player a, Player b, int komi) {
        this.a = a;
        this.b = b;
        this.komi = komi;
    }

    public void startGame() {
        this.a.setActive();
        this.b.setInactive();
    }

    public void nextTurn() {
        if (this.a.isActive()) {
            this.a.setInactive();
            this.b.setActive();
        } else {
            this.a.setActive();
            this.b.setInactive();
        }
    }

    /***
     * Controlls if the game has finished and the outcome
     * @return and integer that is
     *  1  if player a won
     *  0  if it's a tie
     *  -1 if player b won
     */
    public int checkEnd() {

        // controlla che un giocatore abbia finito gli stones
        // controllo che tutti gli spazzi della board siano occupati
        // controllo che qualcuno abbia creato una strada

        return 0;
    }


}
