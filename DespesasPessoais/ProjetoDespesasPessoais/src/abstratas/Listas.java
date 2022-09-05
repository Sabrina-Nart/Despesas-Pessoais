
package abstratas;

import classes.Credor;
import classes.Despesa;
import classes.TipoDespesa;
import java.util.LinkedList;

abstract public class Listas {
    
    private static LinkedList<Credor> listaCredor = new LinkedList<>();
    private static LinkedList<TipoDespesa> listaTipoDespesa = new LinkedList<>();
    private static LinkedList<Despesa> listaDespesa = new LinkedList<>();

    public static LinkedList<Credor> getListaCredor() {
        return listaCredor;
    }

    public static LinkedList<TipoDespesa> getListaTipoDespesa() {
        return listaTipoDespesa;
    }

    public static LinkedList<Despesa> getListaDespesa() {
        return listaDespesa;
    }
      
}
