package br.pro.hashi.ensino.desagil.desafio.model;

public abstract class Player extends Element {
    protected final Board board;
    private final int id;
    private int coins;

    Player(int row, int col, Board board, int id) {
        super(row, col);
        this.board = board;
        this.id = id;
        this.coins = 0;
    }

    protected void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }

    public int getId() {
        return this.id;
    }

    public void teleport(int newrow, int newcol){
        this.row = newrow;
        this.col = newcol;
    }

    public void addCoin(){
        this.coins++;
    }

}
