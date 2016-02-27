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
    
        Se indica que hereda de persona para asi poder recir de alumno y profesor
    
    */
    public void listarUpperBounded(List<? extends Persona> lista){
        /*
        Recibe cualquier tipo que sea una clase de la clase que se indica (Herencia o interfaz)
        for(Object a : lista){
            if(a instanceof Alumno){
                System.out.println(((Alumno)a).getNombre());
            }
        }
        Se adapto el codigo de la clase object a persona
        */
        for(Persona per : lista){
                System.out.println(per.getNombre());
        }
    }
    public void listarLowerBounded(List<? super Alumno> lista){
        /*
        Cualquier tipo que sea una super clase delaclase que se indica
        
        Se van a reconocer las clases que sean mayores a lla clase que se va a indicar
        En vez de usar extends, se usara super para entrar a un contexto superior
        Al poner super alumno = se indica que solo se aceptaran als super clases que sean de 
        alumno, osea que sean mayores que la clase alumno
        Se manda un error ya que no se puede hacer una conversion, se tendira que hacer un casteo
        a persona o alumnop
         for(Alumno a : lista){
                System.out.println(a.getNombre());
        }
       */
        for(Object a : lista){
                System.out.println(((Persona)a).getNombre());
        }
    }
     public void listarUnBounded(List<?> lista){
        /*
            No se indica el tipo, se va a esperar de un tipo Object en comun, de cualquier tipo
       */
        for(Object a : lista){
                System.out.println(((Persona)a).getNombre());
        }
    }
    public static void main(String[] args) {
        AppWild aw = new AppWild();
        //El resultado es el mismo ya que alumno es una subclase de persona
        Persona a11 = new Profesor("trejo");
        Persona a12 = new Alumno("jose");
        Persona a13 = new Alumno("misael");
        List<Persona> a = new ArrayList<Persona>();
        a.add(a11);
        a.add(a12);
        a.add(a13);
        aw.listarUpperBounded(a);
        aw.listarLowerBounded(a);
        aw.listarUnBounded(a);
        
    }

}
