public class Minimo {
    public static int encontrarMinimo(int[] numeros) {

        int minimo = numeros[0];
        for(int i = 1; i<numeros.length; i++){

            if(numeros[i]< minimo){
                minimo = numeros[i];
            }
        }
        return minimo;
    }
    public static void main(String[] args) {

        int[] numeros = {3,2,2,4,5,6,7,8,9,10};

        System.out.println("El num minimo es : " + encontrarMinimo(numeros));

    }
}