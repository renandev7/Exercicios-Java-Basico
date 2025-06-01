public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(777);
        conta.setSaldo(500);
        conta.titular = "Carlos";


        System.out.println("O numero da sua conta é: " + conta.getNumeroConta());
        System.out.println("O seu saldo é de: " + conta.getSaldo());
        System.out.println("O nome registrado na sua conta é: " + conta.titular);


    }
}
