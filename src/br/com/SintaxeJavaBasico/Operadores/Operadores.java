package br.com.SintaxeJavaBasico.Operadores;

import java.util.Date;

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


        // Classe operadores
        String nome = "Junior Camargo";
        int idade = 22;
        double peso = 67.7;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println("O meu nome é: " + nome
                + " tenho " + idade
                + " meu peso é " + peso
                + " sou do sexo " + sexo
                + " eu nao sou doador de orgao " + doadorOrgao
                + " e á data de hoje é: " + dataNascimento);
    }
}
