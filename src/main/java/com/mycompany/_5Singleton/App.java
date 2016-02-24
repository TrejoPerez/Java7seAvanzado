/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._5Singleton;

/**
 *
 * @author root
 */
public class App {
    public static void main(String[] args) {
        /*
        PaisDAOImpl dao = new PaisDAOImpl();
        
            //Como no se le indica que sera de un tipo en particular de la lista, se deja como Object
        
        for(Object obj :dao.getPaises()){
            //Como la lista no tiene un generico agregado, se tiene que hacer esto 
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println("*****************************");
        for(Object obj :dao.getPaises()){
            //Como la lista no tiene un generico agregado, se tiene que hacer esto 
            System.out.println(((Pais)obj).getNombre());
        }
        
            PaisDAOImpl daoi = new PaisDAOImpl();
        
        System.out.println("*****************************");
        for(Object obj :daoi.getPaises()){
            //Como la lista no tiene un generico agregado, se tiene que hacer esto 
            System.out.println(((Pais)obj).getNombre());
        }
        */
        //Con singleton correcto
        //Se obtiene la instancia apartir del metodo estatico
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        for(Object obj :dao.getPaises()){
            //Como la lista no tiene un generico agregado, se tiene que hacer esto 
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println("*****************************");
        for(Object obj :dao.getPaises()){
            //Como la lista no tiene un generico agregado, se tiene que hacer esto 
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println("*****************************");
        PaisDAOImpl daoi = PaisDAOImpl.getInstance();
        for(Object obj :daoi.getPaises()){
            //Como la lista no tiene un generico agregado, se tiene que hacer esto 
            System.out.println(((Pais)obj).getNombre());
        }
        //Evitar que haya nuevas instancias y no se roma el patron
        //PaisDAOImpl dao2 = new PaisDAOImpl();
    }
}
