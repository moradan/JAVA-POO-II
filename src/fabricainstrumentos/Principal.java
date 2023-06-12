package fabricainstrumentos;

import java.util.Collection;

public class Principal {
    static final String SEPARADOR = "\n*****************\n";

    public static void main(String[] args) {
        FabricaInstrumentos miFabrica = new FabricaInstrumentos();

        miFabrica.listarInstrumentos();
        mostrar(SEPARADOR);

        Collection<Instrumento> instrumentosDeViento = miFabrica.instrumentosPorTipo(TipoInstrumento.VIENTO);
        mostrar(instrumentosDeViento);
        mostrar(SEPARADOR);

        miFabrica.borrarInstrumento("buV4");

        mostrar("Sin el instrumento de viento de burzaco buV4\n\n");
        miFabrica.listarInstrumentos();
        mostrar(SEPARADOR);

        double porcentaje = miFabrica.porcInstrumentosPorTipo("lanus", TipoInstrumento.PERCUSION);
        mostrar("Los instrumentos de viento de burzaco son el " + 
            String.format("%.2f", porcentaje) +
            "% del total");        
    }

    static void mostrar(Object objeto) {
        System.out.println(objeto);
    }

    static void mostrar(Collection<Instrumento> listaInstrumentos) {
        for (Instrumento instrumento : listaInstrumentos) {
            System.out.println(instrumento);
        }
    }
}
