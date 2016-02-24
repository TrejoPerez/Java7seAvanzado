package com.mycompany._6GenéricosI;
//Se le puso el diamante par aindicar que es una lista de esteriotipos

import com.mycompany._7GenéricosII.*;
//Se le puso el diamante par aindicar que es una lista de esteriotipos
public class Clase <T>{
  /*
    Generico
    Una clase va a poder implementar un determinado tipo de elemento
    Crear una clase generica
  */  
    //Se indica que es un pbjeto generico y que se implementara mas adelante, que tipo de dato va a ser este objeto
    private T objeto;
    //Mostrara una oimnpresion en cosola para saber que tiopo de objeto se a implementado, s epuede usar cualquier letra
    /*
        Los estereotipos son para llevar un orden y que esa letra representara ciertos tipos
        E: Elemento(usado extensivamente por las colecciones y frameworks de java)
        K: Key =Hashmap
    N:Number
    T:Type
    V:Value
    S,U,V- 2do, 3ro 4to tipos 
    */
    public Clase(T objeto) {
        this.objeto = objeto;
    }
    public void mostrarTipo(){
        //Mostrar el nombre d ela lase que implem enta este objeto
        System.out.println("T es un " + objeto.getClass().getName());
    }


}



