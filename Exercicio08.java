import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     int numQuadrado, quadrado;
     int opcao;
     double numCirculo, pi, raio;
     pi = 3.14;


        System.out.println("1. Calcular área do quadrado  \n2. Calcular área do circulo\n");
        opcao = sc.nextInt();

        if (opcao == 1){
            System.out.println("Qual o numero que deseja fazer ao quadrado? ");
            numQuadrado = sc.nextInt();
            quadrado = numQuadrado * numQuadrado;
            System.out.println("Seu numero ao quadrado é: " + quadrado);
        } else if (opcao == 2) {
            System.out.println("Qual numero deseja calcular a área do circulo? ");
            numCirculo = sc.nextDouble();
            raio = (numCirculo * numCirculo) * pi;
            System.out.println("Seu numero da area do circulo é: " + raio);
        }

    }
}
/*
Crie um menu que oferece duas opções ao usuário:
"1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */