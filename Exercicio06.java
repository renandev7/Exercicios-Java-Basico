import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num > 0){
            System.out.println("Numero Positivo");
        } else if (num < 0){
            System.out.println("Numero Negativo");
        } else {
            System.out.println("Numero Neutro");
        }
    }
}

/*
Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */