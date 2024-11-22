import java.util.Scanner;

public class EjSumaPositivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] anArray = new int[10];
        int sumapositiva = 0;
        int sumanegativa = 0;

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = sc.nextInt();
            if (anArray[i] < 0) {
                sumanegativa += anArray[i];
            } else if (anArray[i] > 0) {
                sumapositiva += anArray[i];
            }

//            sumapositiva = sumapositiva + anArray[i];
            System.out.println(anArray[i] + " la suma de numeros positivos  = " + sumapositiva);
            System.out.println(anArray[i] + " la suma de numeros negativos  = " + sumanegativa);
        }


    }

}
