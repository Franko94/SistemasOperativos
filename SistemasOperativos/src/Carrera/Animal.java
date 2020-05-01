package Carrera;

public class Animal extends Thread {
    private String nombre;
    private int contadorVueltas;
    private int ventaja;
    private int vueltasCarrera;


    public Animal(String nombre, int ventaja){
        this.nombre = nombre;
        this.ventaja = ventaja;
        contadorVueltas = 0;
        vueltasCarrera = 8;
    }

    @Override
    public synchronized void run(){
        while(contadorVueltas < vueltasCarrera){
            Carrera.darUnaVuelta(this);
            try {
                wait(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getContadorVueltas(){
        return contadorVueltas;
    }

    public void setContadorVueltas(){
        contadorVueltas++;
    }

    public int getVentaja() {
        return ventaja;
    }
}
