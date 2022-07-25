abstract class Coche {

    String marca;
    String modelo;
    int puertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
