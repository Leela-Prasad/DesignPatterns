package com.codewithmosh.behavourial.command.exercise;

public interface UndoableCommand extends Command {
    void unexecute();
}
