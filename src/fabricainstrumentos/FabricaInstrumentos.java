package fabricainstrumentos;

import java.util.ArrayList;

class FabricaInstrumentos {
    private ArrayList<Sucursal> listaSucursales = new ArrayList<>();

    public FabricaInstrumentos(){
        this.listaSucursales.add(new Sucursal("burzaco"));
        this.listaSucursales.add(new Sucursal("adrogue"));
        this.listaSucursales.add(new Sucursal("lanus"));
    }

    public void listarInstrumentos() {
        
        for (Sucursal sucursal : this.listaSucursales) {
            sucursal.listarInstrumentos();;
        }
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        
        for (Sucursal sucursal : this.listaSucursales) {
            instrumentos.addAll(sucursal.instrumentosPorTipo(tipo));
        }        

        return instrumentos;
    }

    public void borrarInstrumento(String id) {
        Sucursal sucursal = buscarInstrumento(id);
        sucursal.borrarInstrumento(id);
    }

    private Sucursal buscarInstrumento(String id) {
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

    public double porcInstrumentosPorTipo(String nombreSucursal, TipoInstrumento tipoInstrumento) {
        Sucursal sucursal = buscarSucursalPorNombre(nombreSucursal);
        ArrayList<Instrumento> instrumentos = sucursal.getListaInstrumentos();
        ArrayList<Instrumento> instrumentosDelTipo = sucursal.instrumentosPorTipo(tipoInstrumento);

        return ((double) instrumentosDelTipo.size() / instrumentos.size()) * 100;
    }

    private Sucursal buscarSucursalPorNombre(String nombreSucursal) {
        var sucursales = listaSucursales.iterator();
        Sucursal sucursalBuscada = null;

        while (sucursales.hasNext() && sucursalBuscada == null) {
            sucursalBuscada = sucursales.next();
            if (!sucursalBuscada.getNombre().equals(nombreSucursal)) {
                sucursalBuscada = null;
            }
        }

        return sucursalBuscada;
    }
}