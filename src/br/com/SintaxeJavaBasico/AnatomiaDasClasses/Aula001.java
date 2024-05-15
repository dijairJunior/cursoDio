package br.com.SintaxeJavaBasico.AnatomiaDasClasses;

public class Aula001 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double num1 = 14.31;
        double num2 = 13.50;
        double num3 = 13.41;
        double num4 = 7.32;
        double num5 = 10.42;
        double num6 = 8.31;

        double soma = num1 + num2 + num3 +
                num4 + num5 + num6;

        System.out.println("Soma: " + soma);

        String primeiroNome = "Junior";
        String segundoNome = "Camargo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
