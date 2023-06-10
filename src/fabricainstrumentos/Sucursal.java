package fabricainstrumentos;

import java.util.ArrayList;

public class Sucursal {
    private String nombre;
    private ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
    private static int ai = 0;
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Instrumento> listaInstrumentos() {
        return listaInstrumentos;
    }

    public ArrayList<Instrumento> listarInstrumentos() {
        return listaInstrumentos;
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentos = new ArrayList<>();

        for (Instrumento instrumento : this.listaInstrumentos()) {
            if (instrumento.tipo() == tipo) {
                instrumentos.add(instrumento);
            }
        }
        return instrumentos;
    }

    public Sucursal(String nombre) {
        this.nombre = nombre;

        agregarPercusion(nombre);
        agregarViento(nombre);
        agregarCuerda(nombre);

    }

    private void agregarPercusion(String nombreSucursal) {
        TipoInstrumento tipo = TipoInstrumento.PERCUSION;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            14850));
        ai++;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            110000));
        ai++;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            31499));
        ai++;
    }

    private void agregarViento(String nombreSucursal) {
        TipoInstrumento tipo = TipoInstrumento.VIENTO;
        
        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            4141));
        ai++;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            101765));
        ai++;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            904550));
        ai++;
    }

    private void agregarCuerda(String nombreSucursal) {
        TipoInstrumento tipo = TipoInstrumento.CUERDA;
        
        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            4141));
        ai++;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            101765));
        ai++;

        listaInstrumentos.add(new Instrumento(
            nombreSucursal.substring(0, 2) + 
            tipo.name().substring(0, 1) +
            Integer.toString(ai), 
            tipo,
            904550));
        ai++;
    }

    @Override
    public String toString() {
        return "Sucursal " + nombre + "\nlistaInstrumentos\n" + listaInstrumentos + "";
    }

}
