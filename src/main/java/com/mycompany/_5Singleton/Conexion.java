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
public class Conexion {
    /*Patron singleton
        Poseer una unica instancia de una clase en particular
    */
    private static Conexion instancia = null;
    public static Conexion getInstance(){
        //Comprobar si la instancia es iguala null, no se a instanciado
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    //Se asegura que solo haya una instancia y no haya instancia postyeriores en la case
    /*
        Conewxion a  BD ya que son fijas
        Otra es en el container de los beans de los ambitos singleton de spring
        Si se tiene datos constantes(no varian), ciudades, estados, etc, estos no varia y seria 
    recomendabel tenerlos como singleton y asi tener un mejor rendimiento en la aplicacion
    Se hara una lista de paises con y sin singleton
    */
    private Conexion(){
        
    }
}
