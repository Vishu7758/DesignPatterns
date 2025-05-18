package com.designpatterns.behavioural.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Caretaker class that manages the mementos for the TextEditor.
 * It saves and restores the state of the TextEditor.
 */
public class Caretaker {
    private final Deque<EditorMemento> mementoStack;

    public Caretaker() {
        mementoStack = new ArrayDeque<>();
    }

    public void save(TextEditor editor) {
        mementoStack.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop());
        } else {
            System.out.println("No mementos to undo.");
        }
    }
}
