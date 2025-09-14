package model;

import controller.PlayerAction;

public class Player {

    private final String name;

    /**
     * Color is either black or white:
     *  1 --> white
     *  0 --> black
     *
     * @param color to be set to the player
     */
    private final boolean color;
    public boolean isActive;
    private PlayerAction playerAction;

    public Player(String name, boolean color) {
        this.name = name;
        this.color = color;
    }

    public void setActive() {
        isActive = true;
    }

    public void setInactive() {
        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public boolean getColor() {
        return color;
    }

}
