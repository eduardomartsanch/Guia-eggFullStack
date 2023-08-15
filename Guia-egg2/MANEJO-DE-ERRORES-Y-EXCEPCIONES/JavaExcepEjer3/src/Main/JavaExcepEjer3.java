/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.  */
package Main;

import Entidad.DivisionNumero;
import java.util.Scanner;

public class JavaExcepEjer3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el primer numero "); 
        String num1Str = scanner.next();
        
        System.out.println("Ingrese el segundo numero "); 
        String num2Str = scanner.next();
    
        int num1=Integer.parseInt(num1Str);
        int num2=Integer.parseInt(num2Str);
        
        try{
        int resultado = DivisionNumero.dividirNumeros(num1, num2);
            System.out.println("El resultado de la diviion es: "+ resultado);
        }catch(Exception e){
        
        }
 }
}
