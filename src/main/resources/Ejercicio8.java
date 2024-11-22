public class Ejercicio8 {

    public static int sumavalores(int[] numeros) {
        int sumaPositivos = 0;
        for (int numPositivo : numeros) {
            if (numPositivo > 0) {
                sumaPositivos += numPositivo;
            }
        }
        return sumaPositivos;
    }
    public static int restavalores(int[] numeros) {
        int sumaNegativos = 0;
        for (int numNegativo : numeros) {
            if (numNegativo < 0) {
                sumaNegativos += numNegativo;
            }
        }
        return sumaNegativos;
    }
    public static void main(String[] args) {

        int[] numerosp = {3, 2, 1, 4, 5, 6, 7, 8, 9, 10, -3, -2, -1, -4, -5, -6, -7, -8, -9, -10};

        System.out.println("LA SUMA DE VALORES POSITIVOS: " + sumavalores(numerosp));
        System.out.println("LA SUMA DE VALORES NEGATIVOS: " + restavalores(numerosp));

    }
}
