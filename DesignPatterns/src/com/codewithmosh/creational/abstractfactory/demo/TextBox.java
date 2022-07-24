package com.codewithmosh.creational.abstractfactory.demo;

import com.codewithmosh.creational.abstractfactory.demo.ant.AntButton;
import com.codewithmosh.creational.abstractfactory.demo.ant.AntTextBox;

public interface TextBox extends Widget {
    class AntWidgetFactory implements WidgetFactory {
        @Override
        public Button createButton() {
            return new AntButton();
        }

        @Override
        public TextBox CreateTextBox() {
            return new AntTextBox();
        }
    }
}
