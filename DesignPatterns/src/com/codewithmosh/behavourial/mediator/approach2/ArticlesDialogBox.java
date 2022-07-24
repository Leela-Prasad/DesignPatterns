package com.codewithmosh.behavourial.mediator.approach2;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        /*articlesListBox.attach(() -> articleSelected());
        titleTextBox.attach(() -> titleChanged());*/

        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        System.out.println("Text Box: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
        titleTextBox.setContent("");
        System.out.println("Text Box: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
        titleTextBox.setContent("Article 3");
        System.out.println("Text Box: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content == "");
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        String selection = articlesListBox.getSelection();
        titleTextBox.setContent(selection);
        saveButton.setEnabled(true);
    }
}
