package Day17.Task02;

public class ChessBoard {

    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;

    }
    public  void print() {
        for (ChessPiece[] chessPieces : chessBoard) {
            for (ChessPiece chessPiece : chessPieces) {
                System.out.print(chessPiece);
            }

        }
    }
}
