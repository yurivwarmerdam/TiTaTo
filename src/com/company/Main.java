package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int[][] board;
        //board = new int[3][3];
        Scanner move = new Scanner(System.in);


        System.out.println("Welcome to TicTacToe");
        System.out.println("The game is played as follows:");
        System.out.println("select one of the positions on the board to place your mark.");
        System.out.println("The positions are as follows:\n|1|2|3|\n|4|5|6|\n|7|8|9|");

        char[][] testBoard = {{'x', 'x', 'x'}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    System.out.println(testBoard[0][0] == 'x');


        BoardState.turn();
        BoardState.turn();
        BoardState.turn();


//
//        System.out.println("Player1 (x) make a move");
//        System.out.println("Select your position:");
//        choice = move.nextInt();
//
//        row = (choice-1)    /3;
//        col = (choice+2) % 3;
//        System.out.println(row);
//        System.out.println(col);
//        board[col][row]=1;

    }
}
