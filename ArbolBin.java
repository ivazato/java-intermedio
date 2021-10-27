
/**
 * Write a description of class ArbolBin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class ArbolBin<T>
{
    private T raiz;
    private ArbolBin<T> izq;
    private ArbolBin<T> der;
    
    public ArbolBin(T dato){
        raiz = null;
        izq = null;
        der = null;
    }
    
    public void addAmplitud(T dato){
        if(estavacio()){
            raiz = dato;
            izq = new ArbolBin<T>();
            der = new ArbolBin<T>();
        }
        else{
            Queue<ArbolBin<T>> 
        }
    }
    
    public boolean estaVacio(){
        return raiz == null;
    }
}
