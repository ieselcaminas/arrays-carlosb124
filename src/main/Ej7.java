import java.util.Scanner;

class Ej7 {
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = miScanner.nextLine();
        }

        enmarcarCadenas(cadenas);
    }

    public static void enmarcarCadenas(String[] cadenas) {
        int maxAncho = 0;

        for (String cadena : cadenas) {
            if (cadena.length() > maxAncho) {
                maxAncho = cadena.length();
            }
        }

        for (int i = 0; i < maxAncho + 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (String cadena : cadenas) {
            System.out.print("* " + cadena);

            for (int j = cadena.length(); j < maxAncho; j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }

        for (int i = 0; i < maxAncho + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}