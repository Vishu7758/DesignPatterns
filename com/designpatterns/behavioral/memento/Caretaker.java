package com.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * Caretaker class that manages the mementos for the TextEditor.
 * It saves and restores the state of the TextEditor.
 */
public class Caretaker {
    private final Stack<EditorMemento> mementoStack;

    public Caretaker() {
        mementoStack = new Stack<>();
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
