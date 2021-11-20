
package Casa;

import java.util.Scanner;//La funcion scanner esta añadida para la segunda opcion de ejercicio

/**
 * Funcíón que se le pasa mediante código un listado de 4 casas y te devuelve en diferentes listados las direcciones, 
 * el codigo postal, los metros cuadrados y las habitaciones. Abajo en oculto se propone otra opcion en la que el usuario elige el listado deseado.
 * 
 * @author victor
 */
public class ModeloCasa {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);//La funcion scanner esta añadida para la segunda opcion de ejercicio

        // Array de casas
        Casa[] arrayCasa = {new Casa(), new Casa(), new Casa(), new Casa()};
        
        //Diferentes datos para las casas
        arrayCasa[0].direccion = "Av. de la Albufera, 140";
        arrayCasa[0].codigoPostal = "28038";
        arrayCasa[0].habitaciones = 4;
        arrayCasa[0].metrosCuadrados = 100;
        
        arrayCasa[1].direccion = "Calle la Adrada, 37-35";
        arrayCasa[1].codigoPostal = "28031";
        arrayCasa[1].habitaciones = 5;
        arrayCasa[1].metrosCuadrados = 150;
        
        arrayCasa[2].direccion = "C. de Atocha, a70";
        arrayCasa[2].codigoPostal = "28012";
        arrayCasa[2].habitaciones = 3;
        arrayCasa[2].metrosCuadrados = 90;
        
        arrayCasa[3].direccion = "Av. del Mediterráneo, 26-30s";
        arrayCasa[3].codigoPostal = "28007";
        arrayCasa[3].habitaciones = 5;
        arrayCasa[3].metrosCuadrados = 130;
        
        // Al no saber añadir elementos de un array he creado 4 strings donde ir concatenando los diferentes elementos en forma de listado
        String direcciones = "";
        String codigoPostales = "";
        String metrosCuadrados = "";
        String habitaciones = "";
        
        //Bucle para recorrerme las casas
        for (var i = 0; i < arrayCasa.length; i++) {
            
            direcciones += "La dirección de la casa " + (i + 1) + " es " + arrayCasa[i].direccion + "\n";
            codigoPostales += "El código postal de la casa " + (i + 1) + " es " + arrayCasa[i].codigoPostal + "\n";
            habitaciones += "El número de habitaciones de la casa " + (i + 1) + " es " + arrayCasa[i].habitaciones + "\n";
            metrosCuadrados += "El tamaño de la casa " + (i + 1) + " es " + arrayCasa[i].metrosCuadrados + " metros cuadrados" + "\n";
         }
        
        //Mostrar los listados acorde con el enunciado del ejercicio
        System.out.println("\n================= DIRECCIONES =================\n");
        System.out.println(direcciones);
         System.out.println("\n================= CÓDIGOS POSTALES =================\n");
        System.out.println(codigoPostales);
         System.out.println("\n================= HABITACIONES =================\n");
        System.out.println(habitaciones);
         System.out.println("\n================= METROS CUADRADOS =================\n");
        System.out.println(metrosCuadrados);
        
        
        //=============== EN EL CASO DE QUE QUISIERAMOS PEDIR AL USUARIO QUE ELIJA QUE LISTADO QUIERE VISUALIZAR LO HARIAMOS DE ESTA FORMA 

        /*System.out.println("\n¿Que informacion quieres ver? \n\n(0) Direccion \n(1) CP \n(2) Habitaciones \n(3) MetrosCuadrados \n(4) Finalizar \n");
        int dato = entrada.nextInt();
        // Dependiendo del numero que se le pase se le muestra una cabecera diferente
        if (dato == 0 ) {
            System.out.println("\n================= DIRECCIONES =================\n");
        } else if (dato == 1) {
            System.out.println("\n================= CÓDIGO POSTAL =================\n");
        } else if (dato == 2) {
            System.out.println("\n================= HABITACIONES =================\n");
        } else if (dato == 3) {
            System.out.println("\n================= TAMAÑO DE LAS CASAS =================\n");
        }
        //Si el numero que se le pasa es entre 0 y 3 entra por la condicion y dependiendo del numero entra por el switch mostrando los datos que corresponde.
        // He comparado con numeros ya que si intentaba comparar con una cadena de caracteres no me funcionaba. La ayuda me ponia usar dato.equals().
        if (dato == 0 || dato == 1 || dato == 2 || dato == 3) {
            for (var i = 0; i < arrayCasa.length; i++) {
                switch (dato) {
                    case 0:
                        System.out.println(" Las direccion de la casa " + (i + 1) + " es: " + arrayCasa[i].direccion +".");
                        break;
                    case 1:
                        System.out.println(" El CP de la casa " + (i + 1) + " es: " + arrayCasa[i].codigoPostal+".");
                        break;
                    case 2:
                        System.out.println("El numero de habitaciones de la casa " + (i + 1) + " es: " + arrayCasa[i].habitaciones+".");
                        break;
                    case 3:
                        System.out.println(" El tamaño de la casa " + (i + 1) + " es: " + arrayCasa[i].metrosCuadrados+".");
                        break;
                }
            }
            System.out.println("\n========================================================");
        // Vuelvo a llamar al metodo para que vuelva consultar datos
            ModeloCasa.main(args);
        } else {

            if (dato == 4) {
        //Para salir del metodo
                System.out.println("\n======================================");
                System.out.println(" Gracias por participar");
                System.out.println("======================================\n");
            } else {
        //Si pone un valor que es distinto entre 0 y 4
                System.out.println("\n=================================");
                System.out.println(" Dato erroneo");
                System.out.println("=================================\n");
                ModeloCasa.main(args);
            }
        }*/
    }

}
