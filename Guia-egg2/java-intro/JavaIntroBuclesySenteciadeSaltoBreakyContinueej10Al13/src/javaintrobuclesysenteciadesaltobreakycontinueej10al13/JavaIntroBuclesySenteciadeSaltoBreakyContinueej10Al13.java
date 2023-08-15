package javaintrobuclesysenteciadesaltobreakycontinueej10al13;

import java.util.Scanner;

public class JavaIntroBuclesySenteciadeSaltoBreakyContinueej10Al13 {

    
    public static void main(String[] args) {
        // Ejercicio 10
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa un limite positivo");
        int limite = leer.nextInt();
        int num = 0;
        int suma = num;
        //hacemos un while de suma hasta que el valor supere el limite
        while(suma <=limite) {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            suma+=num;/*una vez que ingreses el numero volvras a ingresar un nuevo numero y este se ira sumando  hata que la uma del numero ingresado supere al limite*/
        }
        System.out.println("La suma "+suma+" supero el limite");
    }
    
}
