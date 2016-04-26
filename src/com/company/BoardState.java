package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardState {
    public static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public static int turnCount = 0;
    public static int choice = -1;
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

            while (choice>9 || choice<1 || !(board[(choice-1)/3][(choice+2)%3] ==' ')){
                if (choice==-1){

                }
                else if (choice>9){
                    System.out.println("integer too large.");
                }
                else if (choice<1){
                    System.out.println("integer too small");
                }
                else if (!(board[(choice-1)/3][(choice+2)%3] ==' ')){
                    System.out.println("That position has already been chosen");
                }
                System.out.println("Select your position:");
                choice = getInteger();
            }

            row = (choice - 1) / 3;
            col = (choice + 2) % 3;
//            System.out.println(row);
//            System.out.println(col);
//            while (!(board[row][col] == ' ')){
//                System.out.println("Oh great, you're trying to cheat by overriding another move. Try again.");
//                choice =move.nextInt();
//                row = (choice - 1) / 3;
//                col = (choice + 2) % 3;
//            }
            board[row][col]=currentPlayer;
            checkForVictory();

            turnCount++;
    }

    private static int getInteger() {
        int checkedInt;
        while (!move.hasNextInt()) {
            System.out.println();
            System.out.println("Real mature. A number between 1 and 9 is not hard to come up with, Dickhead.");
            move.nextLine();
        }
        checkedInt = move.nextInt();
        return checkedInt;
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