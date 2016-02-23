/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._5Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class PaisDAOImpl {
    private List paises=null;
    //Aqui se supone que se tiene una lista de BD de paises
    public List getPaises(){
        //Aqui se aplica el patrong singleton
        if(paises==null){
            paises = new ArrayList();
            Pais p1 = new Pais("Peru");
            Pais p2 = new Pais("Mexico");
            Pais p3 = new Pais("Colombia");
            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
        return paises;
    }
    
}
