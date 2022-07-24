package com.codewithmosh.creational.abstractfactory.novice;

import com.codewithmosh.creational.abstractfactory.novice.ant.AntButton;
import com.codewithmosh.creational.abstractfactory.novice.ant.AntTextBox;
import com.codewithmosh.creational.abstractfactory.novice.material.MaterialButton;
import com.codewithmosh.creational.abstractfactory.novice.material.MaterialTextBox;

public class ContactForm {
    void render(Theme theme) {
        if(theme == Theme.MATERIAL) {
            new MaterialButton().render();
            new MaterialTextBox().render();
        }else if(theme == Theme.ANT) {
            new AntButton().render();
            new AntTextBox().render();
        }
    }
}
