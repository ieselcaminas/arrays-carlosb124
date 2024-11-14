import java.util.Scanner;
public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int[] numeroDNI = new int[1];

        System.out.print("Introduce el número del DNI (sin la letra): ");
        numeroDNI[0] = sc.nextInt();

        int indiceLetra = numeroDNI[0] % 23;

        String letraCalculada = letrasDNI[indiceLetra];

        System.out.println("El DNI completo es: " + numeroDNI[0] + letraCalculada);

    }
}
