package Day17.Task02;

import static Day17.Task02.ChessPiece.*;

public class Main {
    public static void main(String[] args) {
        ChessBoard board1 = new ChessBoard(new ChessPiece[][] {
                {ROOK_BLACK, EMPTY, EMPTY, EMPTY, EMPTY, ROOK_BLACK, KING_BLACK, EMPTY},
                {EMPTY, ROOK_WHITE, EMPTY, EMPTY, PAWN_BLACK, PAWN_BLACK, EMPTY, PAWN_BLACK},
                {PAWN_BLACK, EMPTY, HORSE_BLACK, EMPTY, EMPTY, EMPTY, PAWN_BLACK, EMPTY},
                {QUEEN_BLACK, EMPTY, EMPTY, ELEPHANT_WHITE, EMPTY, ELEPHANT_WHITE, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, ELEPHANT_BLACK, PAWN_WHITE, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, ELEPHANT_WHITE, PAWN_WHITE, EMPTY, EMPTY},
                {PAWN_WHITE, EMPTY, EMPTY, QUEEN_WHITE, EMPTY, PAWN_WHITE, EMPTY, PAWN_WHITE},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, ROOK_WHITE, KING_WHITE, EMPTY}
        });
        board1.print();
    }
}
