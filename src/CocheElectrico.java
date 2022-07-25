public class CocheElectrico extends Coche{
    int bateria;

    public CocheElectrico() {
        super();

    }

    public CocheElectrico(int bateria) {
        this.bateria = bateria;
    }

    public CocheElectrico(String marca, String modelo, int puertas, int bateria) {
        super(marca, modelo, puertas);
        this.bateria = bateria;
    }
}
