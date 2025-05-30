public class Aluno {
    String nome;
    int idade;

    public void exibirInformacoes(){
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("Ele tem: " + idade + " Anos");

    }

    public static void main(String[] args) {

        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Claudio";
        meuAluno.idade = 22;

        meuAluno.exibirInformacoes();
    }
}
