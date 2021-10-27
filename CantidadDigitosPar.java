
/**
 * Write a description of class NumeroDigitosPar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CantidadDigitosPar
{
    // EJERCICIO 3: CONTAR NUMEROS PARES
    
    public int numerosPares(int n){
        int digito;
        int numeroPar = 0; //contador
        
        if(n == 0)
            numeroPar = 1;
        else{        
            if(n<10){
                if(n%2 == 0)
                    numeroPar = 1;
            }
            else{
                digito = n%10;
                if(digito%2 == 0)
                    numeroPar = 1 + numerosPares(n/10);
                else
                    numeroPar = numerosPares(n/10);
            }
        }
        return numeroPar;
    
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public int contarDigitosRec(int numero){
        int contador=0;
        if(numero>0){
            numero = numero/10;
            contador = 1 + contarDigitosRec(numero);
        }else{
            contador = 0;
        }
        return contador;
    }
    
    public int cantidadDigitos(int n){
       if(n < 10)
          return 1;
       else
          return 1 + cantidadDigitos(n/10);
    }
    
    
    public boolean esPar(int digito){
        boolean esPar = false;
        
        if(digito == 0)
            esPar = true;
            
        if(digito % 2 == 0 ){
            esPar = true;
        }
        return esPar;
    }
*/
    
}
