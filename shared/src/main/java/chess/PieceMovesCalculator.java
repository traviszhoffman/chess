package chess;

import java.util.ArrayList;

public class PieceMovesCalculator {

}

class RookMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> rookMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> rookMoves = new ArrayList<>();
        return rookMoves;
    }
}

class KnightMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> knightMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> knightMoves = new ArrayList<>();
        return knightMoves;
    }
}

class BishopMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> bishopMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> bishopMoves = new ArrayList<>();
        return bishopMoves;
    }
}

class QueenMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> queenMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> queenMoves = new ArrayList<ChessMove>();
        return queenMoves;
    }
}

class KingMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> kingMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> kingMoves = new ArrayList<>();
        return kingMoves;
    }
}

class PawnMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> pawnMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> pawnMoves = new ArrayList<>();
        return pawnMoves;
    }
}
