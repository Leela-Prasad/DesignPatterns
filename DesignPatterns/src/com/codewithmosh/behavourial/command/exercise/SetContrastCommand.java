package com.codewithmosh.behavourial.command.exercise;

public class SetContrastCommand implements UndoableCommand {
    private float prevContrast;
    private float contrast;
    private VideoEditor editor;
    private History history;

    public SetContrastCommand(float contrast, VideoEditor editor, History history) {
        this.contrast = contrast;
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
       prevContrast = editor.getContrast();
       editor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContrast);
    }
}
