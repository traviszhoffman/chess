package chess;

import java.util.ArrayList;

public class PieceMovesCalculator {
    static ArrayList<ChessMove> moves(ChessBoard board, ChessPosition position, int rowChange, int colChange){
        ArrayList<ChessMove> moves = new ArrayList<>();
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor myColor =  board.getPiece(position).pieceColor;
        for(int i = 0; i < 8; i++){
            row += rowChange;
            col += colChange;
            if(row <=8 && row >=1 && col <=8 && col >=1 ){
                ChessPosition newChessPos = new ChessPosition(row,col);
                ChessPiece pieceAtNewPos = board.getPiece(newChessPos);
                if(pieceAtNewPos == null){
                    moves.add(new ChessMove(position,newChessPos,null));
                } else if(pieceAtNewPos.getTeamColor() != myColor){
                    moves.add(new ChessMove(position,newChessPos,null));
                    break;
                } else{
                    break;
                }
            }
        }
        return moves;
    }

    static ArrayList<ChessMove> moveOnce(ChessBoard board, ChessPosition position, int rowChange, int colChange){
        ArrayList<ChessMove> moves = new ArrayList<>();
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor myColor =  board.getPiece(position).pieceColor;
        row += rowChange;
        col += colChange;
        if(row <=8 && row >=1 && col <=8 && col >=1 ){
            ChessPosition newChessPos = new ChessPosition(row,col);
            ChessPiece pieceAtNewPos = board.getPiece(newChessPos);
            if(pieceAtNewPos == null){
                moves.add(new ChessMove(position,newChessPos,null));
            } else if(pieceAtNewPos.getTeamColor() != myColor){
                moves.add(new ChessMove(position,newChessPos,null));
            }
        }
        return moves;
    }

}

class RookMovesCalculator extends PieceMovesCalculator {
    static void rookMoves(ChessBoard board, ChessPosition position, ArrayList<ChessMove> validMoves){
        validMoves.addAll(moves(board,position,1,0));
        validMoves.addAll(moves(board,position,-1,0));
        validMoves.addAll(moves(board,position,0,1));
        validMoves.addAll(moves(board,position,0,-1));
    }
}

class KnightMovesCalculator extends PieceMovesCalculator {
    //(-2,1)(-2,-1)(2,1),(2,-1)(1,2),(1,-2)(-1,2),(-1,-2)
    static void knightMoves(ChessBoard board, ChessPosition position, ArrayList<ChessMove> validMoves){
        validMoves.addAll(moveOnce(board,position,-2,1));
        validMoves.addAll(moveOnce(board,position,-2,-1));
        validMoves.addAll(moveOnce(board,position,2,1));
        validMoves.addAll(moveOnce(board,position,2,-1));
        validMoves.addAll(moveOnce(board,position,1,2));
        validMoves.addAll(moveOnce(board,position,1,-2));
        validMoves.addAll(moveOnce(board,position,-1,2));
        validMoves.addAll(moveOnce(board,position,-1,-2));

    }
}

class BishopMovesCalculator extends PieceMovesCalculator {
    static void bishopMoves(ChessBoard board, ChessPosition position, ArrayList<ChessMove> validMoves){
        validMoves.addAll(moves(board,position,1,1));
        validMoves.addAll(moves(board,position,1,-1));
        validMoves.addAll(moves(board,position,-1,1));
        validMoves.addAll(moves(board,position,-1,-1));
    }
}

class QueenMovesCalculator extends PieceMovesCalculator {
    static void queenMoves(ChessBoard board, ChessPosition position, ArrayList<ChessMove> validMoves){
        validMoves.addAll(moves(board,position,1,0));
        validMoves.addAll(moves(board,position,-1,0));
        validMoves.addAll(moves(board,position,0,1));
        validMoves.addAll(moves(board,position,0,-1));
        validMoves.addAll(moves(board,position,1,1));
        validMoves.addAll(moves(board,position,1,-1));
        validMoves.addAll(moves(board,position,-1,1));
        validMoves.addAll(moves(board,position,-1,-1));
    }
}

