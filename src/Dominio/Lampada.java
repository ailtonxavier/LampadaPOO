package Dominio; // Criação do dominio, lugar onde fica a lógica do sistema

public class Lampada {  // Criação da classe, local onde fica os atributos da própria classe
    private boolean ligada; //
    private int potencia;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public boolean estaligada(){
        return ligada;
    }
    public int potencia(){
        return potencia;
    }
    public int verificarPotencia(){
        return potencia;
    }
    public void alterarPotencia(int novaPotencia){
        potencia = novaPotencia;
    }
}
