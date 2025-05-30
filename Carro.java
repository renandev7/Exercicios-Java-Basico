public class Carro {
    String modelo, cor;
    int ano, anoAtual = 2025;

    public void exibirFichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("A cor do carro é: " + cor);
        System.out.println("O ano do carro é: " + ano);
    }

     int idadeDoCarro(){
        return anoAtual - ano;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fiat Uno";
        meuCarro.cor = "Vermelho";
        meuCarro.ano = 2015;

        meuCarro.exibirFichaTecnica();
    }
}
