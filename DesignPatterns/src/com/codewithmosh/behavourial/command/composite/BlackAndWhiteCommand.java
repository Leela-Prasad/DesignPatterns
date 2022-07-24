package com.codewithmosh.behavourial.command.composite;

import com.codewithmosh.behavourial.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
