public class ConversacionHilos {

    public static void main(String[] args) {

        Thread hablante = new Interlocutor("1");
        Thread contestador = new Interlocutor("2");

        hablante.start();
        contestador.start();
    }
}

C:\Documents and Settings\Usuario\Desktop\workspace\src\ConversacionHilos.java