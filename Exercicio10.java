import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, calculo;

        System.out.println("Digite o numero que deseja saber se é par ou impar: ");
        num1 = sc.nextInt();

        calculo = num1 % 2;

        if (calculo == 0){
            System.out.println("O numero " + num1 + " é par");

        }
        else if (calculo == 1){
            System.out.println("O numero " + num1 + " é impar");
        }

    }
}
