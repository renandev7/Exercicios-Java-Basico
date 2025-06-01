public class Main {
    public static void main(String[] args) {


        IdadePessoa pessoa = new IdadePessoa();

            pessoa.setIdade(18);
        pessoa.setNome("Ronaldo");


        System.out.println("Seu nome é: " + pessoa.getNome());
        if (pessoa.getIdade() < 18){
            System.out.println("Essa pessoa é menor de idade");
        } else {
            System.out.println("Essa pessoa é maior de idade");
        }

        // Poderia ter feito uma função calcula idade


    }
}
