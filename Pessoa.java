public class Pessoa {

    void dizerOla(String nome){
        System.out.println("Olá " + nome + " Seja bem vindo");

    }

    public static void main(String[] args) {
        Pessoa nova = new Pessoa();
        nova.dizerOla("Carlos");
    }
}

