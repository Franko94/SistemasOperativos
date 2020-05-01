package Carrera;

public class MainCarrera {

    public static void main(String[] args) throws InterruptedException {

        Thread liebre = new Animal("Liebre",4);
        Thread tortuga = new Animal("Tortuga",1);

        liebre.setPriority(Thread.MAX_PRIORITY);
        tortuga.setPriority(Thread.MIN_PRIORITY);

        liebre.start();
        tortuga.start();
    }
}
