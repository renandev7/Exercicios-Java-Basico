import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("São iguais");
        } else if (num1 > num2){
            System.out.println("Primeiro numero é maior");
        } else {
            System.out.println("Segundo numero é maior");
        }
    }
}


/*
Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */