public class Calculadora {

    public int dobrar(int numero){
        return numero * 2;
    }

    public static void main(String[] args) {


        Calculadora calculo = new Calculadora();
        int resultado = calculo.dobrar(5);

        System.out.println(resultado);
}

}