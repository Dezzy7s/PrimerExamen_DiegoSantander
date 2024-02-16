package examen1;
import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Examen #1");
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a preguntas");
            System.out.println("3. Mostrar el historial del menu");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido Ejercicios String");
                    ejerciciostring();
                    break;
                case 2:
                    System.out.println("Ha elegidoRespuestas a preguntas");
                    preguntas();
                    break;
                case 3:
                    System.out.println("Ha elegido Mostrar el historial del menú");
                    Historial();
                    break;
                case 4:
                    System.out.println("Hasta el proximo examen D:");
                    break;
                default:
                    System.out.println("Seleccione un numero del 1 al 4");
                    break;
            }
        } while (opcion != 4);


    }
    public static void ejerciciostring(){
Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena mayor o igual a 8 caracteres: ");
        String cadena = entrada.nextLine();

        if (cadena.length() < 8) {
            System.out.println("Ingrese una cadena más grande");
        } else if (cadena.length() % 2 != 0) {
            cadenaImpar(cadena);
        } else {
            cadenaPar(cadena);
        }
    }

    public static void cadenaImpar(String cadena) {
        int mitad = cadena.length() / 2;
        String mitad1 = obtenerMitad1(cadena, mitad);
        String mitad2 = obtenerMitad2(cadena, mitad);
        String resultado = mitad2 + mitad1;
        Resultado(mitad1, mitad2, resultado);
    }

    public static void cadenaPar(String cadena) {
        int mitad = cadena.length() / 2;
        String mitad1 = obtenerMitad1(cadena, mitad);
        String mitad2 = obtenerMitad2(cadena, mitad);
        String resultado = cadenaInter(mitad1, mitad2);
       Resultado(mitad1, mitad2, resultado);
    }

    public static String obtenerMitad1(String cadena, int mitad) {
        return cadena.substring(0, mitad);
    }

    public static String obtenerMitad2(String cadena, int mitad) {
        return cadena.substring(mitad);
    }

    public static String cadenaInter(String mitad1, String mitad2) {
        String resultado = "";
        for (int x = 0; x < mitad1.length(); x++) {
            resultado += mitad1.charAt(x) + "-" + mitad2.charAt(x);
        }
        return resultado;
    }

    public static void Resultado(String mitad1, String mitad2, String resultado) {
        System.out.println("Primera mitad de la cadena: " + mitad1);
        System.out.println("Segunda mitad de la cadena: " + mitad2);
        System.out.println("Cadena resultante: " + resultado);
    }

    public static void preguntas(){
        System.out.println("a. Describa el funcionamiento de los ciclos for, while y do-while: ");
        System.out.println("Respuesta: Los bucles for, while y do while en Java son estructuras de control que repiten unaparte de código, el for se usa para un número conocido de repeticiones, while repite mientras una condición es verdadera, y do while va agarantizar al menos una ejecución antes de verificar la condición. ");

        System.out.println("b. Describa el funcionamiento de .charAt(), indexOf() y .length():");
        System.out.println("Respuesta: En Java, los métodos de charAt, indexOf y length operan en cadenas de caracteres, charAt devuelve el carácter en una posición específica de la cadena, donde el índice se pasa como argumento, el indexOf devuelve la posición de la primera ocurrencia de un carácter o subcadena dentro de la cadena, o -1 si no se encuentra y el length retorna la cantidad de caracteres en la cadena.");
        
        System.out.println("c. Mencione 2 tipos de datos primitivos de Java y cuál es su uso:");
        System.out.println("Respuesta: estan int y boolean, el int se utiliza para almacenar números enteros, mientras que boolean se utiliza para representar valores de verdadero o falso.");
    }
    
    public static void Historial(){
        
    }
}


    
    

