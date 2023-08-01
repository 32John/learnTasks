package Day17.Task02;

public enum ChessPiece {
    KING_WHITE(100, "\u2654"),
    KING_BLACK(100, "\u265A"),
    QUEEN_WHITE(9, "\u2655"),
    QUEEN_BLACK(9, "\u265B"),
    ROOK_WHITE(5, "\u2656"),
    ROOK_BLACK(5, "\u265C"),
    ELEPHANT_WHITE(3.5, "\u2657"),
    ELEPHANT_BLACK(3.5, "\u265D"),
    HORSE_WHITE(3, "\u2658"),
    HORSE_BLACK(3, "\u265E"),
    PAWN_WHITE(1, "\u2659"),
    PAWN_BLACK(1, "\u265F"),
    EMPTY(-1, "_");

    private double value;
    private String stringNotation;

    ChessPiece(double value, String stringNotation) {
        this.value = value;
        this.stringNotation = stringNotation;
    }

    public String getStringNotation() {
        return stringNotation;
    }

    @Override
    public String toString() {
        return stringNotation;
    }
}
