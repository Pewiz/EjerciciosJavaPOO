package com.cine.model;

public class Sala {
    private int asientosM[][] = new int[3][3];
    private int asientosVer[][] = new int [3][3];
    private int asientosVes[][] = new int[3][3];
    private int x, y, pos; 
    private int asiento[][] = new int[3][3];



    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void seleccionarHorarioSala(int pos){
        this.pos = pos;

        switch (pos) {
            case 0: asiento = this.asientosM.clone(); break;
            case 1: asiento = this.asientosVer.clone(); break;
            case 2: asiento = this.asientosVes.clone(); break;
        }
    }

    public void asignarPosicionTabla(){
        if(asiento[x][y] == 0){
            asiento[x][y]=1;
        }
    }

    public boolean verificarPosicionTabla(int fila, int columna){
        boolean verif = true;
        if(asiento[fila][columna]==1){
            verif = false;
        }
        return verif;
    }

    public void seleccionarAsientos(){
        asignarPosicionTabla();

        switch(pos){
            case 0: this.asientosM = asiento.clone(); break;
            case 1: this.asientosVer = asiento.clone();break;
            case 2: this.asientosVes = asiento.clone(); break;

        }
    }
    
}
