import java.util.priority.*
public class EjercicioDivisores
{
    class Numero implements Comparable<Numero>{ //Una clase sabe conmpararse, obligado a sobreescribirse
        int valor;
        public Numero(int v){
            valor v; 
        }
        
        public int compareTo(Numero otro){ //Menor valor, mayor prioridad
            int res = 0;
            if(valor%2 !=0 && otro.getValor()%2==0){
                res = -1;
            }
            else{
                res = 1;
            }
            return res;
                
        }
        //El metodo compareTo le da la prioridad
        public PriorityQueue sacarDivisores(int num){
            PriorityQueue<Numero> res = new PriorityQueue<>();
            for(int div = 1; div <= (num/2); div++){
                if(num%div == 0){
                    Numero nuevo = New Numero
                }
            }
        }
    }
    
    
}
