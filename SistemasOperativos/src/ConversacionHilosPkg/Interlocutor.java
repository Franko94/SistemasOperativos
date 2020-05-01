package ConversacionHilosPkg;

import ConversacionHilosPkg.Conversacion;

public class Interlocutor extends Thread {

    private String numero;

    public Interlocutor(String numero){
        this.numero = numero;
    }

    @Override
    public void run(){
        System.out.println("Soy el numero: " + getNumero());
        Conversacion.contestar(getNumero());

    }

    public String getNumero() {
        return numero;
    }

}
