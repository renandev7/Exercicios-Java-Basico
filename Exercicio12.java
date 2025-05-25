import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        String nome = "Ronaldo";
        String tipoConta = "Corrente";
        double saldo = 2000;
        double valor, valor2;
        int opcao = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("************************\nNome do Cliente: " + nome + "\nTipo de Conta: " + tipoConta + "\nSaldo Atual: " + saldo + "\n************************");

        String menu = """
                1 - Consultar Saldo
                2 - Transefir Valor
                3 - Receber Valor
                4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atual é "+ saldo);
            } else if (opcao == 2){
                System.out.println("Digite o valor que deseja transferir: ");
                valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferencia");
                }else {
                    saldo = saldo - valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Digite o valor que deseja receber: ");
                valor2 = sc.nextDouble();
                saldo = saldo + valor2;
                System.out.println("Seu saldo atual é de: " + saldo);


            } else if(opcao != 4){
                System.out.println("Opção Invalida");
            }
        }


    }

}
