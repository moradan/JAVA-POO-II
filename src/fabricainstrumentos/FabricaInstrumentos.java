package fabricainstrumentos;

import java.util.ArrayList;
import java.util.Collection;

class FabricaInstrumentos {
    private static ArrayList<Sucursal> listaSucursales;

    public static void main(String[] args) {
        
        listaSucursales = cargarSucursales();
        mostrar(listaSucursales + "\n*****************\n");

        Collection<Instrumento> listaInstrumentos = listarInstrumentos();
        mostrar(listaInstrumentos + "\n*****************\n");

        Collection<Instrumento> instrumentosDeViento = instrumentosPorTipo(TipoInstrumento.VIENTO);
        mostrar(instrumentosDeViento + "\n*****************\n");

        borrarInstrumento("buV4");

        mostrar("Sin el instrumento de viento de burzaco buV4\n\n" + listarInstrumentos() + 
        "\n*****************\n");

        
    }

    static ArrayList<Sucursal> cargarSucursales(){
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        
        sucursales.add(new Sucursal("burzaco"));
        sucursales.add(new Sucursal("adrogue"));
        sucursales.add(new Sucursal("lanus"));
        
        return sucursales;
    }

    static void mostrar(Object objeto) {
        System.out.println(objeto);
    }

    static ArrayList<Instrumento> listarInstrumentos() {
        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        
        for (Sucursal sucursal : listaSucursales) {
            instrumentos.addAll(sucursal.listarInstrumentos());
        }

        return instrumentos;
    }

    static ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        
        for (Sucursal sucursal : listaSucursales) {
            instrumentos.addAll(sucursal.instrumentosPorTipo(tipo));
        }        

        return instrumentos;
    }

    static void borrarInstrumento(String id) {
        Sucursal sucursal = buscarInstrumento(id);
        sucursal.borrarInstrumento(id);
    }

    static Sucursal buscarInstrumento(String id) {
        var sucursales = listaSucursales.iterator();
        Sucursal sucursalDuenia = null;
        
        while(sucursales.hasNext() && sucursalDuenia == null) {
            sucursalDuenia = sucursales.next();
            if (!sucursalDuenia.tieneInstrumento(id)) {
                sucursalDuenia = null;
            }
        }

        return sucursalDuenia;
    }
}