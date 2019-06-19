package br.pro.hashi.ensino.desagil.desafio.model;

import java.io.IOException;

public class Model {
    private final Board board;
    private final Target target;
    private final HumanPlayer humanPlayer;
    private final HumanPlayer humanPlayer1;
    private final CpuPlayer cpuPlayer;

    private Player winner;

    public Model() throws IOException {
        board = new Board("board.txt");

        target = new Target(4, 14, board);

        humanPlayer = new HumanPlayer(0, 0, board, 0);

        humanPlayer1 = new HumanPlayer(0, 15, board, 1);

        cpuPlayer = new CpuPlayer(8, 18, board, 2);

        this.winner = null;
    }

    public Player getWinner() {
        return this.winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Board getBoard() {
        return board;
    }

    public Target getTarget() {
        return target;
    }

    public HumanPlayer getHumanPlayer() {
        return humanPlayer;
    }

    public HumanPlayer getHumanPlayer1() {
        return humanPlayer1;
    }

    public CpuPlayer getCpuPlayer() {
        return cpuPlayer;
    }
}
