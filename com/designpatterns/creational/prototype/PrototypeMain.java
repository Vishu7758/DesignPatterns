package com.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] ignoredArgs) {
        GamePeice knight = new GamePeice("Knight", "Black");
        GamePeice bishop = new GamePeice("Bishop", "White");

        GameBoard gameBoard = new GameBoard();
        gameBoard.addGamePiece(knight);
        gameBoard.addGamePiece(bishop);

        // Cloning the game board
        GameBoard clonedBoard = gameBoard.cloneObject();

        // Displaying the original and cloned game board
        System.out.println("Original Board: " + gameBoard);
        System.out.println("Cloned Board: " + clonedBoard);
    }
}
