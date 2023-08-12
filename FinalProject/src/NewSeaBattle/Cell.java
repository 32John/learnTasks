package NewSeaBattle;

public enum Cell {
    EMPTY("\uD83C\uDFFF"),
    HALO("\uD83C\uDFFB"),
    SHIP("\uD83D\uDEE5"),  // символ корабля(юникод)
    PADDED_CELL("✖"),   // подбитая ячейка
    BEGINNING("y⃥x"),
    X1(" X₁"),
    X2("X₂"),
    X3("X₃"),
    X4("X₄"),
    X5("X₅"),
    X6("X₆"),
    X7("X₇"),
    X8("X₈"),
    X9("X₉"),
    X10("X1₀"),
    Y1("Y₁ "),
    Y2("Y₂ "),
    Y3("Y₃ "),
    Y4("Y₄ "),
    Y5("Y₅ "),
    Y6("Y₆ "),
    Y7("Y₇ "),
    Y8("Y₈ "),
    Y9("Y₉ "),
    Y10("Y1₀");


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
