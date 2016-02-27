/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._8GenericosIIIWildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class AppWild {
    /*
        WildCard: poder ejcutar generico ssin indicar el tipo de dato, este se indicara
        en tiempo de ejcucion
        al colocar este signo ? se esta llamando un wioldarc de 
        tipo desconocido porque no se identifica la implementacion de la lista
        Ya seria un objetyo de tipo object y no tiene acceso al metodo getNombre
        Por lo tanto se tendria que hacer un casteo
    
        A este signo ? se le copnoce como wildacr UNBOUNDED es lo mismo que hacer esto
        
        <? extends Object> lista=este ? va a frecibir cualquier dato que herede de la clase object, extends en el 
    contexto de genericos de wildcard hace referencia a herencia y a implementaciones 
    si se indica que este opreador tiene que implementar de objecto, se recibe cualquier cosa
    */
    public void listar(List<?> lista){
        for(Object a : lista){
            if(a instanceof Alumno){
                System.out.println(((Alumno)a).getNombre());
            }

            
        }
    }
    public static void main(String[] args) {
        AppWild aw = new AppWild();
        Alumno a11 = new Alumno("trejo");
        Alumno a12 = new Alumno("jose");
        Alumno a13 = new Alumno("misael");
        List<Alumno> a = new ArrayList<Alumno>();
        a.add(a11);
        a.add(a12);
        a.add(a13);
        aw.listar(a);
        
    }

}
