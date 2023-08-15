
package calcuedificio;

import entidad.Edificio;
import entidad.EdificioDeOficina;
import entidad.Polideportivo;
import enumeraciones.TipoP;
import java.util.ArrayList;


public class CalcuEdificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Edificio>ediList=new ArrayList();
        
        Polideportivo p1=new Polideportivo("Torito Rodriguez", TipoP.TECHADO, 100, 2000, 20);
        Polideportivo p2=new Polideportivo("Chiquito el pichichi", TipoP.ABIERTO, 200, 4000, 40);
        
        EdificioDeOficina o1=new EdificioDeOficina(4, 10, 4, 30, 30, 10);
        EdificioDeOficina o2=new EdificioDeOficina(2, 5, 2, 15, 15, 5);
        
        ediList.add(p1);
        ediList.add(p2);
        ediList.add(o1);
        ediList.add(o2);
        
        int contAbi=0;
        int contTech=0;
        
        for(Edificio aux:ediList){
            System.out.println("La superficie de " + aux.toString() + " es: " + aux.calcularSuperficie());
            System.out.println("El volumen de "  + aux.toString() + " es: " + aux.calcularVolumen());
            
            
            if (aux instanceof Polideportivo) {
                if(((Polideportivo) aux).getTipo().equals(TipoP.ABIERTO)){
                    contAbi++;
                    
                }
                if(((Polideportivo) aux).getTipo().equals(TipoP.TECHADO)){
                    contTech++;
                }
             }
            
            if (aux instanceof EdificioDeOficina) {
                ((EdificioDeOficina) aux).cantPerso();
                
            }
        }

        System.out.println("Cantidad de polideportivo abiertos: " + contAbi);
        System.out.println("Cantidad de polideportivo techados: " + contTech);
        
        
    }
    
}
