package com.codewithmosh.behavourial.mediator.approach1;

public class ArticlesDialogBox extends DialogBox{
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

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

    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox)
            articleSelected();
        if(control == titleTextBox)
            titleChanged();
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
