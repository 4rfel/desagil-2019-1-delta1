package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;
    private Random random;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
        this.random = new Random();
    }

    public void move() {

        int side = random.nextInt(5);

        if (side == 1) {
            if (row > 0 && !board.isWall(row - 1, col)) {
                row += -1;
            }
        } else if (side == 2) {
            if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
                col += 1;
            }
        } else if (side == 3) {
            if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
                row += 1;
            }
        } else if (side == 4) {
            if (col > 0 && !board.isWall(row, col - 1)) {
                col += -1;
            }
        }
    }
}
