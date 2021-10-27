/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (Ivan) 
 * @version (1.0)
 */

import java.util.Stack;

public class Volteo //Ejercicio 5
{   
    public String invertirCadena(String texto){ //Invertir
        String res = "";
        Stack<Character> pila = new Stack();
        for(int pos=0; pos<texto.length(); pos++){ //apilar --> PILA
            char caracter = texto.charAt(pos);
            pila.push(caracter);           
        }
        
        while(!pila.empty()){ //desapilar y formar el 
           char caracterAux = pila.pop();
           res = res + caracterAux; // String = String + char
        }
        
        return res;
    }
    
    
    
    
    
    
    
    /*
     * POO
     */
    
    /*
    private String res;
    private Stack<Character> pila;
    
    // Constructor
    public Ejercicio5(){
        res = "";
        pila = new Stack();
    }
    
    public char apilarCaracteres(String cad){
        Stack<Character> pila = new Stack();
        for(int pos=0; pos<cad.length(); pos++){
            char act = cad.charAt(pos);
            return pila.push(act);             
        }
        //return res;
    }
    
    public String desapilarCaracteres(pila){ // Mostrar Cadena Invertida
        while(!pila.empty()){
           char aux = pila.pop();
           String res = res + aux;
        }        
        return res;
    }
    */
}
