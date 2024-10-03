package agencia;

import java.util.Random;

public class Silla {
    private char caracter;
    private int nIdentificacion;
    private Cliente cliente;
    
    
    public Silla(Cliente cliente){
        this.caracter = charAleatorio();
        this.nIdentificacion = nAleatorio();
        this.cliente = cliente;
    }
    
    private char charAleatorio(){
        Random random = new Random();
        return (char) (random.nextInt(26)+ 'A');
    }
    
    private int nAleatorio(){
        
        Random num = new Random();
        int randomnum = num.nextInt(99);
        return randomnum;
    }

    @Override
    public String toString() {
        return cliente +"silla "+caracter+" "+nIdentificacion ;
    }

    

    
}
