
package com.pilas.arr.test;

import com.expresion.Expresion;
import com.pilas.arr.Pila;
import java.util.StringTokenizer;


public class PilaTest {
    
    public static void main(String [] args){
        Pila pila=new Pila();
//        System.out.println("Esta vacia :"+pila.estaVacia());
//        System.out.println("Esta llena :"+pila.estaLlena());
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(6);
//        pila.apilar(1);
//        pila.apilar(7);
//        pila.apilar(8);
//        pila.mostrar();
//        System.out.println("Cima :"+pila.verCima());
//        System.out.println("Esta vacia :"+pila.estaVacia());
//        System.out.println("Esta llena :"+pila.estaLlena());
//        pila.desapilar();
//        System.out.println("Cima :"+pila.verCima());
//        pila.mostrar();
//        pila.apilar("edgar");
//        pila.apilar("norma");
//        pila.mostrar();
        
        //cadena en parentesis
        String cadena="(41+9*7-1)";
        Expresion expresion=new Expresion(cadena);
        pila=expresion.notacionInfija2();
        pila.mostrar();
        //pila.mostrar2();
        pila=expresion.notacionPosfija(pila);
        pila.mostrar();
        expresion.operarExprecion();
        

    }
    
}
