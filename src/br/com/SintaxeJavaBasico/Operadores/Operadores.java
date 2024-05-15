package br.com.SintaxeJavaBasico.Operadores;

public class Operadores {
    public static void main(String[] args) {

        double soma = 10.3 + 18.8;
        System.out.println(soma);

        int subtracao = 10 - 18;
        System.out.println(subtracao);

        int multiplicacao = 10 * 18;
        System.out.println(multiplicacao);

        double divisao = (double) 10 / 18;
        System.out.println(divisao);

        int modulo = 10 % 18;
        System.out.println(modulo);

        double resultado = soma * multiplicacao / divisao;
        System.out.println(resultado);

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        // QUAL SERIA O RESULTADO DAS EXPRESSÕES ABAIXO
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
