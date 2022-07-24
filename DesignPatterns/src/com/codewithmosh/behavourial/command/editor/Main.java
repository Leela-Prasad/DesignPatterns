package com.codewithmosh.behavourial.command.editor;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.setContent("Hello World!");

        var history = new History();

        // This command object is linked to
        // button on the screen
        var command = new BoldCommand(document, history);
        command.execute();
        System.out.println(document.getContent());

        /*command.unexecute();
        System.out.println(document.getContent());*/
        var undo = new UndoCommand(history);
        undo.execute();
        System.out.println(document.getContent());

    }
}
