public class Musica {
    String titulo, artista;
    int anoLancamento;
    double avaliacao, numAvaliacao, somaDasAvaliacao;

   void exibirFichaTecnica(){
       System.out.println("Titulo da musica: " + titulo);
       System.out.println("Artista: " + artista);
       System.out.println("Ano de Lançamento: " + anoLancamento);
   }

   void avalia(double nota){
       somaDasAvaliacao += nota;
       numAvaliacao++;
   }

   double pegaMedia(){
       return somaDasAvaliacao / numAvaliacao;

   }

    public static void main(String[] args) {

       Musica minhaMusica = new Musica();
       minhaMusica.artista = "caio ";
       minhaMusica.titulo = "caio albuns";
       minhaMusica.anoLancamento = 2002;

       minhaMusica.exibirFichaTecnica();

       minhaMusica.avalia(9);
       minhaMusica.avalia(8);
       minhaMusica.avalia(7);

       double mediaAvaliacoes = minhaMusica.pegaMedia();
       System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }

    }

