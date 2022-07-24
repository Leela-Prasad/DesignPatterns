package com.codewithmosh.structural.decorator.exercise;

import java.util.Arrays;

public class Editor {
    public void openProjects(String path) {
        AbstractArtefact[] artefacts = {
                new MainDecorator(new ErrorDecorator(new Artefact("Main"))),
                new Artefact("Demo"),
                new ErrorDecorator(new Artefact("EmailClient")),
                new Artefact("EmailProvider"),
        };

        for(AbstractArtefact artefact: artefacts) {
            System.out.println(artefact.render());
        }
    }
}
