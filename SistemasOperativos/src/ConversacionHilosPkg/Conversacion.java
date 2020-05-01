package ConversacionHilosPkg;

public class Conversacion {

    private static String numero;
    private static boolean respuesta = false;

    public synchronized static void contestar(String miId){
        if(getRespuesta()){
            System.out.println("Hola Hilo: "+ numero);
            respuesta = false;
        }

        respuesta = true;
        numero = miId;
    }

    public static boolean getRespuesta(){
        return respuesta;
    }

}
