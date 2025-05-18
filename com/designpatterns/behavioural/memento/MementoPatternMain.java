package com.designpatterns.behavioural.memento;


public class MementoPatternMain {

    public static final String CURRENT_TEXT = "Current text: ";

    public static void main(String[] ignoredArgs) {
        // Create an originator
        TextEditor editor = new TextEditor("Initial text");
        // Create a caretaker
        Caretaker caretaker = new Caretaker();
        // Save the initial state
        caretaker.save(editor);
        System.out.println(CURRENT_TEXT + editor.getText());
        // Modify the text
        editor.setText("Modified text");
        System.out.println(CURRENT_TEXT + editor.getText());
        // Undo the modification
        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getText());
        // Modify the text again
        editor.setText("Another modification");
        System.out.println(CURRENT_TEXT + editor.getText());

    }
}
