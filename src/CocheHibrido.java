public class CocheHibrido extends Coche{

    String combustible;
    int bateria;

    public CocheHibrido(String combustible, int bateria) {
        this.combustible = combustible;
        this.bateria = bateria;
    }

    public CocheHibrido(String marca, String modelo, int puertas, String combustible, int bateria) {
        super(marca, modelo, puertas);
        this.combustible = combustible;
        this.bateria = bateria;
    }
}
