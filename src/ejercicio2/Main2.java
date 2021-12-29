
package ejercicio2;

import java.util.ArrayList;

/**
 * @author Cortinez Juan José
 */
public class Main2 {

    
    public static void main(String[] args) {
         
          Lavadora nuevaLavadora = new Lavadora();
          nuevaLavadora.crearLavadora();
         // nuevaLavadora.precioFinal();
                    
          Televisor nuevoTelevisor = new Televisor();
          nuevoTelevisor.crearTelevisor();
          //nuevoTelevisor.precioFinal();
          
//          System.out.println("Precio final de la lavadora"+nuevaLavadora.getPrecio());
//          System.out.println("Precio final del televisor"+ nuevoTelevisor.getPrecio());
          
          //Ejercicio 3
          
          ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
          
          Lavadora nuevaLavadora2 = new Lavadora();
          nuevaLavadora2.crearLavadora();
          Televisor nuevoTelevisor2 = new Televisor();
          nuevoTelevisor2.crearTelevisor();
          
          electrodomesticos.add(nuevaLavadora);
          electrodomesticos.add(nuevaLavadora2);
          electrodomesticos.add(nuevoTelevisor);
          electrodomesticos.add(nuevoTelevisor2);
          
          int sumaTelevisores=0;
          int sumaLavadoras = 0;
          for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
            System.out.println("Precio final: "+aux.getPrecio());
            if(aux instanceof Televisor){
                sumaTelevisores+= aux.getPrecio();
            }else{
                sumaLavadoras+= aux.getPrecio();
            }  
        }
        
        System.out.println("La suma de todos los televisores es :"+sumaTelevisores);
        System.out.println("La suma de todos las lavadoras es :"+sumaLavadoras);
        System.out.println("La suma total es: "+ (sumaTelevisores+sumaLavadoras));
    }

}
