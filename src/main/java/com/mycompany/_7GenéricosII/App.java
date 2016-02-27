package com.mycompany._7GenéricosII;

import java.util.ArrayList;
import java.util.List;



public class App {
    
    public static void main(String[] args) {
        /*
        Cuando se indica un tipo de dato en particular, se esta haciendo un type safety
            type safety : Hay una proteccion en cuanto al tipo de dato
            List<String> lista = new ArrayList<Strinng>();
        
        List lista = new ArrayList();
        lista.add("Mitocode");
        lista.add(5);
        */
        //Los arrary si proporcionan typesafety
        String[] array = new  String[5];
        array[0]="jose";
        //array[1]=1;
        /*
            Evitar el casteo en las lsitas, cuandop no existian gfenericos, las lsitas se trabajaban
        asi normal, sin nada, se tenjia que hacer esto, un casteo, ya que la lsita regresa un objeto
        Con los generios ya se evito todo esto
        */
        //String texto =  (String) lista.get(0);
        Clase<String,Integer,String,Double> c = new Clase("jose", 7, "jaime", 25.0);
        //c.mostrarTipo();
        //Se puede tener una lista de clase
        List<Clase<String,Integer,String,Double>> lista = new ArrayList();
        lista.add(new Clase("jose", 7, "jaime", 25.0));
        for(Clase cl: lista){
            c.mostrarTipo();
        }
    }
    
}
