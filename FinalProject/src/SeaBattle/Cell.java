package SeaBattle;

public enum Cell {
    EMPTY(" \u2587 "),
    HALO("□"),
    SHIP(" \uD83D\uDEE5"),  // символ корабля(юникод)
    PADDED_CELL("✖"),   // подбитая ячейка
    BEGINNING(" "),
    X1("  X1 "),
    X2("X2 "),
    X3("X3 "),
    X4("X4 "),
    X5("X5 "),
    X6("X6 "),
    X7("X7 "),
    X8("X8 "),
    X9("X9 "),
    X10("X10"),
    Y1("Y1 "),
    Y2("Y2 "),
    Y3("Y3 "),
    Y4("Y4 "),
    Y5("Y5 "),
    Y6("Y6 "),
    Y7("Y7 "),
    Y8("Y8 "),
    Y9("Y9 "),
    Y10("Y10");


    private String symbol;

    Cell(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    @Override
    public String toString() {
        return getSymbol();
    }
}
