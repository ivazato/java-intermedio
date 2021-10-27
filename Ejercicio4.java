
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio4
{
    public int contadorUnos(int numero){
        int contador = 0;
        int aux;
        
        if(numero == 1){
            contador = 1; //un 1
        }
        
        if(numero >= 10){
            aux = numero%10;
            if(aux == 1){
                numero = numero/10;
                contador = 1 + contadorUnos(numero);
            }
        }
        
        return contador;
}
