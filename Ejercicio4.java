/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de clase scanner para poder leer archivos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Arreglo para poder poder guardar las edades generadas aleatoriamente
         */
        int[] muestra = new int[20];

        /**
         * Variables para almacer datos de edad mayor y edad menor
         */
        int edadMayor=0, edadMenor=122;

        /**
         * Ciclo para guardar las edades generadas aleatoriamente en un posicion del vector
         */
        for(int i=0; i<muestra.length; i++){
            muestra[i] = (int)(Math.random()*122+1);
            System.out.println("La edad es: "+muestra[i]);
        }

        /**
         * Ciclo que recorre todo el arreglo para comparar y guardar la edad mayor o menor
         */
        for(int i=0; i<muestra.length; i++){
            if(muestra[i]>edadMayor){
                edadMayor = muestra[i];
            }
            else if(muestra[i]<edadMenor){
                edadMenor = muestra[i];
            }
        }

        /**
         * Imprimimos en pantalla la edad más grande y la edad más pequeña
         */
        System.out.println("La persona más grande tiene "+edadMayor+" años");
        System.out.println("La persona más joven tiene "+edadMenor+" años");
    }
}
