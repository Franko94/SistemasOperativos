package Carrera;

public class Carrera {
    private static int  vueltas = 8;

    public static synchronized void darUnaVuelta(Animal animal){
        for(int i = 0; i < animal.getVentaja(); i++) {
            animal.setContadorVueltas();
            System.out.println(animal.getNombre() + " vueltas: " + animal.getContadorVueltas());
            vueltas--;
        }
    }

    public synchronized static int getVueltas() {
        return vueltas;
    }
}
