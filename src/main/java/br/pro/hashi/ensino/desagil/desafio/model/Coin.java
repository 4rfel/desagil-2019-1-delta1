package br.pro.hashi.ensino.desagil.desafio.model;

public class Coin extends Element {
    private boolean collected;

    public Coin(int row, int col){
        super(row, col);
        this.collected = false;
    }

    public boolean getCollected(){
        return this.collected;
    }

    public void collect(){
        this.collected = true;
    }
}