class KingMovesCalculator extends PieceMovesCalculator {
    static void kingMoves(ChessBoard board, ChessPosition position, ArrayList<ChessMove> validMoves){
        validMoves.addAll(moveOnce(board,position,1,0));
        validMoves.addAll(moveOnce(board,position,-1,0));
        validMoves.addAll(moveOnce(board,position,0,1));
        validMoves.addAll(moveOnce(board,position,0,-1));
        validMoves.addAll(moveOnce(board,position,1,1));
        validMoves.addAll(moveOnce(board,position,1,-1));
        validMoves.addAll(moveOnce(board,position,-1,1));
        validMoves.addAll(moveOnce(board,position,-1,-1));
    }
}

class PawnMovesCalculator extends PieceMovesCalculator {
    static ArrayList<ChessMove> pawnMovesHelper(ChessBoard board, ChessPosition position){
        ArrayList<ChessMove> moves = new ArrayList<>();
        int row = position.getRow();
        int ogRow = row;
        int col = position.getColumn();
        int promoRow = 8;
        int direction = 1;
        int startRow = 2;
        ChessGame.TeamColor myColor =  board.getPiece(position).pieceColor;
        if(myColor == ChessGame.TeamColor.BLACK){
            promoRow = 1;
            direction = -1;
            startRow = 7;
        }
        row += direction;
        if(row <=8 && row >=1){
            ChessPosition newChessPos = new ChessPosition(row,col);
            ChessPiece pieceAtNewPos = board.getPiece(newChessPos);
            if(pieceAtNewPos == null){
                if(row==promoRow){
                    moves.add(new ChessMove(position,newChessPos, ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(position,newChessPos, ChessPiece.PieceType.KNIGHT));
                    moves.add(new ChessMove(position,newChessPos, ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(position,newChessPos, ChessPiece.PieceType.QUEEN));
                } else {
                    moves.add(new ChessMove(position, newChessPos, null));
                }
                if(ogRow == startRow){
                    ChessPosition moveTwoPos = new ChessPosition(row+direction,col);
                    ChessPiece moveTwoPiece = board.getPiece(moveTwoPos);
                    if(moveTwoPiece == null){
                        moves.add(new ChessMove(position,moveTwoPos,null));
                    }
                }
            }
        }
        return moves;
    }

    static ArrayList<ChessMove> pawnDiagCapture(ChessBoard board, ChessPosition position, int colLeftRightDir){
        ArrayList<ChessMove> moves = new ArrayList<>();
        int row = position.getRow();
        //int ogRow = row;
        int col = position.getColumn();
        int promoRow = 8;
        int direction = 1;
        ChessGame.TeamColor myColor =  board.getPiece(position).pieceColor;
        if(myColor == ChessGame.TeamColor.BLACK){
            promoRow = 1;
            direction = -1;
        }
        row += direction;
        col += colLeftRightDir;
        if(row <=8 && row >=1 && col <=8 && col >=1) {
            ChessPosition newChessPos = new ChessPosition(row, col);
            ChessPiece pieceAtNewPos = board.getPiece(newChessPos);
            if (pieceAtNewPos != null) {
                if (pieceAtNewPos.pieceColor != myColor) {
                    if (row == promoRow) {
                        moves.add(new ChessMove(position, newChessPos, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(position, newChessPos, ChessPiece.PieceType.KNIGHT));
                        moves.add(new ChessMove(position, newChessPos, ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(position, newChessPos, ChessPiece.PieceType.QUEEN));
                    } else {
                        moves.add(new ChessMove(position, newChessPos, null));
                    }
                }
            }
        }
        return moves;
    }

    static void pawnMoves(ChessBoard board, ChessPosition position, ArrayList<ChessMove> validMoves){
        validMoves.addAll(pawnMovesHelper(board,position));
        validMoves.addAll(pawnDiagCapture(board,position,-1));
        validMoves.addAll(pawnDiagCapture(board,position,1));
    }
}
