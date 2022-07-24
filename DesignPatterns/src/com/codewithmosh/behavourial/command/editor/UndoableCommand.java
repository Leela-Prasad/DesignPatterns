package com.codewithmosh.behavourial.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
