package model.tiles;

import model.Player;

public abstract class Stone {

    private boolean conductive;
    private boolean color;
    private Player owner;

    public boolean isConductive() {
        return conductive;
    }

    public void setConductive(boolean conductive) {
        this.conductive = conductive;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
