package chess;

import java.util.Arrays;
import java.util.Objects;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {
    ChessPiece[][] chessBoard;
    public ChessBoard() {
        this.chessBoard = new ChessPiece[8][8];
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        this.chessBoard[position.row-1][position.col-1] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        return this.chessBoard[position.row-1][position.col-1];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {
        //set white and black pawns
        this.chessBoard = new ChessPiece[8][8];
        for(int i = 0; i < 8; i ++){
            this.chessBoard[1][i] = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
            this.chessBoard[6][i] = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        }
        //white
        ChessPiece.PieceType[] piecesInOrder= { ChessPiece.PieceType.ROOK,ChessPiece.PieceType.KNIGHT,ChessPiece.PieceType.BISHOP,
            ChessPiece.PieceType.QUEEN,ChessPiece.PieceType.KING,ChessPiece.PieceType.BISHOP, ChessPiece.PieceType.KNIGHT, ChessPiece.PieceType.ROOK
        };
        for(int i = 0; i < 8; i++){
            this.chessBoard[0][i] = new ChessPiece(ChessGame.TeamColor.WHITE, piecesInOrder[i]);
            this.chessBoard[7][i] = new ChessPiece(ChessGame.TeamColor.BLACK, piecesInOrder[i]);

        }
        //System.out.println(chessBoard);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessBoard that = (ChessBoard) o;
        return Objects.deepEquals(chessBoard, that.chessBoard);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(chessBoard);
    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "chessBoard=" + Arrays.toString(chessBoard) +
                '}';
    }
}
