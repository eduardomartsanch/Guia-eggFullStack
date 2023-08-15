/*Manos a la obra ejercicios*/
package javainro1;

import java.util.Scanner;

public class Javainro1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*EJERCICIO 1 y 2
      ejercicio 1-  Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
ejercicio 2 - ¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.*/
String nombre = "Luis";
boolean bandera = true;
char caracter = 'c';
int numero = 0;
long longitud = 9;
float flotante = 32000.55f;
double doble = 3200.55; 
        System.out.println("el valor de String es: "+ nombre);
        System.out.println("el valor de boolean es: "+ bandera);
        System.out.println("el valor de char es: "+ caracter);
        System.out.println("el valor de int es: "+ numero);
        System.out.println("el valor de long es: "+ longitud);
        System.out.println("el valor de float es: "+ flotante);
        System.out.println("el valor de double es: "+ doble);

/*EJERCICIO 3
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.*/
int valor1 = 7;
int valor2 = 9;
int valor3 = 8;
int valor4 = 3;       

int suma = valor1 + valor2;
        System.out.println("el resultado es: "+ suma);

        int sum = valor3 + valor4;
        System.out.println("el resultado es: "+ sum);

        int resta = valor2 - valor1;
        System.out.println("el resultado es: "+ resta);

        int rest = valor3 - valor4;
        System.out.println("el resultado es: " + rest);
        
        int multiplicacion = valor1 * valor2;
        System.out.println("el resultado es: "+ multiplicacion);
        
        int multi = valor3* valor4;
        System.out.println("el resultado es: "+ multi);

        int division = valor2/valor4;
        System.out.println("el resultado es: "+ division);

int div= valor3/valor1;
          System.out.println("el resultado es: "+ div);

   /* EJERCICIO 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.*/
   Scanner leer = new Scanner(System.in);
   String nomb;
   int edad;
   
        System.out.println("Ingresa tu nombre");
       nomb = leer.next();
        System.out.println("Ingresa tu edad");
        edad = leer.nextInt();
        System.out.println("Mi nombre es: "+ nomb +" y tengo: "+ edad +" años de edad");
       
        /*EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.*/
        
         int edad1 = 25;                      // Variable entera
        double estatura = 1.75;             // Variable de punto flotante
        char genero = 'M';                  // Variable de carácter
        boolean esEstudiante = true;        // Variable booleana
        String nombreCompleto = "Juan Pérez";  // Variable de tipo cadena (String)
        long poblacionMundial = 7800000000L;   // Variable entera larga (necesita la "L" al final)

        // Mostrar los valores de las variables en la consola
        System.out.println("Edad: " + edad1);
        System.out.println("Estatura: " + estatura);
        System.out.println("Género: " + genero);
        System.out.println("Es estudiante: " + esEstudiante);
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Población mundial: " + poblacionMundial);
        
        /*Deteccion de errores*/

       String nombre1;
       boolean bandera1;
       char caracter1;

/*EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.*/
char repetir;
do {
System.out.println("Ingresa dos numeros");
int n1 = leer.nextInt();
int n2 = leer.nextInt();
        if (n1 < 25 && n2 >= 25) {
                System.out.println("n1 "+n1+ " es menor a 25 y n2 "+n2+" es mayor o igual a 25.");
            } else if (n1 >= 25 && n2 < 25) {
                System.out.println("n1 = "+n1+ " es mayor o igual a 25 y n2 = "+n2+ " es menor a 25.");
            } else if (n1 >= 25 && n2 >= 25) {
                System.out.println("Ambos números "+n1+ " y "+n2+ "son mayores o iguales a 25.");
            } else if (n1 == 25 && n2 == 25) {
                System.out.println("Ambos números "+n1+ " y "+n2+ " son iguales a 25.");
            } else {
                System.out.println("Ambos números ingresados, n1 = " + n1 + " y n2 = " + n2 + ", son menores a 25.");
            }

            System.out.println("¿Deseas repetir el proceso? (S/N): ");
            repetir = leer.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');

/*EJERCICIO 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor
de una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”*/

do {
System.out.println("Ingrese el tipo de motor (1 a 4): ");
    System.out.println("Motor tipo 1");
    System.out.println("Motor tipo 2"); 
    System.out.println("Motor tipo 3");
    System.out.println("Motor tipo 4");
        int tipoMotor = leer.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba.");
                break;
        } System.out.println("¿Deseas elegir otro tipo de motor? (S/N): ");
            repetir = leer.next().charAt(0);
               
        } while (repetir == 'S' || repetir == 's');

/* EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

 double nota;

        do {
            System.out.print("Ingrese la nota (entre 0 y 10): ");
            nota = leer.nextDouble();
            
            if (nota < 0 || nota > 10){
            System.out.println("La nota que ingresaste: "+ nota+" esta nota no esta entre 0 y 10 vuelve a intentarlo");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("La nota ingresada es: " + nota);
        
        /*EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó
el numero cero". El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo 
no debe sumarse. Nota: recordar el uso de la sentencia break.*/
        
        int plus = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int number = leer.nextInt();
        
             if (number == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }
             
              if (number > 0) {
                plus += number;
            }
        }
         System.out.println("La suma de los números positivos es: " + plus);
        leer.close();
        
       /* EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
       
       int [] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " (entre 1 y 20): ");
            numeros[i] = leer.nextInt();
            
            // Validar que el número esté entre 1 y 20
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.print("Número inválido. Ingresa el número " + (i + 1) + " nuevamente: ");
                numeros[i] = leer.nextInt();
            }
        }
        
           // Imprimir el número y sus asteriscos
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
               }
     }
}


    


