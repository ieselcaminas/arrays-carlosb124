public class Ejercicio7 {

    public static int longitudMaxima(String[] cadenas) {
        int max = 0;
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > max) {
                max = cadenas[i].length();
            }
        }
        return max;
    }
    public static void asteriscos(int longitudMax) {
        for (int i = 0; i < longitudMax + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void imprimirConMarco(String[] cadenas) {
        int maxdistancia = longitudMaxima(cadenas);
        asteriscos(maxdistancia);

        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("* " + cadenas[i]);
            for (int j = 0; j < (maxdistancia - cadenas[i].length()); j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
        asteriscos(maxdistancia);
    }
    public static void main(String[] args) {
        String[]  lista = {"Hola", "esto", "es", "un", "marco"};

        imprimirConMarco(lista);

    }
}