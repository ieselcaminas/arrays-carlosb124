public class Ejercicio9 {

    public static int contarPares(int[] numeros) {
        int contadorPares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }

    public static int contarImpares(int[] numeros) {
        int contadorImpares = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                contadorImpares++;
            }
        }
        return contadorImpares;
    }

    public static void main(String[] args) {

        int[] numeros = {3, 2, 1, 4, 5, 6, 7, 8, 9, 10, -3, -2, -1, -4, -5, -6, -7, -8, -9, -10};

        System.out.println("Cantidad de números pares: " + contarPares(numeros));
        System.out.println("Cantidad de números impares: " + contarImpares(numeros));
    }

}
