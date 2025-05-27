package com.designpatterns.creational.prototype;

public record GamePeice(String type, String color) implements Prototype<GamePeice> {
    @Override
    public GamePeice cloneObject() {
        return new GamePeice(this.type, this.color);
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
