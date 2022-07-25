public class CocheCombustible extends Coche{

    String combustible;

    public CocheCombustible(String combustible) {
        this.combustible = combustible;
    }

    public CocheCombustible(String marca, String modelo, int puertas, String combustible) {
        super(marca, modelo, puertas);
        this.combustible = combustible;
    }
}
