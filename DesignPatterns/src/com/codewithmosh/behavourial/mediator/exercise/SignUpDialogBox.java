package com.codewithmosh.behavourial.mediator.exercise;

public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox agreeToTermsCheckBox = new CheckBox();

    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.attach(this::controlChanged);
        passwordTextBox.attach(this::controlChanged);
        agreeToTermsCheckBox.attach(this::controlChanged);
    }

    public void simulateUserInteraction() {
        System.out.println("SignUp Button :" + signUpButton.isEnabled());
        usernameTextBox.setContent("username");
        passwordTextBox.setContent("password");
        agreeToTermsCheckBox.setChecked(true);
        System.out.println("SignUp Button :" + signUpButton.isEnabled());

        /*usernameTextBox.setContent("");
        System.out.println("SignUp Button :" + signUpButton.isEnabled());*/
        agreeToTermsCheckBox.setChecked(false);
        System.out.println("SignUp Button :" + signUpButton.isEnabled());

    }

    public void controlChanged() {
        String usernameContent = usernameTextBox.getContent();
        String passwordContent = passwordTextBox.getContent();
        boolean checked = agreeToTermsCheckBox.isChecked();

        if(!usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && agreeToTermsCheckBox.isChecked())
            signUpButton.setEnabled(true);
        else
            signUpButton.setEnabled(false);
    }
}
