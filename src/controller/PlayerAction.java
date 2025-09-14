package controller;

import model.Grid;
import model.actions.MoveAction;
import model.actions.PlaceAction;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public interface PlayerAction {

    public Grid place(PlaceAction placeAction);
    public Grid move(MoveAction moveAction);


}
