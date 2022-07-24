package com.codewithmosh.behavourial.command.exercise;

public class Main {
    public static void main(String[] args) {
        var editor = new VideoEditor();
        editor.setText("Text1");
        editor.setContrast(1.2f);

        var history = new History();
        var textCommand = new SetTextCommand("Text2", editor, history);
        textCommand.execute();
        System.out.println(editor);
        var contrastCommand = new SetContrastCommand(2.2f, editor, history);
        contrastCommand.execute();
        System.out.println(editor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor);
        undoCommand.execute();
        System.out.println(editor);
        undoCommand.execute();
        System.out.println(editor);
    }
}
