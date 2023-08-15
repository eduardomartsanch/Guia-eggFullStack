
package javaintrocondicionalesej6al9;

import java.util.Scanner;


public class JavaIntroCondicionalesej6al11 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio 6
        /*Crear un programa que dado un número determine si es par o impar.*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int numero= leer.nextInt();
        if (numero % 2 !=0) {
            System.out.println("El numero ingreado es impar");
        } else {
             System.out.println("El numero ingreado es par");
        }
        
        //ejercicio 7
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        // declarar e inicializar
        if (frase.equals("eureka")) {
            System.out.println("Acertaste"); 
        } else {
            System.out.println("Fallaste");
        }
        
        //ejercicio 8
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”
, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
        System.out.println("Ingrese una frase o palabras");
        String frase1 = leer.next();
        if (frase1.length() ==8) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto");
        }
        
        //ejercicio 9
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
        
        System.out.println("Igresa una frase");
        String frase2 = leer.next();
       
        if (frase2.startsWith("A") || frase.startsWith("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        //ejercicio10
        
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que
           la suma de los números introducidos supere el límite inicial.*/
        
        System.out.println("Ingrese un limite positivo");
        int limite = leer.nextInt();
        int num = 0;
        int suma = num;
        
        while (suma <= limite) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma =+ num;
        }
   
    System.out.println("La suma " + suma + " superó el límite");
    
    //ejercicio11
    
    /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:*/
    
    System.out.println("Ingrese dos números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String opcion;
        do {
            System.out.println("Seleccione una opción"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir"
                    + "\nElija opción");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    System.out.println("La suma de " + num1 + " con " + num2 + " es de: " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("La resta de " + num1 + " con " + num2 + " es de: " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("La multiplicacion de " + num1 + " con " + num2 + " es de: " + (num1 * num2));
                    break;

                case "4":
                    System.out.println("La división de " + num1 + " con " + num2 + " es de: " + (num1 / num2));
                    break;
                case "5":
                    System.out.println("Seguro desea salir?");
                    opcion = leer.next();
            }
        } while (!"S".equalsIgnoreCase(opcion));
        
    }
    
}
