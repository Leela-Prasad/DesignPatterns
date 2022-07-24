package com.codewithmosh.behavourial.command.composite;

import com.codewithmosh.behavourial.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
