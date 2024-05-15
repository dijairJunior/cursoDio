package br.com.SintaxeJavaBasico.TiposEVariaveis;

public class Tipos {
    public static void main(String[] args) {
        // tipos primitivos
        // classe String que representa texto na aplicação

        double salarioMinimo = 2500;
        String cargo = "Contador";

        System.out.println("A vaga para trabalho é " + cargo + " e o salário é de " + salarioMinimo);

        byte idade = 10;
        short ano = 2020;
        int cep = 106816360;
        long cpf = 1234567890L;
        float pi = 3.14F;
        double salario = 2500.00;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(salario);
        System.out.println(pi);

        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = (short) numeroCurto;

        //String soma = String.valueOf(numeroNormal + numeroCurto2);
        //System.out.println(soma);

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double valorDePi = 3.14;
        System.out.println(valorDePi);

    }
}
