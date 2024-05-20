package br.com.Execicio.Smart_TV;

public class Smart {
    boolean ligado = false;
    int canal = 7;
    int volume = 25;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume(){
        System.out.println("Aumentar volume" + volume);
        volume++;
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir volume" + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
