package com.company;

import java.util.Scanner;

public class BoardState {
    public static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public static int turnCount = 0;
    public static int choice;
    public static int row;
    public static int col;
    public static char currentPlayer;
    static Scanner move = new Scanner(System.in);

//board = new int[3][3];

    public char[][] getBoard() {
        return board;
    }

    public static void state() {
        System.out.println("The current board state is:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void  turn(){
        if (turnCount % 2 ==0){
            currentPlayer = 'x';
        }
        else{
            currentPlayer = 'o';
        }

            BoardState.state();
            //player selects a square and it is filled in
            System.out.println();
            System.out.println("Player "+currentPlayer+" make a move");
            System.out.println("Select your position:");
            choice = move.nextInt();

            row = (choice - 1) / 3;
            col = (choice + 2) % 3;
//            System.out.println(row);
//            System.out.println(col);
            board[row][col]=currentPlayer;
            checkForVictory();
            turnCount++;
    }

    private static void checkForVictory() {
        //test for victory conditions
        //rows
        for (int i=0;i<board.length;i++){
            if (board[i][0] ==currentPlayer){
                if (board[i][1] ==currentPlayer){
                    if (board[i][2] ==currentPlayer) System.out.println("Victory! Player "+currentPlayer+" wins!");
                }
            }
        }
        //columns
        for (int i=0;i<board.length;i++){
            if (board[0][i] == currentPlayer){
                if (board[1][i] == currentPlayer){
                    if (board[2][i] ==currentPlayer) System.out.println("Victory! Player "+currentPlayer+" wins!");
                }
            }
        }
        //diagonals
        if (board[0][0] ==currentPlayer){
            if (board[1][1] ==currentPlayer){
                if (board[2][2]==currentPlayer) System.out.println("Victory! Player "+currentPlayer+" wins!");
            }
        }
        if (board[2][0] ==currentPlayer){
            if (board[1][1] ==currentPlayer){
                if (board[0][2]==currentPlayer) System.out.println("Victory! Player "+currentPlayer+" wins!");
            }
        }
    }



}