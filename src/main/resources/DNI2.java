import java.util.Scanner;

public class DNI2 {
    private static String[] letrasDNI = {
            "T", "R", "W", "A", "G", "M", "Y", "F",
            "P", "D", "X", "B", "N", "J", "Z", "S",
            "Q", "V", "H", "L", "C", "K", "E"
    };

    public static String calcularLetraDNI(int numeroDNI) {
        int indiceLetra = numeroDNI % 23;
        return letrasDNI[indiceLetra];
    }

    public static void main(String[] args) {
        int numeroDNI = leerNumeroDNI("Introduce el número del DNI (sin la letra): ");

        String letraCalculada = calcularLetraDNI(numeroDNI);

        mostrarDNICompleto(numeroDNI, letraCalculada);
    }

    public static int leerNumeroDNI(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt(); // Devolver el número leído
    }

    public static void mostrarDNICompleto(int numeroDNI, String letra) {
        System.out.println("El DNI completo es: " + numeroDNI + letra);
    }
}