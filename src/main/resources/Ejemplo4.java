public class Ejemplo4 {

    public static void main(String[] args) {

        int[] numeros = {3,5,6,7,9,10,8,8,0,10};
        int suma = 0;
        double media;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];

        }
        media = ((double) suma /(double) numeros.length);
        System.out.println(media);
    }
}
