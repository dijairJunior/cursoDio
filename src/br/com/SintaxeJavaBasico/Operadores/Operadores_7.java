package br.com.SintaxeJavaBasico.Operadores;

public class Operadores_7 {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("as duas condiçoes verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das codições é verdadeiras");
        }

        if(condicao1 && ( 7 > 2 )){
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("Fim do programa");
    }
}
