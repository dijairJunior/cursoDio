package br.com.Execicio.Smart_TV;

public class Usuario {
    public static void main(String[] args) {

        Smart smart = new Smart();

        smart.diminuirVolume();
        smart.diminuirVolume();
        smart.diminuirVolume();
        smart.aumentarVolume();

        System.out.println("Volume atual: " + smart.volume);

        System.out.println("TV lisgas: " + smart.ligado);
        System.out.println("Canal atual: " + smart.canal);
        System.out.println("Volume atual: " + smart.volume);

        smart.ligar ();
        System.out.println("Novo Status -> TV ligada ? : " + smart.ligado);

        smart.desligar();
        System.out.println("Novo Status -> TV ligada ? : " + smart.ligado);

        smart.mudarCanal(5);
        System.out.println("Canal atual: " + smart.canal);

    }
}
