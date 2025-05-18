package com.designpatterns.behavioural.command;

public interface Command {
    /*
     * The execute method is the main method of the command pattern. It is
     * responsible for executing the command. The command can be anything from
     * turning on a light to opening a file. The execute method is called when the
     * command is executed
     */
    void execute();

    /*
     * The undo method is responsible for undoing the command. This is useful when
     * you want to revert the command to its previous state. For example, if you
     * turn on a light, the undo method will turn it off. If you open a file, the
     * undo method will close it.
     */
    void undo();
}