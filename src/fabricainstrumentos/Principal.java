package fabricainstrumentos;

import java.util.Collection;

public class Principal {
    static final String SEPARADOR = "\n*****************\n\n";

    public static void main(String[] args) {
        FabricaInstrumentos miFabrica = new FabricaInstrumentos();

        mostrar("Esta es la lista de todos los instrumentos de mi fabrica.");
        miFabrica.listarInstrumentos();
        mostrar(SEPARADOR);

        mostrar("Esta es una lista de los instrumentos de viento de mi fabrica.");
        Collection<Instrumento> instrumentosDeViento = miFabrica.instrumentosPorTipo(TipoInstrumento.VIENTO);
        mostrar(instrumentosDeViento);
        mostrar(SEPARADOR);

        mostrar("Elimino el instrumento cuyo ID es: buV4");
        miFabrica.borrarInstrumento("buV4");

        mostrar("Lista de instrumentos sin el instrumento de viento de burzaco buV4");
        miFabrica.listarInstrumentos();
        mostrar(SEPARADOR);

        double porcentaje = miFabrica.porcInstrumentosPorTipo("lanus", TipoInstrumento.PERCUSION);
        mostrar("Porcentaje de instrumentos de viento en burzaco.");
        mostrar(String.format("%.2f", porcentaje));        
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
