public class Media {
        public static void main(String[] args) {
            // Definir el array
            int[] numeros = {5, 10, 15, 20, 25};

            // Calcular la suma
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }

            // Calcular la media dividiendo la suma entre la cantidad de elementos
            double media = (double) suma / numeros.length;

            // Imprimir la media
            System.out.println("La media es: " + media);
        }

}
