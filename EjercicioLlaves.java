 
import java.util.Stack;
public class EjercicioLlaves
{
    public String numerarLlaves(String cad){
        String res = "";
        Stack<Integer> pila = new Stack(); //La pila indica que llaves de apertura estan pendientes de cierre
        int marca = 1;
        //int val = marca;
        for(int pos=0; pos<cad.length(); pos++){ //Cual era la llave de apertura 
            char act = cad.charAt(pos);
            if(act == '{'){ // Si es la llave de apertura
                res = res+" "+marca;
                pila.push(marca);
                marca++;
                //val = marca;          
            }
            else{
                if(act == '}'){ //Si es la llave de cierre 
                    res = res+" "+pila.pop();
                }
            }
        }
        return res;
    }
}
