package com.designpatterns.behavioral.memento;

/**
 * Memento class that stores the state of the TextEditor.
 * It encapsulates the state of the TextEditor and allows
 * for restoring it later.
 */
public record EditorMemento(String text) {
}
