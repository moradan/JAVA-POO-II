package fabricainstrumentos;

import java.util.ArrayList;

public class Sucursal {
    private String nombre;
    private ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
    private static int ai = 0;
    
    public String getNombre() {
        return nombre;
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : listaInstrumentos) {
            System.out.println(instrumento);
        }
    }

    public ArrayList<Instrumento> getListaInstrumentos() {
        return listaInstrumentos;
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentos = new ArrayList<>();

        for (Instrumento instrumento : this.listaInstrumentos) {
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

    public boolean tieneInstrumento(String id) {
        Boolean tiene = false;
        var instrumentos = listaInstrumentos.iterator();
        
        while(instrumentos.hasNext() && !tiene) {
            if(instrumentos.next().getId().equals(id)) {
                tiene = true;
            }
        }
        return tiene; 
    }

    public void borrarInstrumento(String id) {
        listaInstrumentos.removeIf(instrumento -> (instrumento.getId().equals(id)));
    }

    @Override
    public String toString() {
        return "Sucursal " + nombre + "\nlistaInstrumentos\n" + listaInstrumentos + "";
    }

}
