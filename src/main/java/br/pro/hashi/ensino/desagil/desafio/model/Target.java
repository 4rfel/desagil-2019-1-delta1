package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;
    private final Random random;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
        this.random = new Random();
    }

    public void move() {

        int side = random.nextInt(4);

        if (side == 0) {
            if (row > 0 && !board.isWall(row - 1, col)) {
                row--;
            }
        } else if (side == 1) {
            if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
                col++;
            }
        } else if (side == 2) {
            if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
                row++;
            }
        } else if (side == 3) {
            if (col > 0 && !board.isWall(row, col - 1)) {
                col--;
            }
        }
    }
}
