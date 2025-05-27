package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    private final List<GamePeice> gamePieces = new ArrayList<>();

    public void addGamePiece(GamePeice gamePiece) {
        this.gamePieces.add(gamePiece);
    }

    @Override
    public GameBoard cloneObject() {
        GameBoard clonedBoard = new GameBoard();
        for (GamePeice piece : this.gamePieces) {
            clonedBoard.addGamePiece(piece.cloneObject());
        }
        return clonedBoard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GameBoard{");
        for (GamePeice piece : gamePieces) {
            sb.append(piece.toString()).append(", ");
        }
        sb.append('}');
        return sb.toString();
    }
}
