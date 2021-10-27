public class ContadorDigitosNatural{
    /*public int contarDigitos(int numero){
        int contador = 0;
        while(numero>0){
            numero = numero/10;
            contador++;
        }
        return contador;
    }*/
    
    //CONTAR DIGITOS
    public int contarDigitosRec(int numero){ // n = 86563
        int contador; //7894
        if(numero>0){ // 
            aux = numero%10
            if(aux == 1)
            numero = numero/10; // 
            contador = 1 + contarDigitosRec(numero); //contador =    . Porque 86 > 0
        }else{
            contador = 0;
        }
        return contador;
    }    
    
}