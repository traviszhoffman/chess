package chess;

import java.util.ArrayList;

public class PieceMovesCalculator {
    static ArrayList<ChessMove> up(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> upMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
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

    static ArrayList<ChessMove> upDiagRight(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> upDiagRightMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            row += 1;
            col += 1;
            if(row <=8 && col <=8){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    upDiagRightMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    upDiagRightMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return upDiagRightMoves;
    }

    static ArrayList<ChessMove> downDiagRight(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> downDiagRightMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            row -= 1;
            col += 1;
            if(row >=1 && col <=8){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    downDiagRightMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    downDiagRightMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return downDiagRightMoves;
    }

    static ArrayList<ChessMove> upDiagLeft(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> upDiagLeftMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            row += 1;
            col -= 1;
            if(row <=8 && col >=1){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    upDiagLeftMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    upDiagLeftMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return upDiagLeftMoves;
    }

    static ArrayList<ChessMove> downDiagLeft(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> downDiagLeftMoves = new ArrayList<>();
        int col = myPosition.col;
        int row = myPosition.row;
        for(int step = 1;step < 8; step++){
            row -= 1;
            col -= 1;
            if(row >=1 && col >=1){
                ChessPosition newPos = new ChessPosition(row, col);
                ChessPiece pieceAtNewPos = board.getPiece(newPos);
                if(pieceAtNewPos == null ) {
                    downDiagLeftMoves.add(new ChessMove(myPosition, newPos, null));
                } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                    downDiagLeftMoves.add(new ChessMove(myPosition,newPos,null));
                    break;
                } else {
                    break;
                }
            }
        }
        return downDiagLeftMoves;
    }


}

class RookMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> rookMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> rookMoves = new ArrayList<>();
        rookMoves.addAll(up(board, myPosition));
        rookMoves.addAll(down(board,myPosition));
        rookMoves.addAll(left(board,myPosition));
        rookMoves.addAll(right(board,myPosition));

        return rookMoves;
    }
}

class KnightMovesCalculator extends PieceMovesCalculator{
    static ArrayList<ChessMove> knightMoveChecker(ChessBoard board, ChessPosition myPosition, int rowChange, int colChange){
        ArrayList<ChessMove> moves = new ArrayList<>();
        int row = myPosition.row + rowChange;
        int col = myPosition.col + colChange;
        if(row <= 8 && row >=1 && col <= 8 && col >=1){
            ChessPosition newPos = new ChessPosition(row, col);
            ChessPiece pieceAtNewPos = board.getPiece(newPos);
            if(pieceAtNewPos == null){
                moves.add(new ChessMove(myPosition, newPos, null));
            } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                moves.add(new ChessMove(myPosition, newPos, null));
            }
        }
        return moves;
    }

    public static ArrayList<ChessMove> knightMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> knightMoves = new ArrayList<>();
        knightMoves.addAll(knightMoveChecker(board,myPosition,2,1));
        knightMoves.addAll(knightMoveChecker(board,myPosition,-2,1));
        knightMoves.addAll(knightMoveChecker(board,myPosition,2,-1));
        knightMoves.addAll(knightMoveChecker(board,myPosition,-2,-1));
        knightMoves.addAll(knightMoveChecker(board,myPosition,1,2));
        knightMoves.addAll(knightMoveChecker(board,myPosition,1,-2));
        knightMoves.addAll(knightMoveChecker(board,myPosition,-1,-2));
        knightMoves.addAll(knightMoveChecker(board,myPosition,-1, 2));
        return knightMoves;
    }
}

class BishopMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> bishopMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> bishopMoves = new ArrayList<>();
        bishopMoves.addAll(upDiagRight(board,myPosition));
        bishopMoves.addAll(downDiagRight(board,myPosition));
        bishopMoves.addAll(upDiagLeft(board,myPosition));
        bishopMoves.addAll(downDiagLeft(board,myPosition));
        return bishopMoves;
    }
}

class QueenMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> queenMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> queenMoves = new ArrayList<>();
        queenMoves.addAll(up(board, myPosition));
        queenMoves.addAll(down(board,myPosition));
        queenMoves.addAll(left(board,myPosition));
        queenMoves.addAll(right(board,myPosition));

        queenMoves.addAll(upDiagRight(board,myPosition));
        queenMoves.addAll(downDiagRight(board,myPosition));
        queenMoves.addAll(upDiagLeft(board,myPosition));
        queenMoves.addAll(downDiagLeft(board,myPosition));
        return queenMoves;
    }
}

class KingMovesCalculator extends PieceMovesCalculator{
    static ArrayList<ChessMove> kingMoveChecker(ChessBoard board, ChessPosition myPosition, int rowChange, int colChange){
        ArrayList<ChessMove> moves = new ArrayList<>();
        int row = myPosition.row + rowChange;
        int col = myPosition.col + colChange;
        if(row <= 8 && row >=1 && col <= 8 && col >=1){
            ChessPosition newPos = new ChessPosition(row, col);
            ChessPiece pieceAtNewPos = board.getPiece(newPos);
            if(pieceAtNewPos == null){
                moves.add(new ChessMove(myPosition, newPos, null));
            } else if(!pieceAtNewPos.getTeamColor().equals(board.getPiece(myPosition).getTeamColor())){
                moves.add(new ChessMove(myPosition, newPos, null));
            }
        }
        return moves;
    }
    public static ArrayList<ChessMove> kingMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> kingMoves = new ArrayList<>();
        kingMoves.addAll(kingMoveChecker(board, myPosition, 1, 0));
        kingMoves.addAll(kingMoveChecker(board, myPosition, -1, 0));
        kingMoves.addAll(kingMoveChecker(board, myPosition, 0, -1));
        kingMoves.addAll(kingMoveChecker( board, myPosition, 0, 1));
        kingMoves.addAll(kingMoveChecker(board, myPosition, 1, 1));
        kingMoves.addAll(kingMoveChecker(board, myPosition, -1, 1));
        kingMoves.addAll(kingMoveChecker(board, myPosition, 1, -1));
        kingMoves.addAll(kingMoveChecker(board, myPosition, -1, -1));

        return kingMoves;
    }
}

class PawnMovesCalculator extends PieceMovesCalculator{
    public static ArrayList<ChessMove> pawnMoves(ChessBoard board, ChessPosition myPosition){
        ArrayList<ChessMove> pawnMoves = new ArrayList<>();
        return pawnMoves;
    }
}
