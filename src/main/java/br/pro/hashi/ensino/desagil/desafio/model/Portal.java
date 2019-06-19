package br.pro.hashi.ensino.desagil.desafio.model;

public class Portal extends Element {
    private final int totalCD;
    private boolean usable;
    private int actualCD;

    public Portal(int row, int col, int totalCD){
        super(row, col);
        this.totalCD = totalCD;
        this.usable = true;
        this.actualCD = 0;
    }

    public void use(){ this.usable = false; }

    public void cd(){
        if(!this.usable && this.actualCD < this.totalCD){
            this.actualCD += 1;
        }
        if(this.actualCD==this.totalCD){
            this.usable = true;
        }
    }

    public boolean getUsable(){
        return this.usable;
    }
}
