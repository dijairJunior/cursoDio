package br.com.SintaxeJavaBasico.Operadores;

public class operadores_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a == b){
            System.out.println("a nossa condição é verdadeira");
        }

        boolean negacao = a == b;
        System.out.println("Se letra A é igual a B: " + negacao);

        negacao = a != b;
        System.out.println("Se letra A é diferente a B: " + negacao);negacao = a != b;

        negacao = a > b;
        System.out.println("Se letra A é maior a B: " + negacao);


        String nomeUm = "Jurandir";
        String nomeDois = new String("Fabricio");

        System.out.println(nomeUm.equals(nomeDois));
    }
}
