public abstract class Sensor implements Runnable{


    //Atributos
    private String nombre;
    private String unidad;
    private long periodo;
    private int numLecturas;
    private double umbralMin;
    private double umbralMax;

    //creamos el constructor
    public Sensor(String nombre, String unidad, long periodo, int numLecturas, double umbralMin, double umbralMax){
        this.nombre = nombre;
        this.unidad = unidad;
        this.periodo = periodo;
        this.numLecturas = numLecturas;
        this.umbralMin = umbralMin;
        this.umbralMax = umbralMax;
    }

    public abstract double medir();


    @Override
    public void run() {
    }

}
