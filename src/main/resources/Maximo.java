public class Maximo {
    public static int encontrarMax(int[] numeros) {

        int max = numeros[0];
        for(int i = 1; i<numeros.length; i++){

            if(numeros[i]>max){
                max = numeros[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] numeros = {3,2,1,4,5,6,7,8,9,10};


        System.out.println("El num max es : " + encontrarMax(numeros));

    }
}