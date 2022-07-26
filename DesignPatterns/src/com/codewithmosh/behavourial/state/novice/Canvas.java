package com.codewithmosh.behavourial.state.novice;

public class Canvas {
    private ToolType currentTool;

    public void mouseDown() {
        if(currentTool == ToolType.SELECTION)
            System.out.println("Selection Icon");
        else if(currentTool == ToolType.BRUSH)
            System.out.println("Brush Icon");
        else if(currentTool == ToolType.ERASER)
            System.out.println("Eraser Icon");
    }

    public void mouseUp() {
        if(currentTool == ToolType.SELECTION)
            System.out.println("Drawing dashed Rectangle");
        else if(currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if(currentTool == ToolType.ERASER)
            System.out.println("Erase Something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
