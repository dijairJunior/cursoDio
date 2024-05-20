package br.com.SintaxeJavaBasico.Operadores;

public class operadores_5 {
    public static void main(String[] args) {
        int a, b;

        a = 3;
        b = 9;

        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);


        int g, h;

        g = 34;
        h = 56;

        int resultado2 = g == h ? 1 : 0;

        System.out.println(resultado2);
    }
}
