package fabricainstrumentos;

public class Instrumento {
    private String id;
    private TipoInstrumento tipo;
    private double precio;

    public Instrumento(String id, TipoInstrumento tipo, double precio) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public TipoInstrumento tipo() {
        return this.tipo;
    }
    @Override
    public String toString() {
        return id + "\t" + tipo + "\t$" + precio;
    } 
}
