/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._6GenéricosI;

import com.mycompany._7GenéricosII.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author root
 */
public class App {
    /*
        Que pasaria si se tiene una lista que no tiene defino el tipo de dato, es una lista simple
        est alista va a permiytir almacenar todo tipo de elementos (String,Integer, u obejtos propios)
        En grances aplicaciones se respeta un orden
        Una lista debe especificar que tipoi de elemento va a implementar 
        List<Integer>
        List<Object>
        Si la lista no tiene indicado el tipo de dato, puede haver errores en la aplcacion
        Como indicar el comun denomidaro de una determinada clase
    */
    //Se le tiene que inferir el generico y constructor tiene un parametro
    public static void main(String[] args) {
        //Clase<Integer> c = new Clase<Integer>(123456);
        Clase<Integer> c = new Clase(123456);
        c.mostrarTipo();
        //Se sugiere el esterotipo E para elementos
        List<String> l = new ArrayList<String>();
        //HashMap<K,V> //K=Key V=Value
    }
    
}
