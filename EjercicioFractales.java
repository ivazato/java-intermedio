
/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7
{

    public int estrellaPentagrama(int n) // ESTRELLA PENTAGRAMA
    {
        int res;
        //int aux = 0;
        if(n == 1){ //CB
            res = 1;
        }else{
            int aux;
            if(n == 2){ //CB            
                aux = 5;
                res = aux + estrellaPentagrama(n-1);
            }
            else{                
                res = estrellaPentagrama(n-1) + aux*n + 4;
                aux = aux + n + 4;
                
            }
        }
        
        return res;
    }
    
    public int generadorAux(int n){
        int aux = 5;
        if(n > 2){
            return aux + n + 4;
        }
    }
}
