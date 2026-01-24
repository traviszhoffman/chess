package chess;

import java.util.ArrayList;

public class PieceMovesCalculator {
    static ArrayList<ChessMove> up(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> upMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            //row = myPosition.row;
            //row += step;
            row += 1;
            if(row <=8){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    upMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    upMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return upMoves;
    }

    static ArrayList<ChessMove> down(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> downMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            //row -= step;
            row -= 1;
            if(row >=1){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    downMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    downMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return downMoves;
    }

    static ArrayList<ChessMove> left(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> leftMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            //col -= step;
            col -= 1;
            if(col >=1){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    leftMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    leftMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return leftMoves;
    }

    static ArrayList<ChessMove> right(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> rightMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            // col += step;
            col += 1;
            if(col <=8){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    rightMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    rightMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return rightMoves;
    }
}

class RookMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> rookMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> rookMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        rookMoves.addAll(up(board, myPosition));
        rookMoves.addAll(down(board,myPosition));
        rookMoves.addAll(left(board,myPosition));
        rookMoves.addAll(right(board,myPosition));

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
