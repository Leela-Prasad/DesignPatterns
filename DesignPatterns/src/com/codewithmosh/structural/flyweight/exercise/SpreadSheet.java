package com.codewithmosh.structural.flyweight.exercise;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;

    private CellContextFactory cellContextFactory;

    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    public SpreadSheet(CellContextFactory cellContextFactory) {
        this.cellContextFactory = cellContextFactory;
        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExist(row, col);

        cells[row][col].setContent(content);
    }

    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExist(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getCellContext();
        var context = cellContextFactory.getCellContext(fontFamily, currentContext.getFontSize(), currentContext.isBold());
        cell.setCellContext(context);
    }

    private void ensureCellExist(int row, int col) {
        if(row<0 || row >=MAX_ROWS)
            throw new IllegalArgumentException();
        if(col<0 || col>=MAX_COLS)
            throw new IllegalArgumentException();
    }
    private void generateCells() {
        for(int row=0; row<MAX_ROWS; ++row)
            for(int col=0; col<MAX_COLS; ++col)
                cells[row][col] = new Cell(row, col, getDefaultContext());
    }

    private CellContext getDefaultContext() {
        return cellContextFactory.getCellContext("Times New Roman", 12, false);
    }

    public void render() {
        for(int row=0; row<MAX_ROWS; ++row)
            for(int col=0; col<MAX_COLS; ++col)
                cells[row][col].render();
    }
}
